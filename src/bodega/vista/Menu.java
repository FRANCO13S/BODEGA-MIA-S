package bodega.vista;

import bodega.modelo.Clientes;
import bodega.modelo.Pagos;
import bodega.modelo.Pedidos;
import bodega.modelo.Productos;
import bodega.modelo.Sales;
import bodega.modelo.Ventas;
import bodega.service.Service_Cliente;
import bodega.service.Service_Pago;
import bodega.service.Service_Pedido;
import bodega.service.Service_Producto;
import bodega.service.Service_Sale;
import bodega.service.Service_Venta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    private Service_Cliente ServiceCli;
    private Service_Producto ServicePro;
    private Service_Pedido ServicePe;
    private Service_Venta ServiceVe;
    private Service_Sale ServiceSa;
    private Service_Pago ServicePa;

    String Products[] = {"Coca cola", "Inka cola", "Sporade", "Pepsi", "Oro", "Kr", "Guaraná"};
    double precios[] = {5.50,5.50,2.50,8,8,7.50,8.50};
    double precio = 0;
    int cantidad = 0;
    DefaultTableModel model = new DefaultTableModel();
    ArrayList<Sales> listaPro = new ArrayList<Sales>();
    
    public Menu() {
        initComponents();

        ServiceCli = new Service_Cliente();
        ServicePro = new Service_Producto();
        ServicePe = new Service_Pedido();
        ServiceVe = new Service_Venta();
        ServiceSa = new Service_Sale();
        ServicePa = new Service_Pago();
        
        DefaultComboBoxModel combobox = new DefaultComboBoxModel(Products);
        products.setModel(combobox);
        model.addColumn("DESCRIPCIÓN");
        model.addColumn("PRECIO U.");
        model.addColumn("CANTIDAD");
        model.addColumn("IMPORTE");
        ActualizarTabla();
        calcularPrecio();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel17 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        P_INICIO = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tbtnMostrar = new javax.swing.JToggleButton();
        P_REGISTROS = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        Submenus = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        CLIENTE = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTelefonoCli = new javax.swing.JTextField();
        txtApellidoCli = new javax.swing.JTextField();
        txtNombreCli = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtFechaCli = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        btnEliminarCli = new javax.swing.JButton();
        btnSalirCli = new javax.swing.JButton();
        btnRegistrarCli = new javax.swing.JButton();
        btnEditarCli = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        PRODUCTO = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombrePro = new javax.swing.JTextField();
        txtPrecioPro = new javax.swing.JTextField();
        txtDescriPro = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtFechaPro = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnRegistrarPro = new javax.swing.JButton();
        btnEliminarPro = new javax.swing.JButton();
        btnEditarPro = new javax.swing.JButton();
        btnSalirPro = new javax.swing.JButton();
        PEDIDO = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtFechaPe = new javax.swing.JTextField();
        txtProductoPe = new javax.swing.JTextField();
        txtClientePe = new javax.swing.JTextField();
        txtFechaRegPe = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtIdPedido = new javax.swing.JTextField();
        btnRegistrarPe = new javax.swing.JButton();
        btnEliminarPe = new javax.swing.JButton();
        btnEditarPe = new javax.swing.JButton();
        btnSalirPe = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        VENTA = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFechaVe = new javax.swing.JTextField();
        txtTotalVe = new javax.swing.JTextField();
        txtProductoVe = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtFechaRegVe = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtIdVenta = new javax.swing.JTextField();
        btnRegistrarVe = new javax.swing.JButton();
        btnEliminarVe = new javax.swing.JButton();
        btnEditarVe = new javax.swing.JButton();
        btnSalirVe = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        P_PRODUCTOS = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        products = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lblIgv = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnRegistraSa = new javax.swing.JButton();
        btnSalirP = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        P_PAGOS = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        btnSalirPa = new javax.swing.JButton();
        btnRegistraPa = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtIdPago = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtMontoPagado = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtMontoPagar = new javax.swing.JTextField();
        txtTipoPa = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txtFechaPa = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtIdC = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        btnNuevoPa = new javax.swing.JButton();
        btnReportePa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        P_INICIO.setBackground(new java.awt.Color(102, 102, 255));

        jLabel18.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 66)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("BODEGA MIA'S");

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida-del-portal.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/despensa.png"))); // NOI18N

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresco.png"))); // NOI18N

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/las-compras-en-linea.png"))); // NOI18N

        tbtnMostrar.setBackground(new java.awt.Color(51, 51, 255));
        tbtnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circulo-de-usuario.png"))); // NOI18N
        tbtnMostrar.setToolTipText("FLORES RAMOS MIA MERCE");
        tbtnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_INICIOLayout = new javax.swing.GroupLayout(P_INICIO);
        P_INICIO.setLayout(P_INICIOLayout);
        P_INICIOLayout.setHorizontalGroup(
            P_INICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_INICIOLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tbtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_INICIOLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(P_INICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(P_INICIOLayout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(P_INICIOLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
        );
        P_INICIOLayout.setVerticalGroup(
            P_INICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_INICIOLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(P_INICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(P_INICIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(tbtnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        jTabbedPane2.addTab("INICIO", P_INICIO);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(239, 176, 201));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 450, 40));

        Submenus.setBackground(new java.awt.Color(239, 176, 201));

        jPanel2.setBackground(new java.awt.Color(244, 194, 215));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BODEGA MIA'S");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(244, 194, 215));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRAR CLIENTES");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 50));

        jPanel4.setBackground(new java.awt.Color(244, 194, 215));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRAR PRODUCTOS");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 50));

        jPanel5.setBackground(new java.awt.Color(244, 194, 215));
        jPanel5.setPreferredSize(new java.awt.Dimension(260, 50));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REGISTRAR PEDIDOS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 50));

        jPanel6.setBackground(new java.awt.Color(244, 194, 215));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGISTRAR VENTAS");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 50));

        javax.swing.GroupLayout SubmenusLayout = new javax.swing.GroupLayout(Submenus);
        Submenus.setLayout(SubmenusLayout);
        SubmenusLayout.setHorizontalGroup(
            SubmenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SubmenusLayout.setVerticalGroup(
            SubmenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubmenusLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(Submenus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 460));

        CLIENTE.setBackground(new java.awt.Color(239, 176, 201));

        jPanel7.setBackground(new java.awt.Color(239, 176, 201));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRAR CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("NOMBRES                 :");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("APELLIDOS               :");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("TELÉFONO                :");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 130, 20));
        jPanel7.add(txtTelefonoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 190, -1));
        jPanel7.add(txtApellidoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 190, -1));
        jPanel7.add(txtNombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("FECHA DE REGISTRO  :");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 130, 20));
        jPanel7.add(txtFechaCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("ID CLIENTE               :");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 130, 20));
        jPanel7.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 190, -1));

        btnEliminarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/basura.png"))); // NOI18N
        btnEliminarCli.setText("ELIMINAR");
        btnEliminarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCliActionPerformed(evt);
            }
        });

        btnSalirCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hogar (1).png"))); // NOI18N
        btnSalirCli.setText("INICIO");
        btnSalirCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCliActionPerformed(evt);
            }
        });

        btnRegistrarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista-del-portapapeles (1).png"))); // NOI18N
        btnRegistrarCli.setText("REGISTRAR");
        btnRegistrarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCliActionPerformed(evt);
            }
        });

        btnEditarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEditarCli.setText("EDITAR");
        btnEditarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCliActionPerformed(evt);
            }
        });

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/señas (3).png"))); // NOI18N
        jLabel34.setPreferredSize(new java.awt.Dimension(73, 85));

        javax.swing.GroupLayout CLIENTELayout = new javax.swing.GroupLayout(CLIENTE);
        CLIENTE.setLayout(CLIENTELayout);
        CLIENTELayout.setHorizontalGroup(
            CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLIENTELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CLIENTELayout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalirCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        CLIENTELayout.setVerticalGroup(
            CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLIENTELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CLIENTELayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarCli, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(btnEditarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminarCli, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(btnSalirCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CLIENTELayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("CLIENTE", CLIENTE);

        PRODUCTO.setBackground(new java.awt.Color(239, 176, 201));

        jPanel8.setBackground(new java.awt.Color(239, 176, 201));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRAR PRODUCTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("NOMBRE PRODUCTO   :");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("PRECIO                      :");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("DESCRIPCIÓN             :");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, 20));
        jPanel8.add(txtNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, -1));
        jPanel8.add(txtPrecioPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 190, -1));
        jPanel8.add(txtDescriPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 190, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("FECHA DE REGISTRO   :");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 140, 20));
        jPanel8.add(txtFechaPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("ID PRODUCTO            :");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, 20));
        jPanel8.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 190, -1));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/señas (3).png"))); // NOI18N
        jLabel21.setPreferredSize(new java.awt.Dimension(73, 85));

        btnRegistrarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista-del-portapapeles (1).png"))); // NOI18N
        btnRegistrarPro.setText("REGISTRAR");
        btnRegistrarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProActionPerformed(evt);
            }
        });

        btnEliminarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/basura.png"))); // NOI18N
        btnEliminarPro.setText("ELIMINAR");
        btnEliminarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProActionPerformed(evt);
            }
        });

        btnEditarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEditarPro.setText("EDITAR");
        btnEditarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProActionPerformed(evt);
            }
        });

        btnSalirPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hogar (1).png"))); // NOI18N
        btnSalirPro.setText("INICIO");
        btnSalirPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PRODUCTOLayout = new javax.swing.GroupLayout(PRODUCTO);
        PRODUCTO.setLayout(PRODUCTOLayout);
        PRODUCTOLayout.setHorizontalGroup(
            PRODUCTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRODUCTOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PRODUCTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PRODUCTOLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PRODUCTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PRODUCTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalirPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PRODUCTOLayout.setVerticalGroup(
            PRODUCTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRODUCTOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PRODUCTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PRODUCTOLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(PRODUCTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarPro, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(btnEditarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PRODUCTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalirPro, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(btnEliminarPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(PRODUCTOLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("PRODUCTO", PRODUCTO);

        PEDIDO.setBackground(new java.awt.Color(239, 176, 201));

        jPanel9.setBackground(new java.awt.Color(239, 176, 201));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRAR PEDIDO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("ID CLIENTE                 :");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("ID PRODUCTO             :");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("FECHA DE PEDIDO        :");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));
        jPanel9.add(txtFechaPe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 190, -1));
        jPanel9.add(txtProductoPe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 190, -1));
        jPanel9.add(txtClientePe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, -1));
        jPanel9.add(txtFechaRegPe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("FECHA DE REGISTRO     :");
        jPanel9.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("ID PEDIDO                  :");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 20));
        jPanel9.add(txtIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 190, -1));

        btnRegistrarPe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista-del-portapapeles (1).png"))); // NOI18N
        btnRegistrarPe.setText("REGISTRAR");
        btnRegistrarPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPeActionPerformed(evt);
            }
        });

        btnEliminarPe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/basura.png"))); // NOI18N
        btnEliminarPe.setText("ELIMINAR");
        btnEliminarPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPeActionPerformed(evt);
            }
        });

        btnEditarPe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEditarPe.setText("EDITAR");
        btnEditarPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPeActionPerformed(evt);
            }
        });

        btnSalirPe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hogar (1).png"))); // NOI18N
        btnSalirPe.setText("INICIO");
        btnSalirPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirPeActionPerformed(evt);
            }
        });

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/señas (3).png"))); // NOI18N
        jLabel35.setPreferredSize(new java.awt.Dimension(73, 85));

        javax.swing.GroupLayout PEDIDOLayout = new javax.swing.GroupLayout(PEDIDO);
        PEDIDO.setLayout(PEDIDOLayout);
        PEDIDOLayout.setHorizontalGroup(
            PEDIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PEDIDOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PEDIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addGroup(PEDIDOLayout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(PEDIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminarPe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarPe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PEDIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditarPe, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(btnSalirPe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PEDIDOLayout.setVerticalGroup(
            PEDIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PEDIDOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PEDIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PEDIDOLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(PEDIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarPe, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(btnEditarPe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PEDIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminarPe, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(btnSalirPe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(PEDIDOLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("PEDIDO", PEDIDO);

        VENTA.setBackground(new java.awt.Color(239, 176, 201));

        jPanel10.setBackground(new java.awt.Color(239, 176, 201));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRAR VENTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("ID PRODUCTO           :");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("TOTAL                      :");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("FECHA DE VENTA        :");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));
        jPanel10.add(txtFechaVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 190, -1));
        jPanel10.add(txtTotalVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 190, -1));
        jPanel10.add(txtProductoVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("FECHA DE REGISTRO   :");
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 20));
        jPanel10.add(txtFechaRegVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("ID VENTA                 :");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 20));
        jPanel10.add(txtIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 190, -1));

        btnRegistrarVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista-del-portapapeles (1).png"))); // NOI18N
        btnRegistrarVe.setText("REGISTRAR");
        btnRegistrarVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVeActionPerformed(evt);
            }
        });

        btnEliminarVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/basura.png"))); // NOI18N
        btnEliminarVe.setText("ELIMINAR");
        btnEliminarVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVeActionPerformed(evt);
            }
        });

        btnEditarVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEditarVe.setText("EDITAR");
        btnEditarVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVeActionPerformed(evt);
            }
        });

        btnSalirVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hogar (1).png"))); // NOI18N
        btnSalirVe.setText("INICIO");
        btnSalirVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirVeActionPerformed(evt);
            }
        });

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/señas (3).png"))); // NOI18N
        jLabel36.setPreferredSize(new java.awt.Dimension(73, 85));

        javax.swing.GroupLayout VENTALayout = new javax.swing.GroupLayout(VENTA);
        VENTA.setLayout(VENTALayout);
        VENTALayout.setHorizontalGroup(
            VENTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VENTALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VENTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addGroup(VENTALayout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(VENTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(VENTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditarVe, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(btnSalirVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        VENTALayout.setVerticalGroup(
            VENTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VENTALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(VENTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VENTALayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(VENTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarVe, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(btnEditarVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(VENTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarVe, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalirVe, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VENTALayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("VENTA", VENTA);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 450, 460));

        jPanel15.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout P_REGISTROSLayout = new javax.swing.GroupLayout(P_REGISTROS);
        P_REGISTROS.setLayout(P_REGISTROSLayout);
        P_REGISTROSLayout.setHorizontalGroup(
            P_REGISTROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_REGISTROSLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        P_REGISTROSLayout.setVerticalGroup(
            P_REGISTROSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_REGISTROSLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("REGISTROS", P_REGISTROS);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(239, 176, 201));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(239, 176, 201));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELECCIONE SUS PRODUCTOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("IMPORTE");
        jPanel14.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 80, 30));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("PRECIO");
        jPanel14.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 80, 30));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecio.setText("S/. 000.00 soles");
        jPanel14.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, 30));

        lblImporte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblImporte.setText("S/. 000.00 soles");
        jPanel14.add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 120, 30));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("PRODUCTO");
        jPanel14.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("CANTIDAD");
        jPanel14.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 30));

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        jPanel14.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 70, 30));

        products.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- SELECCIONE--", "Item 2", "Item 3", "Item 4" }));
        products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsActionPerformed(evt);
            }
        });
        jPanel14.add(products, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 130, 30));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresco.png"))); // NOI18N
        jLabel38.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 180));

        jPanel16.setBackground(new java.awt.Color(239, 176, 201));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("SUBTOTAL");
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 30));

        lblSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSub.setText("S/. 000.00 soles");
        jPanel16.add(lblSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, 30));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("IGV");
        jPanel16.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 30, 30));

        lblIgv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIgv.setText("S/. 000.00 soles");
        jPanel16.add(lblIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 110, 30));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotal.setText("S/. 000.00 soles");
        jPanel16.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 100, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("TOTAL");
        jPanel16.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 50, 30));

        jPanel13.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 670, 50));

        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "CANTIDAD", "PRECIO", "IMPORTE"
            }
        ));
        jScrollPane1.setViewportView(tblMostrar);

        jPanel13.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 670, 100));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton-agregar (1).png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel13.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 150, 50));

        btnRegistraSa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistraSa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista-del-portapapeles (1).png"))); // NOI18N
        btnRegistraSa.setText("REGISTRAR");
        btnRegistraSa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraSaActionPerformed(evt);
            }
        });
        jPanel13.add(btnRegistraSa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 170, 50));

        btnSalirP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalirP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hogar (1).png"))); // NOI18N
        btnSalirP.setText("INICIO");
        btnSalirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirPActionPerformed(evt);
            }
        });
        jPanel13.add(btnSalirP, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 130, 50));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-archivo.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel13.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 130, 50));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 460));

        javax.swing.GroupLayout P_PRODUCTOSLayout = new javax.swing.GroupLayout(P_PRODUCTOS);
        P_PRODUCTOS.setLayout(P_PRODUCTOSLayout);
        P_PRODUCTOSLayout.setHorizontalGroup(
            P_PRODUCTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P_PRODUCTOSLayout.setVerticalGroup(
            P_PRODUCTOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("PRODUCTOS", P_PRODUCTOS);

        jPanel18.setBackground(new java.awt.Color(239, 176, 201));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalirPa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalirPa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hogar (1).png"))); // NOI18N
        btnSalirPa.setText("INICIO");
        btnSalirPa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirPaActionPerformed(evt);
            }
        });
        jPanel18.add(btnSalirPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 130, 50));

        btnRegistraPa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistraPa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lista-del-portapapeles (1).png"))); // NOI18N
        btnRegistraPa.setText("REGISTRAR");
        btnRegistraPa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraPaActionPerformed(evt);
            }
        });
        jPanel18.add(btnRegistraPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 170, 50));

        jPanel19.setBackground(new java.awt.Color(239, 176, 201));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REALICE SU PAGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("ID CLIENTE");
        jPanel19.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 30));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("ID PAGO");
        jPanel19.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 30));
        jPanel19.add(txtIdPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 60, 30));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("FECHA PAGO");
        jPanel19.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 90, 30));
        jPanel19.add(txtMontoPagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 120, 30));

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/las-compras-en-linea.png"))); // NOI18N
        jLabel46.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel19.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("MONTO A PAGAR");
        jPanel19.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 110, 30));
        jPanel19.add(txtMontoPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, 30));
        jPanel19.add(txtTipoPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 120, 30));

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("MONTO PAGADO");
        jPanel19.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 110, 30));
        jPanel19.add(txtFechaPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 120, 30));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("TIPO PAGO");
        jPanel19.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 80, 30));
        jPanel19.add(txtIdC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 60, 30));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagar.png"))); // NOI18N
        jPanel19.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 50, 30));

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jPanel19.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 50, 30));

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 230));

        btnNuevoPa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevoPa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-archivo.png"))); // NOI18N
        btnNuevoPa.setText("NUEVO");
        btnNuevoPa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPaActionPerformed(evt);
            }
        });
        jPanel18.add(btnNuevoPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 130, 50));

        btnReportePa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReportePa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte.png"))); // NOI18N
        btnReportePa.setText("REPORTE");
        btnReportePa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportePaActionPerformed(evt);
            }
        });
        jPanel18.add(btnReportePa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 150, 50));

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID PAGO", "ID CLIENTE", "TIPO PAGO", "MONTO A PAGAR", "MONTO PAGADO", "FECHA PAGO"
            }
        ));
        jScrollPane2.setViewportView(tblReporte);

        jPanel18.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 670, 100));

        javax.swing.GroupLayout P_PAGOSLayout = new javax.swing.GroupLayout(P_PAGOS);
        P_PAGOS.setLayout(P_PAGOSLayout);
        P_PAGOSLayout.setHorizontalGroup(
            P_PAGOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        P_PAGOSLayout.setVerticalGroup(
            P_PAGOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("PAGOS", P_PAGOS);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnRegistrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCliActionPerformed
        int idCli = Integer.parseInt(txtIdCliente.getText());
        String nomCli = txtNombreCli.getText();
        String apeCli = txtApellidoCli.getText();
        String telCli = txtTelefonoCli.getText();
        String feCli = txtFechaCli.getText();

        Clientes clientes = new Clientes(idCli, nomCli, apeCli, telCli, feCli);
        ServiceCli.IngresarClienteAlSQL(clientes);
        ServiceCli = new Service_Cliente();

        txtIdCliente.setText("");
        txtNombreCli.setText("");
        txtApellidoCli.setText("");
        txtTelefonoCli.setText("");
        txtFechaCli.setText("");
        txtIdCliente.requestFocus();
    }//GEN-LAST:event_btnRegistrarCliActionPerformed

    private void btnEditarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCliActionPerformed
        int idCli = Integer.parseInt(txtIdCliente.getText());
        String nomCli = txtNombreCli.getText();
        String apeCli = txtApellidoCli.getText();
        String teleCli = txtTelefonoCli.getText();
        String fechaCli = txtFechaCli.getText();

        Clientes cliente = new Clientes(idCli, nomCli, apeCli, teleCli, fechaCli);
        ServiceCli.Editar(cliente);
        ServiceCli = new Service_Cliente();

        txtIdCliente.setText("");
        txtNombreCli.setText("");
        txtApellidoCli.setText("");
        txtTelefonoCli.setText("");
        txtFechaCli.setText("");
        txtIdCliente.requestFocus();
    }//GEN-LAST:event_btnEditarCliActionPerformed

    private void btnEliminarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCliActionPerformed
        int idCli = Integer.parseInt(txtIdCliente.getText());

        Clientes cliente = new Clientes(idCli);
        ServiceCli.Eliminar(cliente);
        ServiceCli = new Service_Cliente();

        txtIdCliente.setText("");
        txtNombreCli.setText("");
        txtApellidoCli.setText("");
        txtTelefonoCli.setText("");
        txtFechaCli.setText("");
        txtIdCliente.requestFocus();
    }//GEN-LAST:event_btnEliminarCliActionPerformed

    private void btnSalirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCliActionPerformed
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_btnSalirCliActionPerformed

    private void btnRegistrarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProActionPerformed
        int idPro = Integer.parseInt(txtIdProducto.getText());
        String nomPro = txtNombrePro.getText();
        double prePro = Double.parseDouble(txtPrecioPro.getText());
        String descPro = txtDescriPro.getText();
        String fePro = txtFechaPro.getText();

        Productos productos = new Productos(idPro, nomPro, prePro, descPro, fePro);
        ServicePro.IngresarProductoAlSQL(productos);
        ServicePro = new Service_Producto();

        txtIdProducto.setText("");
        txtNombrePro.setText("");
        txtPrecioPro.setText("");
        txtDescriPro.setText("");
        txtFechaPro.setText("");
        txtIdProducto.requestFocus();
    }//GEN-LAST:event_btnRegistrarProActionPerformed

    private void btnEditarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProActionPerformed
        int idPro = Integer.parseInt(txtIdProducto.getText());
        String nomPro = txtNombrePro.getText();
        Double prePro = Double.parseDouble(txtPrecioPro.getText());
        String descPro = txtDescriPro.getText();
        String fePro = txtFechaPro.getText();

        Productos producto = new Productos(idPro, nomPro, prePro, descPro, fePro);
        ServicePro.Editar(producto);
        ServicePro = new Service_Producto();

        txtIdProducto.setText("");
        txtNombrePro.setText("");
        txtPrecioPro.setText("");
        txtDescriPro.setText("");
        txtFechaPro.setText("");
        txtIdProducto.requestFocus();
    }//GEN-LAST:event_btnEditarProActionPerformed

    private void btnEliminarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProActionPerformed
        int idPro = Integer.parseInt(txtIdProducto.getText());

        Productos producto = new Productos(idPro);
        ServicePro.Eliminar(producto);
        ServicePro = new Service_Producto();

        txtIdProducto.setText("");
        txtNombrePro.setText("");
        txtPrecioPro.setText("");
        txtDescriPro.setText("");
        txtFechaPro.setText("");
        txtIdProducto.requestFocus();
    }//GEN-LAST:event_btnEliminarProActionPerformed

    private void btnSalirProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProActionPerformed
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_btnSalirProActionPerformed

    private void btnRegistrarPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPeActionPerformed
        int idPe = Integer.parseInt(txtIdPedido.getText());
        int IdCliPe = Integer.parseInt(txtClientePe.getText());
        int IdProPe = Integer.parseInt(txtProductoPe.getText());
        String fePe = txtFechaPe.getText();
        String feRegPe = txtFechaRegPe.getText();

        Pedidos pedidos = new Pedidos(idPe, IdCliPe, IdProPe, fePe, feRegPe);
        ServicePe.IngresarPedidoAlSQL(pedidos);
        ServicePe = new Service_Pedido();

        txtIdPedido.setText("");
        txtClientePe.setText("");
        txtProductoPe.setText("");
        txtFechaPe.setText("");
        txtFechaRegPe.setText("");
        txtIdPedido.requestFocus();
    }//GEN-LAST:event_btnRegistrarPeActionPerformed

    private void btnEditarPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPeActionPerformed
        int idPe = Integer.parseInt(txtIdPedido.getText());
        int idCliPe = Integer.parseInt(txtClientePe.getText());
        int idProPe = Integer.parseInt(txtProductoPe.getText());
        String fePe = txtFechaPe.getText();
        String feRegPe = txtFechaRegPe.getText();

        Pedidos pedido = new Pedidos(idPe, idCliPe, idProPe, fePe, feRegPe);
        ServicePe.Editar(pedido);
        ServicePe = new Service_Pedido();

        txtIdPedido.setText("");
        txtClientePe.setText("");
        txtProductoPe.setText("");
        txtFechaPe.setText("");
        txtFechaRegPe.setText("");
        txtIdPedido.requestFocus();
    }//GEN-LAST:event_btnEditarPeActionPerformed

    private void btnEliminarPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPeActionPerformed
        int idPe = Integer.parseInt(txtIdPedido.getText());

        Pedidos pedido = new Pedidos(idPe);
        ServicePe.Eliminar(pedido);
        ServicePe = new Service_Pedido();

        txtIdPedido.setText("");
        txtClientePe.setText("");
        txtProductoPe.setText("");
        txtFechaPe.setText("");
        txtFechaRegPe.setText("");
        txtIdPedido.requestFocus();
    }//GEN-LAST:event_btnEliminarPeActionPerformed

    private void btnSalirPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirPeActionPerformed
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_btnSalirPeActionPerformed

    private void btnRegistrarVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVeActionPerformed
        int idVe = Integer.parseInt(txtIdVenta.getText());
        int IdProVe = Integer.parseInt(txtProductoVe.getText());
        double totalVe = Double.parseDouble(txtTotalVe.getText());
        String feVe = txtFechaVe.getText();
        String feRegVe = txtFechaRegVe.getText();

        Ventas ventas = new Ventas(idVe, IdProVe, totalVe, feVe, feRegVe);
        ServiceVe.IngresarVentaAlSQL(ventas);
        ServiceVe = new Service_Venta();

        txtIdVenta.setText("");
        txtProductoVe.setText("");
        txtTotalVe.setText("");
        txtFechaVe.setText("");
        txtFechaRegVe.setText("");
        txtIdVenta.requestFocus();
    }//GEN-LAST:event_btnRegistrarVeActionPerformed

    private void btnEditarVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVeActionPerformed
        int idVe = Integer.parseInt(txtIdVenta.getText());
        int idProVe = Integer.parseInt(txtProductoVe.getText());
        double totalVe = Double.parseDouble(txtTotalVe.getText());
        String feVe = txtFechaVe.getText();
        String feRegVe = txtFechaRegVe.getText();

        Ventas venta = new Ventas(idVe, idProVe, totalVe, feVe, feRegVe);
        ServiceVe.Editar(venta);
        ServiceVe = new Service_Venta();

        txtIdVenta.setText("");
        txtProductoVe.setText("");
        txtTotalVe.setText("");
        txtFechaVe.setText("");
        txtFechaRegVe.setText("");
        txtIdVenta.requestFocus();
    }//GEN-LAST:event_btnEditarVeActionPerformed

    private void btnEliminarVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVeActionPerformed
        int idVe = Integer.parseInt(txtIdVenta.getText());

        Ventas venta = new Ventas(idVe);
        ServiceVe.Eliminar(venta);
        ServiceVe = new Service_Venta();

        txtIdVenta.setText("");
        txtProductoVe.setText("");
        txtTotalVe.setText("");
        txtFechaVe.setText("");
        txtFechaRegVe.setText("");
        txtIdVenta.requestFocus();
    }//GEN-LAST:event_btnEliminarVeActionPerformed

    private void btnSalirVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirVeActionPerformed
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_btnSalirVeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnMostrarActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Flores Flores Milagros Mia");
    }//GEN-LAST:event_tbtnMostrarActionPerformed

    private void productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsActionPerformed
        calcularPrecio();
    }//GEN-LAST:event_productsActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        calcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Sales vent = new Sales();
        vent.setIdSale(products.getSelectedIndex());
        vent.setDescripcion(products.getSelectedItem().toString());
        vent.setPrecio(precio);
        vent.setCantidad(cantidad);
        vent.setImporte(precio*cantidad);
        if(!buscarVenta(vent)){
           listaPro.add(vent); 
        }
        ActualizarTabla();
        borrar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegistraSaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraSaActionPerformed
        int idSa = products.getSelectedIndex();
        String des = products.getSelectedItem().toString();
        double pre = precio;
        int cant = cantidad;
        double imp = (precio*cantidad);
        double sub = Double.parseDouble(lblSub.getText());
        double igv = Double.parseDouble(lblIgv.getText());
        double total = Double.parseDouble(lblTotal.getText());

        Sales sales = new Sales(idSa, des, pre, cant, imp, sub, igv, total);
        ServiceSa.IngresarSaleAlSQL(sales);
        ServiceSa = new Service_Sale();
    }//GEN-LAST:event_btnRegistraSaActionPerformed

    private void btnSalirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirPActionPerformed
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_btnSalirPActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        DefaultTableModel mod = (DefaultTableModel) tblMostrar.getModel();
        while (mod.getRowCount() > 0) {
        mod.removeRow(0);        
        }
        lblSub.setText("S/. 0.0 soles");
        lblIgv.setText("S/. 0.0 soles");
        lblTotal.setText("S/. 0.0 soles");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirPaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirPaActionPerformed
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_btnSalirPaActionPerformed

    private void btnRegistraPaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraPaActionPerformed
        int idPa = Integer.parseInt(txtIdPago.getText());
        int IdC = Integer.parseInt(txtIdC.getText());
        String tipoPa = txtTipoPa.getText();
        double montoPagar = Double.parseDouble(txtMontoPagar.getText());
        double montoPagado = Double.parseDouble(txtMontoPagado.getText());
        String fePa = txtFechaPa.getText();

        Pagos pagos = new Pagos(idPa, IdC, tipoPa, montoPagar, montoPagado, fePa);
        ServicePa.IngresarPagoAlSQL(pagos);
        ServicePa = new Service_Pago();

        txtIdPago.setText("");
        txtIdC.setText("");
        txtTipoPa.setText("");
        txtMontoPagar.setText("");
        txtMontoPagado.setText("");
        txtFechaPa.setText("");
        txtIdPago.requestFocus();
    }//GEN-LAST:event_btnRegistraPaActionPerformed

    private void btnNuevoPaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPaActionPerformed
        
    }//GEN-LAST:event_btnNuevoPaActionPerformed

    private void btnReportePaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportePaActionPerformed
        reporteTabla();
    }//GEN-LAST:event_btnReportePaActionPerformed

    public boolean buscarVenta(Sales nueva){
        for (Sales s : listaPro) {
            if (s.getIdSale()==nueva.getIdSale()){
                int nuevaCantidad = s.getCantidad()+nueva.getCantidad();
                s.setCantidad(nuevaCantidad);
                s.setImporte(s.getPrecio()*nuevaCantidad);
                return true;
            }
        }
        return false;
    }
    
    public void borrar(){
        precio=0;
        cantidad=1;
        lblPrecio.setText(aMoneda(0));
        lblImporte.setText(aMoneda(0));
        products.setSelectedIndex(0);
        spnCantidad.setValue(1);
        calcularPrecio();
    }
    
    public void calcularPrecio(){
        precio = precios[products.getSelectedIndex()];
        cantidad = Integer.parseInt(spnCantidad.getValue().toString());
        lblPrecio.setText(aMoneda(precio));
        lblImporte.setText(aMoneda(precio*cantidad));
    }
    
    public String aMoneda(double precio){
        return "S/. "+ Math.round(precio*100.0)/100.0 + " soles";
    }
    
    public void ActualizarTabla(){
        while(model.getRowCount()>0){
                model.removeRow(0);
        } 
        double subtotal=0;
        for (Sales s : listaPro) {
            Object x[]=new Object[4];
        x[0] = s.getDescripcion();
        x[1] = aMoneda(s.getPrecio());
        x[2] = s.getCantidad();
        x[3] = aMoneda(s.getImporte());
        subtotal += s.getImporte();
        model.addRow(x);
        }
        double  igv=subtotal*0.18;
        double total = subtotal + igv;
        lblSub.setText(aMoneda(subtotal));
        lblIgv.setText(aMoneda(igv));
        lblTotal.setText(aMoneda(total));
        tblMostrar.setModel(model);
    }
    
    public void reporteTabla() {
        List<Pagos> listaPagos = ServicePa.reporteDeSQL();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("ID PAGO");
        modelo.addColumn("ID CLIENTE");
        modelo.addColumn("TIPO PAGO");
        modelo.addColumn("MONTO A PAGAR");
        modelo.addColumn("MONTO PAGADO");
        modelo.addColumn("FECHA DE PAGOo");

        for (Pagos pago : listaPagos) {
            Object[] fila = {
                    pago.getIdPago(),
                    pago.getIdCliente(),
                    pago.getTipoPa(),
                    pago.getMontoPagar(),
                    pago.getMontoPagado(),
                    pago.getFechaPa()
            };
            modelo.addRow(fila);
        }

        tblReporte.setModel(modelo);
    }

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CLIENTE;
    private javax.swing.JPanel PEDIDO;
    private javax.swing.JPanel PRODUCTO;
    private javax.swing.JPanel P_INICIO;
    private javax.swing.JPanel P_PAGOS;
    private javax.swing.JPanel P_PRODUCTOS;
    private javax.swing.JPanel P_REGISTROS;
    private javax.swing.JPanel Submenus;
    private javax.swing.JPanel VENTA;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditarCli;
    private javax.swing.JButton btnEditarPe;
    private javax.swing.JButton btnEditarPro;
    private javax.swing.JButton btnEditarVe;
    private javax.swing.JButton btnEliminarCli;
    private javax.swing.JButton btnEliminarPe;
    private javax.swing.JButton btnEliminarPro;
    private javax.swing.JButton btnEliminarVe;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoPa;
    private javax.swing.JButton btnRegistraPa;
    private javax.swing.JButton btnRegistraSa;
    private javax.swing.JButton btnRegistrarCli;
    private javax.swing.JButton btnRegistrarPe;
    private javax.swing.JButton btnRegistrarPro;
    private javax.swing.JButton btnRegistrarVe;
    private javax.swing.JButton btnReportePa;
    private javax.swing.JButton btnSalirCli;
    private javax.swing.JButton btnSalirP;
    private javax.swing.JButton btnSalirPa;
    private javax.swing.JButton btnSalirPe;
    private javax.swing.JButton btnSalirPro;
    private javax.swing.JButton btnSalirVe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblIgv;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JComboBox<String> products;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblMostrar;
    private javax.swing.JTable tblReporte;
    private javax.swing.JToggleButton tbtnMostrar;
    private javax.swing.JTextField txtApellidoCli;
    private javax.swing.JTextField txtClientePe;
    private javax.swing.JTextField txtDescriPro;
    private javax.swing.JTextField txtFechaCli;
    private javax.swing.JTextField txtFechaPa;
    private javax.swing.JTextField txtFechaPe;
    private javax.swing.JTextField txtFechaPro;
    private javax.swing.JTextField txtFechaRegPe;
    private javax.swing.JTextField txtFechaRegVe;
    private javax.swing.JTextField txtFechaVe;
    private javax.swing.JTextField txtIdC;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdPago;
    private javax.swing.JTextField txtIdPedido;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdVenta;
    private javax.swing.JTextField txtMontoPagado;
    private javax.swing.JTextField txtMontoPagar;
    private javax.swing.JTextField txtNombreCli;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtPrecioPro;
    private javax.swing.JTextField txtProductoPe;
    private javax.swing.JTextField txtProductoVe;
    private javax.swing.JTextField txtTelefonoCli;
    private javax.swing.JTextField txtTipoPa;
    private javax.swing.JTextField txtTotalVe;
    // End of variables declaration//GEN-END:variables
}
