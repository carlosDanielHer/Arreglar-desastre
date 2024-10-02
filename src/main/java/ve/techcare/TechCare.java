package ve.techcare;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import ve.techcare.vistas.Login;

/**
 *
 * @author Carlos Hernandez
 */
public class TechCare {

    public static void main(String[] args) {
       try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Crear y mostrar el JFrame
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
