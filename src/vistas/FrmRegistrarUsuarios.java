
package vistas;



import java.sql.Connection;
import java.net.ConnectException;
import javax.swing.JOptionPane;
import modelo.beans.Usuario;
import modelo.logic.UsuarioLogic;
import java.sql.Statement;
import java.sql.ResultSet;


public class FrmRegistrarUsuarios extends javax.swing.JDialog {

    Connection Conn;
    FrmLogin frmLogin = new FrmLogin();
    Usuario usuario;
    
    public FrmRegistrarUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
     public FrmRegistrarUsuarios(java.awt.Frame parent, boolean modal,Connection conn) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.Conn=conn;
    }
     public FrmRegistrarUsuarios(java.awt.Frame parent, boolean modal,Connection conn, Usuario _usuario ) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.Conn=conn;
        this.usuario = _usuario;
        this.CargarUsuario();
    }
     
     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtRepetirContraseña = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        MensajeNombre = new javax.swing.JLabel();
        MensajeApellido = new javax.swing.JLabel();
        MensajeCorreo = new javax.swing.JLabel();
        MensajeUsuario = new javax.swing.JLabel();
        MensajeTelefono = new javax.swing.JLabel();
        MensajeContrasena = new javax.swing.JLabel();
        MensajeConfirmar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Registro de usuarios");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Nombres:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Apellidos:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("Correo:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Repetir contraseña:");

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Teléfono:");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        MensajeNombre.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        MensajeNombre.setForeground(new java.awt.Color(255, 51, 51));

        MensajeApellido.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        MensajeApellido.setForeground(new java.awt.Color(255, 51, 51));

        MensajeCorreo.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        MensajeCorreo.setForeground(new java.awt.Color(255, 51, 51));

        MensajeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        MensajeUsuario.setForeground(new java.awt.Color(255, 51, 51));

        MensajeTelefono.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        MensajeTelefono.setForeground(new java.awt.Color(255, 51, 51));

        MensajeContrasena.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        MensajeContrasena.setForeground(new java.awt.Color(255, 51, 51));

        MensajeConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        MensajeConfirmar.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 152, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(txtRepetirContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(txtUsuario)
                            .addComponent(txtTelefono)
                            .addComponent(txtCorreo)
                            .addComponent(txtApellidos)
                            .addComponent(MensajeNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MensajeApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MensajeCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MensajeUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MensajeTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MensajeContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MensajeConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(MensajeNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(MensajeApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MensajeCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(MensajeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(MensajeTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(MensajeContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRepetirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MensajeConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       if(this.Validar()){
           if(this.ConfirmarContrasena(txtContraseña.getText(), txtRepetirContraseña.getText())){
       try{
           if(Conn==null){
           JOptionPane.showMessageDialog(null,"Sin conexion a base de datos");
           }
           Statement Ejecutar=this.Conn.createStatement();
           int Resultado= Ejecutar.executeUpdate("Update  `tarea4`.`logins` Set `Nombres` = '"+txtNombres.getText()+
                   "',`Apellidos` = '" + txtApellidos.getText() + "', `Usuario` = '"  +  txtUsuario.getText() +
                   "',`Correo` = '" + txtCorreo.getText() +  "',`Teléfono` = '" + txtTelefono.getText() +
                   "',`Contrasena` = '" + txtContraseña.getText() + "' where ID = " + usuario.getID());
           if(Resultado>0){
               JOptionPane.showMessageDialog(this, "Usuario actualizado existosamente");
               FrmPaginaPrincipal frmPaginaPrincipal= new FrmPaginaPrincipal(this.Conn,frmLogin.Consultartodo());
               frmPaginaPrincipal.setVisible(true);
               this.setVisible(false);
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error actualizando datos");
            e.printStackTrace();
            
        }
       }
       }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(this.Validar()){
            if(this.ConfirmarContrasena(txtContraseña.getText(), txtRepetirContraseña.getText())){
        try{
           if(Conn==null){
           JOptionPane.showMessageDialog(null,"Sin conexion a base de datos");
           }
           Statement Ejecutar=this.Conn.createStatement();
           int Resultado= Ejecutar.executeUpdate("Insert into `tarea4`.`logins`(`Nombres`,`Apellidos`,"+
                    "`Usuario`,`Correo`,`Teléfono`,`Contrasena`)Values('"+txtNombres.getText()+"','"+
                           txtApellidos.getText()+"','"+txtUsuario.getText()+"','"+
                   txtCorreo.getText()+"','"+txtTelefono.getText()+"','"+txtContraseña.getText()+"')");
           if(Resultado>0){
               JOptionPane.showMessageDialog(this, "Usuario registrado existosamente");
               FrmPaginaPrincipal frmPaginaPrincipal= new FrmPaginaPrincipal(this.Conn,frmLogin.Consultartodo());
               frmPaginaPrincipal.setVisible(true);
               this.setVisible(false);
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error insertando datos");
            e.printStackTrace();
            
        }
        }
        }
    
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!txtUsuario.getText().isEmpty()){
           
            if (UsuarioLogic.eliminar(txtUsuario.getText())) {
                JOptionPane.showMessageDialog(this, "Usuario eliminado existosamente");
            }else{
                JOptionPane.showMessageDialog(this, "Usuario no encontrado");
            }
            
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegistrarUsuarios dialog = new FrmRegistrarUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
   
    public boolean Validar(){
        boolean Resultado = false;
        if(txtNombres.getText().isEmpty()){
            MensajeNombre.setText("Este campo es obligatorio");
            
            return Resultado = false ;
            
        }else{
            MensajeNombre.setText("");
            Resultado = true;
            
        }
        if(txtApellidos.getText().isEmpty()){
            MensajeApellido.setText("Este campo es obligatorio");
            
            return Resultado = false ;
            
        }else{
            MensajeApellido.setText("");
            Resultado = true;
            
        }
        
        if(txtCorreo.getText().isEmpty()){
            MensajeCorreo.setText("Este campo es obligatorio");
            
            return Resultado = false ;
            
        }else{
            MensajeCorreo.setText("");
            Resultado = true;
            
        }
        
        if(txtUsuario.getText().isEmpty()){
            MensajeUsuario.setText("Este campo es obligatorio");
            
            return Resultado = false ;
            
        }else{
            MensajeUsuario.setText("");
            Resultado = true;
            
        }
        
        if(txtTelefono.getText().isEmpty()){
            MensajeTelefono.setText("Este campo es obligatorio");
            
            return Resultado = false ;
            
        }else{
            MensajeTelefono.setText("");
            Resultado = true;
            
        }
         if(txtContraseña.getText().isEmpty()){
            MensajeContrasena.setText("Este campo es obligatorio");
            
            return Resultado = false ;
            
        }else{
            MensajeContrasena.setText("");
            Resultado = true;
            
        }
       
       
        return Resultado;
    }
    
    public boolean ConfirmarContrasena(String contrasena1,String contrasena2 ){
        boolean Resultado = false;
        if(contrasena2.equals(contrasena1)){
           MensajeConfirmar.setText("");
            
            Resultado = true ; 
        }else{
          MensajeConfirmar.setText("Las contraseñas no coinciden"); 
          Resultado = false ;
        }
        
        
        
        return Resultado;
    }
        
    
    
    protected void CargarUsuario(){
        this.txtNombres.setText(usuario.getNombres());
        this.txtApellidos.setText(usuario.getApellidos());
        this.txtUsuario.setText(usuario.getUsuario());
        this.txtCorreo.setText(usuario.getCorreo());
        this.txtTelefono.setText(usuario.getTelefono());
        this.txtContraseña.setText(usuario.getContraseña());
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MensajeApellido;
    private javax.swing.JLabel MensajeConfirmar;
    private javax.swing.JLabel MensajeContrasena;
    private javax.swing.JLabel MensajeCorreo;
    private javax.swing.JLabel MensajeNombre;
    private javax.swing.JLabel MensajeTelefono;
    private javax.swing.JLabel MensajeUsuario;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtRepetirContraseña;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
