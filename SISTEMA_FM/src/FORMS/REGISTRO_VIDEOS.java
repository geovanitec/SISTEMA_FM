/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FORMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Geovani
 */
public class REGISTRO_VIDEOS extends javax.swing.JInternalFrame {

    /**
     * Creates new form REGISTRO_VIDEOS
     */
    public REGISTRO_VIDEOS() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtExistencias = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 51, 153));
        setClosable(true);
        setIconifiable(true);
        setVisible(true);

        jLabel1.setText("                         REGISTRO VIDEOS");

        jLabel2.setText("CODIGO VIDEO");

        jLabel3.setText("NOMBRE VIDEO");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("TIPO");

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel5.setText("AUTOR");

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel6.setText("EXISTENCIAS");

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel7.setText("PRECIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAutor)
                    .addComponent(txtCodigo)
                    .addComponent(txtNombre)
                    .addComponent(txtTipo)
                    .addComponent(txtExistencias)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        
        
        
         if ( txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() ||
                 txtTipo.getText().isEmpty() || txtAutor.getText().isEmpty() || txtExistencias.getText().isEmpty() ){
             
            JOptionPane.showMessageDialog(null, " NO PUEDE DEJAR CAMPOS VACIOS ");
            
            txtCodigo.setText("");
            txtNombre.setText("");
            txtTipo.setText("");
            txtAutor.setText("");
            txtExistencias.setText("");
            
        }
        else {
      
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/SISTEMA_FM", "rex", "polloloco900");
            PreparedStatement pst = cn.prepareStatement("insert into videos values(?,?,?,?,?,?)");
            //en la variables pst de tipo coneccion a base de datos inserte 
           // pst.setString(1, "0");
           
            pst.setString(1, txtCodigo.getText().trim());
            pst.setString(2, txtNombre.getText().trim());
            pst.setString(3, txtTipo.getText().trim());
            pst.setString(4, txtAutor.getText().trim());
            pst.setString(5, txtExistencias.getText().trim());
            pst.setString(6, txtPrecio.getText().trim());
            
           
            
            // aca ejecuta el qvery
           JOptionPane.showMessageDialog(null, " VIDEO REGISTRADO CORRECTAMENTE");
           
            ///txt_ConfirmPassword.setText("");
           
            pst.executeUpdate();
           /* LOGIN_USERS usuario = new LOGIN_USERS();
           usuario.setVisible(true);
           this.dispose();*/
           
          txtCodigo.setText("");
            txtNombre.setText("");
            txtTipo.setText("");
            txtAutor.setText("");
            txtExistencias.setText("");
            txtPrecio.setText("");
            
            
        }catch (Exception e){
            
        }
        }






// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if (txtBuscar.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, " NO PUEDE DEJAR CAMPOS VACIOS ");
        }
        
        else{
        
 try {
            String Codigo = txtBuscar.getText().trim();
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/SISTEMA_FM", "rex", "polloloco900");
            PreparedStatement pst = cn.prepareStatement("update videos set Codigo = ?, Nombre_Video = ? , Tipo = ? , Autor = ? , Existencia =, Precio =  ?  where Codigo = " + Codigo);
            
             pst.setString(1, txtCodigo.getText().trim());
            pst.setString(2, txtNombre.getText().trim());
            pst.setString(3, txtTipo.getText().trim());
            pst.setString(4, txtAutor.getText().trim());
            pst.setString(5, txtExistencias.getText().trim());
            pst.setString(6, txtPrecio.getText().trim());
            
            
            JOptionPane.showMessageDialog(null, " VIDEO MODIFICADO CORRECTAMENTE");
            
           
            pst.executeUpdate();
            
            
              txtCodigo.setText("");
            txtNombre.setText("");
            txtTipo.setText("");
            txtAutor.setText("");
            txtExistencias.setText("");
            txtPrecio.setText("");
            
            
        } catch (Exception e) {
        }        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

if (txtBuscar.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, " NO PUEDE DEJAR CAMPOS VACIOS ");
        }
        
        else{
        try {
            
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/SISTEMA_FM", "rex", "polloloco900");
            PreparedStatement pst = cn.prepareStatement("delete from videos where Codigo = ? " );
            
            pst.setString(1, txtBuscar.getText().trim());
            JOptionPane.showMessageDialog(null, " VIDEO ELIMINADO CORRECTAMENTE");
            pst.executeUpdate();
            
              txtCodigo.setText("");
            txtNombre.setText("");
            txtTipo.setText("");
            txtAutor.setText("");
            txtExistencias.setText("");
            txtPrecio.setText("");
            
           
        } catch (Exception e) {
        }  
        
        }// TODO add your handling code her        

// TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtBuscar.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, " NO PUEDE DEJAR CAMPOS VACIOS ");
        }else{
                
 try{
     /*
       Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/SISTEMA_FM", "rex", "polloloco900");
            PreparedStatement pst = cn.prepareStatement("select * from clientes where Codigo = ?");
            
            //aca busca que tiene el txt 
            pst.setString(1, txtBuscar.getText().trim());
            
            /// aca ejecuta el query
            ResultSet rs = pst.executeQuery();
     */
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/SISTEMA_FM", "rex", "polloloco900");
            PreparedStatement pst = cn.prepareStatement("select * from videos where Codigo = ?");
            
            //aca busca que tiene el txt 
            pst.setString(1, txtBuscar.getText().trim());
            
            /// aca ejecuta el query
            ResultSet rs = pst.executeQuery();
            
            
            if(rs.next()){
                
            pst.setString(1, txtCodigo.getText().trim());
            pst.setString(2, txtNombre.getText().trim());
            pst.setString(3, txtTipo.getText().trim());
            pst.setString(4, txtAutor.getText().trim());
            pst.setString(5, txtExistencias.getText().trim());
            pst.setString(6, txtPrecio.getText().trim());
            } else {
                JOptionPane.showMessageDialog(null, "VIDEO NO REGISTRADO");
                    
              
              txtCodigo.setText("");
            txtNombre.setText("");
            txtTipo.setText("");
            txtAutor.setText("");
            txtExistencias.setText("");
            txtPrecio.setText("");
            }
            
        }catch (Exception e){
        
        }       
    }        // TODO// TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      txtCodigo.setText("");
            txtNombre.setText("");
            txtTipo.setText("");
            txtAutor.setText("");
            txtExistencias.setText("");
            txtPrecio.setText("");
            txtBuscar.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
