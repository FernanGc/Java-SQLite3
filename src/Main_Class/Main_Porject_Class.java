package Main_Class;

import App_Main_View.Menu_Principal;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class Main_Porject_Class {
    
    public static void main(String[] args) {

        try {
            UIManager.put("RootPane.setupButtonVisible", false);
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se cargo BeautyEye", "Error", JOptionPane.ERROR_MESSAGE);
        }
            Menu_Principal mainMenu = new Menu_Principal();
            mainMenu.setVisible(true);
            mainMenu.setLocationRelativeTo(null);
    //        mainMenu.Select_Estacion();
    } // Fin de main
} // Fin de la clase
