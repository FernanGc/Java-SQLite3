
package App_Buscador;

import static App_Buscador.Controller_Search_v2.buscarAtenas;
import static App_Buscador.Controller_Search_v2.buscarEstacion;
import static App_Buscador.Controller_Search_v2.buscarLineas;
import static App_Buscador.Controller_Search_v2.buscarMotogens;
import static App_Buscador.Controller_Search_v2.buscarPlantasF;
import static App_Buscador.Controller_Search_v2.buscarRadios;
import static App_Buscador.Controller_Search_v2.buscarTorre;
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

public class Reporte {
    
    public void descargarEstacionBuscador(String estacion) {
        String fileDir = "";

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar estaciòn como:");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Excel (*.xls)", "xls");
        fileChooser.setFileFilter(filtro);
        fileChooser.setSelectedFile(new File(estacion));
        int userSelection = fileChooser.showSaveDialog(fileChooser);
        fileDir = fileChooser.getSelectedFile().toString()+ ".xls";
        File archivo = new File(fileDir);
        
        if (userSelection == JFileChooser.APPROVE_OPTION && archivo.exists() == false) {
            reporte(fileDir, estacion); 
            JOptionPane.showMessageDialog(null, "El archivo se guardo correctamnte",
           "CEM - Informaciòn", JOptionPane.INFORMATION_MESSAGE);
        } else if (archivo.exists()) {
                int opc = JOptionPane.showConfirmDialog(null, //
                        "El archivo ya existe ¿Quieres renplasarlo?", //
                        "Confirmar", JOptionPane.YES_NO_OPTION, //
                        JOptionPane.QUESTION_MESSAGE);
                if (opc == JOptionPane.YES_OPTION) {
                    reporte(fileDir, estacion);
                    JOptionPane.showMessageDialog(null, "El archivo se remplazo",
                        "CEM - Informaciòn", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    fileChooser.setSelectedFile(new File(""));
                    fileChooser.showSaveDialog(fileChooser);
                    fileDir = fileChooser.getSelectedFile().toString() + ".xls";
                    reporte(fileDir, estacion);
                }
        }  // Fin file.exists  
    } // fin del mètodo

    public void reporte(String directorio, String estacion){
        
        String queryData[] = buscarEstacion(estacion);
        String queryData2[] = buscarTorre(estacion);
        
        try {
            FileOutputStream fileOut = new FileOutputStream(directorio);
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet spreadsheet = workbook.createSheet("Estacion");
            HSSFRow row = spreadsheet.createRow(1);

            HSSFCell cell = (HSSFCell) row.createCell((short) 1);
            row.createCell(1).setCellValue("DATOS DE LA ESTACIÒN " + estacion.toUpperCase());

            spreadsheet.addMergedRegion(
                    new CellRangeAddress(
                            1, //first row (0-based)
                            1, //last row (0-based)
                            1, //first column (0-based)
                            3 //last column (0-based)
                    )
            );
            
            spreadsheet.setColumnWidth(0, 7000);
            spreadsheet.setColumnWidth(1, 6000);
            spreadsheet.setColumnWidth(3, 5000);

            row = spreadsheet.createRow((short) 3);
            row.createCell(0).setCellValue("Nombre de la estacion:");
            row.createCell(1).setCellValue(queryData[0]);

            row = spreadsheet.createRow((short) 4);
            row.createCell(0).setCellValue("Zona:");
            row.createCell(1).setCellValue(queryData[5]);

            row = spreadsheet.createRow((short) 5);
            row.createCell(0).setCellValue("Sector:");
            row.createCell(1).setCellValue(queryData[6]);

            row = spreadsheet.createRow((short) 6);
            row.createCell(0).setCellValue("Cetro de Trabajo:");
            row.createCell(1).setCellValue(queryData[7]);

            row = spreadsheet.createRow((short) 7);
            row.createCell(0).setCellValue("Tipo de Estacion:");
            row.createCell(1).setCellValue(queryData[1]);

            row = spreadsheet.createRow((short) 8);
            row.createCell(0).setCellValue("Latitud:");
            row.createCell(1).setCellValue(queryData[2]);

            row = spreadsheet.createRow((short) 9);
            row.createCell(0).setCellValue("Longitud:");
            row.createCell(1).setCellValue(queryData[3]);

            row = spreadsheet.createRow((short) 10);
            row.createCell(0).setCellValue("Domicilio:");
            row.createCell(1).setCellValue(queryData[4]);

            row = spreadsheet.createRow((short) 11);
            row.createCell(0).setCellValue("Resposable:");
            row.createCell(1).setCellValue(queryData[8] + queryData[9] + queryData[10]);

            row = spreadsheet.createRow((short) 12);
            row.createCell(0).setCellValue("Telefono:");
            row.createCell(1).setCellValue(queryData[11]);

            row = spreadsheet.createRow((short) 13);
            row.createCell(0).setCellValue("Celular:");
            row.createCell(1).setCellValue(queryData[12]);

            row = spreadsheet.createRow((short) 14);
            row.createCell(0).setCellValue("Directo:");
            row.createCell(1).setCellValue(queryData[13]);

            row = spreadsheet.createRow((short) 15);
            row.createCell(0).setCellValue("Extencion:");
            row.createCell(1).setCellValue(queryData[14]);

            row = spreadsheet.createRow((short) 16);
            row.createCell(0).setCellValue("Email:");
            row.createCell(1).setCellValue(queryData[15]);
            
            
            // Torre 
            HSSFRow rowt = spreadsheet.createRow(18);
            HSSFCell cellt = (HSSFCell) rowt.createCell((short) 18);
            rowt.createCell(1).setCellValue("DATOS DE LA TORRE EN " + estacion.toUpperCase());

            spreadsheet.addMergedRegion(
                    new CellRangeAddress(
                            18, //first row (0-based)
                            18, //last row (0-based)
                            1, //first column (0-based)
                            3 //last column (0-based)
                    )
            );

            row = spreadsheet.createRow((short) 20);
            row.createCell(0).setCellValue("Tipo de Torre:");
            row.createCell(1).setCellValue(queryData2[1]);

            row = spreadsheet.createRow((short) 21);
            row.createCell(0).setCellValue("Altura de la Torre:");
            row.createCell(1).setCellValue(queryData2[2] + " m ");

            row = spreadsheet.createRow((short) 22);
            row.createCell(0).setCellValue("Estado:");
            row.createCell(1).setCellValue(queryData2[3]);

            row = spreadsheet.createRow((short) 23);
            row.createCell(0).setCellValue("Ubicaciòn:");
            row.createCell(1).setCellValue(queryData2[4]);
            
            // Radios
            HSSFSheet radios = workbook.createSheet("Radios");
            HSSFRow row2 = radios.createRow(1);
            HSSFRow row3 = radios.createRow(3);
            HSSFCell cell2;

            row2.createCell(1).setCellValue("RADIOS EN LA ESTACION " + estacion.toUpperCase());
            radios.addMergedRegion(
                    new CellRangeAddress(
                            1, //first row (0-based)
                            1, //last row (0-based)
                            1, //first column (0-based)
                            9 //last column (0-based)
                    )
            );

            cell2 = row3.createCell(0);
            cell2.setCellValue("No");
            cell2 = row3.createCell(1);
            cell2.setCellValue("DIRECCION");
            cell2 = row3.createCell(2);
            cell2.setCellValue("MARCA");
            cell2 = row3.createCell(3);
            cell2.setCellValue("MODELO");
            cell2 = row3.createCell(4);
            cell2.setCellValue("GESTOR");
            cell2 = row3.createCell(5);
            cell2.setCellValue("IP");
            cell2 = row3.createCell(6);
            cell2.setCellValue("BANDWIDTH");
            cell2 = row3.createCell(7);
            cell2.setCellValue("FORMATO");
            cell2 = row3.createCell(8);
            cell2.setCellValue("TIPO");
            cell2 = row3.createCell(9);
            cell2.setCellValue("CONFIGURACION");
            int k = 4;

            ArrayList<RadioBuscador> data = buscarRadios(estacion);
            int longitud = data.size();
            for (int i = 0; i < longitud; i++) {
                row = radios.createRow(k);

                cell = row.createCell(0);
                cell.setCellValue(i + 1);
                cell = row.createCell(1);
                cell.setCellValue(data.get(i).getEstacion() + " - " + data.get(i).getDireccion());
                cell = row.createCell(2);
                cell.setCellValue(data.get(i).getRadioMarca());
                cell = row.createCell(3);
                cell.setCellValue(data.get(i).getRadioModelo());
                cell = row.createCell(4);
                cell.setCellValue(data.get(i).getRadioGestor());
                cell = row.createCell(5);
                cell.setCellValue(data.get(i).getRadioIP());
                cell = row.createCell(6);
                cell.setCellValue(data.get(i).getBandwidth() + " Mbps ");
                cell = row.createCell(7);
                cell.setCellValue(data.get(i).getFormato());
                cell = row.createCell(8);
                cell.setCellValue(data.get(i).getRadioTipo());
                cell = row.createCell(9);
                cell.setCellValue(data.get(i).getConfig());
                k++;
            } // Fin de for
            
            // Antenas en la Estacion
            HSSFSheet antenas = workbook.createSheet("Antenas");
            HSSFRow row4 = antenas.createRow(1);
            HSSFRow row5 = antenas.createRow(3);
            HSSFCell cell3;

            row4.createCell(1).setCellValue("ANTENAS DE RADIOS EN " + estacion.toUpperCase());
            antenas.addMergedRegion(
                    new CellRangeAddress(
                            1, //first row (0-based)
                            1, //last row (0-based)
                            1, //first column (0-based)
                            6 //last column (0-based)
                    )
            );

            cell3 = row5.createCell(0);
            cell3.setCellValue("No");
            cell3 = row5.createCell(1);
            cell3.setCellValue("RADIO");
            cell3 = row5.createCell(2);
            cell3.setCellValue("MARCA");
            cell3 = row5.createCell(3);
            cell3.setCellValue("MODELO");
            cell3 = row5.createCell(4);
            cell3.setCellValue("DIAMETRO");
            int m = 4;

            ArrayList<AntenaBuscador> data2 = buscarAtenas(estacion);
            int longitud2 = data2.size();

            for (int i = 0; i < longitud2; i++) {
                rowt = antenas.createRow(m);

                cell = rowt.createCell(0);
                cell.setCellValue(i + 1);
                cell = rowt.createCell(1);
                cell.setCellValue(data2.get(i).getEst() + " - " + data2.get(i).getDir());
                cell = rowt.createCell(2);
                cell.setCellValue(data2.get(i).getMarca());
                cell = rowt.createCell(3);
                cell.setCellValue(data2.get(i).getModelo());
                cell = rowt.createCell(4);
                cell.setCellValue(data2.get(i).getDiamtro() + " m ");
                m++;
            } // Fin de for

            // Lineas de TX en la Estacion
            HSSFSheet lineasTX = workbook.createSheet("Lineas");
            HSSFRow row6 = lineasTX.createRow(1);
            HSSFRow row7 = lineasTX.createRow(3);
            HSSFCell cell4;

            row6.createCell(1).setCellValue("LINEAS TX DE LOS RADIOS EN " + estacion.toUpperCase());
            lineasTX.addMergedRegion(
                    new CellRangeAddress(
                            1, //first row (0-based)
                            1, //last row (0-based)
                            1, //first column (0-based)
                            6 //last column (0-based)
                    )
            );

            cell4 = row7.createCell(0);
            cell4.setCellValue("No");
            cell4 = row7.createCell(1);
            cell4.setCellValue("RADIO");
            cell4 = row7.createCell(2);
            cell4.setCellValue("TIPO");
            cell4 = row7.createCell(3);
            cell4.setCellValue("LONGTUD");
            int n = 4;

            ArrayList<LineasBuscador> data3 = buscarLineas(estacion);
            int longitud3 = data3.size();

            for (int i = 0; i < longitud3; i++) {
                rowt = lineasTX.createRow(n);
                cell = rowt.createCell(0);
                cell.setCellValue(i + 1);
                cell = rowt.createCell(1);
                cell.setCellValue(data3.get(i).getEst() + " - " + data3.get(i).getDir());
                cell = rowt.createCell(2);
                cell.setCellValue(data3.get(i).getTipoL());
                cell = rowt.createCell(3);
                cell.setCellValue(data3.get(i).getLongi() + " m ");
                n++;
            } // Fin de for

            // Plantas de Fuerza
            HSSFSheet plantaFZ = workbook.createSheet("Plantas Fza");
            HSSFRow row8 = plantaFZ.createRow(1);
            HSSFRow row9 = plantaFZ.createRow(3);
            HSSFCell cell5;

            row8.createCell(1).setCellValue("PLANTAS DE FUERZA EN " + estacion.toUpperCase());
            plantaFZ.addMergedRegion(
                    new CellRangeAddress(
                            1, //first row (0-based)
                            1, //last row (0-based)
                            1, //first column (0-based)
                            6 //last column (0-based)
                    )
            );

            cell5 = row9.createCell(0);
            cell5.setCellValue("No");
            cell5 = row9.createCell(1);
            cell5.setCellValue("No SERIE");
            cell5 = row9.createCell(2);
            cell5.setCellValue("MARCA");
            cell5 = row9.createCell(3);
            cell5.setCellValue("MODELO");
            cell5 = row9.createCell(4);
            cell5.setCellValue("CAPACIDAD");
            cell5 = row9.createCell(5);
            cell5.setCellValue("DESCRIPCION");
            int o = 4;

            ArrayList<PlantasBuscador> data4 = buscarPlantasF(estacion);
            int longitud4 = data4.size();
            for (int i = 0; i < longitud4; i++) {
                rowt = plantaFZ.createRow(o);
                cell = rowt.createCell(0);
                cell.setCellValue(i + 1);
                cell = rowt.createCell(1);
                cell.setCellValue(data4.get(i).getNumS());
                cell = rowt.createCell(2);
                cell.setCellValue(data4.get(i).getMarca());
                cell = rowt.createCell(3);
                cell.setCellValue(data4.get(i).getModelo());
                cell = rowt.createCell(4);
                cell.setCellValue(data4.get(i).getCapacidad() + " A ");
                cell = rowt.createCell(5);
                cell.setCellValue(data4.get(i).getDesc());
                o++;
            } // Fin de for

            // Motogeneradores
            HSSFSheet motoGR = workbook.createSheet("Motogenerador");
            HSSFRow row10 = motoGR.createRow(1);
            HSSFRow row11 = motoGR.createRow(3);
            HSSFCell cell6;

            row10.createCell(1).setCellValue("MOTOGENERADORES EN " + estacion.toUpperCase());
            motoGR.addMergedRegion(
                    new CellRangeAddress(
                            1, //first row (0-based)
                            1, //last row (0-based)
                            1, //first column (0-based)
                            6 //last column (0-based)
                    )
            );

            cell6 = row11.createCell(0);
            cell6.setCellValue("No");
            cell6 = row11.createCell(1);
            cell6.setCellValue("No SERIE");
            cell6 = row11.createCell(2);
            cell6.setCellValue("MARCA");
            cell6 = row11.createCell(3);
            cell6.setCellValue("MODELO");
            cell6 = row11.createCell(4);
            cell6.setCellValue("CAPACIDAD");
            cell6 = row11.createCell(5);
            cell6.setCellValue("DESCRIPCION");
            int p = 4;

            ArrayList<MotoBuscador> data5 = buscarMotogens(estacion);
            int longitud5 = data5.size();

            for (int i = 0; i < longitud5; i++) {
                rowt = motoGR.createRow(p);
                cell = rowt.createCell(0);
                cell.setCellValue(i + 1);
                cell = rowt.createCell(1);
                cell.setCellValue(data5.get(i).getNumS());
                cell = rowt.createCell(2);
                cell.setCellValue(data5.get(i).getMarca());
                cell = rowt.createCell(3);
                cell.setCellValue(data5.get(i).getModelo());
                cell = rowt.createCell(4);
                cell.setCellValue(data5.get(i).getCapacidad() + " KW ");
                cell = rowt.createCell(5);
                cell.setCellValue(data5.get(i).getDesc());
                p++;
            } // Fin de for

            workbook.write(fileOut);
            fileOut.flush();
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    } // Fin del metdo reporte
    
    
    
    
    
    
    
} // fin de la clase
