
package vistas;

import javax.swing.JOptionPane;
import modelo.logic.UsuarioLogic;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.beans.Usuario;



public class FrmLogin extends javax.swing.JFrame {
    
    public static Connection conn;
    //private Statement Consulta=null;
    //private ResultSet Resultado=null;

    
    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Daniel's Login");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        chkMostrarContraseña = new javax.swing.JCheckBox();
        btnIngresar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        MensajeUsuario = new javax.swing.JLabel();
        MensajeUsuariocontrasena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Inicio de Sesión");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña:");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        chkMostrarContraseña.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        chkMostrarContraseña.setText("Mostrar Contraseña");
        chkMostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMostrarContraseñaActionPerformed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        MensajeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        MensajeUsuario.setForeground(new java.awt.Color(255, 51, 51));

        MensajeUsuariocontrasena.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        MensajeUsuariocontrasena.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MensajeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkMostrarContraseña)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1))
                            .addComponent(MensajeUsuariocontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MensajeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(MensajeUsuariocontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkMostrarContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        FrmRegistrarUsuarios frmRegistrarUsuarios=new FrmRegistrarUsuarios(this, true,conn);
        frmRegistrarUsuarios.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void chkMostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMostrarContraseñaActionPerformed
        if (chkMostrarContraseña.isSelected()) {
            txtContraseña.setEchoChar((char)0);
        }else{
            txtContraseña.setEchoChar('*');
        }
    }//GEN-LAST:event_chkMostrarContraseñaActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
      if(Validar()){
        if (!txtUsuario.getText().isEmpty() && !txtContraseña.getText().isEmpty()){
        boolean Confirmado = this.Consultar("Select * from logins where Usuario = '"+
               txtUsuario.getText()+"' and Contrasena = '"+txtContraseña.getText()+"'");
       if(Confirmado){
          
           FrmPaginaPrincipal frmPaginaPrincipal= new FrmPaginaPrincipal(conn,this.Consultartodo());
               frmPaginaPrincipal.setVisible(true);
               this.setVisible(false);
       }else{
           JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
       }  
       }
      }
    }//GEN-LAST:event_btnIngresarActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });

        //Creating a connection to the database
        
        try {
            //Loading the required JDBC Driver class
	    Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tarea4","root","");
            
            //Executing SQL query and fetching the result
            Statement stmt=conn.createStatement();  
            ResultSet rs=stmt.executeQuery("show tables;");
            System.out.println("Connected"); 
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}		
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
       
             
    }
    public boolean Consultar(String Miconsulta){
        boolean Dato = false;
        try{
        
        if(conn != null){
            Statement Consulta = conn.createStatement();
            ResultSet Resultado = Consulta.executeQuery(Miconsulta);
            if(Resultado.next()){
                Dato = true;
            }
            
        }
        return Dato;
      }catch(Exception e){
         e.printStackTrace();
         return Dato;
        
      }
       
    }
    public DefaultTableModel Consultartodo(){
        DefaultTableModel Model = new DefaultTableModel();
        try{
        
        String[]Datos = new String[6];
        Model.addColumn("Código");
        Model.addColumn("Nombre");
        Model.addColumn("Apellido");
        Model.addColumn("Teléfono");
        Model.addColumn("Correo");
        Model.addColumn("Usuario");
        
        Statement Consulta = conn.createStatement();
        ResultSet Resultado = Consulta.executeQuery("Select * from logins");
        while (Resultado.next()){
            Datos[0] = Resultado.getString(1);
            Datos[1] = Resultado.getString(2);
            Datos[2] = Resultado.getString(3);
            Datos[3] = Resultado.getString(6);
            Datos[4] = Resultado.getString(5);
            Datos[5] = Resultado.getString(4);
            Model.addRow(Datos);
        }
                
      
        
        
        
        
        }catch(Exception e){
         e.printStackTrace();
         //return Model;
        
      }
      return Model;  
    }
    
    public Usuario Informacionusuario(int codigo){
        Usuario usuario = new Usuario();
        try{ 
        if(conn != null ){
            String Miconsulta = "Select * from logins where ID = " + codigo;
            Statement consulta = conn.createStatement();
            ResultSet Resultado = consulta.executeQuery(Miconsulta);
            while(Resultado.next()){
                usuario.setID(Resultado.getInt(1));
                usuario.setNombres(Resultado.getString(2));
                usuario.setApellidos(Resultado.getString(3));
                usuario.setUsuario(Resultado.getString(4));
                usuario.setCorreo(Resultado.getString(5));
                usuario.setTelefono(Resultado.getString(6));
                usuario.setContraseña(Resultado.getString(7));
                
            }
        }
        }catch(Exception e){
         e.printStackTrace();
         //return Model;
        
      }
        
     
        return usuario;
        
    }
    public boolean Validar(){
        boolean Resultado = false;
        if(txtUsuario.getText().isEmpty()){
            MensajeUsuario.setText("Este campo es obligatorio");
            
            return Resultado = false ;
            
        }else{
            MensajeUsuario.setText("");
            Resultado = true;
            
        }
        if(txtContraseña.getText().isEmpty()){
            MensajeUsuariocontrasena.setText("Este campo es obligatorio");
            
            return Resultado = false ;
            
        }else{
            MensajeUsuariocontrasena.setText("");
            Resultado = true;
            
        }
        
        
        
        return Resultado;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MensajeUsuario;
    private javax.swing.JLabel MensajeUsuariocontrasena;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox chkMostrarContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
