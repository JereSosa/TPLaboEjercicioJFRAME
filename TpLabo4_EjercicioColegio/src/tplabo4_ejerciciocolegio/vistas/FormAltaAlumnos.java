/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tplabo4_ejerciciocolegio.vistas;

import java.awt.Color;
import java.util.HashSet;
import javax.swing.JOptionPane;
import tplabo4_ejerciciocolegio.Alumno;

/**
 *
 * @author jeso_
 */
public class FormAltaAlumnos extends javax.swing.JInternalFrame {
    private HashSet <Alumno> alum;
    /**
     * Creates new form AltaAlumnoss
     */
    public FormAltaAlumnos(HashSet<Alumno> alum) {
        initComponents();
        this.alum = alum;
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
        JTlegajoAlumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTnombreAlumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTapellidoAlumno = new javax.swing.JTextField();
        JBcargarAlumno = new javax.swing.JButton();
        JBnuevoAlumno = new javax.swing.JButton();
        JBsalirAlumno = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(242, 37, 40));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Formulario de Alumnos");

        jLabel2.setText("Legajo:");

        JTlegajoAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTlegajoAlumno.setCaretColor(new java.awt.Color(153, 153, 0));
        JTlegajoAlumno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTlegajoAlumnoFocusLost(evt);
            }
        });
        JTlegajoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTlegajoAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        JTnombreAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTnombreAlumno.setCaretColor(new java.awt.Color(153, 153, 0));

        jLabel4.setText("Apellido:");

        JTapellidoAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JTapellidoAlumno.setCaretColor(new java.awt.Color(153, 153, 0));

        JBcargarAlumno.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        JBcargarAlumno.setText("Cargar");
        JBcargarAlumno.setBorder(null);
        JBcargarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcargarAlumnoActionPerformed(evt);
            }
        });

        JBnuevoAlumno.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        JBnuevoAlumno.setText("Nuevo");
        JBnuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnuevoAlumnoActionPerformed(evt);
            }
        });

        JBsalirAlumno.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        JBsalirAlumno.setText("Salir");
        JBsalirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsalirAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBnuevoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTlegajoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTapellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTnombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBcargarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBsalirAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTlegajoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTnombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTapellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBcargarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBsalirAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JBnuevoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTlegajoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTlegajoAlumnoActionPerformed

    }//GEN-LAST:event_JTlegajoAlumnoActionPerformed

    private void JBcargarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcargarAlumnoActionPerformed
        
        int legajo = Integer.parseInt(JTlegajoAlumno.getText());
        String nombreAlumno = JTnombreAlumno.getText();
        String apellidoAlumno = JTapellidoAlumno.getText();
        Alumno alum1 = new Alumno(legajo, apellidoAlumno, nombreAlumno);
        alum.add(alum1);
        JOptionPane.showMessageDialog(null, "Alumno cargado con exitó!");
        
    }//GEN-LAST:event_JBcargarAlumnoActionPerformed

    private void JBnuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnuevoAlumnoActionPerformed
        JTapellidoAlumno.setText("");
        JTlegajoAlumno.setText("");
        JTnombreAlumno.setText("");
    }//GEN-LAST:event_JBnuevoAlumnoActionPerformed

    private void JBsalirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsalirAlumnoActionPerformed
            dispose();  
    }//GEN-LAST:event_JBsalirAlumnoActionPerformed

    private void JTlegajoAlumnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTlegajoAlumnoFocusLost
        String text = JTlegajoAlumno.getText();
    try {
        Integer.parseInt(text);
        
        JTlegajoAlumno.setBackground(Color.WHITE);
    } catch (NumberFormatException e) {
        JTlegajoAlumno.setBackground(Color.RED);
        JOptionPane.showMessageDialog(this, 
            "El legajo debe ser un número entero válido.","Error de entrada", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_JTlegajoAlumnoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBcargarAlumno;
    private javax.swing.JButton JBnuevoAlumno;
    private javax.swing.JButton JBsalirAlumno;
    private javax.swing.JTextField JTapellidoAlumno;
    private javax.swing.JTextField JTlegajoAlumno;
    private javax.swing.JTextField JTnombreAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
