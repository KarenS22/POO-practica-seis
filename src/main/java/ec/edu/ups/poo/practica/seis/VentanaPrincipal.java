package ec.edu.ups.poo.practica.seis;

import ec.edu.ups.poo.practica.seis.controlador.ControladorDirectorio;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorDirectorio controladorDirectorio;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.controladorDirectorio = new ControladorDirectorio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txtRuta = new javax.swing.JTextField();
        btnValidar = new javax.swing.JButton();
        btnListarDirectorios = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btnListarArchivosOcultos = new javax.swing.JButton();
        btnListarArchivos = new javax.swing.JButton();
        btnListarDirectoriosOcultos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        btnRepeat = new javax.swing.JButton();
        btnMostrarInformacion = new javax.swing.JButton();
        btnListarTodo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuGestionarDirectorio = new javax.swing.JMenu();
        menuCrear = new javax.swing.JMenu();
        menuItemCrearCarpeta = new javax.swing.JMenuItem();
        menuItemCrearArchivo = new javax.swing.JMenuItem();
        menuItemEliminar = new javax.swing.JMenuItem();
        menuItemRenombrar = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestionar Directorio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtRuta.setToolTipText("Ingrese la ruta ");
        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });

        btnValidar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Circle.24.png"))); // NOI18N
        btnValidar.setText("Validar");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        btnListarDirectorios.setText("Listar Directorios");
        btnListarDirectorios.setEnabled(false);
        btnListarDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirectoriosActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(5);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        btnListarArchivosOcultos.setText("Listar Archivos Ocultos");
        btnListarArchivosOcultos.setEnabled(false);
        btnListarArchivosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarArchivosOcultosActionPerformed(evt);
            }
        });

        btnListarArchivos.setText("Listar Archivos ");
        btnListarArchivos.setEnabled(false);
        btnListarArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarArchivosActionPerformed(evt);
            }
        });

        btnListarDirectoriosOcultos.setText("Listar Directorios Ocultos");
        btnListarDirectoriosOcultos.setEnabled(false);
        btnListarDirectoriosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirectoriosOcultosActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jTree1);

        btnRepeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Repeat.24.png"))); // NOI18N
        btnRepeat.setActionCommand("");
        btnRepeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepeatActionPerformed(evt);
            }
        });

        btnMostrarInformacion.setText("Mostrar Informacion");
        btnMostrarInformacion.setEnabled(false);
        btnMostrarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInformacionActionPerformed(evt);
            }
        });

        btnListarTodo.setText("Listar Todo");
        btnListarTodo.setEnabled(false);
        btnListarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnListarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarDirectorios, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarArchivosOcultos, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarDirectoriosOcultos, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(txtRuta)
                .addGap(18, 18, 18)
                .addComponent(btnValidar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRepeat)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane3)
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValidar)
                    .addComponent(btnRepeat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarDirectorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListarArchivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListarArchivosOcultos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListarDirectoriosOcultos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarInformacion)
                        .addGap(41, 41, 41))))
        );

        menuGestionarDirectorio.setText("Gestionar Directorio");

        menuCrear.setText("Crear");

        menuItemCrearCarpeta.setText("Carpeta");
        menuItemCrearCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearCarpetaActionPerformed(evt);
            }
        });
        menuCrear.add(menuItemCrearCarpeta);

        menuItemCrearArchivo.setText("Archivo");
        menuItemCrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearArchivoActionPerformed(evt);
            }
        });
        menuCrear.add(menuItemCrearArchivo);

        menuGestionarDirectorio.add(menuCrear);

        menuItemEliminar.setText("Eliminar");
        menuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarActionPerformed(evt);
            }
        });
        menuGestionarDirectorio.add(menuItemEliminar);

        menuItemRenombrar.setText("Renombrar");
        menuItemRenombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRenombrarActionPerformed(evt);
            }
        });
        menuGestionarDirectorio.add(menuItemRenombrar);

        menuItemSalir.setText("Salir");
        menuGestionarDirectorio.add(menuItemSalir);

        jMenuBar1.add(menuGestionarDirectorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        // TODO add your handling code here:
        boolean x = controladorDirectorio.validarRuta(txtRuta.getText());
        if (x == true) {
            habilitarBotones(x);

        } else {
            // System.out.println("invalido");
            JOptionPane.showMessageDialog(this, "La ruta no es correcta, intentelo de nuevo");
        }
    }//GEN-LAST:event_btnValidarActionPerformed

    private void btnListarArchivosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarArchivosOcultosActionPerformed
        File file = new File(txtRuta.getText());
        DefaultTreeModel treeModel = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(file.getName());

        controladorDirectorio.listarComponentes(root, file, 4);
        treeModel.setRoot(root);
    }//GEN-LAST:event_btnListarArchivosOcultosActionPerformed

    private void btnListarDirectoriosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirectoriosOcultosActionPerformed
        File file = new File(txtRuta.getText());
        DefaultTreeModel treeModel = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(file.getName());

        controladorDirectorio.listarComponentes(root, file, 5);
        treeModel.setRoot(root);
    }//GEN-LAST:event_btnListarDirectoriosOcultosActionPerformed

    private void btnListarDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirectoriosActionPerformed
        File file = new File(txtRuta.getText());
        DefaultTreeModel treeModel = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(file.getName());

        controladorDirectorio.listarComponentes(root, file, 3);
        treeModel.setRoot(root);

    }//GEN-LAST:event_btnListarDirectoriosActionPerformed

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
        // TODO add your handling code here:
        //
    }//GEN-LAST:event_txtRutaActionPerformed

    private void btnRepeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepeatActionPerformed
        habilitarBotones(false);

    }//GEN-LAST:event_btnRepeatActionPerformed

    private void btnMostrarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInformacionActionPerformed
        String rutaBase = txtRuta.getText();
        DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        if (nodoSeleccionado != null) {
            TreeNode[] rutas = nodoSeleccionado.getPath();
            String r = "";
            for (int i = 1; i < rutas.length; i++) {
                r = r + "/" + rutas[i];
            }
            String ruta = "";
            ruta = rutaBase + r;

            String info = controladorDirectorio.obtenerinformacion(ruta);
            jTextArea2.setText(info);
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun archivo");
        }
    }//GEN-LAST:event_btnMostrarInformacionActionPerformed

    private void btnListarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodoActionPerformed
        File file = new File(txtRuta.getText());
        DefaultTreeModel treeModel = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(file.getName());

        controladorDirectorio.listarComponentes(root, file, 1);
        treeModel.setRoot(root);
    }//GEN-LAST:event_btnListarTodoActionPerformed

    private void btnListarArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarArchivosActionPerformed
        File file = new File(txtRuta.getText());
        DefaultTreeModel treeModel = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(file.getName());

        controladorDirectorio.listarComponentes(root, file, 2);
        treeModel.setRoot(root);
    }//GEN-LAST:event_btnListarArchivosActionPerformed

    private void menuItemCrearCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearCarpetaActionPerformed
        String ruta = txtRuta.getText();
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre de la carpeta");
        String r = ruta + "/" + nombre;
        File file = new File(r);
        if (!file.exists()) {
            boolean b = controladorDirectorio.crearCarpeta(file);
            if (b) {
                JOptionPane.showMessageDialog(this, "La carpeta " + nombre + " ha sido creada");
                btnListarTodoActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "La carpeta " + nombre + " no ha sido creada");
            }
        } else {
            JOptionPane.showMessageDialog(this, "La carpeta " + nombre + " ya existe");
        }
    }//GEN-LAST:event_menuItemCrearCarpetaActionPerformed

    private void menuItemCrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearArchivoActionPerformed
        String ruta = txtRuta.getText();
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del archivo");
        String r = ruta + "/" + nombre;
        File file = new File(r);
        if (!file.exists()) {
            boolean b = controladorDirectorio.crearArchivo(file);
            if (b) {
                JOptionPane.showMessageDialog(this, "El archivo " + nombre + " ha sido creado");
                btnListarTodoActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "El archivo " + nombre + " no ha sido creado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El archivo " + nombre + " ya existe");
        }
    }//GEN-LAST:event_menuItemCrearArchivoActionPerformed

    private void menuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarActionPerformed
        String rutaBase = txtRuta.getText();
        DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        if (nodoSeleccionado != null) {
            TreeNode[] rutas = nodoSeleccionado.getPath();
            String r = "";
            for (int i = 1; i < rutas.length; i++) {
                r = r + "/" + rutas[i];
            }
            String ruta = "";
            ruta = rutaBase + r;
             boolean b = controladorDirectorio.eliminarFile(ruta);
            if (b) {
                JOptionPane.showMessageDialog(this, "El archivo " + nodoSeleccionado + " ha sido eliminado");
                btnListarTodoActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "El archivo " + nodoSeleccionado + " no ha sido eliminado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun archivo");
        }
    }//GEN-LAST:event_menuItemEliminarActionPerformed

    private void menuItemRenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRenombrarActionPerformed
        
                String rutaBase = txtRuta.getText();
        DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        if (nodoSeleccionado != null) {
            TreeNode[] rutas = nodoSeleccionado.getPath();
            String r = "";
            for (int i = 1; i < rutas.length; i++) {
                r = r + "/" + rutas[i];
            }
            String rutaAntigua = "";
            rutaAntigua = rutaBase + r;
            
            String nombre = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre del archivo");
            String rN = "";
            for (int i = 1; i < rutas.length-1; i++) {
                rN = rN + "/" + rutas[i];
            }
            String nuevoNombre = rutaBase + rN + "/" + nombre;
            boolean b = controladorDirectorio.renombrarFile(rutaAntigua, nuevoNombre);
            if (b) {
                JOptionPane.showMessageDialog(this, "El archivo " + nodoSeleccionado + " ha sido renombrado");
                btnListarTodoActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "El archivo " + nodoSeleccionado + " no ha sido renombrado");
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun archivo");
        }
    }//GEN-LAST:event_menuItemRenombrarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });

    }

    private void habilitarBotones(boolean estado) {
        btnListarArchivos.setEnabled(estado);
        btnListarArchivosOcultos.setEnabled(estado);
        btnListarDirectoriosOcultos.setEnabled(estado);
        btnListarTodo.setEnabled(estado);
        btnMostrarInformacion.setEnabled(estado);
        txtRuta.setEnabled(!estado);
        btnListarDirectorios.setEnabled(estado);
        if (estado == true) {
            Icon icono = new ImageIcon("src/main/resources/Check.24.png");
            btnValidar.setIcon(icono);
            btnValidar.setText("Valido");
        } else {
            Icon icono = new ImageIcon("src/main/resources/Circle.24.png");
            btnValidar.setIcon(icono);
            btnValidar.setText("Validar");
        }
        DefaultTreeModel treeModel = (DefaultTreeModel) jTree1.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) treeModel.getRoot();
        root.removeAllChildren();
        treeModel.reload();
        jTextArea2.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarArchivos;
    private javax.swing.JButton btnListarArchivosOcultos;
    private javax.swing.JButton btnListarDirectorios;
    private javax.swing.JButton btnListarDirectoriosOcultos;
    private javax.swing.JButton btnListarTodo;
    private javax.swing.JButton btnMostrarInformacion;
    private javax.swing.JButton btnRepeat;
    private javax.swing.JButton btnValidar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenu menuCrear;
    private javax.swing.JMenu menuGestionarDirectorio;
    private javax.swing.JMenuItem menuItemCrearArchivo;
    private javax.swing.JMenuItem menuItemCrearCarpeta;
    private javax.swing.JMenuItem menuItemEliminar;
    private javax.swing.JMenuItem menuItemRenombrar;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
