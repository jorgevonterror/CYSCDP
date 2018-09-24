/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jorgeantoniogarciagomez
 */
public class Participantes extends javax.swing.JInternalFrame {

    Conexion mConexion = new Conexion();
    int  idParticipante = 0, Semestre = 0, Equipos_idEquipos = 0, IDEquipo=0;
    String NombreParticipante, Carrera;
    DatosParticipante mDatosParticipante;
    DefaultTableModel Tabla = new DefaultTableModel();
    private int Selec = 0;
    private int ID = 0;
    /**
     * Creates new form Participantes
     */
    public Participantes() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTnombre = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BTNguardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CBequipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        LBL_Mensajero = new javax.swing.JLabel();
        CBcarrera = new javax.swing.JComboBox<>();
        CBsemestre = new javax.swing.JComboBox<>();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_Participantes = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CBcar = new javax.swing.JComboBox<>();
        CBeq = new javax.swing.JComboBox<>();
        LBLmen = new javax.swing.JLabel();
        TXTnom = new javax.swing.JTextField();
        TXTsem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BTNmod = new javax.swing.JButton();
        LBLid = new javax.swing.JLabel();

        setBorder(null);

        jPanel2.setBackground(new java.awt.Color(71, 120, 197));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X");
        jLabel5.setToolTipText("Presione para salir");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jLabel5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel5KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APARTADO PARTICIPANTES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addGap(113, 113, 113)
                .addComponent(jLabel5)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setText("Nombre:");

        jScrollPane1.setViewportView(TXTnombre);

        jLabel3.setText("Carrera:");

        jLabel4.setText("Semestre:");

        BTNguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/16 (User add).jpg"))); // NOI18N
        BTNguardar.setText("Dar de alta");
        BTNguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNguardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Equipo:");

        jLabel7.setText("Presione dar de alta para guardar el participante");

        CBcarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "II", "ISC", "ITICS", "IS", "IC" }));

        CBsemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(CBequipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(CBcarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(LBL_Mensajero, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BTNguardar))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CBcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CBequipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(BTNguardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBL_Mensajero, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(92, 92, 92))
        );

        jTabbedPane1.addTab("Alta", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Dar de baja un participante.", jPanel3);

        jTabbedPane1.addTab("Baja", jTabbedPane2);

        tbl_Participantes.setModel(Tabla);
        tbl_Participantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ParticipantesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_Participantes);

        jLabel12.setText("Nombre: ");

        jLabel13.setText("Semestre: ");

        CBcar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISC", "II", "ITICS", "IS", "IC" }));

        LBLmen.setText("*");

        TXTsem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTsemKeyTyped(evt);
            }
        });

        jLabel8.setText("Carrera: ");

        jLabel9.setText("Equipo: ");

        BTNmod.setText("Modificar");
        BTNmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNmodActionPerformed(evt);
            }
        });

        LBLid.setText("ID");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LBLid)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TXTsem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel9)))
                                .addGap(160, 160, 160)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(LBLmen, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNmod))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(TXTnom, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBeq, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBcar, 0, 130, Short.MAX_VALUE))))
                        .addGap(30, 30, 30))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CBcar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TXTnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(CBeq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTsem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LBLmen)
                        .addComponent(LBLid))
                    .addComponent(BTNmod, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Modificar un participante.", jPanel4);

        jTabbedPane1.addTab("Cambios", jTabbedPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked
    public void LlenarComboEquipo() {
        CBequipo.addItem("Ninguno");
        if (mConexion.conectar()) {
            ArrayList mArrayList = new ArrayList();
            mArrayList = mConexion.ConsultaNombresEquipos();

            if (mArrayList != null) {

                for (int i = 0; i < mArrayList.size(); i++) {
                    CBequipo.addItem(mArrayList.get(i).toString());
                }

            } else {
                LBL_Mensajero.setText("No tiene Equipos Dados de Alta");
            }
            mConexion.desconectar();
        } else {
            LBL_Mensajero.setText("No conectado a la BD");
        }
    }
    private void jLabel5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel5KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel5KeyPressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

    }//GEN-LAST:event_jPanel2MousePressed

    private void BTNguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNguardarActionPerformed
        // TODO add your handling code here:
        if (CBcarrera.getSelectedItem() == "Ninguna") {

        } else {
            if (CBcarrera.getSelectedItem() == "II") {
                Carrera = "II"; //Basico
            } else {
                if (CBcarrera.getSelectedItem() == "ISC") {
                    Carrera = "ISC"; //Medio
                } else {
                    if (CBcarrera.getSelectedItem() == "ITICS") {
                        Carrera = "ITICS"; //Avanzado
                    } else {
                        if (CBcarrera.getSelectedItem() == "IS") {
                            Carrera = "IS"; //Avanzado
                        } else {
                            if (CBcarrera.getSelectedItem() == "IC") {
                                Carrera = "IC"; //Avanzado
                            } else {
                                LBL_Mensajero.setText("Selecciona una Carrera");
                            }  
                        }
                    }
                }
            }
        }
        if (CBsemestre.getSelectedItem() == "Ninguno") {

        } else {
            if (CBsemestre.getSelectedItem() == "1") {
                Semestre = 1; //Basico
            } else {
                if (CBsemestre.getSelectedItem() == "2") {
                    Semestre = 2; //Medio
                } else {
                    if (CBsemestre.getSelectedItem() == "3") {
                        Semestre = 3; //Avanzado
                    } else {
                        if (CBsemestre.getSelectedItem() == "4") {
                            Semestre = 4; //Avanzado
                        } else {
                            if (CBsemestre.getSelectedItem() == "5") {
                                Semestre = 5; //Avanzado
                            } else {
                                if (CBsemestre.getSelectedItem() == "6") {
                                    Semestre = 6; //Avanzado
                                } else {
                                    if (CBsemestre.getSelectedItem() == "7") {
                                        Semestre = 7; //Avanzado
                                    } else {
                                        if (CBsemestre.getSelectedItem() == "8") {
                                            Semestre = 8; //Avanzado
                                        } else {
                                            if (CBsemestre.getSelectedItem() == "9") {
                                                Semestre = 9; //Avanzado
                                            } else {
                                                LBL_Mensajero.setText("Selecciona un Semestre");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        mDatosParticipante = new DatosParticipante();
        mDatosParticipante.setNombreParticipante(TXTnombre.getText());
        if (mConexion.conectar()) {
            if ((CBcarrera.getSelectedItem() != "Ninguna") && (CBsemestre.getSelectedItem() != "Ninguno") && (CBequipo.getSelectedItem() != "Ninguno")) {
                IDEquipo = mConexion.ConsultarIDEquipos(CBequipo.getSelectedItem().toString());
            } else {
                LBL_Mensajero.setText("Selecciona un equipo");
            }
            mConexion.desconectar();
        } else {
            LBL_Mensajero.setText("No conectado a la BD");
        }
        mDatosParticipante.setCarrera(Carrera);
        mDatosParticipante.setSemestre(Semestre);
        mDatosParticipante.setEquipos_idEquipos(IDEquipo);

        if (mConexion.conectar()) {
            if ((CBcarrera.getSelectedItem() != "Ninguna") && (CBsemestre.getSelectedItem() != "Ninguno") && (CBequipo.getSelectedItem() != "Ninguno") && (TXTnombre.getText()!=null)) {
                if (mConexion.AltaParticipante(mDatosParticipante)) {
                    LBL_Mensajero.setText("Se guardo el participante");
                    TXTnombre.setText("");
                    CBsemestre.setSelectedIndex(0);
                    CBcarrera.setSelectedIndex(0);
                    CBequipo.setSelectedIndex(0);
                }
            } else {
                LBL_Mensajero.setText("Favor de llenar bien los campos");
            }
            mConexion.desconectar();
        } else {
            LBL_Mensajero.setText("No conectado a la BD");
        }
    }//GEN-LAST:event_BTNguardarActionPerformed

    private void tbl_ParticipantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ParticipantesMouseClicked
        TXTnom.setText("");
        TXTsem.setText("");
        String EQtemp = "";
        Selec = tbl_Participantes.rowAtPoint(evt.getPoint());
        LBLid.setText(tbl_Participantes.getModel().getValueAt(Selec, 0).toString());
        TXTnom.setText(tbl_Participantes.getModel().getValueAt(Selec, 1).toString());
        TXTsem.setText(tbl_Participantes.getModel().getValueAt(Selec, 3).toString());
        EQtemp = (tbl_Participantes.getModel().getValueAt(Selec, 4).toString());
        for (int i = 0; i < CBeq.getItemCount(); i++) {
            if (EQtemp.equals(CBeq.getItemAt(i))) {
                CBeq.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_tbl_ParticipantesMouseClicked

    private void TXTsemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTsemKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_TXTsemKeyTyped

    public void ConsultaTabla() {
        int ID = 0;
        Tabla = (DefaultTableModel) tbl_Participantes.getModel();
        int a = Tabla.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            Tabla.removeRow(Tabla.getRowCount() - 1);
        }

        if (mConexion.conectar()) {
            ArrayList mListaParticipantes = mConexion.consultarParticipantes();
            String[] datos;

            for (Object mListaParticipante : mListaParticipantes) {
                datos = new String[5];
                mDatosParticipante = (DatosParticipante) mListaParticipante;
                datos[0] = "" + mDatosParticipante.getIdParticipante();
                datos[1] = mDatosParticipante.getNombreParticipante();
                datos[2] = mDatosParticipante.getCarrera();
                datos[3] = "" + mDatosParticipante.getSemestre();
                datos[4] = "" + mDatosParticipante.getEquipos_idEquipos();
                ID = Integer.parseInt(datos[4]);
                //datos[4] = mConexion.ConsultaNombresEquipos(ID);
                Tabla.addRow(datos);
            }
            this.tbl_Participantes = new javax.swing.JTable();
            this.tbl_Participantes.setModel(Tabla);
            this.tbl_Participantes.getColumnModel().getColumn(0).setPreferredWidth(50);
            this.tbl_Participantes.getColumnModel().getColumn(1).setPreferredWidth(300);
            this.tbl_Participantes.getColumnModel().getColumn(2).setPreferredWidth(300);
            this.tbl_Participantes.getColumnModel().getColumn(3).setPreferredWidth(300);
            this.tbl_Participantes.getColumnModel().getColumn(4).setPreferredWidth(300);
            if (this.tbl_Participantes.getRowCount() > 0) {
                this.tbl_Participantes.setRowSelectionInterval(0, 0);
            }
        } else {
            LBLmen.setText("Error al consultar los participantes");
        }
        mConexion.desconectar();
    }
    
    public boolean Validarcajas() {
        return !(TXTnom.getText().equals("") || TXTsem.getText().equals("") || Integer.parseInt(TXTsem.getText()) < 1);
    }
    
    private void BTNmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNmodActionPerformed
        DatosParticipante vParticipante = new DatosParticipante();
        DatosParticipante nParticipante = new DatosParticipante();

        if (Validarcajas()) {
            if (mConexion.conectar()) {
                ID = mConexion.ConsultarIDEquipos(CBeq.getSelectedItem().toString());
                vParticipante.setIdParticipante(Integer.parseInt(LBLid.getText()));
                nParticipante.setNombreParticipante(this.TXTnom.getText());
                nParticipante.setCarrera((String) CBcar.getSelectedItem());
                nParticipante.setSemestre(Integer.parseInt(this.TXTsem.getText()));
                nParticipante.setEquipos_idEquipos(ID);
                if (mConexion.ModificarParticipantes(vParticipante, nParticipante)) {
                    LBLmen.setText("Participante modificado exitosamente");
                } else {
                    LBLmen.setText("Error al modificar");
                }
            } else {
                LBLmen.setText("Error al conectar con la Base de Datos");
            }
            mConexion.desconectar();
        } else {
            LBLmen.setText("Por favor completa los campos");
        }
        ConsultaTabla();
    }//GEN-LAST:event_BTNmodActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNguardar;
    private javax.swing.JButton BTNmod;
    private javax.swing.JComboBox<String> CBcar;
    private javax.swing.JComboBox<String> CBcarrera;
    private javax.swing.JComboBox<String> CBeq;
    private javax.swing.JComboBox<String> CBequipo;
    private javax.swing.JComboBox<String> CBsemestre;
    private javax.swing.JLabel LBL_Mensajero;
    private javax.swing.JLabel LBLid;
    private javax.swing.JLabel LBLmen;
    private javax.swing.JTextField TXTnom;
    private javax.swing.JTextPane TXTnombre;
    private javax.swing.JTextField TXTsem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable tbl_Participantes;
    // End of variables declaration//GEN-END:variables
}
