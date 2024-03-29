/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.BomberoData;
import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class BomberosXBrigadasView extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel() {
    
    @Override
    public boolean isCellEditable(int fila, int columna){
    return false;
    }
    };
    /**
     * Creates new form BomberosXBrigadas
     */
    public BomberosXBrigadasView() {
        initComponents();
        armarCabecera();
        llenarCombobox();
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
        jLabel2 = new javax.swing.JLabel();
        jcBrigadas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBomberos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOMBREROS X BRIGADA");

        jLabel2.setText("Seleccione la Brigada");

        jcBrigadas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcBrigadasItemStateChanged(evt);
            }
        });

        tablaBomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaBomberos);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bomberos");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(44, 44, 44)
                            .addComponent(jcBrigadas, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcBrigadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcBrigadasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcBrigadasItemStateChanged
        limpiarTabla();
        ArrayList<Brigada> brigadas = new ArrayList<>();
        BrigadaData bd = new BrigadaData();
        brigadas = bd.listarBrigada();
        if (jcBrigadas.getSelectedIndex() != 0) {
            int num = jcBrigadas.getSelectedIndex();
            Brigada b = brigadas.get(num - 1);
            BomberoData bomd = new BomberoData();
            ArrayList<Bombero> bomberos = bomd.listarBomberosPorBrigadas(b.getCodigo());
            for (Bombero bb : bomberos) {
                if (bb.isEstado()) {
                    modelo.addRow(new Object[]{bb.getDni(), bb.getNombre(), bb.getApellido(), bb.getFechaNac(), bb.getCelular(), bb.getGrupoSanguineo(),"Activo"});
                } else {
                    modelo.addRow(new Object[]{bb.getDni(), bb.getNombre(), bb.getApellido(), bb.getFechaNac(), bb.getCelular(), bb.getGrupoSanguineo(), "Inactivo"});
                }
            }
        }

    }//GEN-LAST:event_jcBrigadasItemStateChanged

    private void armarCabecera() {
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Celular");
        modelo.addColumn("Grupo Sanguìneo");
        modelo.addColumn("Estado");
        tablaBomberos.setModel(modelo);
    }
    public void llenarCombobox() {
        Brigada b = new Brigada();
        ArrayList<Brigada> brigadas = new ArrayList<>();
        BrigadaData bd = new BrigadaData();
        brigadas = bd.listarBrigada();
        jcBrigadas.addItem("Seleccione la Brigada");
        for (Brigada brigada : brigadas) {
            jcBrigadas.addItem(brigada.toString());
        }
    }

    private void limpiarTabla() {
        for (int i = 0; i < tablaBomberos.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcBrigadas;
    private javax.swing.JTable tablaBomberos;
    // End of variables declaration//GEN-END:variables
}
