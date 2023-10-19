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
import java.awt.event.ItemEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class BomberoView extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form BomberoView
     */
    public BomberoView() {
        initComponents();
        LlenarCBCuarteles(2);
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
        jtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jtDNI = new javax.swing.JTextField();
        jtCelular = new javax.swing.JTextField();
        cbCuartel = new javax.swing.JComboBox<>();
        jdFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jcGrupoSanguineo = new javax.swing.JComboBox<>();
        jbBaja = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cbBrigada = new javax.swing.JComboBox<>();
        jbLimpiar = new javax.swing.JButton();
        jtEstado = new javax.swing.JTextField();
        jbAlta = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Fecha Nacimieto");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Celular");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Grupo sanguinio");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Estado");

        jtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDNIKeyTyped(evt);
            }
        });

        cbCuartel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCuartelItemStateChanged(evt);
            }
        });
        cbCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCuartelActionPerformed(evt);
            }
        });

        jdFechaNacimiento.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("BOMBERO");

        jbAgregar.setBackground(new java.awt.Color(153, 153, 153));
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(153, 153, 153));
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(204, 204, 204));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(153, 153, 153));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Brigada");

        jcGrupoSanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "B+", "0+", "AB+", "A-", "B-", "0-", "AB-" }));

        jbBaja.setText("Dar de Baja");
        jbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Cuartel");

        jbLimpiar.setText("Limpiar Campos");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jtEstado.setEditable(false);

        jbAlta.setText("Dar de Alta");
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtCelular, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbLimpiar)
                        .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlta))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbModificar)
                    .addComponent(jbSalir)
                    .addComponent(jbBaja))
                .addGap(29, 29, 29))
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

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
   
          this.dispose();

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        BomberoData bd = new BomberoData();       
        Bombero b= new Bombero();
        BrigadaData brd= new BrigadaData();
        Brigada bb= new Brigada();
        //b = bd.buscarBomberoPorDni(jtDNI.getText());
        if ( jtDNI.getText().length()!=0) {
            b = bd.buscarBomberoPorDni(jtDNI.getText());
        }else{
            JOptionPane.showMessageDialog(null,"Complete el campo DNI");
        }
        if (b.getIdBombero()!=0 ) {
            jtNombre.setText(b.getNombre());
            jtApellido.setText(b.getApellido());
            jtCelular.setText(b.getCelular());
            jcGrupoSanguineo.setSelectedItem(b.getGrupoSanguineo() + "");
            jdFechaNacimiento.setDate(Date.valueOf(b.getFechaNac()));
            if (b.isEstado()) {
                jtEstado.setText("Activo"); 
            }else{
                jtEstado.setText("Inactivo");
            }
            if (b.getBrigada() != null) {
                cbCuartel.removeAllItems();
                LlenarCBCuarteles(1);
              
                cbCuartel.setSelectedItem(b.getBrigada().getCuartel());
                cbBrigada.removeAllItems();
                LlenarCBBrigadas(b.getBrigada().getCuartel(), 1);
                cbBrigada.setSelectedItem(b.getBrigada());
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaActionPerformed
        Bombero b = new Bombero();
        BomberoData bd = new BomberoData(); 
        
        if (jtDNI.getText().length()!=0) {
            b = bd.buscarBomberoPorDni(jtDNI.getText());
            if (b.getDni()!=null) {              
                 bd.darDeBajaBombero(b.getIdBombero());
                 jtEstado.setText("Inactivo");
            }                  
        }else{
            JOptionPane.showMessageDialog(null,"complete el campo el DNI");
        }
    }//GEN-LAST:event_jbBajaActionPerformed

    private void jtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDNIKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter <'0' || caracter >'9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDNIKeyTyped

    private void cbCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCuartelActionPerformed
         /*Cuartel cuartel= (Cuartel)cbCuartel.getSelectedItem();
            BrigadaData bd= new BrigadaData();
            cbBrigada.removeAllItems();
            LlenarCBBrigadas(cuartel);  */
    }//GEN-LAST:event_cbCuartelActionPerformed

    private void cbCuartelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCuartelItemStateChanged
        if (evt.getStateChange()== ItemEvent.SELECTED) {
            Cuartel cuartel= (Cuartel)cbCuartel.getSelectedItem();
            BrigadaData bd= new BrigadaData();
            cbBrigada.removeAllItems();
            LlenarCBBrigadas(cuartel, 1);            
        }
    }//GEN-LAST:event_cbCuartelItemStateChanged

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // TODO add your handling code here:
        ////CONFIRMAR VACANTES DE BRIGADAS
        BrigadaData brd = new BrigadaData(); 
        Bombero b = new Bombero();
        BomberoData bd = new BomberoData(); 
       
        b.setApellido(jtApellido.getText());
        b.setNombre(jtNombre.getText());
        b.setCelular(jtCelular.getText());
        b.setEstado(true);
        b.setDni(jtDNI.getText());
        b.setGrupoSanguineo((String) jcGrupoSanguineo.getSelectedItem());
        b.setFechaNac(jdFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        if (cbBrigada.getSelectedItem()!=null) {
               b.setBrigada((Brigada) cbBrigada.getSelectedItem());
               
               if (brd.comprobarCapacidadBrigada(b.getBrigada().getCodigo())) {
                 bd.guardarBombero(b);
                 limpiarCampos();
            }else{
               JOptionPane.showMessageDialog(null,"La Brigada está completa. Elija otra Brigada");
               }    
        }else{
        JOptionPane.showMessageDialog(null,"Es necesario agregar al bombero en una Brigada");
        }
     
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
      limpiarCampos();
        
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
       Bombero b = new Bombero();
       BomberoData bd = new BomberoData();    
       BrigadaData brd = new BrigadaData(); 
        if (jtDNI.getText().length()!=0) {
            b = bd.buscarBomberoPorDni(jtDNI.getText());
            if (b.getDni()!=null) {   
                
                if (brd.comprobarCapacidadBrigada(b.getBrigada().getCodigo())){
                 bd.darDeAltaBombero(b.getIdBombero());
                 jtEstado.setText("Activo");
                }else{
                JOptionPane.showMessageDialog(null,"La Brigada ya está completa. Elija otra.");
                }
                
                
            }                  
        }else{
            JOptionPane.showMessageDialog(null,"complete el campo del DNI");
        }
    }//GEN-LAST:event_jbAltaActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        Bombero b = new Bombero();
        BomberoData bd = new BomberoData();
        BrigadaData brd = new BrigadaData(); 
        if (jtDNI.getText().length() != 0) {
            b.setNombre(jtNombre.getText());
            b.setApellido(jtApellido.getText());
            b.setFechaNac(jdFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            b.setCelular(jtCelular.getText());
            b.setGrupoSanguineo(jcGrupoSanguineo.getSelectedItem().toString());
            b.setBrigada((Brigada) cbBrigada.getSelectedItem());
            b.setIdBombero(bd.buscarBomberoPorDni(jtDNI.getText()).getIdBombero());
            b.setDni(jtDNI.getText());
            b.setEstado(bd.buscarBomberoPorDni(jtDNI.getText()).isEstado());
            
             if (brd.comprobarCapacidadBrigada(b.getBrigada().getCodigo())){
            bd.modificarBombero(b);
            limpiarCampos();           
             }else{
               JOptionPane.showMessageDialog(null,"La Brigada está completa. Elija otra Brigada");
               }
             
             
             
        }else{
             JOptionPane.showMessageDialog(null,"complete el campo del DNI");
        }

    }//GEN-LAST:event_jbModificarActionPerformed
    
    private void LlenarCBCuarteles(int j){
        Cuartel c= new Cuartel();
        ArrayList<Cuartel> cuarteles = new ArrayList<>();        
        CuartelData cd= new CuartelData();
        cuarteles = cd.listarCuartel();
       Cuartel cl = new  Cuartel("Seleccione el Cuartel");
        if (j!=1) {
          cbCuartel.addItem(cl);  
        }
        
        for (Cuartel cuartel : cuarteles) {
            cbCuartel.addItem(cuartel);
        }
    }
    private void LlenarCBBrigadas(Cuartel cuartel, int j){
        Brigada b= new Brigada();
        ArrayList<Brigada> brigadas = new ArrayList<>();        
        BrigadaData bd= new BrigadaData();
        brigadas = bd.listarBrigadasPorCuartel(cuartel.getCodigo());
        Brigada br = new Brigada("Seleccione la Brigada");
        if(j !=1){
        cbBrigada.addItem(br);
        }
        

        for (Brigada brigada : brigadas) {
            cbBrigada.addItem(brigada);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Brigada> cbBrigada;
    private javax.swing.JComboBox<Cuartel> cbCuartel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbAlta;
    private javax.swing.JButton jbBaja;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcGrupoSanguineo;
    private com.toedter.calendar.JDateChooser jdFechaNacimiento;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtEstado;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
public void limpiarCampos(){
jtNombre.setText("");
        jtDNI.setText("");
        jtApellido.setText("");
        jtCelular.setText("");
        jcGrupoSanguineo.setSelectedIndex(0);
        jdFechaNacimiento.setDate(null);
        jtEstado.setText("");
        cbCuartel.removeAllItems();
        LlenarCBCuarteles(2);
        cbBrigada.removeAllItems();


}

}
