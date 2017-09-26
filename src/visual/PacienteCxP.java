/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

/**
 *
 * @author Miguel Angel
 */
public class PacienteCxP extends javax.swing.JFrame {

    /**
     * Creates new form PacienteCxP
     */
    public PacienteCxP() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("CONSULTA POR PROFESIONAL DE PACIENTES");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        texReg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        texNomb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        texApellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnBusca = new javax.swing.JButton();
        btnLimpia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        botMenuPaciente = new javax.swing.JButton();
        texNom = new javax.swing.JLabel();

        jButton4.setText("Volver a menu principal");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Consultas por Profesional");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PACIENTES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 220, 60));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("DATOS del PACIENTE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 153, -1));

        jLabel6.setText("Registro N°");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        texReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texRegActionPerformed(evt);
            }
        });
        getContentPane().add(texReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 68, -1));

        jLabel1.setText("Nombre/s:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        texNomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texNombActionPerformed(evt);
            }
        });
        getContentPane().add(texNomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 377, -1));

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        texApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(texApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 377, 21));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Consulta Médica");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 119, 20));

        jLabel8.setText("Especialidad");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 230, -1));

        btnBusca.setText("BUSCAR");
        getContentPane().add(btnBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 110, -1));

        btnLimpia.setText("LIMPIAR");
        btnLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                "Profesional", "Fecha", "Hora", "Consultorio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(40);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(2).setMinWidth(40);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(3).setMinWidth(40);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 700, 240));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 454, -1, 70));

        botMenuPaciente.setText("VOLVER");
        botMenuPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMenuPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(botMenuPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 120, -1));

        texNom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/profesionales 2.jpg"))); // NOI18N
        getContentPane().add(texNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 720, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texRegActionPerformed
        texReg.transferFocus();
    }//GEN-LAST:event_texRegActionPerformed

    private void botMenuPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMenuPacienteActionPerformed
      Pacientes paciente = new Pacientes();
        paciente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botMenuPacienteActionPerformed

    private void texNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texNombActionPerformed
        texNomb.transferFocus();
    }//GEN-LAST:event_texNombActionPerformed

    private void texApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texApellidoActionPerformed
        texApellido.transferFocus();
    }//GEN-LAST:event_texApellidoActionPerformed

    private void btnLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaActionPerformed
       texReg.setText("");
       texNomb.setText("");
       texApellido.setText("");
    }//GEN-LAST:event_btnLimpiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botMenuPaciente;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnLimpia;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField texApellido;
    private javax.swing.JLabel texNom;
    private javax.swing.JTextField texNomb;
    private javax.swing.JTextField texReg;
    // End of variables declaration//GEN-END:variables
}
