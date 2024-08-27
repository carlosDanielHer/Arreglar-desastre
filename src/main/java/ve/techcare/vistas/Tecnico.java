package ve.techcare.vistas;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.imageio.ImageIO;

/**
 *
 * @author Carlos Hernandez
 */
public class Tecnico extends javax.swing.JFrame {

    /**
     * Creates new form Tecnico
     */
    public Tecnico() {
        initComponents();

        setIcon();
        setMensajeBienvenida();
        fechaFooter();
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
        bienvenido_lb = new javax.swing.JLabel();
        fechaActual_lb = new javax.swing.JLabel();
        horaActual_lb = new javax.swing.JLabel();
        footer_lb = new javax.swing.JLabel();
        gestionarEquipos_btt = new javax.swing.JButton();
        graficaEstatus_btt = new javax.swing.JButton();
        graficaMarcas_btt = new javax.swing.JButton();
        graficaTipos_btt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setPreferredSize(new java.awt.Dimension(1040, 655));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_lb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo_lb.setForeground(new java.awt.Color(0, 0, 0));
        titulo_lb.setText("TechCare: Panel Tecnico");
        panelFondo.add(titulo_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 420, 40));

        bienvenido_lb.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        bienvenido_lb.setForeground(new java.awt.Color(0, 0, 0));
        bienvenido_lb.setText("Bienvenido: ");
        panelFondo.add(bienvenido_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, -1));

        fechaActual_lb.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        fechaActual_lb.setForeground(new java.awt.Color(0, 0, 0));
        fechaActual_lb.setText("Hoy es: ");
        panelFondo.add(fechaActual_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 150, -1));

        horaActual_lb.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        horaActual_lb.setForeground(new java.awt.Color(0, 0, 0));
        horaActual_lb.setText("|");
        panelFondo.add(horaActual_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 110, -1));

        footer_lb.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        footer_lb.setForeground(new java.awt.Color(0, 0, 0));
        footer_lb.setText("TechCare® System ");
        panelFondo.add(footer_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 240, 20));

        gestionarEquipos_btt.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        gestionarEquipos_btt.setForeground(new java.awt.Color(0, 0, 0));
        gestionarEquipos_btt.setText("GESTIONAR EQUIPOS");
        gestionarEquipos_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarEquipos_bttActionPerformed(evt);
            }
        });
        panelFondo.add(gestionarEquipos_btt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 240, 110));

        graficaEstatus_btt.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        graficaEstatus_btt.setForeground(new java.awt.Color(0, 0, 0));
        graficaEstatus_btt.setText("GRAFICA ESTATUS");
        graficaEstatus_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficaEstatus_bttActionPerformed(evt);
            }
        });
        panelFondo.add(graficaEstatus_btt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 240, 110));

        graficaMarcas_btt.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        graficaMarcas_btt.setForeground(new java.awt.Color(0, 0, 0));
        graficaMarcas_btt.setText("GRAFICA MARCAS");
        graficaMarcas_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficaMarcas_bttActionPerformed(evt);
            }
        });
        panelFondo.add(graficaMarcas_btt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 240, 110));

        graficaTipos_btt.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        graficaTipos_btt.setForeground(new java.awt.Color(0, 0, 0));
        graficaTipos_btt.setText("GRAFICA TIPOS");
        graficaTipos_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficaTipos_bttActionPerformed(evt);
            }
        });
        panelFondo.add(graficaTipos_btt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 240, 110));

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

    private void gestionarEquipos_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarEquipos_bttActionPerformed

    }//GEN-LAST:event_gestionarEquipos_bttActionPerformed

    private void graficaEstatus_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaEstatus_bttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graficaEstatus_bttActionPerformed

    private void graficaMarcas_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaMarcas_bttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graficaMarcas_bttActionPerformed

    private void graficaTipos_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficaTipos_bttActionPerformed

    }//GEN-LAST:event_graficaTipos_bttActionPerformed

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
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido_lb;
    private javax.swing.JLabel fechaActual_lb;
    private javax.swing.JLabel footer_lb;
    private javax.swing.JButton gestionarEquipos_btt;
    private javax.swing.JButton graficaEstatus_btt;
    private javax.swing.JButton graficaMarcas_btt;
    private javax.swing.JButton graficaTipos_btt;
    private javax.swing.JLabel horaActual_lb;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel titulo_lb;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        try {
            BufferedImage originalImage = ImageIO.read(getClass().getResource("/imagenes/icono.png"));
            Image scaledImage = originalImage.getScaledInstance(27, 27, Image.SCALE_SMOOTH); // Cambia el tamaño según tus necesidades
            this.setIconImage(scaledImage);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setMensajeBienvenida() {
        String username = Login.usuario;
        bienvenido_lb.setText("Bienvenido: " + username);
    }
    
    private void fechaFooter() {
        LocalDateTime fechaHora = LocalDateTime.now();
        int year = fechaHora.getYear();
        String fechaFormateada = String.valueOf(year);

        footer_lb.setText("TechCare® System " + fechaFormateada);
    }
}
