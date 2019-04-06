/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.EmpleadoVO;
import modelo.ServiciosDAO;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Conexion;
import modelo.ServicioVO;
/**
 *
 * @author jhond
 */
public class vistaServicios extends javax.swing.JFrame {
 
    private EmpleadoVO user;

    /**
     * Creates new form vistaEmpleados
     */
    public vistaServicios(EmpleadoVO user) {
        this.user=user;
        initComponents();
        this.setLocationRelativeTo(null);
       btnAgregar.setEnabled(false);
      //  btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
       


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
        lblnom = new javax.swing.JLabel();
        lblcos = new javax.swing.JLabel();
        lbldescrip = new javax.swing.JLabel();
        txtCnombre = new javax.swing.JTextField();
        txtcosto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescrip = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoPequeño.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 642, -1));

        lblnom.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblnom.setText("Nombre");
        getContentPane().add(lblnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 247, -1, -1));

        lblcos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblcos.setText("Costo");
        getContentPane().add(lblcos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 284, -1, -1));

        lbldescrip.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbldescrip.setText("Descripción");
        getContentPane().add(lbldescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 323, -1, -1));

        txtCnombre.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtCnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCnombreFocusLost(evt);
            }
        });
        txtCnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtCnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 244, 279, -1));

        txtcosto.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtcosto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcostoFocusLost(evt);
            }
        });
        txtcosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcostoActionPerformed(evt);
            }
        });
        txtcosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcostoKeyTyped(evt);
            }
        });
        getContentPane().add(txtcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 281, 279, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 120, -1));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 120, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 364, 120, -1));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 120, -1));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, -1));

        btnborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnborrar.setText("Borrar");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 120, -1));

        jScrollPane2.setViewportView(txtdescrip);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 280, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcostoActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        vistaMenuPrincipal vista = new vistaMenuPrincipal(user); 
        vista.setVisible (true);
        vista.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ServiciosDAO ser=new ServiciosDAO();
        float cos=Float.parseFloat(txtcosto.getText());
     ser.AgregarServicio(txtCnombre.getText(), cos, txtdescrip.getText());
        txtCnombre.setText("");
        txtcosto.setText("");
        txtdescrip.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         ServiciosDAO ser=new ServiciosDAO();
     buscarServicio(txtCnombre.getText());
     btnModificar.setEnabled(true);
     btnEliminar.setEnabled(true);
    }//GEN-LAST:event_btnBuscarActionPerformed
 public void buscarServicio(String nombre) {
      
        Conexion conex = new Conexion();
        ServicioVO BusServi = new ServicioVO();
        boolean existe = false;
        try {
            PreparedStatement consulta = conex.getConexion().prepareStatement("SELECT *FROM Servicio where nombre=?");
            consulta.setString(1, nombre);//
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                existe = true;
                BusServi.setNombre((res.getString("nombre")));
                BusServi.setCosto((Float.parseFloat(res.getString("costo"))));
                BusServi.setDescripcion(res.getString("descripcion"));
             
                existe = true;
             txtcosto.setText(String.valueOf(BusServi.getCosto()));
             txtdescrip.setText(BusServi.getDescripcion());
             
            }
            res.close();
            conex.desconectar();

        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
           
        }
        if (existe) {
        } else {
             JOptionPane.showMessageDialog(null,"No se encontro el servicio");
        }
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       ServiciosDAO ser=new ServiciosDAO();
      ser.eliminarServicio(txtCnombre.getText());
       txtCnombre.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       ServiciosDAO ser=new ServiciosDAO();
     float cos=Float.parseFloat(txtcosto.getText());
    ser.modificarServicio(txtCnombre.getText(), cos, txtdescrip.getText());
       txtCnombre.setText("");
        txtcosto.setText("");
        txtdescrip.setText("");  
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtCnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnombreKeyTyped
                char car = evt.getKeyChar();
        if( (car<' ' || car>' ')&& (car<'a' || car>'z')&& (car<'A' || car>'Z')) evt.consume();
      
                String a="Fotografías";
                String b="globoforma";
                String c="hora animador";
                String d="hora inflable grande";
                String e="hora inflable pequeño";
                String f="hora maquina de burbujas";
                String g="hora animador adicional";
                String h="Mago";
                String i="mimo";
                String j="pastel";
                String k="personaje adicional";
                String m="piñata";
                String n="pintucaritas";
                 TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(txtCnombre );
                 textAutoAcompleter.addItem(a);
                 textAutoAcompleter.addItem(b);
                 textAutoAcompleter.addItem(c);
                 textAutoAcompleter.addItem(d);
                 textAutoAcompleter.addItem(e);
                 textAutoAcompleter.addItem(f);
                 textAutoAcompleter.addItem(g);
                 textAutoAcompleter.addItem(h);
                 textAutoAcompleter.addItem(i);
                 textAutoAcompleter.addItem(j);
                 textAutoAcompleter.addItem(k);
                 textAutoAcompleter.addItem(m);
                 textAutoAcompleter.addItem(n);


    }//GEN-LAST:event_txtCnombreKeyTyped

    private void txtcostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcostoKeyTyped
     char car = evt.getKeyChar();
if(Character.isDigit(car)){

}else{
evt.consume();
getToolkit().beep();
}
    }//GEN-LAST:event_txtcostoKeyTyped
int etiquetas;
    private void txtCnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCnombreFocusLost
   int a=0;
        if (txtCnombre.getText().length()<4) {
            lblnom.setForeground(Color.red);
        }else{
            lblnom.setForeground(Color.green);
           a++; 
        }
        etiquetas=a;
    }//GEN-LAST:event_txtCnombreFocusLost

    private void txtcostoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcostoFocusLost
     int b=0;
        if (txtcosto.getText().length()>3 || txtcosto.getText().length()<1) {
            lblcos.setForeground(Color.red);
        }else{
            lblcos.setForeground(Color.green);
            b++;
        }
        etiquetas+=b;
    }//GEN-LAST:event_txtcostoFocusLost

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
      txtCnombre.setText("");
      txtdescrip.setText("");
      txtcosto.setText("");
    }//GEN-LAST:event_btnborrarActionPerformed
    
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
            java.util.logging.Logger.getLogger(vistaServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaServicios(new EmpleadoVO()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnHome;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnborrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblcos;
    private javax.swing.JLabel lbldescrip;
    private javax.swing.JLabel lblnom;
    public javax.swing.JTextField txtCnombre;
    public javax.swing.JTextField txtcosto;
    private javax.swing.JTextPane txtdescrip;
    // End of variables declaration//GEN-END:variables
}