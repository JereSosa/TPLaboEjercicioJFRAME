/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tplabo5_ejercicioagenda.Vistas;

import java.awt.Dimension;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tplabo5_ejercicioagenda.Contactos;
import tplabo5_ejercicioagenda.Directorio;

/**
 *
 * @author jeso_
 */
public class BuscarTelefono extends javax.swing.JInternalFrame {
    private TreeMap<Long, Contactos> Agenda;
    
    /**
     * Creates new form BuscarTelefono
     */
    public BuscarTelefono(TreeMap<Long, Contactos> agenda) {
        initComponents();
        this.Agenda = agenda;

        
        setBounds(100, 100, 1000, 600);  
        setClosable(true);
        setResizable(true);

        
        jTable1.setPreferredScrollableViewportSize(new Dimension(950, 500));
        jTable1.setFillsViewportHeight(true);

       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTfiltroTelefono = new javax.swing.JTextField();
        JTfiltroApellido = new javax.swing.JTextField();
        JTfiltroCiudad = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Dni", "Ciudad", "Direccion", "Telefono"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable1.setMaximumSize(new Dimension(1000, 700));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Nombre");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Apellido");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Dni");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Ciudad");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Direccion");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Telefono");
        }

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 221, 26));
        jLabel1.setText("Filtrar Contactos por:");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Seleccionar contacto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 221, 26));
        jLabel3.setText("Numero de telefono:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 221, 26));
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 221, 26));
        jLabel5.setText("Ciudad:");

        JTfiltroTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTfiltroTelefonoKeyReleased(evt);
            }
        });

        JTfiltroApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTfiltroApellidoActionPerformed(evt);
            }
        });
        JTfiltroApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTfiltroApellidoKeyReleased(evt);
            }
        });

        JTfiltroCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTfiltroCiudadKeyReleased(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTfiltroTelefono, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(JTfiltroApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTfiltroCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTfiltroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTfiltroApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTfiltroCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void JTfiltroApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTfiltroApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTfiltroApellidoActionPerformed

    private void JTfiltroTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTfiltroTelefonoKeyReleased
        actualizarTabla();
    }//GEN-LAST:event_JTfiltroTelefonoKeyReleased

    private void JTfiltroApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTfiltroApellidoKeyReleased
        actualizarTabla();
    }//GEN-LAST:event_JTfiltroApellidoKeyReleased

    private void JTfiltroCiudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTfiltroCiudadKeyReleased
        actualizarTabla();
    }//GEN-LAST:event_JTfiltroCiudadKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
    
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar un contacto.");
        return;
    }

    
    String nombre = (String) jTable1.getValueAt(filaSeleccionada, 0);
    String apellido = (String) jTable1.getValueAt(filaSeleccionada, 1);
    Long dni = (Long) jTable1.getValueAt(filaSeleccionada, 2);
    String ciudad = (String) jTable1.getValueAt(filaSeleccionada, 3);
    String direccion = (String) jTable1.getValueAt(filaSeleccionada, 4);
    Long telefono = (Long) jTable1.getValueAt(filaSeleccionada, 5);

    
    AgendaTelefonicaVista vistaPrincipal = new AgendaTelefonicaVista();
    vistaPrincipal.setVisible(true); 
    vistaPrincipal.cargarContactoEnFormulario(nombre, apellido, dni, ciudad, direccion, telefono); 

    this.dispose(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        AgendaTelefonicaVista vistaPrincipal = new AgendaTelefonicaVista();
        vistaPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    public void llenarTabla(TreeMap<Long, Contactos> agenda) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); 

    for (Map.Entry<Long, Contactos> entry : agenda.entrySet()) {
        Long telefono = entry.getKey();
        Contactos contacto = entry.getValue();
        Object[] fila = {
            contacto.getNombre(),
            contacto.getApellido(),
            contacto.getDni(),
            contacto.getCiudad(),
            contacto.getDireccion(),
            telefono
        };
        model.addRow(fila); 
    }
}

    private void actualizarTabla(){
        if (Agenda == null){
            System.out.println("Agenda es null, no se puede actualizar la tabla.");
            return;
        }
 DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); 

   
    String telefonoFiltro = JTfiltroTelefono.getText().trim();
    String apellidoFiltro = JTfiltroApellido.getText().trim();
    String ciudadFiltro = JTfiltroCiudad.getText().trim();

    
    for (Map.Entry<Long, Contactos> entry : Agenda.entrySet()) {
        Long telefono = entry.getKey();
        Contactos contacto = entry.getValue();

        
        String telefonoStr = telefono.toString();
        String apellido = contacto.getApellido().toLowerCase();
        String ciudad = contacto.getCiudad().toLowerCase();

        
        boolean cumpleFiltroTelefono = telefonoFiltro.isEmpty() || telefonoStr.startsWith(telefonoFiltro);
        boolean cumpleFiltroApellido = apellidoFiltro.isEmpty() || apellido.contains(apellidoFiltro.toLowerCase());
        boolean cumpleFiltroCiudad = ciudadFiltro.isEmpty() || ciudad.contains(ciudadFiltro.toLowerCase());

        
        if (cumpleFiltroTelefono && cumpleFiltroApellido && cumpleFiltroCiudad) {
            model.addRow(new Object[]{
                contacto.getNombre(),
                contacto.getApellido(),
                contacto.getDni(),
                contacto.getCiudad(),
                contacto.getDireccion(),
                telefono 
            });
        }
    }
  }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTfiltroApellido;
    private javax.swing.JTextField JTfiltroCiudad;
    private javax.swing.JTextField JTfiltroTelefono;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
