/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazUsuario;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import objetosNegocio.Usuario;

/**
 *
 * @author PC
 */
public class DlgUsuario extends javax.swing.JDialog {
    Usuario usuario;
    int operacion;
    StringBuffer respuesta;
    
    
    /**
     * Creates new form DlgUsuario
     */
    public DlgUsuario(java.awt.Frame parent, String title ,boolean modal, Usuario usuario, int operacion, StringBuffer respuesta) {
        super(parent, modal);
        this.usuario = usuario;
        this.respuesta = respuesta;
        this.operacion = operacion;
        initComponents();
        
        Image iconoPropio = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/etc/mlogo.png"));
        setIconImage(iconoPropio);

        if((operacion == ConstantesGUI.DESPLEGAR)) { 
            campoTextoIp.setText(usuario.getIp());    
            campoTextoIp.setEditable(false);
            campoTextoNombre.setText(usuario.getNombre());   
            campoTextoNombre.setEditable(false);
            campoTextoCorreo.setText(usuario.getDireccionCorreo());
            campoTextoCorreo.setEditable(false);
        }
        
        respuesta.append(ConstantesGUI.CANCELAR);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoTextoCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoTextoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoTextoIp = new javax.swing.JTextField();
        botonMandar = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Correo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 80, 20));

        campoTextoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(campoTextoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 20));

        campoTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(campoTextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 300, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ip:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 20, 20));

        campoTextoIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoIpActionPerformed(evt);
            }
        });
        getContentPane().add(campoTextoIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 140, -1));

        botonMandar.setText("Mandar Correo");
        botonMandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMandarActionPerformed(evt);
            }
        });
        getContentPane().add(botonMandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 120, 40));

        botonCerrar.setText("Cerar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 120, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondos/fondo4.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoTextoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoCorreoActionPerformed

    private void campoTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoNombreActionPerformed

    private void campoTextoIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoIpActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        respuesta.append(ConstantesGUI.CANCELAR);
        dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonMandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMandarActionPerformed
        respuesta.delete(0, respuesta.length());
        respuesta.append(ConstantesGUI.AÑADIR_C);
        dispose();
    }//GEN-LAST:event_botonMandarActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonMandar;
    private javax.swing.JTextField campoTextoCorreo;
    private javax.swing.JTextField campoTextoIp;
    private javax.swing.JTextField campoTextoNombre;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
