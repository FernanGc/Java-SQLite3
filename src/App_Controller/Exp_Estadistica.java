
package App_Controller;

import static App_Controller.Controller_Estaditica.centrsT;
import static App_Controller.Controller_Estaditica.estacionesT;
import static App_Controller.Controller_Estaditica.getRadiosEstadistica;
import static App_Controller.Controller_Estaditica.responsablesE;
import static App_Controller.Controller_Estaditica.sectores;
import static App_Controller.Controller_Estaditica.tEstSuper;
import static App_Controller.Controller_Estaditica.zona;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

public class Exp_Estadistica {
    public void descargarReporteEstadistico(int suma) {
        String fileDir = "";
        String reporte = "Reporte Estadistico";

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar estaciòn como:");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Excel (*.xls)", "xls");
        fileChooser.setFileFilter(filtro);
        fileChooser.setSelectedFile(new File(reporte));
        int userSelection = fileChooser.showSaveDialog(fileChooser);
        fileDir = fileChooser.getSelectedFile().toString() + ".xls";
        File archivo = new File(fileDir);

        if (userSelection == JFileChooser.APPROVE_OPTION && archivo.exists() == false) {
            reporte(fileDir, suma);
            JOptionPane.showMessageDialog(null, "El archivo se guardo correctamnte",
                    "CEM - Informaciòn", JOptionPane.INFORMATION_MESSAGE);
        } else if (archivo.exists()) {
            int opc = JOptionPane.showConfirmDialog(null, //
                    "El archivo ya existe ¿Quieres renplasarlo?", //
                    "Confirmar", JOptionPane.YES_NO_OPTION, //
                    JOptionPane.QUESTION_MESSAGE);
            if (opc == JOptionPane.YES_OPTION) {
                reporte(fileDir, suma);
                JOptionPane.showMessageDialog(null, "El archivo se remplazo",
                        "CEM - Informaciòn", JOptionPane.INFORMATION_MESSAGE);
            } else {
                fileChooser.setSelectedFile(new File(""));
                fileChooser.showSaveDialog(fileChooser);
                fileDir = fileChooser.getSelectedFile().toString() + ".xls";
                reporte(fileDir, suma);
            } // Fin de else
        }  // Fin file.exists  
    } // fin del mètodo
    
    public void reporte(String directorio, int suma) {
        ArrayList<Estadistica2_SG> data = tEstSuper();
        ArrayList<Estadistica_SG> data2 = getRadiosEstadistica();
        int longitud = data.size(); 
        int longitud2 = data2.size(); 
        
        try {
            FileOutputStream fileOut = new FileOutputStream(directorio);
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet spreadsheet = workbook.createSheet("Reporte");
            HSSFRow row = spreadsheet.createRow(1);

            HSSFCell cell = (HSSFCell) row.createCell((short) 1);
            row.createCell(1).setCellValue("Reporte Estadistico");

            spreadsheet.addMergedRegion(
                    new CellRangeAddress(
                            1, //first row (0-based)
                            1, //last row (0-based)
                            1, //first column (0-based)
                            2 //last column (0-based)
                    )
            );
            
            spreadsheet.setColumnWidth(0, 7000);
            spreadsheet.setColumnWidth(1, 6000);
 

            row = spreadsheet.createRow((short) 3);
            row.createCell(0).setCellValue("Estaciones:");
            row.createCell(1).setCellValue(estacionesT());
            int k = 4;
    
            for (int i = 0; i < longitud; i++) {
                row = spreadsheet.createRow(k);

                row.createCell(0).setCellValue(data.get(i).getTipoEst());
                row.createCell(1).setCellValue(data.get(i).getTotal());
                k++;
            }  
            
            row = spreadsheet.createRow((short) k );
            row.createCell(0).setCellValue("Zonas:");
            row.createCell(1).setCellValue(zona());

            row = spreadsheet.createRow((short) k + 1);
            row.createCell(0).setCellValue("Sectores:");
            row.createCell(1).setCellValue(sectores());

            row = spreadsheet.createRow((short) k + 2);
            row.createCell(0).setCellValue("Centro de Trabajo:");
            row.createCell(1).setCellValue(centrsT());

            row = spreadsheet.createRow((short) k + 3);
            row.createCell(0).setCellValue("Responsables:");
            row.createCell(1).setCellValue(responsablesE());
            
            int l = k + 5;

            for (int i = 0; i < longitud2; i++) {
                row = spreadsheet.createRow(l);

                row.createCell(0).setCellValue(data2.get(i).getModelos());
                row.createCell(1).setCellValue(data2.get(i).getTotales());

                l++;
            }
            row = spreadsheet.createRow((short) l);
            row.createCell(0).setCellValue("Total:");
            row.createCell(1).setCellValue(suma);

            workbook.write(fileOut);
            fileOut.flush();
            fileOut.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    } // Fin del metodo    
} // Fin de la clase
