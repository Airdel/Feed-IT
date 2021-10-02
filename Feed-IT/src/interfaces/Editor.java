/*
//hola soy brayan
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.ImageIcon;

/**
 *
 * @author Feed-IT Team
 */
public class Editor extends javax.swing.JFrame {

    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());
        this.setExtendedState(MAXIMIZED_BOTH);
        btntemaclaro.setEnabled(false);
        pintarclaro();

    }

    public void pintaroscuro() {
        //pintar jframe
        this.getContentPane().setBackground(Color.darkGray);

        //pintar botones        
        btnEjecutar.setBackground(Color.black);
        btnGuardar.setBackground(Color.black);

        //pintar interfaz
        txtEditor.setBackground(Color.black);
        txtEditor.setForeground(Color.white);
        jPanelbotones.setForeground(Color.black);
        jPanelbotones.setBackground(Color.black);
        jMenuBar2.setBackground(Color.black);
        //letra menus
        jMenu1.setForeground(Color.white);
        jMenuBar2.setForeground(Color.white);
        jMenu2.setForeground(Color.white);
        jMenu5.setForeground(Color.white);
        jMenu6.setForeground(Color.white);
        jMenu7.setForeground(Color.white);
        jMenu8.setForeground(Color.white);
        jMenuItem1.setForeground(Color.white);
        jMenuItem10.setForeground(Color.white);
        jMenuItem11.setForeground(Color.white);
        jMenuItem12.setForeground(Color.white);
        jMenuItem13.setForeground(Color.white);
        jMenuItem2.setForeground(Color.white);
        jMenuItem3.setForeground(Color.white);
        jMenuItem4.setForeground(Color.white);
        jMenuItem5.setForeground(Color.white);
        jMenuItem6.setForeground(Color.white);
        jMenuItem7.setForeground(Color.white);
        jMenuItem8.setForeground(Color.white);
        jMenuItem9.setForeground(Color.white);
        btntemaclaro.setForeground(Color.white);
        btntemaoscuro.setForeground(Color.white);
        jSeparator1.setForeground(Color.white);
        //fondo menus
        jMenu1.setBackground(Color.black);
        jMenuBar2.setBackground(Color.black);
        jMenu2.setBackground(Color.black);
        jMenu5.setBackground(Color.black);
        jMenu6.setBackground(Color.black);
        jMenu7.setBackground(Color.black);
        jMenu8.setBackground(Color.black);
        jMenuItem1.setBackground(Color.black);
        jMenuItem10.setBackground(Color.black);
        jMenuItem11.setBackground(Color.black);
        jMenuItem12.setBackground(Color.black);
        jMenuItem13.setBackground(Color.black);
        jMenuItem2.setBackground(Color.black);
        jMenuItem3.setBackground(Color.black);
        jMenuItem4.setBackground(Color.black);
        jMenuItem5.setBackground(Color.black);
        jMenuItem6.setBackground(Color.black);
        jMenuItem7.setBackground(Color.black);
        jMenuItem8.setBackground(Color.black);
        jMenuItem9.setBackground(Color.black);
        btntemaclaro.setBackground(Color.black);
        btntemaoscuro.setBackground(Color.black);
        jSeparator1.setBackground(Color.black);
        jDesktopPane1.setBackground(Color.darkGray);
        
        //BOTONES IMAGENES
       
        btnEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perrooscuro.png")));
    }

    public void pintarclaro() {
        // pintar jframe
        this.getContentPane().setBackground(Color.white);
        //pintar botones        
        btnEjecutar.setBackground(Color.white);
        btnGuardar.setBackground(Color.white);
        //pintar interfaz
        txtEditor.setBackground(Color.white);
        txtEditor.setForeground(Color.black);
        jPanelbotones.setForeground(Color.white);
        jPanelbotones.setBackground(Color.white);
        jMenuBar2.setBackground(Color.white);
        //letra menus
        jMenu1.setForeground(Color.black);
        jMenuBar2.setForeground(Color.black);
        jMenu2.setForeground(Color.black);
        jMenu5.setForeground(Color.black);
        jMenu6.setForeground(Color.black);
        jMenu7.setForeground(Color.black);
        jMenu8.setForeground(Color.black);
        jMenuItem1.setForeground(Color.black);
        jMenuItem10.setForeground(Color.black);
        jMenuItem11.setForeground(Color.black);
        jMenuItem12.setForeground(Color.black);
        jMenuItem13.setForeground(Color.black);
        jMenuItem2.setForeground(Color.black);
        jMenuItem3.setForeground(Color.black);
        jMenuItem4.setForeground(Color.black);
        jMenuItem5.setForeground(Color.black);
        jMenuItem6.setForeground(Color.black);
        jMenuItem7.setForeground(Color.black);
        jMenuItem8.setForeground(Color.black);
        jMenuItem9.setForeground(Color.black);
        btntemaclaro.setForeground(Color.black);
        btntemaoscuro.setForeground(Color.black);
        jSeparator1.setForeground(Color.black);
        //fondo menus
        jMenu1.setBackground(Color.white);
        jMenuBar2.setBackground(Color.white);
        jMenu2.setBackground(Color.white);
        jMenu5.setBackground(Color.white);
        jMenu6.setBackground(Color.white);
        jMenu7.setBackground(Color.white);
        jMenu8.setBackground(Color.white);
        jMenuItem1.setBackground(Color.white);
        jMenuItem10.setBackground(Color.white);
        jMenuItem11.setBackground(Color.white);
        jMenuItem12.setBackground(Color.white);
        jMenuItem13.setBackground(Color.white);
        jMenuItem2.setBackground(Color.white);
        jMenuItem3.setBackground(Color.white);
        jMenuItem4.setBackground(Color.white);
        jMenuItem5.setBackground(Color.white);
        jMenuItem6.setBackground(Color.white);
        jMenuItem7.setBackground(Color.white);
        jMenuItem8.setBackground(Color.white);
        jMenuItem9.setBackground(Color.white);
        btntemaclaro.setBackground(Color.white);
        btntemaoscuro.setBackground(Color.white);
        jSeparator1.setBackground(Color.white);
        jDesktopPane1.setBackground(Color.white);

        //BOTONES IMAGENES
       
        btnEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perro_2.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelbotones = new javax.swing.JPanel();
        btnEjecutar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEditor = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        btntemaoscuro = new javax.swing.JMenuItem();
        btntemaclaro = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Feed-IT");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(getIconImages());
        setName("editor"); // NOI18N

        btnEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perro_2.png"))); // NOI18N
        btnEjecutar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEjecutar.setInheritsPopupMenu(true);
        btnEjecutar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardrp30.png"))); // NOI18N
        btnGuardar.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtEditor.setColumns(20);
        txtEditor.setRows(5);
        jScrollPane1.setViewportView(txtEditor);

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout jPanelbotonesLayout = new javax.swing.GroupLayout(jPanelbotones);
        jPanelbotones.setLayout(jPanelbotonesLayout);
        jPanelbotonesLayout.setHorizontalGroup(
            jPanelbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelbotonesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelbotonesLayout.createSequentialGroup()
                        .addGroup(jPanelbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        jPanelbotonesLayout.setVerticalGroup(
            jPanelbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbotonesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelbotonesLayout.createSequentialGroup()
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 245, Short.MAX_VALUE))))
        );

        jMenu5.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Nuevo");
        jMenu5.add(jMenuItem1);

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuItem3.setText("Guardar");
        jMenu5.add(jMenuItem3);

        jMenuItem4.setText("Guardar como");
        jMenu5.add(jMenuItem4);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Editar");

        jMenuItem11.setText("Deshacer");
        jMenu6.add(jMenuItem11);

        jMenuItem12.setText("Reacer");
        jMenu6.add(jMenuItem12);
        jMenu6.add(jSeparator1);

        jMenuItem5.setText("Cortar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuItem6.setText("Copiar");
        jMenu6.add(jMenuItem6);

        jMenuItem7.setText("Pegar");
        jMenu6.add(jMenuItem7);

        jMenuItem13.setText("Buscar");
        jMenu6.add(jMenuItem13);

        jMenuBar2.add(jMenu6);

        jMenu7.setText("Ejecutar");

        jMenuItem9.setText("Analisis Lexico");
        jMenu7.add(jMenuItem9);

        jMenuItem10.setText("Analisis Sintactico");
        jMenu7.add(jMenuItem10);

        jMenuBar2.add(jMenu7);

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Opciones");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Tema");

        btntemaoscuro.setText("Oscuro");
        btntemaoscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntemaoscuroActionPerformed(evt);
            }
        });
        jMenu2.add(btntemaoscuro);

        btntemaclaro.setText("Claro");
        btntemaclaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntemaclaroActionPerformed(evt);
            }
        });
        jMenu2.add(btntemaclaro);

        jMenu1.add(jMenu2);

        jMenuBar2.add(jMenu1);

        jMenu8.setText("Ayuda");

        jMenuItem8.setText("Acerca de ");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem8);

        jMenuBar2.add(jMenu8);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelbotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelbotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void btntemaoscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntemaoscuroActionPerformed

        btntemaoscuro.setEnabled(false);
        btntemaclaro.setEnabled(true);
        btntemaclaro.setSelected(false);
        System.out.print("Tema Oscuro");
        pintaroscuro();
    }//GEN-LAST:event_btntemaoscuroActionPerformed

    private void btntemaclaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntemaclaroActionPerformed

        btntemaclaro.setEnabled(false);

        btntemaoscuro.setEnabled(true);
        btntemaoscuro.setSelected(false);
        System.out.print("Tema Claro");
        pintarclaro();
    }//GEN-LAST:event_btntemaclaroActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEjecutarActionPerformed

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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Editor e = new Editor();
                e.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JMenuItem btntemaclaro;
    private javax.swing.JMenuItem btntemaoscuro;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanelbotones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea txtEditor;
    // End of variables declaration//GEN-END:variables
}
