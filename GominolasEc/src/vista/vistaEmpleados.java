/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.EmpleadoVO;
import modelo.PersonaVO;

/**
 *
 * @author jhond
 */
public class vistaEmpleados extends javax.swing.JFrame {

    private EmpleadoVO user;
    Conexion con;

    /**
     * Creates new form vistaEmpleados
     */
    public vistaEmpleados(EmpleadoVO user) {
        this.user=user;
        initComponents();
        this.setLocationRelativeTo(null);
        btnEliminar.setVisible(false);
        btnModificar.setVisible(false);
        btnRestablecer.setVisible(false);
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
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnRestablecer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoPequeño.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");

        lblCedula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblCedula.setText("CI");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblNombre.setText("Nombre");

        lblApellido.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblApellido.setText("Apellido");

        lblTelefono.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblTelefono.setText("Telefono");

        lblDireccion.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblDireccion.setText("Dirección");

        lblCorreo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblCorreo.setText("Correo electronico");

        txtCedula.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });

        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnRestablecer.setText("Restablecer contraseña");
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblDireccion)
                            .addComponent(lblCorreo)
                            .addComponent(lblCedula)
                            .addComponent(lblApellido)
                            .addComponent(lblTelefono))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCedula))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefono))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)
                        .addGap(4, 4, 4)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome)
                    .addComponent(btnRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        vistaMenuPrincipal vista = new vistaMenuPrincipal(user); 
        vista.setVisible (true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (btnBuscar.getText()=="Buscar") {
            EmpleadoVO E=new EmpleadoVO();
            PersonaVO P=new PersonaVO();
            Conexion con=new Conexion();
            Connection accesoBD = con.getConexion();
            String cei;
            cei=txtCedula.getText();
            try{
                PreparedStatement ps=accesoBD.prepareStatement("select * from empleado where ci=?");
                ps.setString(1, cei);

                ResultSet rs=ps.executeQuery();
                if (rs.next()){
                    E.setCi(rs.getString(1));
                    E.setContrasena(rs.getString(2));
                    E.setCargo(rs.getString(3));
                }
            }
            catch(Exception e)
            {

            }
            if (E.getCi()!="") {
                try{
                    PreparedStatement ps=accesoBD.prepareStatement("select * from persona where ci=?");
                    ps.setString(1, E.getCi());

                    ResultSet rs=ps.executeQuery();
                    if (rs.next()){
                        P.setCi(rs.getString(1));
                        P.setNombre(rs.getString(2));
                        P.setApellido(rs.getString(3));
                        P.setDireccion(rs.getString(4));
                        P.setTelefono(rs.getString(5));
                        P.setCorreo(rs.getString(6));
                    }
                }
                catch(Exception e)
                {

                }
                JOptionPane.showMessageDialog(null, "Empleado encontrado");
                txtNombre.setText(P.getNombre());
                txtApellido.setText(P.getApellido());
                txtDireccion.setText(P.getDireccion());
                txtTelefono.setText(P.getTelefono());
                txtCorreo.setText(P.getCorreo());
                if ("gerente".equals(E.getCargo())) {
                    btnEliminar.setVisible(false);
                }else{
                    btnEliminar.setVisible(true);
                }
                btnModificar.setVisible(true);
                btnAgregar.setVisible(false);
                btnRestablecer.setVisible(true);
                txtCedula.setEditable(false);
                btnBuscar.setText("Otra Busqueda");
            }else{
                JOptionPane.showMessageDialog(null, "Empleado no encontrado");
                btnEliminar.setVisible(false);
                btnModificar.setVisible(false);
                btnRestablecer.setVisible(false);
                btnAgregar.setVisible(true);
            }
        }else{
            txtCedula.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtDireccion.setText("");
            txtTelefono.setText("");
            txtCorreo.setText("");
            txtCedula.setEditable(true);
            btnEliminar.setVisible(false);
            btnModificar.setVisible(false);
            btnRestablecer.setVisible(false);
            btnAgregar.setVisible(true);
            btnBuscar.setText("Buscar");
        }
        lblCedula.setForeground(Color.black);
        lblNombre.setForeground(Color.black);
        lblApellido.setForeground(Color.black);
        lblDireccion.setForeground(Color.black);
        lblTelefono.setForeground(Color.black);
        lblCorreo.setForeground(Color.black);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (todoOK()) {
            EmpleadoVO E=new EmpleadoVO();
            PersonaVO P=new PersonaVO();
            Conexion con=new Conexion();
            Connection accesoBD = con.getConexion();
            P.setCi(txtCedula.getText());
            P.setNombre(txtNombre.getText());
            P.setApellido(txtApellido.getText());
            P.setDireccion(txtDireccion.getText());
            P.setTelefono(txtTelefono.getText());
            P.setCorreo(txtCorreo.getText());
            E.setCi(txtCedula.getText());
            E.setContrasena("12345");
            E.setCargo("empleado");
            int ban=AgregarEmpleado(P.getCi(),P.getNombre(),P.getApellido(),P.getDireccion(),P.getTelefono(),P.getCorreo(),E.getContrasena(),E.getCargo());
            if (ban==1) {
                txtNombre.setText(P.getNombre());
                txtApellido.setText(P.getApellido());
                txtDireccion.setText(P.getDireccion());
                txtTelefono.setText(P.getTelefono());
                txtCorreo.setText(P.getCorreo());
                btnEliminar.setVisible(true);
                btnModificar.setVisible(true);
                btnRestablecer.setVisible(true);
                btnAgregar.setVisible(false);
                txtCedula.setEditable(false);
                btnBuscar.setText("Otra Busqueda");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El empleado no se pudo agregar. Verifique si los datos son correctos");
        }
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        System.out.println("ci"+txtCedula.getText());
        int ban=EliminarEmpleado(txtCedula.getText());
        if (ban==1) {
            txtCedula.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtDireccion.setText("");
            txtTelefono.setText("");
            txtCorreo.setText("");
            txtCedula.setEditable(true);
            btnEliminar.setVisible(false);
            btnModificar.setVisible(false);
            btnRestablecer.setVisible(false);
            btnAgregar.setVisible(true);
            btnBuscar.setText("Buscar");
            lblCedula.setForeground(Color.black);
            lblNombre.setForeground(Color.black);
            lblApellido.setForeground(Color.black);
            lblDireccion.setForeground(Color.black);
            lblTelefono.setForeground(Color.black);
            lblCorreo.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (todoOK()) {
            ModificarEmpleado(txtCedula.getText(),txtNombre.getText(),txtApellido.getText(),txtDireccion.getText(),txtTelefono.getText(),txtCorreo.getText());
        } else {
            JOptionPane.showMessageDialog(null, "El empleado no se pudo modificar. Verifique si los datos son correctos");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char validar=evt.getKeyChar();
        if ((int)validar>32 && (int)validar<=47
                || (int)validar>58 && (int)validar<=255) {
            getToolkit().beep();
            evt.consume();
        }
        if (txtCedula.getText().length()>9) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
        if (Character.isSpace(validar)) {
            getToolkit().beep();
            evt.consume();
        }
        if ((int)validar>32 && (int)validar<=47
                || (int)validar>58 && (int)validar<=64
                || (int)validar>91 && (int)validar<=96
                || (int)validar>123 && (int)validar<=255) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char validar=evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
        if (Character.isSpace(validar)) {
            getToolkit().beep();
            evt.consume();
        }
        if ((int)validar>32 && (int)validar<=47
                || (int)validar>58 && (int)validar<=64
                || (int)validar>91 && (int)validar<=96
                || (int)validar>123 && (int)validar<=255) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char validar=evt.getKeyChar();
        if ((int)validar>32 && (int)validar<=47
                || (int)validar>58 && (int)validar<=255) {
            getToolkit().beep();
            evt.consume();
        }
        if (txtTelefono.getText().length()>9) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        mat = pat.matcher(txtCorreo.getText());
        if (mat.find()) {
            lblCorreo.setForeground(Color.green);
        } else {
            //JOptionPane.showMessageDialog(null, "Correo electrónico incorrecto","Validar correo electrónico",JOptionPane.INFORMATION_MESSAGE);
            lblCorreo.setForeground(Color.red);
        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        if ("".equals(txtCedula.getText())) {
            //JOptionPane.showMessageDialog(null, "Cédula de identidad incorrecta","Validar cédula de identidad",JOptionPane.INFORMATION_MESSAGE);
            lblCedula.setForeground(Color.red);
        } else {
            if (!validaCedula(txtCedula.getText())) {
                //JOptionPane.showMessageDialog(null, "Cédula de identidad incorrecta","Validar cédula de identidad",JOptionPane.INFORMATION_MESSAGE);
                lblCedula.setForeground(Color.red);
            }else{
                lblCedula.setForeground(Color.green);
            }
        }
    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if (txtNombre.getText().length()<2) {
            lblNombre.setForeground(Color.red);
        }else{
            lblNombre.setForeground(Color.green);
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        if (txtApellido.getText().length()<2) {
            lblApellido.setForeground(Color.red);
        }else{
            lblApellido.setForeground(Color.green);
        }
    }//GEN-LAST:event_txtApellidoFocusLost

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        if (txtTelefono.getText().length()<9) {
            lblTelefono.setForeground(Color.red);
        }else{
            lblTelefono.setForeground(Color.green);
        }
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        if (txtDireccion.getText().length()<4) {
            lblDireccion.setForeground(Color.red);
        }else{
            lblDireccion.setForeground(Color.green);
        }
    }//GEN-LAST:event_txtDireccionFocusLost

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
       restablecerContrasena(txtCedula.getText());
    }//GEN-LAST:event_btnRestablecerActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

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
            java.util.logging.Logger.getLogger(vistaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaEmpleados(new EmpleadoVO()).setVisible(true);
            }
        });
    }
    public int AgregarEmpleado(String ci1,String nombre1,String apellido1,String direccion1,String telefono1,String correo1,String contraseña1,String cargo1){
        
        con=new Conexion();
        Connection accesoBD = con.getConexion();
        try{
            PreparedStatement ps=accesoBD.prepareCall("call registrarEmp(?,?,?,?,?,?,?,?)");
            ps.setString(1, ci1);
            ps.setString(2, nombre1);
            ps.setString(3, apellido1);
            ps.setString(4, direccion1);
            ps.setString(5, telefono1);
            ps.setString(6, correo1);
            ps.setString(7, contraseña1);
            ps.setString(8, cargo1);
           
            int res=ps.executeUpdate();
            if (res==1){
               JOptionPane.showMessageDialog(null, "El empleado se agregó correctamente y se le asigno por defecto la contraseña '12345'");
               return 1;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "El empleado no se pudo agregar. Verifique si los datos son correctos o ya se encuentra registrado");
            return 0;
        }
        return 0;
    }
    public int EliminarEmpleado(String ci1){
        con=new Conexion();
        Connection accesoBD = con.getConexion();
        try{
            PreparedStatement ps=accesoBD.prepareCall("call eliminarEmp(?)");
            ps.setString(1, ci1);
           
            int res=ps.executeUpdate();
            if (res==1){
               JOptionPane.showMessageDialog(null, "El empleado se eliminó correctamente");
               return 1;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "El empleado no se pudo eliminar. Verifique si los datos son correctos");
            return 0;
        }
        return 0;
    }
    public boolean validaCedula(String x){
        int suma=0;
        if(x.length()==9){
            return false;
        }else{
            int a[]=new int [x.length()/2];
            int b[]=new int [(x.length()/2)];
            int c=0;
            int d=1;
            for (int i = 0; i < x.length()/2; i++) {
                a[i]=Integer.parseInt(String.valueOf(x.charAt(c)));
                c=c+2;
                if (i < (x.length()/2)-1) {
                    b[i]=Integer.parseInt(String.valueOf(x.charAt(d)));
                    d=d+2;
                }
            }
            for (int i = 0; i < a.length; i++) {
                a[i]=a[i]*2;
                if (a[i] >9){
                    a[i]=a[i]-9;
                }
                suma=suma+a[i]+b[i];
            } 
            int aux=suma/10;
            int dec=(aux+1)*10;
            if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length()-1))))
                return true;
            else
                if(suma%10==0 && x.charAt(x.length()-1)=='0'){
                    return true;
                }else{
                    return false;
                }
        }
    }
    public int ModificarEmpleado(String ci1,String nombre1,String apellido1,String direccion1,String telefono1,String correo1){
        
        con=new Conexion();
        Connection accesoBD = con.getConexion();
        try{
            PreparedStatement ps=accesoBD.prepareCall("call modificarEmp(?,?,?,?,?,?)");
            ps.setString(1, ci1);
            ps.setString(2, nombre1);
            ps.setString(3, apellido1);
            ps.setString(4, direccion1);
            ps.setString(5, telefono1);
            ps.setString(6, correo1);
           
            int res=ps.executeUpdate();
            if (res==1){
               JOptionPane.showMessageDialog(null, "El empleado se modificó correctamente");
               return 1;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "El empleado no se pudo modificar. Verifique si los datos son correctos");
            return 0;
        }
        return 0;
    }
    public int restablecerContrasena(String ci1){
        
        con=new Conexion();
        Connection accesoBD = con.getConexion();
        try{
            PreparedStatement ps=accesoBD.prepareCall("call restablecerCon(?)");
            ps.setString(1, ci1);
           
            int res=ps.executeUpdate();
            if (res==1){
               JOptionPane.showMessageDialog(null, "la contraseña se reestableció correctamente");
               return 1;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "El empleado no se pudo modificar. Verifique si los datos son correctos");
            return 0;
        }
        return 0;
    }
    public boolean todoOK(){
        if ("".equals(txtCedula.getText())) {
            lblCedula.setForeground(Color.red);
            return false;
        } else {
            if (!validaCedula(txtCedula.getText())) {
                lblCedula.setForeground(Color.red);
                return false;
            }
        }
        if (txtNombre.getText().length()<2) {
            lblNombre.setForeground(Color.red);
            return false;
        }
        if (txtApellido.getText().length()<2) {
            lblApellido.setForeground(Color.red);
            return false;
        }
        if (txtTelefono.getText().length()<9) {
            lblTelefono.setForeground(Color.red);
            return false;
        }
        if (txtDireccion.getText().length()<4) {
            lblDireccion.setForeground(Color.red);
            return false;
        }
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        mat = pat.matcher(txtCorreo.getText());
        if (mat.find()) {
        } else {
            lblCorreo.setForeground(Color.red);
            return false;
        }
        return true;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnHome;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnRestablecer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
