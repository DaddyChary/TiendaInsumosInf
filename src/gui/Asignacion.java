/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import db.dao.DAOEstanteria;
import db.dao.DAOManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Estanteria;
import model.Tienda;
import model.tm.TMEstanteria;

/**
 *
 * @author sega_
 */
public class Asignacion extends javax.swing.JFrame {

    /**
     * Creates new form Asignacion
     */
    private DAOManager manager;
    private Menu menu;

    public Asignacion() throws SQLException {
        initComponents();
        setProperties();
        manager = new DAOManager();
        actualizarComboboxIdTienda();
        actualizarTablaEstanteria();
        txt_id_Asignacion.disable();
        cbo_id_tienda.disable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_id_Asignacion = new javax.swing.JTextField();
        txt_tiempo_asignacion = new javax.swing.JTextField();
        btn_create_asignacion = new javax.swing.JButton();
        btn_update_asignacion = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btnAtrasAsignacion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbo_id_tienda = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        txt_reload_asignacion = new javax.swing.JTextField();
        btn_reload = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_asignacion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(4, 6, 36));

        jPanel1.setBackground(new java.awt.Color(4, 6, 36));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.red, java.awt.Color.green, java.awt.Color.blue));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("iD");

        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Tiempo");

        txt_id_Asignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_AsignacionActionPerformed(evt);
            }
        });

        btn_create_asignacion.setBackground(new java.awt.Color(4, 6, 36));
        btn_create_asignacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_create_asignacion.setForeground(new java.awt.Color(255, 153, 51));
        btn_create_asignacion.setText("Create");
        btn_create_asignacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.yellow, java.awt.Color.magenta, java.awt.Color.green));
        btn_create_asignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_asignacionActionPerformed(evt);
            }
        });

        btn_update_asignacion.setBackground(new java.awt.Color(4, 6, 36));
        btn_update_asignacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_update_asignacion.setForeground(new java.awt.Color(255, 153, 51));
        btn_update_asignacion.setText("Update");
        btn_update_asignacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.yellow, java.awt.Color.magenta, java.awt.Color.green));
        btn_update_asignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_asignacionActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(4, 6, 36));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 153, 51));
        btn_delete.setText("Delete");
        btn_delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.yellow, java.awt.Color.magenta, java.awt.Color.green));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btnAtrasAsignacion.setBackground(new java.awt.Color(4, 6, 36));
        btnAtrasAsignacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAtrasAsignacion.setForeground(new java.awt.Color(255, 153, 51));
        btnAtrasAsignacion.setText("Atras");
        btnAtrasAsignacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.yellow, java.awt.Color.magenta, java.awt.Color.green));
        btnAtrasAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasAsignacionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Asignacion Estanteria");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.green, java.awt.Color.red, java.awt.Color.orange, java.awt.Color.magenta));

        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("iD Tienda");

        cbo_id_tienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnAtrasAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_create_asignacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_update_asignacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_id_Asignacion, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                .addComponent(txt_tiempo_asignacion)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbo_id_tienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_id_Asignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(cbo_id_tienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_tiempo_asignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_create_asignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_update_asignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnAtrasAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel3.setBackground(new java.awt.Color(4, 6, 36));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.yellow, java.awt.Color.blue, java.awt.Color.orange, java.awt.Color.magenta));

        txt_reload_asignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_reload_asignacionActionPerformed(evt);
            }
        });
        txt_reload_asignacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_reload_asignacionKeyReleased(evt);
            }
        });

        btn_reload.setBackground(new java.awt.Color(4, 6, 36));
        btn_reload.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_reload.setForeground(new java.awt.Color(255, 153, 51));
        btn_reload.setText("Reload");
        btn_reload.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.yellow, java.awt.Color.magenta, java.awt.Color.green));
        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(txt_reload_asignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reload, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_reload_asignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reload, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        jPanel4.setBackground(new java.awt.Color(4, 6, 36));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.cyan, java.awt.Color.white, java.awt.Color.orange, java.awt.Color.red));

        tbl_asignacion.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_asignacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_asignacionMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_asignacion);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_AsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_AsignacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_AsignacionActionPerformed

    private void btn_create_asignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_asignacionActionPerformed
        // TODO add your handling code here:
        Estanteria estanteria = new Estanteria();

        estanteria.setId_tienda_fk(Integer.parseInt(cbo_id_tienda.getSelectedItem().toString()));
        estanteria.setTiempo_descuento(Integer.parseInt(txt_tiempo_asignacion.getText()));
        try {
            manager.getdEstanteria().create(estanteria);
            actualizarTablaEstanteria();
            limpiarCampos();
        } catch (SQLException ex) {
            Logger.getLogger(Asignacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_create_asignacionActionPerformed

    private void btnAtrasAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasAsignacionActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            menu = new Menu();
        } catch (SQLException ex) {
            Logger.getLogger(ProductosModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        menu.setVisible(true);

    }//GEN-LAST:event_btnAtrasAsignacionActionPerformed

    private void txt_reload_asignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_reload_asignacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_reload_asignacionActionPerformed

    private void btn_update_asignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_asignacionActionPerformed
        // TODO add your handling code here:

        Estanteria estanteria = new Estanteria();
        estanteria.setId(Integer.parseInt(txt_id_Asignacion.getText()));
        estanteria.setId_tienda_fk(Integer.parseInt(cbo_id_tienda.getSelectedItem().toString()));
        estanteria.setTiempo_descuento(Integer.parseInt(txt_tiempo_asignacion.getText()));
        try {
            manager.getdEstanteria().update(estanteria);
            actualizarTablaEstanteria();
            limpiarCampos();

        } catch (SQLException ex) {
            Logger.getLogger(Asignacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_update_asignacionActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        Estanteria estanteria = new Estanteria();
        estanteria.setId(Integer.parseInt(txt_id_Asignacion.getText()));
        try {
            manager.getdEstanteria().delete(estanteria);
            actualizarTablaEstanteria();
            limpiarCampos();

        } catch (SQLException ex) {
            Logger.getLogger(Asignacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tbl_asignacionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_asignacionMouseReleased
        // TODO add your handling code here:

        try {
            int dato = tbl_asignacion.getSelectedRow();
            Object id = tbl_asignacion.getValueAt(dato, 0);
            Estanteria estanteria = manager.getdEstanteria().getOne(Integer.parseInt(id.toString()));
            txt_id_Asignacion.setText(estanteria.getIdString());
            txt_tiempo_asignacion.setText(estanteria.getTiempo_descuento_String());
        } catch (SQLException ex) {
            Logger.getLogger(ProductosModule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, "Error al agregar los campos", "Aceptar", JOptionPane.DEFAULT_OPTION);
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "Ingrese solo numeros", "Aceptar", JOptionPane.DEFAULT_OPTION);
        }

    }//GEN-LAST:event_tbl_asignacionMouseReleased

    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed
        try {
            // TODO add your handling code here:
            actualizarTablaEstanteria();
            txt_reload_asignacion.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Asignacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_reloadActionPerformed

    private void txt_reload_asignacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_reload_asignacionKeyReleased
        // TODO add your handling code here:
        
        try {
            String dato = txt_reload_asignacion.getText();
            filtrarTabla(dato);
        } catch (SQLException ex) {
            Logger.getLogger(ProductosModule.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, "Error, No se pudo filtrar por release", "Aceptar", JOptionPane.DEFAULT_OPTION);
        }
        
    }//GEN-LAST:event_txt_reload_asignacionKeyReleased

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
            java.util.logging.Logger.getLogger(Asignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display btnAtrasAsignacion */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Asignacion().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Asignacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasAsignacion;
    private javax.swing.JButton btn_create_asignacion;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_reload;
    private javax.swing.JButton btn_update_asignacion;
    private javax.swing.JComboBox<String> cbo_id_tienda;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_asignacion;
    private javax.swing.JTextField txt_id_Asignacion;
    private javax.swing.JTextField txt_reload_asignacion;
    private javax.swing.JTextField txt_tiempo_asignacion;
    // End of variables declaration//GEN-END:variables

    public void actualizarTablaEstanteria() throws SQLException {
        DAOEstanteria dao = manager.getdEstanteria();
        List<Estanteria> lista = dao.getAll();
        TMEstanteria tmEstanteria = new TMEstanteria(lista);
        tbl_asignacion.setModel(tmEstanteria);
    }

    public void filtrarTabla(String dato) throws SQLException {
        DAOEstanteria dao = manager.getdEstanteria();
        List<Estanteria> lista = dao.getAll(dato);
        TMEstanteria tmEstanteria = new TMEstanteria(lista);
        tbl_asignacion.setModel(tmEstanteria);
    }
    
    public void actualizarComboboxIdTienda() throws SQLException {
        Tienda tienda = new Tienda();
        cbo_id_tienda.removeAllItems();
        List<String> ids;
        ids = manager.getdTienda().getIdTienda();
        for (String id : ids) {
            System.out.println(id);
            cbo_id_tienda.addItem(id);
        }
    }

    public final void setProperties() {
        this.setTitle("Asignacion Estanterias");
        setLocationRelativeTo(null);
    }

    public void limpiarCampos() {

        txt_id_Asignacion.setText("");
        txt_tiempo_asignacion.setText("");

    }

}