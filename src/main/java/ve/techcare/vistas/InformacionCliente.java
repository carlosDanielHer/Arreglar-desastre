
package ve.techcare.vistas;

/**
 *
 * @author Carlos Hernandez
 */
public class InformacionCliente extends javax.swing.JFrame {

    /** Creates new form InformacionCliente */
    public InformacionCliente() {
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

        panelFondo = new javax.swing.JPanel();
        titulo_lb = new javax.swing.JLabel();
        footer_lb = new javax.swing.JLabel();
        nombreCompleto_lb = new javax.swing.JLabel();
        nombreCompleto_txt = new javax.swing.JTextField();
        dni_lb = new javax.swing.JLabel();
        dni_txt = new javax.swing.JTextField();
        correo_lb = new javax.swing.JLabel();
        correo_txt = new javax.swing.JTextField();
        telefono_lb = new javax.swing.JLabel();
        telefono_txt = new javax.swing.JTextField();
        registradoPor_txt = new javax.swing.JTextField();
        registradoPor_lb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEquipos_tbl = new javax.swing.JTable();
        equiposRegistrados_lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setPreferredSize(new java.awt.Dimension(1040, 665));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_lb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo_lb.setForeground(new java.awt.Color(0, 0, 0));
        titulo_lb.setText("Informacion del Equipo");
        panelFondo.add(titulo_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 280, 40));

        footer_lb.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        footer_lb.setForeground(new java.awt.Color(0, 0, 0));
        footer_lb.setText("TechCare® System ");
        panelFondo.add(footer_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 240, 20));

        nombreCompleto_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreCompleto_lb.setForeground(new java.awt.Color(0, 0, 0));
        nombreCompleto_lb.setText("Nombre Completo");
        panelFondo.add(nombreCompleto_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        nombreCompleto_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(nombreCompleto_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 370, 60));

        dni_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dni_lb.setForeground(new java.awt.Color(0, 0, 0));
        dni_lb.setText("DNI (Cedula, Identificacion Nacional)");
        panelFondo.add(dni_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        dni_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(dni_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 370, 60));

        correo_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        correo_lb.setForeground(new java.awt.Color(0, 0, 0));
        correo_lb.setText("Correo Electronico");
        panelFondo.add(correo_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        correo_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(correo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 370, 60));

        telefono_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telefono_lb.setForeground(new java.awt.Color(0, 0, 0));
        telefono_lb.setText("Número de Telefono");
        panelFondo.add(telefono_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        telefono_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(telefono_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 370, 60));

        registradoPor_txt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelFondo.add(registradoPor_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 370, 60));

        registradoPor_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registradoPor_lb.setForeground(new java.awt.Color(0, 0, 0));
        registradoPor_lb.setText("Registrado / modificado por");
        panelFondo.add(registradoPor_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        listaEquipos_tbl.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        listaEquipos_tbl.setForeground(new java.awt.Color(0, 0, 0));
        listaEquipos_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nro", "Tipos", "Marcas", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaEquipos_tbl.setRowHeight(28);
        jScrollPane1.setViewportView(listaEquipos_tbl);

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 520, 230));

        equiposRegistrados_lb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        equiposRegistrados_lb.setForeground(new java.awt.Color(0, 0, 0));
        equiposRegistrados_lb.setText("Equipos Registrados");
        panelFondo.add(equiposRegistrados_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

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
            java.util.logging.Logger.getLogger(InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correo_lb;
    private javax.swing.JTextField correo_txt;
    private javax.swing.JLabel dni_lb;
    private javax.swing.JTextField dni_txt;
    private javax.swing.JLabel equiposRegistrados_lb;
    private javax.swing.JLabel footer_lb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaEquipos_tbl;
    private javax.swing.JLabel nombreCompleto_lb;
    private javax.swing.JTextField nombreCompleto_txt;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JLabel registradoPor_lb;
    private javax.swing.JTextField registradoPor_txt;
    private javax.swing.JLabel telefono_lb;
    private javax.swing.JTextField telefono_txt;
    private javax.swing.JLabel titulo_lb;
    // End of variables declaration//GEN-END:variables

}
