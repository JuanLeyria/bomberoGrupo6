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
import java.sql.Date;
import java.time.ZoneId;
import java.util.ArrayList;
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
        LlenarCBCuarteles();
        jtApellido.setTransferHandler(null);
        jtNombre.setTransferHandler(null);
        jtCelular.setTransferHandler(null);
        jtDNI.setTransferHandler(null);
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
        jbLimpiar = new javax.swing.JButton();
        jtEstado = new javax.swing.JTextField();
        jbAlta = new javax.swing.JButton();
        cbCuartel = new javax.swing.JComboBox<>();
        cbBrigada = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
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

        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });

        jtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDNIActionPerformed(evt);
            }
        });
        jtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDNIKeyTyped(evt);
            }
        });

        jtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCelularKeyTyped(evt);
            }
        });

        jdFechaNacimiento.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        cbCuartel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCuartelItemStateChanged(evt);
            }
        });
        cbCuartel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbCuartelMousePressed(evt);
            }
        });
        cbCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCuartelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jcGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cbCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jbBuscar)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbLimpiar))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cbCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jbAlta)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAgregar)
                    .addComponent(jbModificar)
                    .addComponent(jbBaja)
                    .addComponent(jbSalir)))
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
        Bombero b = new Bombero();
        BrigadaData brd = new BrigadaData();
        Brigada bb = new Brigada();
        //b = bd.buscarBomberoPorDni(jtDNI.getText());
        if (jtDNI.getText().length() != 0) {
            b = bd.buscarBomberoPorDni(jtDNI.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Complete el campo DNI");
        }
        if (b.getIdBombero() != 0) {
            jtNombre.setText(b.getNombre());
            jtApellido.setText(b.getApellido());
            jtCelular.setText(b.getCelular());
            jcGrupoSanguineo.setSelectedItem(b.getGrupoSanguineo() + "");
            jdFechaNacimiento.setDate(Date.valueOf(b.getFechaNac()));
            if (b.isEstado()) {
                jtEstado.setText("Activo");
            } else {
                jtEstado.setText("Inactivo");
            }
            if (b.getBrigada() != null) {
                cbCuartel.removeAllItems();
                LlenarCBCuarteles();

                cbCuartel.setSelectedItem(b.getBrigada().getCuartel().toString());
                cbBrigada.removeAllItems();

                LlenarCBBrigadas(b.getBrigada().getCuartel(), 2);
                cbBrigada.setSelectedItem(b.getBrigada().toString());
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaActionPerformed
        try {
            
       
        Bombero b = new Bombero();
        BomberoData bd = new BomberoData();

        if (jtDNI.getText().length() != 0) {
            b = bd.buscarBomberoPorDni(jtDNI.getText());
            if (b.getDni() != null) {
                bd.darDeBajaBombero(b.getIdBombero());
                jtEstado.setText("Inactivo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "complete el campo el DNI");
        }
        limpiarCampos();
         } catch (Exception e) {
        }
    }//GEN-LAST:event_jbBajaActionPerformed

    private void jtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDNIKeyTyped
        char caracter = evt.getKeyChar();
        if ((caracter < '0' || caracter > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDNIKeyTyped

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        try {

            if (jtApellido.getText().length() > 0 && jtCelular.getText().length() > 0 && jtDNI.getText().length() > 0 && jtNombre.getText().length() > 0 && jcGrupoSanguineo.getSelectedItem().toString().isEmpty()
                    && cbBrigada.getSelectedItem().toString().isEmpty() && cbCuartel.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "La Brigada está completa. Elija otra Brigada");
            } else {
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
                if (cbBrigada.getSelectedItem() != null) {
                    ArrayList<Cuartel> cuarteles = new ArrayList<>();
                    CuartelData cd = new CuartelData();
                    cuarteles = cd.listarCuartel();
                    if (cbCuartel.getSelectedIndex() == 0) {
                        cbBrigada.removeAllItems();
                        cbBrigada.addItem("Seleccione la Brigada");
                    }
                    if (cbCuartel.getSelectedIndex() != 0) {
                        int num = cbCuartel.getSelectedIndex() - 1;
                        Cuartel c = cuarteles.get(num);
                        ArrayList<Brigada> brigadas = brd.listarBrigadasPorCuartel(c.getCodigo());

                        for (int i = 0; i < brigadas.size(); i++) {
                            System.out.println(brigadas.get(i));
                        }
                        if (brigadas != null) {
                            b.setBrigada(brigadas.get(cbBrigada.getSelectedIndex()));
                            if (brd.comprobarCapacidadBrigada(brigadas.get(cbBrigada.getSelectedIndex()).getCodigo())) {
                                bd.guardarBombero(b);
                                limpiarCampos();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "La Brigada está completa. Elija otra Brigada");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Es necesario agregar al bombero en una Brigada");
                    }
                }


    }//GEN-LAST:event_jbAgregarActionPerformed

        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }
    }
    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
        try {
            
        Bombero b = new Bombero();
        BomberoData bd = new BomberoData();
        BrigadaData brd = new BrigadaData();
        if (jtDNI.getText().length() != 0) {
            b = bd.buscarBomberoPorDni(jtDNI.getText());
            if (b.getDni() != null) {

                if (brd.comprobarCapacidadBrigada(b.getBrigada().getCodigo())) {
                    bd.darDeAltaBombero(b.getIdBombero());
                    jtEstado.setText("Activo");
                } else {
                    JOptionPane.showMessageDialog(null, "La Brigada ya está completa. Elija otra.");
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "complete el campo del DNI");
        }
        limpiarCampos();
                } catch (Exception e) {
        }
    }//GEN-LAST:event_jbAltaActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        //No Muestra el cuartel requerido
        Bombero b = new Bombero();
        BomberoData bd = new BomberoData();
        BrigadaData brd = new BrigadaData();
        if (jtDNI.getText().length() != 0) {
            if (jtNombre.getText().equals("") || jtApellido.getText().equals("") || jdFechaNacimiento == null || jtCelular.getText().equals("") || jcGrupoSanguineo.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Busque el bombero correspondiente");
            } else {
                b.setNombre(jtNombre.getText());
                b.setApellido(jtApellido.getText());
                b.setFechaNac(jdFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                b.setCelular(jtCelular.getText());
                b.setGrupoSanguineo(jcGrupoSanguineo.getSelectedItem().toString());

                CuartelData cd = new CuartelData();
                ArrayList<Cuartel> cuarteles = new ArrayList<>();
                cuarteles = cd.listarCuartel();
                Cuartel c = cuarteles.get(cbCuartel.getSelectedIndex() - 1);
                ArrayList<Brigada> brigadas = brd.listarBrigadasPorCuartel(c.getCodigo());

                b.setBrigada(brigadas.get(cbBrigada.getSelectedIndex()));

                b.setIdBombero(bd.buscarBomberoPorDni(jtDNI.getText()).getIdBombero());
                b.setDni(jtDNI.getText());
                b.setEstado(bd.buscarBomberoPorDni(jtDNI.getText()).isEstado());

                if (brd.comprobarCapacidadBrigada(b.getBrigada().getCodigo())) {
                    bd.modificarBombero(b);
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "La Brigada está completa. Elija otra Brigada");
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "complete el campo del DNI");

        }


    }//GEN-LAST:event_jbModificarActionPerformed

    private void cbCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCuartelActionPerformed

        /*
        ArrayList<Cuartel> cuarteles = new ArrayList<>();        
        CuartelData cd= new CuartelData();
        cuarteles = cd.listarCuartel();
        
        int num = cbCuartel.getSelectedIndex()-1;
         Cuartel c= cuarteles.get(num);
        cbBrigada.removeAllItems();
        
        LlenarCBBrigadas(c);
     
         */
    }//GEN-LAST:event_cbCuartelActionPerformed

    private void cbCuartelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCuartelItemStateChanged

            

        ArrayList<Cuartel> cuarteles = new ArrayList<>();
        CuartelData cd = new CuartelData();
        cuarteles = cd.listarCuartel();
        if (cbCuartel.getSelectedIndex() == 0) {
            cbBrigada.removeAllItems();
            cbBrigada.addItem("Seleccione la Brigada");
        }
        if (cbCuartel.getSelectedIndex() != 0) {
            int num = cbCuartel.getSelectedIndex() - 1;
            Cuartel c = cuarteles.get(num);

            cbBrigada.removeAllItems();

            LlenarCBBrigadas(c, 2);

        }
        
    }//GEN-LAST:event_cbCuartelItemStateChanged

    private void cbCuartelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCuartelMousePressed
        // TODO add your handling code here:


    }//GEN-LAST:event_cbCuartelMousePressed

    private void jtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCelularKeyTyped
        char caracter = evt.getKeyChar();
        if ((caracter < '0' || caracter > '9') && (caracter != '+' || jtCelular.getText().contains("+"))) {
            evt.consume();
        }
    }//GEN-LAST:event_jtCelularKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        char caracter = evt.getKeyChar();
        if ((caracter < 'a' || caracter > 'z') && (caracter < 'A' || caracter > 'Z') && (caracter != ' ' || jtNombre.getText().contains(" "))) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        char caracter = evt.getKeyChar();
        if ((caracter < 'a' || caracter > 'z') && (caracter < 'A' || caracter > 'Z') && (caracter != ' ' || jtApellido.getText().contains(" "))) {
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDNIActionPerformed

    private void LlenarCBCuarteles() {

        Cuartel c = new Cuartel();
        ArrayList<Cuartel> cuarteles = new ArrayList<>();
        CuartelData cd = new CuartelData();
        cuarteles = cd.listarCuartel();

        cbCuartel.addItem("Seleccione el Cuartel");
        for (Cuartel cuartel : cuarteles) {
            cbCuartel.addItem(cuartel.toString());
        }
        cbBrigada.addItem("Seleccione la Brigada");
    }

    private void LlenarCBBrigadas(Cuartel cuartel, int f) {
        Brigada b = new Brigada();
        ArrayList<Brigada> brigadas = new ArrayList<>();
        BrigadaData bd = new BrigadaData();
        brigadas = bd.listarBrigadasPorCuartel(cuartel.getCodigo());
        if (f == 1) {
            cbBrigada.addItem("Seleccione la Brigada");
        }

        for (Brigada brigada : brigadas) {
            cbBrigada.addItem(brigada.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbBrigada;
    private javax.swing.JComboBox<String> cbCuartel;
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
public void limpiarCampos() {
        jtNombre.setText("");
        jtDNI.setText("");
        jtApellido.setText("");
        jtCelular.setText("");
        jcGrupoSanguineo.setSelectedIndex(0);
        jdFechaNacimiento.setDate(null);
        jtEstado.setText("");
        cbBrigada.removeAllItems();
        cbCuartel.removeAllItems();
        LlenarCBCuarteles();

    }

}
