package ve.techcare.vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import ve.techcare.servicios.utilidades.ConexionBaseDatos;

/**
 *
 * @author Carlos Hernandez
 */
public class GraficaEstatus extends javax.swing.JFrame {

    /**
     * Creates new form GraficaEstatus
     */
    public GraficaEstatus() {
        initComponents();

        graficarEstatus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        titulo_lb = new javax.swing.JLabel();
        footer_lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setPreferredSize(new java.awt.Dimension(1040, 665));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_lb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo_lb.setForeground(new java.awt.Color(0, 0, 0));
        titulo_lb.setText("Grafica de los Equipos según su Estatus");
        panelFondo.add(titulo_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 460, 40));

        footer_lb.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        footer_lb.setForeground(new java.awt.Color(0, 0, 0));
        footer_lb.setText("TechCare® System ");
        panelFondo.add(footer_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 240, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraficaEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficaEstatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel footer_lb;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel titulo_lb;
    // End of variables declaration//GEN-END:variables

    private static void graficarEstatus() {

        // OBTENCION DEL CONTEO DE LOS ESTATUS DESDE LA BASE DE DATOS.
        int nuevoIngreso = 0, enRevision = 0, reparado = 0, noReparado = 0, entregado = 0;

        try (Connection con = ConexionBaseDatos.conectar(); PreparedStatement ps = con.prepareStatement(
                "SELECT status, COUNT(*) AS cantidad FROM equipments GROUP BY status"); ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {
                String estatus = rs.getString("estatus");
                int cantidad = rs.getInt("cantidad");

                switch (estatus) {
                    case "Nuevo Ingreso":
                        nuevoIngreso = cantidad;

                        break;
                    case "En Revision":
                        enRevision = cantidad;
                        break;
                    case "Reparado":
                        reparado = cantidad;
                        break;
                    case "No Reparado":
                        noReparado = cantidad;
                        break;
                    case "Entregado":
                        entregado = cantidad;
                        break;
                    default:
                        break;

                }

            }

            System.out.println("Nuevo Ingreso: " + nuevoIngreso + " En Revision: " + enRevision + " Reparado: " + reparado);
            System.out.println("No Reparado: " + noReparado + " Entregado: " + entregado);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el conteo de los estatus para graficar.");
            System.out.println("Error en Obtener Cantidades de equipos segun su estatus");
            System.out.println(e);

        }

    }
}
