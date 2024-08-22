
package ve.techcare.vistas;

/**
 *
 * @author Carlos Hernandez
 */
public class RegistrarUsuario extends javax.swing.JFrame {

    /** Creates new form RegistrarUsuario */
    public RegistrarUsuario() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo_lb = new javax.swing.JLabel();
        nombreCompleto_lb = new javax.swing.JLabel();
        dni_lb = new javax.swing.JLabel();
        correo_lb = new javax.swing.JLabel();
        telefono_lb = new javax.swing.JLabel();
        nombreUsuario_lb = new javax.swing.JLabel();
        contraseña_lb = new javax.swing.JLabel();
        footer_lb = new javax.swing.JLabel();
        roles_lb = new javax.swing.JLabel();
        nombreCompleto_txt = new javax.swing.JTextField();
        dni_txt = new javax.swing.JTextField();
        correo_txt = new javax.swing.JTextField();
        telefono_txt = new javax.swing.JTextField();
        nombreUsuario_txt = new javax.swing.JTextField();
        contraseña_txt = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1040, 665));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_lb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo_lb.setForeground(new java.awt.Color(0, 0, 0));
        titulo_lb.setText("Registro Nuevo Usuario");
        jPanel1.add(titulo_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 290, 40));

        nombreCompleto_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreCompleto_lb.setForeground(new java.awt.Color(0, 0, 0));
        nombreCompleto_lb.setText("Nombre Completo");
        jPanel1.add(nombreCompleto_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        dni_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dni_lb.setForeground(new java.awt.Color(0, 0, 0));
        dni_lb.setText("DNI (Cedula, Identificacion Nacional)");
        jPanel1.add(dni_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        correo_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        correo_lb.setForeground(new java.awt.Color(0, 0, 0));
        correo_lb.setText("Correo Electronico");
        jPanel1.add(correo_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        telefono_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telefono_lb.setForeground(new java.awt.Color(0, 0, 0));
        telefono_lb.setText("Número de Telefono");
        jPanel1.add(telefono_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        nombreUsuario_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreUsuario_lb.setForeground(new java.awt.Color(0, 0, 0));
        nombreUsuario_lb.setText("Nombre de Usuario");
        jPanel1.add(nombreUsuario_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        contraseña_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña_lb.setForeground(new java.awt.Color(0, 0, 0));
        contraseña_lb.setText("Contraseña");
        jPanel1.add(contraseña_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        footer_lb.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        footer_lb.setForeground(new java.awt.Color(0, 0, 0));
        footer_lb.setText("TechCare® System ");
        jPanel1.add(footer_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 240, 20));

        roles_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        roles_lb.setForeground(new java.awt.Color(0, 0, 0));
        roles_lb.setText("Roles");
        jPanel1.add(roles_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        nombreCompleto_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPanel1.add(nombreCompleto_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 370, 60));

        dni_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPanel1.add(dni_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 370, 60));

        correo_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPanel1.add(correo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 370, 60));

        telefono_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPanel1.add(telefono_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 370, 60));

        nombreUsuario_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPanel1.add(nombreUsuario_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 370, 60));

        contraseña_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPanel1.add(contraseña_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 370, 60));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Administrador", "Capturista", "Tecnico" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 370, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contraseña_lb;
    private javax.swing.JTextField contraseña_txt;
    private javax.swing.JLabel correo_lb;
    private javax.swing.JTextField correo_txt;
    private javax.swing.JLabel dni_lb;
    private javax.swing.JTextField dni_txt;
    private javax.swing.JLabel footer_lb;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreCompleto_lb;
    private javax.swing.JTextField nombreCompleto_txt;
    private javax.swing.JLabel nombreUsuario_lb;
    private javax.swing.JTextField nombreUsuario_txt;
    private javax.swing.JLabel roles_lb;
    private javax.swing.JLabel telefono_lb;
    private javax.swing.JTextField telefono_txt;
    private javax.swing.JLabel titulo_lb;
    // End of variables declaration//GEN-END:variables

}
