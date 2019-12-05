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
public class InternalBajas extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalAltas
     */
    public InternalBajas() {
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
        ComboCarrera = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CajaSegundoApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CajaPrimerApellido = new javax.swing.JTextField();
        CajaNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CajaNumeroControl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BtnEliminar = new javax.swing.JButton();
        SpinnerSemestre = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        SpinnerEdad = new javax.swing.JSpinner();

        setMaximumSize(new java.awt.Dimension(580, 480));
        setMinimumSize(new java.awt.Dimension(580, 480));
        setPreferredSize(new java.awt.Dimension(580, 480));

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BAJAS ALUMNOS");

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

        ComboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir Carrera ...", "CP", "IA", "IM", "ISC", "LA" }));
        ComboCarrera.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CARRERA:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("SEMESTRE:");

        CajaSegundoApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CajaSegundoApellido.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("SEGUNDO APELLIDO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("PRIMER APELLIDO:");

        CajaPrimerApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CajaPrimerApellido.setEnabled(false);

        CajaNombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CajaNombres.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRES:");

        CajaNumeroControl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CajaNumeroControl.setNextFocusableComponent(BtnBuscar);
        CajaNumeroControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CajaNumeroControlKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaNumeroControlKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NÚMERO DE CONTROL:");

        BtnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.setNextFocusableComponent(BtnEliminar);
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnBuscar.setText("BUSCAR");
        BtnBuscar.setNextFocusableComponent(BtnLimpiar);
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnCancelar.setText("CANCELAR");
        BtnCancelar.setAlignmentY(0.0F);
        BtnCancelar.setNextFocusableComponent(CajaNumeroControl);
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
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

        BtnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.setAlignmentY(0.0F);
        BtnEliminar.setEnabled(false);
        BtnEliminar.setName(""); // NOI18N
        BtnEliminar.setNextFocusableComponent(BtnCancelar);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        SpinnerSemestre.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        SpinnerSemestre.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("EDAD:");

        SpinnerEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        SpinnerEdad.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CajaPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CajaSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(CajaNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(SpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SpinnerSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(CajaNumeroControl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajaNumeroControl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(BtnLimpiar)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CajaNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajaPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(BtnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajaSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(SpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(SpinnerSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(ComboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        establecerComponentesDefault();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        if(ALUMNO_DAO.eliminarAlumno(CajaNumeroControl.getText())){
            JOptionPane.showMessageDialog(rootPane, "Alumno eliminado correctamente.");
            establecerComponentesDefault();
            BtnEliminar.setEnabled(false);
            CajaNumeroControl.setEditable(true);
            CajaNumeroControl.setEditable(true);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Error al eliminar el alumno.");	
        actualizarTabla(MOSTRAR_TODOS_LOS_REGISTROS);
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        if(!CajaNumeroControl.getText().equals("")){
            Alumno al = ALUMNO_DAO.buscarAlumno(CajaNumeroControl.getText());
            if(al != null){
                CajaNombres.setText(al.getNombre());
                CajaPrimerApellido.setText(al.getPrimerAp());
                CajaSegundoApellido.setText(al.getSegundoAp());
                SpinnerEdad.setValue(al.getEdad());
                SpinnerSemestre.setValue(al.getSemestre());
                ComboCarrera.setSelectedItem(al.getCarrera());
                BtnEliminar.setEnabled(true);
                CajaNumeroControl.setEditable(false);
                BtnBuscar.setEnabled(false);
            }
            else
                JOptionPane.showMessageDialog(rootPane, "No se encotro al alumno.");
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Ingresa un numero de control a buscar.");
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void TablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseReleased
        CajaNumeroControl.setText((String) Tabla.getValueAt(Tabla.getSelectedRow(), 0));
        CajaNombres.setText((String) Tabla.getValueAt(Tabla.getSelectedRow(), 1));
        CajaPrimerApellido.setText((String) Tabla.getValueAt(Tabla.getSelectedRow(), 2));
        CajaSegundoApellido.setText((String) Tabla.getValueAt(Tabla.getSelectedRow(), 3));
        SpinnerEdad.setValue(Tabla.getValueAt(Tabla.getSelectedRow(), 4));
        SpinnerSemestre.setValue(Tabla.getValueAt(Tabla.getSelectedRow(), 5));
        ComboCarrera.setSelectedItem(Tabla.getValueAt(Tabla.getSelectedRow(), 6));
        BtnEliminar.setEnabled(true);
        BtnBuscar.setEnabled(false);
        CajaNumeroControl.setEditable(false);
    }//GEN-LAST:event_TablaMouseReleased

    private void CajaNumeroControlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaNumeroControlKeyPressed
        if(evt.getKeyCode() == 10){
            if(CajaNumeroControl.isEditable())
                BtnBuscar.doClick();
            else
                BtnEliminar.doClick();
        }
    }//GEN-LAST:event_CajaNumeroControlKeyPressed

    private void CajaNumeroControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaNumeroControlKeyTyped
        verificarEntradaNumControl(CajaNumeroControl, evt);
    }//GEN-LAST:event_CajaNumeroControlKeyTyped

    public void establecerComponentesDefault(){
        restablecerCompontes(CajaNumeroControl, CajaNombres, CajaPrimerApellido, CajaSegundoApellido, SpinnerEdad, SpinnerSemestre, ComboCarrera);
        BtnEliminar.setEnabled(false);
        CajaNumeroControl.setEditable(true);
        BtnBuscar.setEnabled(true);
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
        else
            if(!Character.isAlphabetic(e.getKeyChar()) && !Character.isDigit(e.getKeyChar()))
                e.consume();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JTextField CajaNombres;
    private javax.swing.JTextField CajaNumeroControl;
    private javax.swing.JTextField CajaPrimerApellido;
    private javax.swing.JTextField CajaSegundoApellido;
    private javax.swing.JComboBox<String> ComboCarrera;
    private javax.swing.JSpinner SpinnerEdad;
    private javax.swing.JSpinner SpinnerSemestre;
    private javax.swing.JTable Tabla;
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
    // End of variables declaration//GEN-END:variables
    final static String MOSTRAR_TODOS_LOS_REGISTROS = "SELECT * FROM Alumnos";
    Alumno alumno;
    final static AlumnoDAO ALUMNO_DAO = new AlumnoDAO();
}