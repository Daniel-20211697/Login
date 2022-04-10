
package vistas;

import modelo.beans.Usuario;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;




public class FrmPaginaPrincipal extends javax.swing.JFrame {
 public static Connection Conn;
 FrmLogin frmLogin = new FrmLogin(); 
    
    public FrmPaginaPrincipal(Usuario usuario) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        lblUsuario.setText(usuario.getNombres());
    }
    public FrmPaginaPrincipal(Connection conn,DefaultTableModel Modelo) {
        initComponents();
        this.Conn= conn;
        this.CargarRegistro(Modelo);
        
        this.setLocationRelativeTo(null);
        //lblUsuario.setText(usuario.getNombres());
    }
    
    public FrmPaginaPrincipal(Connection conn) {
        initComponents();
        this.Conn= conn;
        
        this.setLocationRelativeTo(null);
        //lblUsuario.setText(usuario.getNombres());
    }

    FrmPaginaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Data = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsuario.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Data);
        if (Data.getColumnModel().getColumnCount() > 0) {
            Data.getColumnModel().getColumn(0).setResizable(false);
            Data.getColumnModel().getColumn(1).setResizable(false);
            Data.getColumnModel().getColumn(2).setResizable(false);
            Data.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(627, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(lblUsuario)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
         FrmRegistrarUsuarios frmRegistrarUsuarios=new FrmRegistrarUsuarios(this, true,Conn);
        frmRegistrarUsuarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        this.BuscarUsuario();
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.EliminarUsuario();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        frmLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    public static void main(String args[]) {

        
                 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FrmPaginaPrincipal(null).setVisible(true);
            }
        });
     
       
    }
    public void CargarRegistro(DefaultTableModel MiModelo){
        Data.setModel(MiModelo);
    
       
    }
    
    public void BuscarUsuario(){
       int fila =  Data.getSelectedRow();
       int codigo = Integer.parseInt(this.Data.getValueAt(fila, 0).toString());
       Usuario usuario = frmLogin.Informacionusuario(codigo);
       FrmRegistrarUsuarios frmRegistrarUsuarios=new FrmRegistrarUsuarios(this, true,Conn, usuario);
        frmRegistrarUsuarios.setVisible(true);
        this.setVisible(false);
    }
    
    public void EliminarUsuario(){
       int fila =  Data.getSelectedRow();
       int codigo = Integer.parseInt(this.Data.getValueAt(fila, 0).toString());
       Usuario usuario = frmLogin.Informacionusuario(codigo);
       int Resultado = 0;
       String[] Botones = {"Si","No"};
       
       int Rpt = JOptionPane.showOptionDialog(this," Seguro que desea eliminarlo? ", " Eliminar ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, Botones, Botones[1]);
       try{
           
       if(Rpt == 0){
           if(Conn != null){
               Statement Sentencia = Conn.createStatement();
               Resultado =  Sentencia.executeUpdate("Delete from logins where ID = " + codigo );
               
               if(Resultado > 0){
                   JOptionPane.showMessageDialog(null, "Registro Eliminado existosamente");
                   this.CargarRegistro(frmLogin.Consultartodo());
               }
           }
       }
       
       }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error eliminando datos");
            e.printStackTrace();
            
        }
           
       }
    
           
       
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Data;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
