/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ve.techcare.vistas;

/**
 *
 * @author Carlos Hernandez
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDeFondo = new javax.swing.JPanel();
        tituloPrincipal_lb = new javax.swing.JLabel();
        inicioDeSesion_lb = new javax.swing.JLabel();
        nombreUsuario_lb = new javax.swing.JLabel();
        contraseña_lb = new javax.swing.JLabel();
        registrarse_lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDeFondo.setBackground(new java.awt.Color(255, 255, 255));

        tituloPrincipal_lb.setFont(new java.awt.Font("Segoe UI", 1, 29)); // NOI18N
        tituloPrincipal_lb.setForeground(new java.awt.Color(0, 0, 0));
        tituloPrincipal_lb.setText("TechCare");

        inicioDeSesion_lb.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        inicioDeSesion_lb.setForeground(new java.awt.Color(0, 0, 0));
        inicioDeSesion_lb.setText("INICIO DE SESION");

        nombreUsuario_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreUsuario_lb.setForeground(new java.awt.Color(0, 0, 0));
        nombreUsuario_lb.setText("Nombre de Usuario");

        contraseña_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña_lb.setForeground(new java.awt.Color(0, 0, 0));
        contraseña_lb.setText("Contraseña");

        registrarse_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registrarse_lb.setForeground(new java.awt.Color(0, 0, 204));
        registrarse_lb.setText("Registrarse");

        javax.swing.GroupLayout panelDeFondoLayout = new javax.swing.GroupLayout(panelDeFondo);
        panelDeFondo.setLayout(panelDeFondoLayout);
        panelDeFondoLayout.setHorizontalGroup(
            panelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeFondoLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(panelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeFondoLayout.createSequentialGroup()
                        .addComponent(tituloPrincipal_lb)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeFondoLayout.createSequentialGroup()
                        .addGroup(panelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreUsuario_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicioDeSesion_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseña_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeFondoLayout.createSequentialGroup()
                        .addComponent(registrarse_lb)
                        .addGap(40, 40, 40))))
        );
        panelDeFondoLayout.setVerticalGroup(
            panelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPrincipal_lb)
                .addGap(42, 42, 42)
                .addComponent(inicioDeSesion_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(nombreUsuario_lb)
                .addGap(72, 72, 72)
                .addComponent(contraseña_lb)
                .addGap(66, 66, 66)
                .addComponent(registrarse_lb)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDeFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDeFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contraseña_lb;
    private javax.swing.JLabel inicioDeSesion_lb;
    private javax.swing.JLabel nombreUsuario_lb;
    private javax.swing.JPanel panelDeFondo;
    private javax.swing.JLabel registrarse_lb;
    private javax.swing.JLabel tituloPrincipal_lb;
    // End of variables declaration//GEN-END:variables
}
