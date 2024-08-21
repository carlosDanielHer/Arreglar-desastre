/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ve.techcare.vistas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import ve.techcare.servicios.utilidades.ConexionBaseDatos;

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
        this.setLocationRelativeTo(null);

        setIcon();  // Establece el icono en la interfaz
        mostrarOcultarLabelRegistrarseLB(); // Muestra o no la etiqueta de registrarse_lb
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
        nombreUsuario_txt = new javax.swing.JTextField();
        contraseña_txt = new javax.swing.JTextField();
        acceder_btt = new javax.swing.JButton();

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
        registrarse_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarse_lbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarse_lbMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarse_lbMousePressed(evt);
            }
        });

        acceder_btt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        acceder_btt.setForeground(new java.awt.Color(0, 0, 0));
        acceder_btt.setText("Acceder");
        acceder_btt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceder_bttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDeFondoLayout = new javax.swing.GroupLayout(panelDeFondo);
        panelDeFondo.setLayout(panelDeFondoLayout);
        panelDeFondoLayout.setHorizontalGroup(
            panelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeFondoLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(panelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombreUsuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addGap(40, 40, 40)))
                        .addComponent(contraseña_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeFondoLayout.createSequentialGroup()
                        .addComponent(acceder_btt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreUsuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contraseña_lb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseña_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registrarse_lb)
                .addGap(18, 18, 18)
                .addComponent(acceder_btt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void acceder_bttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceder_bttActionPerformed
        String username= nombreUsuario_txt.getText().trim();
        String contraseña= contraseña_txt.getText().trim();
        
        if(!username.isEmpty() && !contraseña.isEmpty()){
            try {
                Connection conexion = ConexionBaseDatos.conectar();
                PreparedStatement ps = conexion.prepareStatement("SELECT role,"
                        + " status FROM users WHERE username = ? and password = ?");

                ps.setString(1, username);
                ps.setString(2, contraseña);

                ResultSet resultados = ps.executeQuery();

                if (resultados.next()) {
                    String role = resultados.getString("role");
                    String status = resultados.getString("status");

                    conexion.close();
                    ps.close();
                    resultados.close();

                    switch (role) {
                        case "admin" -> {
                            if (status.equals("activo")) {
                                JOptionPane.showMessageDialog(null, "Administrador");
                            } else {
                                JOptionPane.showMessageDialog(null, "Usuario inactivo");
                            }
                        }
                            
                        case "captu" -> {
                            if (status.equals("activo")) {
                                JOptionPane.showMessageDialog(null, "Capturista");
                            } else {
                                JOptionPane.showMessageDialog(null, "Usuario inactivo");
                            }
                        }
                            
                        case "tec" -> {
                            if (status.equals("activo")) {
                                JOptionPane.showMessageDialog(null, "Tecnico");
                            } else {
                                JOptionPane.showMessageDialog(null, "Usuario inactivo");
                            }
                        }
                            
                        default -> {
                        }
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales Icorrectas");
                }

            } catch (HeadlessException | SQLException e) {
                System.out.println("Errro en el Boton Acceder de  la clase Login: " + e);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese sus credenciales");
        }
   
    }//GEN-LAST:event_acceder_bttActionPerformed

    private void registrarse_lbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarse_lbMousePressed
        this.dispose();
        new RegistrarPrimerUsuario().setVisible(true);
    }//GEN-LAST:event_registrarse_lbMousePressed

    private void registrarse_lbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarse_lbMouseEntered
        registrarse_lb.setForeground(new Color(0, 102, 255));
    }//GEN-LAST:event_registrarse_lbMouseEntered

    private void registrarse_lbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarse_lbMouseExited
        registrarse_lb.setForeground(new Color(0, 0, 204));
    }//GEN-LAST:event_registrarse_lbMouseExited

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
    private javax.swing.JButton acceder_btt;
    private javax.swing.JLabel contraseña_lb;
    private javax.swing.JTextField contraseña_txt;
    private javax.swing.JLabel inicioDeSesion_lb;
    private javax.swing.JLabel nombreUsuario_lb;
    private javax.swing.JTextField nombreUsuario_txt;
    private javax.swing.JPanel panelDeFondo;
    private javax.swing.JLabel registrarse_lb;
    private javax.swing.JLabel tituloPrincipal_lb;
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

    /*
    * Metodo que se encarga de ocultar o mostrar la etiqueta registrarse_lb.
    * La muestra si No existe ningun usuario con rol de administrador en la base de datos
    * No la muestra SI existe algun usuario con rol de adminstrador en la base de datos
     */
    private void mostrarOcultarLabelRegistrarseLB() {

        try (Connection cn = ConexionBaseDatos.conectar();
                PreparedStatement psr = cn.prepareStatement(
                "SELECT COUNT(*) FROM users WHERE role = 'admin' AND status = 'activo'");
            
                ResultSet rsr = psr.executeQuery()) {

            if (rsr.next()) {
                int c = rsr.getInt(1);

                if (c > 0) {
                    registrarse_lb.setEnabled(false);
                    registrarse_lb.setText("");
                } else {
                    registrarse_lb.setEnabled(true);
                    registrarse_lb.setText("Registrarse");
                }
            } else {
                registrarse_lb.setEnabled(true);
                registrarse_lb.setText("Registrarse");
            }

        } catch (SQLException e) {
            System.out.println("Error en determinar si existe Administrador en la base de datos: ");
            System.out.println(e);
            System.out.println("Clase: Login");
        }
    }

}