/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrmHotelAlura;

import UsuariosBL.UsuariosBL;
import javax.swing.JOptionPane;
import java.util.Calendar;
import UsuariosDAL.Conexion;
import java.awt.Component;
import java.awt.Container;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author andres
 */
public class frmHotelAlura extends javax.swing.JFrame {
    DefaultTableModel modelo;

    /**
     * Creates new form frmHotelAlura
     */
    public frmHotelAlura() {
        initComponents();
        this.setLocationRelativeTo(null); 
        inputFInicial_frmReserva.setVisible(false);
        inputFFinal_frmReserva.setVisible(false);
        //inputID_frmDatosCliente.setVisible(false);
        inputNombre_frmManejoReserva.getCursor();
        enableComponents(frmManejoReserva, false);
        enableComponents(frmReserva, false);    
        //OJOOOOOOOOOOOO no son parentesís son llaves
        String[] titulos = {"ID", "NOMBRES", "APELLIDOS", "CEL", "PRECIO", "RESERVA"};
        modelo = new DefaultTableModel(null,titulos);
        tblUsuarios.setModel(modelo);
        mostrarDatos();
         
    }
    
    //método para cargar los componentes de los formularios Reserva y Manejo Reservas
    public void enableComponents(Container container, boolean enable) {
    Component[] components = container.getComponents();
    for (Component component : components) {
        component.setEnabled(enable);
        if (component instanceof Container) {
            enableComponents((Container)component, enable);
        }
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        frmcontenedor = new javax.swing.JTabbedPane();
        frmLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputUsuario_frmlogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputPassword_frmlogin = new javax.swing.JTextField();
        buttonConfirmar_frmlogin = new javax.swing.JButton();
        frmReserva = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        calendFechaIniclal = new com.toedter.calendar.JCalendar();
        calendFechaFinal = new com.toedter.calendar.JCalendar();
        jLabel7 = new javax.swing.JLabel();
        labelTarifa_frmReserva = new javax.swing.JLabel();
        buttonCalcular_frmReserva = new javax.swing.JButton();
        inputFInicial_frmReserva = new javax.swing.JTextField();
        inputFFinal_frmReserva = new javax.swing.JTextField();
        buttonFechaInicial_frmReserva = new javax.swing.JButton();
        buttonFechaFinal_frmReserva = new javax.swing.JButton();
        inputPrueba = new javax.swing.JTextField();
        inputFInicial_frmReservaVisible = new javax.swing.JTextField();
        inputFFinal_frmReservaVsible = new javax.swing.JTextField();
        frmManejoReserva = new javax.swing.JPanel();
        buttonEditar_frmManejoReservas = new javax.swing.JButton();
        buttonEliminar_frmManejoReservas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        inputID_frmManejoReserva = new javax.swing.JTextField();
        inputNombre_frmManejoReserva = new javax.swing.JTextField();
        inputApellido_frmManejoReserva = new javax.swing.JTextField();
        inputCelular_frmManejoReserva = new javax.swing.JTextField();
        inputPrecio_frmManejoReserva = new javax.swing.JTextField();
        inputReserva_frmManejoReserva = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonReserva_frmManejoReserva = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOTEL ALURA");
        setResizable(false);

        frmcontenedor.setBackground(new java.awt.Color(255, 255, 255));

        frmLogin.setBackground(new java.awt.Color(230, 252, 252));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FrmHotelAlura/hotalalura2.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        inputUsuario_frmlogin.setToolTipText("USUARIO Andres");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("USUARIO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("CONTRASEÑA");

        inputPassword_frmlogin.setToolTipText("CONTRASEÑA Alura");

        buttonConfirmar_frmlogin.setText("CONFIRMAR");
        buttonConfirmar_frmlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmar_frmloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmLoginLayout = new javax.swing.GroupLayout(frmLogin);
        frmLogin.setLayout(frmLoginLayout);
        frmLoginLayout.setHorizontalGroup(
            frmLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(frmLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmLoginLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(frmLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addGroup(frmLoginLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4))
                    .addGroup(frmLoginLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(frmLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputUsuario_frmlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputPassword_frmlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(frmLoginLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(buttonConfirmar_frmlogin)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        frmLoginLayout.setVerticalGroup(
            frmLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmLoginLayout.createSequentialGroup()
                .addGroup(frmLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(frmLoginLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(inputUsuario_frmlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputPassword_frmlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(buttonConfirmar_frmlogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frmcontenedor.addTab("Login", frmLogin);

        frmReserva.setBackground(new java.awt.Color(230, 252, 252));

        jLabel5.setText("FECHA INICIAL");

        jLabel6.setText("FECHA FINAL");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("TOTAL TARIFA $: ");

        labelTarifa_frmReserva.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        buttonCalcular_frmReserva.setText("CALCULAR TARIFA");
        buttonCalcular_frmReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcular_frmReservaActionPerformed(evt);
            }
        });

        buttonFechaInicial_frmReserva.setText("ACEPTAR");
        buttonFechaInicial_frmReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFechaInicial_frmReservaActionPerformed(evt);
            }
        });

        buttonFechaFinal_frmReserva.setText("ACEPTAR");
        buttonFechaFinal_frmReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFechaFinal_frmReservaActionPerformed(evt);
            }
        });

        inputPrueba.setEditable(false);

        javax.swing.GroupLayout frmReservaLayout = new javax.swing.GroupLayout(frmReserva);
        frmReserva.setLayout(frmReservaLayout);
        frmReservaLayout.setHorizontalGroup(
            frmReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmReservaLayout.createSequentialGroup()
                .addGroup(frmReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmReservaLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCalcular_frmReserva)
                        .addGap(82, 82, 82)
                        .addComponent(labelTarifa_frmReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmReservaLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(frmReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmReservaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputFInicial_frmReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputFInicial_frmReservaVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonFechaInicial_frmReserva))
                            .addComponent(calendFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calendFechaIniclal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(frmReservaLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(inputFFinal_frmReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputFFinal_frmReservaVsible, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonFechaFinal_frmReserva)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frmReservaLayout.setVerticalGroup(
            frmReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendFechaIniclal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputFInicial_frmReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFechaInicial_frmReserva)
                    .addComponent(inputFInicial_frmReservaVisible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calendFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(frmReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputFFinal_frmReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonFechaFinal_frmReserva)
                        .addComponent(inputFFinal_frmReservaVsible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmReservaLayout.createSequentialGroup()
                        .addComponent(labelTarifa_frmReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(frmReservaLayout.createSequentialGroup()
                        .addGroup(frmReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(frmReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buttonCalcular_frmReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                .addComponent(inputPrueba)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        frmcontenedor.addTab("Reserva", frmReserva);

        frmManejoReserva.setBackground(new java.awt.Color(230, 252, 252));

        buttonEditar_frmManejoReservas.setText("EDITAR");
        buttonEditar_frmManejoReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditar_frmManejoReservasActionPerformed(evt);
            }
        });

        buttonEliminar_frmManejoReservas.setText("ELIMINAR");
        buttonEliminar_frmManejoReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminar_frmManejoReservasActionPerformed(evt);
            }
        });

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsuarios);

        inputID_frmManejoReserva.setEditable(false);
        inputID_frmManejoReserva.setToolTipText("Este campo no puede ser editado");
        inputID_frmManejoReserva.setFocusable(false);

        inputNombre_frmManejoReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputNombre_frmManejoReserva.setNextFocusableComponent(inputApellido_frmManejoReserva);
        inputNombre_frmManejoReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputNombre_frmManejoReservaKeyTyped(evt);
            }
        });

        inputApellido_frmManejoReserva.setNextFocusableComponent(inputPrecio_frmManejoReserva);
        inputApellido_frmManejoReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputApellido_frmManejoReservaKeyTyped(evt);
            }
        });

        inputCelular_frmManejoReserva.setEditable(false);
        inputCelular_frmManejoReserva.setNextFocusableComponent(inputReserva_frmManejoReserva);

        inputPrecio_frmManejoReserva.setNextFocusableComponent(inputCelular_frmManejoReserva);
        inputPrecio_frmManejoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPrecio_frmManejoReservaActionPerformed(evt);
            }
        });
        inputPrecio_frmManejoReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputPrecio_frmManejoReservaKeyTyped(evt);
            }
        });

        jLabel15.setText("ID");

        jLabel16.setText("CEL");

        jLabel17.setText("NOMBRES");

        jLabel18.setText("PRECIO");

        jLabel19.setText("APELLIDOS");

        jLabel20.setText("RESERVA");

        buttonReserva_frmManejoReserva.setText("RESERVAR");
        buttonReserva_frmManejoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReserva_frmManejoReservaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HOTEL ALURA");

        javax.swing.GroupLayout frmManejoReservaLayout = new javax.swing.GroupLayout(frmManejoReserva);
        frmManejoReserva.setLayout(frmManejoReservaLayout);
        frmManejoReservaLayout.setHorizontalGroup(
            frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmManejoReservaLayout.createSequentialGroup()
                .addGroup(frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmManejoReservaLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(frmManejoReservaLayout.createSequentialGroup()
                                .addGroup(frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmManejoReservaLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(buttonReserva_frmManejoReserva))
                                    .addGroup(frmManejoReservaLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputPrecio_frmManejoReserva)))
                                .addGap(15, 15, 15)
                                .addGroup(frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(frmManejoReservaLayout.createSequentialGroup()
                                        .addGroup(frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inputCelular_frmManejoReserva)
                                            .addComponent(inputNombre_frmManejoReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                                    .addComponent(buttonEditar_frmManejoReservas))
                                .addGap(18, 18, 18)
                                .addGroup(frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmManejoReservaLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputApellido_frmManejoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(frmManejoReservaLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGroup(frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(frmManejoReservaLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 77, Short.MAX_VALUE)
                                                .addComponent(buttonEliminar_frmManejoReservas)
                                                .addGap(41, 41, 41))
                                            .addGroup(frmManejoReservaLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(inputReserva_frmManejoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jSeparator1)
                            .addGroup(frmManejoReservaLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGroup(frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmManejoReservaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(frmManejoReservaLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(inputID_frmManejoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(frmManejoReservaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        frmManejoReservaLayout.setVerticalGroup(
            frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmManejoReservaLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputID_frmManejoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNombre_frmManejoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputApellido_frmManejoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19))
                .addGap(31, 31, 31)
                .addGroup(frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCelular_frmManejoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPrecio_frmManejoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputReserva_frmManejoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(frmManejoReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditar_frmManejoReservas)
                    .addComponent(buttonEliminar_frmManejoReservas)
                    .addComponent(buttonReserva_frmManejoReserva))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        frmcontenedor.addTab("Manejo Reservas", frmManejoReserva);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frmcontenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(frmcontenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        frmcontenedor.getAccessibleContext().setAccessibleName("frmReserva");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //FORMULARIO LOGIN
    private void buttonConfirmar_frmloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmar_frmloginActionPerformed
        String inputUsuario = inputUsuario_frmlogin.getText();
        String inputContraseña = inputPassword_frmlogin.getText();
        if(inputUsuario.equals("Andres") && inputContraseña.equals("Alura")){
            JOptionPane.showMessageDialog(this, "Datos validados correctamente");
            inputUsuario_frmlogin.setText("");
            inputPassword_frmlogin.setText("");
            enableComponents(frmManejoReserva, true);
        enableComponents(frmReserva, true);   
        }else{
            if(inputUsuario.equals("") || inputContraseña.equals("")){
                JOptionPane.showMessageDialog(this, "Los campos de USUARIO y CONTRASEÑA no pueden estar vacíos");
            }else{
                JOptionPane.showMessageDialog(this, "Los datos ingresados son incorrectos");
            }
        }
    }//GEN-LAST:event_buttonConfirmar_frmloginActionPerformed

    private void buttonCalcular_frmReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcular_frmReservaActionPerformed
            double Resultado = 0;
            double tarifa = 0.2;
            UsuariosBL usuarios = new UsuariosBL();
            //NUMERO RAMDOM PARA LA FACTURA
            int numero = (int)(Math.random()*10000+1);
            //INPUTS DE FECHA VISIBLES
            String fechaIVisible = inputFInicial_frmReservaVisible.getText();
            String fechaFVisible = inputFFinal_frmReservaVsible.getText();
            if(fechaIVisible.equals(fechaFVisible)){
               JOptionPane.showMessageDialog(this, "La reserva inicial es igual a la reserva final"); 
            }else{
            if(fechaIVisible.equals("") || fechaFVisible.equals("")){
                JOptionPane.showMessageDialog(this, "Los campos de FECHA INICIAL y FECHA FINAL no pueden estar vacíos");
            }else{
            //INPUTS DE FECHA NO VISIBLES, PERO CON LOS QUE SE REALIZAN LAS OPERACIONES
            double fechaInicial = Double.parseDouble(inputFInicial_frmReserva.getText());
            double fechaFinal = Double.parseDouble(inputFFinal_frmReserva.getText());
            Resultado = (fechaFinal - fechaInicial)*tarifa;
            double nuevoResultado = Double.parseDouble(Double.toString(Resultado).substring(000));
            String Resultado2 = String.valueOf(Resultado);
            inputPrueba.setText(Resultado2);
            int resp = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Precaución!", JOptionPane.YES_NO_OPTION);
            if(resp==0){
             inputID_frmManejoReserva.setText("");
             inputNombre_frmManejoReserva.setText("");
             inputApellido_frmManejoReserva.setText("");
             inputCelular_frmManejoReserva.setText("");
             inputPrecio_frmManejoReserva.setText("");
             inputReserva_frmManejoReserva.setText(""); 
             inputCelular_frmManejoReserva.setText(Resultado2);
             inputReserva_frmManejoReserva.setText("Reserva N°: " + numero);
             buttonReserva_frmManejoReserva.setEnabled(true);  
            }
            }
            }
    }//GEN-LAST:event_buttonCalcular_frmReservaActionPerformed


    //CAPTURA DE LAS FECHAS DE LOS JCALENDAR Y SU CONVERSION EN LOS INPUT
    private void buttonFechaInicial_frmReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFechaInicial_frmReservaActionPerformed
String dia = Integer.toString(calendFechaIniclal.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(calendFechaIniclal.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(calendFechaIniclal.getCalendar().get(Calendar.YEAR));
String fecha = (dia + mes +  year);
String fechaVisible = (dia + "/" + mes + "/" +  year);

inputFInicial_frmReserva.setText(fecha);   
inputFInicial_frmReservaVisible.setText(fechaVisible);
    }//GEN-LAST:event_buttonFechaInicial_frmReservaActionPerformed

    private void buttonFechaFinal_frmReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFechaFinal_frmReservaActionPerformed
        String dia = Integer.toString(calendFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(calendFechaFinal.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(calendFechaFinal.getCalendar().get(Calendar.YEAR));
String fecha = (dia +  mes +  year);
String fechaVisible = (dia + "/" + mes + "/" +  year);
inputFFinal_frmReserva.setText(fecha); 
inputFFinal_frmReservaVsible.setText(fechaVisible);
    }//GEN-LAST:event_buttonFechaFinal_frmReservaActionPerformed
    
    //MUESTERA LOS DATOS DE LA TABLA EN LOS CONTROLES DEL FORMULARIO
    public void mostrarDatos(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        Conexion conexion = new Conexion();
          try {
            ResultSet respuesta = conexion.consultarDatos("SELECT * FROM DatosUsuarioReserva");
            while(respuesta.next()){
                System.out.println(respuesta.getString("id_Usuario"));
                System.out.println(respuesta.getString("nombres"));
                System.out.println(respuesta.getString("apellidos"));
                System.out.println(respuesta.getString("telefono"));
                System.out.println(respuesta.getString("precio"));
                System.out.println(respuesta.getString("numero_reserva"));
                
                //OJOOOOOOOOOOOO no son parentesís son llaves
                //DATOS DE LA JTABLE QUE SE MUESTRAN EN LOS CONTROLES DEL FORMULARIO
                Object[] usuario = {respuesta.getString("id_Usuario"), respuesta.getString("nombres"), respuesta.getString("apellidos"), respuesta.getString("telefono"), respuesta.getString("precio"), respuesta.getString("numero_reserva")};
                modelo.addRow(usuario);
                    
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    
    public UsuariosBL obtenerDatos(){
        UsuariosBL usuarios = new UsuariosBL();
        int id_Usuario = (inputID_frmManejoReserva.getText().isEmpty())?0: Integer.parseInt(inputID_frmManejoReserva.getText());
        usuarios.setId_usuario(id_Usuario);
        usuarios.setNombres(inputNombre_frmManejoReserva.getText());
        usuarios.setApellidos(inputApellido_frmManejoReserva.getText());
        usuarios.setTelefono(inputPrecio_frmManejoReserva.getText());
        usuarios.setPrecio(inputCelular_frmManejoReserva.getText());
        usuarios.setNumero_reserva(inputReserva_frmManejoReserva.getText());
        return usuarios;
    }
    
    private void inputPrecio_frmManejoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPrecio_frmManejoReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPrecio_frmManejoReservaActionPerformed

    //LLAMA LOS DATOS DE LA TABLA AL HACER CLICK EN ELLOS Y LOS MUESTRA EN EL FORMULARIO
    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        if(evt.getClickCount()==1){
            JTable receptor = (JTable)evt.getSource();
            //jala los datos de la Jtable
            inputID_frmManejoReserva.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            inputNombre_frmManejoReserva.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
            inputApellido_frmManejoReserva.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
            inputCelular_frmManejoReserva.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
            inputPrecio_frmManejoReserva.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),4).toString());
            inputReserva_frmManejoReserva.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),5).toString());
            buttonReserva_frmManejoReserva.setEnabled(false);             
        }
    }//GEN-LAST:event_tblUsuariosMouseClicked

    //ELIMINAR DATOS DE LA TABLA
    private void buttonEliminar_frmManejoReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminar_frmManejoReservasActionPerformed
        Conexion conexion2 = new Conexion();
         UsuariosBL usuarios = obtenerDatos();
        int resp = JOptionPane.showConfirmDialog(null, "¿Eliminar el Registro?", "Precaución!", JOptionPane.YES_NO_OPTION);
        if(resp==0){          
        String consultaInsert = String.format("DELETE FROM DatosUsuarioReserva WHERE id_Usuario=%d", usuarios.getId_usuario());
        conexion2.sentenciaSQL(consultaInsert);
        System.out.println("Datos Eliminados" );
        
        inputID_frmManejoReserva.setText("");
        inputNombre_frmManejoReserva.setText("");
        inputApellido_frmManejoReserva.setText("");
        inputCelular_frmManejoReserva.setText("");
        inputPrecio_frmManejoReserva.setText("");
        inputReserva_frmManejoReserva.setText("");
        this.mostrarDatos();       
            }
     
    }//GEN-LAST:event_buttonEliminar_frmManejoReservasActionPerformed

    //ACTUALIZAR DATOS DE LA TABLA
    private void buttonEditar_frmManejoReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditar_frmManejoReservasActionPerformed
        Conexion conexion = new Conexion();
        UsuariosBL usuarios3 = obtenerDatos();
        int resp = JOptionPane.showConfirmDialog(null, "¿Actualizar registro?", "Precaución!", JOptionPane.YES_NO_OPTION);
        if(resp==0){   
        String consultaActualizar = String.format("UPDATE DatosUsuarioReserva SET nombres='%s', apellidos='%s', telefono='%s', precio='%s', numero_reserva='%s' WHERE id_Usuario=%d", usuarios3.getNombres(), usuarios3.getApellidos(), usuarios3.getTelefono(), usuarios3.getPrecio(), usuarios3.getNumero_reserva(), usuarios3.getId_usuario() );
        conexion.sentenciaSQL(consultaActualizar);
        System.out.println("Datos Actualizados" );
        inputID_frmManejoReserva.setText("");
        inputNombre_frmManejoReserva.setText("");
        inputApellido_frmManejoReserva.setText("");
        inputCelular_frmManejoReserva.setText("");
        inputPrecio_frmManejoReserva.setText("");
        inputReserva_frmManejoReserva.setText("");
        this.mostrarDatos();     
    
            }
        
    }//GEN-LAST:event_buttonEditar_frmManejoReservasActionPerformed

    //INGRESAR DATOS EN LA TABLA
    private void buttonReserva_frmManejoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReserva_frmManejoReservaActionPerformed
        Conexion conexion = new Conexion();
        String nombre = inputNombre_frmManejoReserva.getText();
        String apellido = inputApellido_frmManejoReserva.getText();
        String telefono = inputCelular_frmManejoReserva.getText();
        String precio = inputPrecio_frmManejoReserva.getText();
        String reserva = inputReserva_frmManejoReserva.getText();
        if(nombre.equals("") || apellido.equals("") || telefono.equals("") || precio.equals("") || reserva.equals("")){
            JOptionPane.showMessageDialog(this, "Ninguno de los campos puede estar vacío");
        }else{
            if(!nombre.equals("") || !apellido.equals("") || !telefono.equals("") || !precio.equals("") || !reserva.equals("")){
                int resp = JOptionPane.showConfirmDialog(null, "¿Desea realizar la reserva?", "Alerta!", JOptionPane.YES_NO_OPTION);
                if(resp==0){

                    UsuariosBL usuarios = obtenerDatos();
                    String consultaInsert = String.format("INSERT INTO DatosUsuarioReserva (id_Usuario, nombres, apellidos, telefono, precio, numero_reserva) VALUES "
                        + "(null, '%s', '%s', '%s', '%s', '%s')", usuarios.getNombres(), usuarios.getApellidos(), usuarios.getTelefono(), usuarios.getPrecio(), usuarios.getNumero_reserva());
                    conexion.sentenciaSQL(consultaInsert);
                   
                    inputNombre_frmManejoReserva.setText("");
                    inputApellido_frmManejoReserva.setText("");
                    inputCelular_frmManejoReserva.setText("");
                    inputPrecio_frmManejoReserva.setText("");
                    inputReserva_frmManejoReserva.setText("");
                    inputFInicial_frmReservaVisible.setText("");
                    inputFFinal_frmReservaVsible.setText("");
                    inputPrueba.setText("");
                    this.mostrarDatos();

                }

            }
        }

    }//GEN-LAST:event_buttonReserva_frmManejoReservaActionPerformed

    //VALIDACION SOLO NUMEROS
    private void inputPrecio_frmManejoReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPrecio_frmManejoReservaKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;     
    if (!numeros)
    {
        evt.consume();
    }
    if (inputPrecio_frmManejoReserva.getText().trim().length() == 10) {
        evt.consume(); 
} 
    }//GEN-LAST:event_inputPrecio_frmManejoReservaKeyTyped

    //VALIDACION SOLO LETRAS
    private void inputNombre_frmManejoReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNombre_frmManejoReservaKeyTyped
         int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_inputNombre_frmManejoReservaKeyTyped

    private void inputApellido_frmManejoReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputApellido_frmManejoReservaKeyTyped
         int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_inputApellido_frmManejoReservaKeyTyped

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
            java.util.logging.Logger.getLogger(frmHotelAlura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHotelAlura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHotelAlura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHotelAlura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHotelAlura().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular_frmReserva;
    private javax.swing.JButton buttonConfirmar_frmlogin;
    private javax.swing.JButton buttonEditar_frmManejoReservas;
    private javax.swing.JButton buttonEliminar_frmManejoReservas;
    private javax.swing.JButton buttonFechaFinal_frmReserva;
    private javax.swing.JButton buttonFechaInicial_frmReserva;
    private javax.swing.JButton buttonReserva_frmManejoReserva;
    private com.toedter.calendar.JCalendar calendFechaFinal;
    private com.toedter.calendar.JCalendar calendFechaIniclal;
    private javax.swing.JPanel frmLogin;
    private javax.swing.JPanel frmManejoReserva;
    private javax.swing.JPanel frmReserva;
    private javax.swing.JTabbedPane frmcontenedor;
    private javax.swing.JTextField inputApellido_frmManejoReserva;
    private javax.swing.JTextField inputCelular_frmManejoReserva;
    private javax.swing.JTextField inputFFinal_frmReserva;
    private javax.swing.JTextField inputFFinal_frmReservaVsible;
    private javax.swing.JTextField inputFInicial_frmReserva;
    private javax.swing.JTextField inputFInicial_frmReservaVisible;
    private javax.swing.JTextField inputID_frmManejoReserva;
    private javax.swing.JTextField inputNombre_frmManejoReserva;
    private javax.swing.JTextField inputPassword_frmlogin;
    private javax.swing.JTextField inputPrecio_frmManejoReserva;
    private javax.swing.JTextField inputPrueba;
    private javax.swing.JTextField inputReserva_frmManejoReserva;
    private javax.swing.JTextField inputUsuario_frmlogin;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelTarifa_frmReserva;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
