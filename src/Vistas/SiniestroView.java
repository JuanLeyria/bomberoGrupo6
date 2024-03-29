/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.SiniestroData;
import Entidades.Siniestro;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class SiniestroView extends javax.swing.JInternalFrame {

    /**
     * Creates new form SIniestroView
     */
    public SiniestroView() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtCoordenadasX = new javax.swing.JTextField();
        jtCoordenadasY = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalles = new javax.swing.JTextArea();
        jbCrear = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcTipoSiniestro = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Tipo de siniestro");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Coordenadas X");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Coordenadas Y");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Detalles");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("SINIESTRO");

        jtCoordenadasX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCoordenadasXKeyTyped(evt);
            }
        });

        jtCoordenadasY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCoordenadasYKeyTyped(evt);
            }
        });

        jtDetalles.setColumns(20);
        jtDetalles.setRows(5);
        jScrollPane1.setViewportView(jtDetalles);

        jbCrear.setText("Crear");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcTipoSiniestro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione especialidad", "Incendios en viviendas e industrias", "Salvamento en derrumbes", "Rescates en ámbito montaña", "Rescate de personas atrapadas en accidentes de tráfico", "Socorrer inundaciones", "Operativos de prevención" }));
        jcTipoSiniestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoSiniestroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCoordenadasX)
                    .addComponent(jtCoordenadasY)
                    .addComponent(jcTipoSiniestro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(136, 136, 136))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jbCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcTipoSiniestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtCoordenadasX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtCoordenadasY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbCrear))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        Siniestro a = new Siniestro();
        boolean h = true;
         try {
                 a.setCoordX(Double.parseDouble(jtCoordenadasX.getText()));
        a.setCoordY(Double.parseDouble(jtCoordenadasY.getText()));
            } catch (Exception e) {
                h = false;
            }
        
        if(h==true){
        if (jcTipoSiniestro.getSelectedIndex() != 0 && jtCoordenadasX.getText().length() > 0 && jtCoordenadasY.getText().length() > 0 && jtDetalles.getText().length() > 0) {
            Siniestro s = new Siniestro();
            SiniestroData sd = new SiniestroData();
            s.setTipo((String) jcTipoSiniestro.getSelectedItem());
            s.setCoordX(Double.parseDouble(jtCoordenadasX.getText()));
            s.setCoordY(Double.parseDouble(jtCoordenadasY.getText()));
            s.setDetalles(jtDetalles.getText());
            s.setEstado(true);
            s.setFechaSiniestro(LocalDate.now());
            s.setHoraSiniestro(Time.valueOf(LocalTime.now()));
            sd.guardarSiniestro(s);
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Complete todos los campos");
        }
        }else{
        JOptionPane.showMessageDialog(this, "Complete correctamente las coordenadas");
        }
  
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jcTipoSiniestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoSiniestroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTipoSiniestroActionPerformed

    private void jtCoordenadasXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCoordenadasXKeyTyped
       char caracter=evt.getKeyChar();
        if ((caracter < '0' || caracter > '9') && (caracter != '.'||jtCoordenadasX.getText().contains(".")) && (caracter != '-'||jtCoordenadasX.getText().contains("-"))) {
           evt.consume();
        }
    }//GEN-LAST:event_jtCoordenadasXKeyTyped

    private void jtCoordenadasYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCoordenadasYKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter < '0' || caracter > '9') && (caracter != '.'||jtCoordenadasY.getText().contains(".")) && (caracter != '-'||jtCoordenadasY.getText().contains("-"))) {
           evt.consume();
        }
    }//GEN-LAST:event_jtCoordenadasYKeyTyped
 private void limpiarCampos() {
        
        jcTipoSiniestro.setSelectedIndex(0);
        jtCoordenadasX.setText("");
        jtCoordenadasY.setText("");
        jtDetalles.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcTipoSiniestro;
    private javax.swing.JTextField jtCoordenadasX;
    private javax.swing.JTextField jtCoordenadasY;
    private javax.swing.JTextArea jtDetalles;
    // End of variables declaration//GEN-END:variables
}
