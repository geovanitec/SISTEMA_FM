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
public class CLIENTES extends javax.swing.JInternalFrame {

    /**
     * Creates new form CLIENTES
     */
    public CLIENTES() {
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
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        tbnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(16, 83, 156));
        setClosable(true);
        setIconifiable(true);
        setVisible(true);

        jLabel1.setText("                           REGISTRO CLIENTES");

        jLabel2.setText("CODIGO CLIENTE");

        jLabel3.setText("NOMBRE CLIENTE");

        jLabel4.setText("ESTADO CLIENTE");

        jLabel5.setText("CELULAR");

        jLabel6.setText("DIRECCION");

        jLabel7.setText("CORREO");

        tbnBuscar.setText("BUSCAR");
        tbnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(tbnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(161, 161, 161))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if ( txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() ||
                 txtCorreo.getText().isEmpty() || txtDireccion.getText().isEmpty() ||
                 txtEstado.getText().isEmpty() || txtCelular.getText().isEmpty() ){
             
            JOptionPane.showMessageDialog(null, " NO SE PUEDE DEJAR CAMPOS VACIOS ");
            
            txtCodigo.setText("");
            txtNombre.setText("");
            txtEstado.setText("");
              txtCelular.setText("");
            txtCorreo.setText("");
             
            txtDireccion.setText("");
            
            
        }
        else {
                    try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/SISTEMA_FM", "rex", "polloloco900");
            PreparedStatement pst = cn.prepareStatement("insert into clientes values(?,?,?,?,?,?)");
            //en la variables pst de tipo coneccion a base de datos inserte 
            
            pst.setString(1, txtCodigo.getText().trim());
            pst.setString(2, txtNombre.getText().trim());
            pst.setString(3, txtEstado.getText().trim());
            pst.setString(4, txtCelular.getText().trim());
            pst.setString(5, txtCorreo.getText().trim());
            pst.setString(6, txtDireccion.getText().trim());
            // aca ejecuta el qvery
            
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, " EMPLEADO REGISTRADO CORRECTAMENTE");
            
               txtCodigo.setText("");
            txtNombre.setText("");
            txtEstado.setText("");
              txtCelular.setText("");
            txtCorreo.setText("");
             
            txtDireccion.setText("");
            
            // limpiio registros
          
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
            
            PreparedStatement pst = cn.prepareStatement("update clientes set Codigo = ?, Nombre = ? , Estado = ? , Celular = ?, Correo = ? , Direccion = ?  where Codigo = " + Codigo);
            
            pst.setString(1, txtCodigo.getText().trim());
            pst.setString(2, txtNombre.getText().trim());
              pst.setString(3, txtEstado.getText().trim());
                pst.setString(4, txtCelular.getText().trim());
            pst.setString(5, txtCorreo.getText().trim());
            pst.setString(6, txtDireccion.getText().trim());;
            
            JOptionPane.showMessageDialog(null, " EMPLEADO MODIFICADO CORRECTAMENTE");
            
           
            pst.executeUpdate();
            
             txtCodigo.setText("");
            txtNombre.setText("");
            txtEstado.setText("");
              txtCelular.setText("");
            txtCorreo.setText("");
             
            txtDireccion.setText("");
            
         
           
            
            // aca ejecuta el qvery
          // JOptionPane.showMessageDialog(null, " CLIENTE MODIFICADO CORRECTAMENTE");
           
            
        } catch (Exception e) {
        }        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tbnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnBuscarActionPerformed
if (txtBuscar.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, " NO PUEDE DEJAR CAMPOS VACIOS ");
        }else{
                
 try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/SISTEMA_FM", "rex", "polloloco900");
            PreparedStatement pst = cn.prepareStatement("select * from clientes where Codigo = ?");
            
            //aca busca que tiene el txt 
            pst.setString(1, txtBuscar.getText().trim());
            
            /// aca ejecuta el query
            ResultSet rs = pst.executeQuery();
            
            
            if(rs.next()){
                txtCodigo.setText(rs.getString("Codigo"));
                txtNombre.setText(rs.getString("Nombre"));
               txtEstado.setText(rs.getString("Estado"));
                txtCelular.setText(rs.getString("Celular"));
                txtCorreo.setText(rs.getString("Correo"));
                txtDireccion.setText(rs.getString("Direccion"));
                
            } else {
                JOptionPane.showMessageDialog(null, "CLIENTE NO REGISTRADO");
                    
              txtCodigo.setText("");
            txtNombre.setText("");
            txtCorreo.setText("");
             txtEstado.setText("");
              txtCelular.setText("");
            txtDireccion.setText("");
            
            }
            
        }catch (Exception e){
        
        }       
    }        // TODO add your handling code here:
    }//GEN-LAST:event_tbnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (txtBuscar.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, " NO PUEDE DEJAR CAMPOS VACIOS ");
        }
        
        else{
        try {
            
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/SISTEMA_FM", "rex", "polloloco900");
            PreparedStatement pst = cn.prepareStatement("delete from clientes where Codigo = ? " );
            
            pst.setString(1, txtBuscar.getText().trim());
            JOptionPane.showMessageDialog(null, " EMPLEADO ELIMINADO CORRECTAMENTE");
            pst.executeUpdate();
            
              txtCodigo.setText("");
            txtNombre.setText("");
            txtCorreo.setText("");
             txtEstado.setText("");
              txtCelular.setText("");
            txtDireccion.setText("");
            
           
        } catch (Exception e) {
        }  
        
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCodigo.setText("");
            txtNombre.setText("");
            txtCorreo.setText("");
             txtEstado.setText("");
              txtCelular.setText("");
            txtDireccion.setText("");
            txtBuscar.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton tbnBuscar;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
