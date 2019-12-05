/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.AlumnoDAO;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import modelo.Alumno;
import modelo.ResultSetTableModel;

/**
 *
 * @author casas
 */
public class InternalModificaciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalAltas
     */
    public InternalModificaciones() {
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
        comboCarrera = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cajaSegundoApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajaPrimerApellido = new javax.swing.JTextField();
        cajaNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaNumeroControl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        spinnerSemestre = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        spinnerEdad = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(580, 480));
        setMinimumSize(new java.awt.Dimension(580, 480));
        setPreferredSize(new java.awt.Dimension(580, 480));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MODIFICACIONES ALUMNOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        comboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir Carrera ...", "CP", "IA", "IM", "ISC", "LA" }));
        comboCarrera.setNextFocusableComponent(btnGuardar);
        comboCarrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboCarreraKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CARRERA:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("SEMESTRE:");

        cajaSegundoApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaSegundoApellido.setNextFocusableComponent(spinnerEdad);
        cajaSegundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaSegundoApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaNombresKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("SEGUNDO APELLIDO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("PRIMER APELLIDO:");

        cajaPrimerApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaPrimerApellido.setNextFocusableComponent(cajaSegundoApellido);
        cajaPrimerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaPrimerApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaNombresKeyTyped(evt);
            }
        });

        cajaNombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaNombres.setNextFocusableComponent(cajaPrimerApellido);
        cajaNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaNombresKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaNombresKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRES:");

        cajaNumeroControl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cajaNumeroControl.setNextFocusableComponent(btnBuscar);
        cajaNumeroControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaNumeroControlKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaNumeroControlKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NÚMERO DE CONTROL:");

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setNextFocusableComponent(cajaNombres);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setNextFocusableComponent(btnLimpiar);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setAlignmentY(0.0F);
        btnCancelar.setNextFocusableComponent(cajaNumeroControl);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Num. Control", "Nombres", "Ap. Paterno", "Ap. Materno", "Edad", "Semestre", "Carrera"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TablaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setAlignmentY(0.0F);
        btnGuardar.setNextFocusableComponent(btnCancelar);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        spinnerSemestre.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spinnerSemestre.setNextFocusableComponent(comboCarrera);

        spinnerEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spinnerEdad.setNextFocusableComponent(spinnerSemestre);
        spinnerEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spinnerEdadKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("EDAD:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cajaNumeroControl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cajaPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnerSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cajaNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaNumeroControl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        establecerComponentesDefault();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void TablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseReleased
        cajaNumeroControl.setText((String) Tabla.getValueAt(Tabla.getSelectedRow(), 0));
        cajaNombres.setText((String) Tabla.getValueAt(Tabla.getSelectedRow(), 1));
        cajaPrimerApellido.setText((String) Tabla.getValueAt(Tabla.getSelectedRow(), 2));
        cajaSegundoApellido.setText((String) Tabla.getValueAt(Tabla.getSelectedRow(), 3));
        spinnerEdad.setValue(Tabla.getValueAt(Tabla.getSelectedRow(), 4));
        spinnerSemestre.setValue(Tabla.getValueAt(Tabla.getSelectedRow(), 5));
        comboCarrera.setSelectedItem(Tabla.getValueAt(Tabla.getSelectedRow(), 6));
        habilitarCampos(true);
    }//GEN-LAST:event_TablaMouseReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(!cajaNumeroControl.getText().equals("")){
            Alumno al = ALUMNO_DAO.buscarAlumno(cajaNumeroControl.getText());
            if(al != null){
                cajaNombres.setText(al.getNombre());
                cajaPrimerApellido.setText(al.getPrimerAp());
                cajaSegundoApellido.setText(al.getSegundoAp());
                spinnerEdad.setValue(al.getEdad());
                spinnerSemestre.setValue(al.getSemestre());
                comboCarrera.setSelectedItem(al.getCarrera());
                habilitarCampos(true);
            }
            else
                JOptionPane.showMessageDialog(rootPane, "No se encotro al alumno.");
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Ingresa un numero de control a buscar.");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(verificarEstadoComponentes()){
            alumno = new Alumno(cajaNumeroControl.getText(), cajaNombres.getText(), cajaPrimerApellido.getText(), cajaSegundoApellido.getText(), (byte)(int)spinnerEdad.getValue(), (byte)(int)spinnerSemestre.getValue(), comboCarrera.getSelectedItem().toString());

            if(ALUMNO_DAO.modificarAlumno(alumno)){
                JOptionPane.showMessageDialog(rootPane, "Cambios guardados correctamente.");
                establecerComponentesDefault();
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Error al gurdar los cambios.");
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Aun existen campos vacios.");
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cajaNumeroControlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNumeroControlKeyPressed
        if(evt.getKeyCode() == 10)
            btnBuscar.doClick();
    }//GEN-LAST:event_cajaNumeroControlKeyPressed

    private void cajaPrimerApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPrimerApellidoKeyPressed
        if(evt.getKeyCode() == 10)
            btnGuardar.doClick();
    }//GEN-LAST:event_cajaPrimerApellidoKeyPressed

    private void cajaSegundoApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaSegundoApellidoKeyPressed
        if(evt.getKeyCode() == 10)
            btnGuardar.doClick();
    }//GEN-LAST:event_cajaSegundoApellidoKeyPressed

    private void comboCarreraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboCarreraKeyPressed
       if(evt.getKeyCode() == 10)
            btnGuardar.doClick();
    }//GEN-LAST:event_comboCarreraKeyPressed

    private void cajaNumeroControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNumeroControlKeyTyped
        verificarEntradaNumControl(cajaNumeroControl, evt);
    }//GEN-LAST:event_cajaNumeroControlKeyTyped

    private void cajaNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNombresKeyTyped
        verificarEntradaTexto(cajaNombres, evt);
    }//GEN-LAST:event_cajaNombresKeyTyped

    private void spinnerEdadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spinnerEdadKeyPressed
        if(evt.getKeyCode() == 10)
            btnGuardar.doClick();
    }//GEN-LAST:event_spinnerEdadKeyPressed

    private void cajaNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNombresKeyPressed
        if(evt.getKeyCode() == 10)
            btnGuardar.doClick();
    }//GEN-LAST:event_cajaNombresKeyPressed

    public void establecerComponentesDefault(){
        restablecerCompontes(cajaNumeroControl, cajaNombres, cajaPrimerApellido, cajaSegundoApellido, spinnerEdad, spinnerSemestre, comboCarrera);
        habilitarCampos(false);
    }
    
    public void habilitarCampos(boolean habilitado){
        cajaNumeroControl.setEnabled(!habilitado);
        btnBuscar.setEnabled(!habilitado);
        btnGuardar.setEnabled(habilitado);
        cajaNombres.setEnabled(habilitado);
        cajaPrimerApellido.setEnabled(habilitado);
        cajaSegundoApellido.setEnabled(habilitado);
        spinnerEdad.setEnabled(habilitado);
        spinnerSemestre.setEnabled(habilitado);
        comboCarrera.setEnabled(habilitado);
    }
    
    public boolean verificarEstadoComponentes(){
        boolean bandera=true;

        if(cajaNombres.getText().equals(""))
            bandera=false;
        if(cajaPrimerApellido.getText().equals(""))
            bandera=false;
        if(cajaSegundoApellido.getText().equals(""))
            bandera=false;
        if((int)spinnerEdad.getValue() == 0)
            bandera=false;
        if((int)spinnerSemestre.getValue() == 0)
            bandera=false;
        if(comboCarrera.getSelectedIndex() == 0)
            bandera=false;

        return bandera;
    }
    
    public void actualizarTabla(String consulta){
        String controlador = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/Escuela?useTimezone=true&serverTimezone=UTC";
        ResultSetTableModel modeloDatos = null;

        try {
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        } catch (ClassNotFoundException | SQLException e) {}

        Tabla.setModel(modeloDatos);
    }
    
    public void restablecerCompontes(JComponent...componentes){
        for(JComponent c : componentes){
            if(c instanceof JTextField)
                ((JTextField) c).setText("");
            if(c instanceof JComboBox)
                ((JComboBox<?>) c).setSelectedIndex(0);
            if(c instanceof JSpinner)
                ((JSpinner) c).setValue(0);
        }		
    }
    
    public void verificarEntradaNumControl(JTextField txtF, KeyEvent e){
        if (txtF.getText().length() == 9) 
            e.consume();			
        else{
            if(!Character.isAlphabetic(e.getKeyChar()) && !Character.isDigit(e.getKeyChar()))
                e.consume();
        }
    }
    
    public void verificarEntradaTexto(JTextField txtF, KeyEvent e){
        if (txtF.getText().length() == 50) 
            e.consume();			
        else
            if(Character.isDigit(e.getKeyChar()))
                e.consume();
            else
                if(!Character.isLetter(e.getKeyChar()) && e.getKeyChar()!=KeyEvent.VK_SPACE && e.getKeyChar()!=KeyEvent.VK_PERIOD)
                    e.consume();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField cajaNombres;
    private javax.swing.JTextField cajaNumeroControl;
    private javax.swing.JTextField cajaPrimerApellido;
    private javax.swing.JTextField cajaSegundoApellido;
    private javax.swing.JComboBox<String> comboCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner spinnerEdad;
    private javax.swing.JSpinner spinnerSemestre;
    // End of variables declaration//GEN-END:variables
    final static String MOSTRAR_TODOS_LOS_DATOS = "SELECT * FROM Alumnos";
    Alumno alumno;
    final static AlumnoDAO ALUMNO_DAO = new AlumnoDAO();
}