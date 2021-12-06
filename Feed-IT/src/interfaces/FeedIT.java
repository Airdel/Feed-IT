/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import analizador_lexico.AnalizadorLexico;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Element;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 *
 * @author Enrique Miramontes
 */
public class FeedIT extends javax.swing.JFrame {
    //DEclaracion de variables globales
    NumeroLinea numerolinea;
    DefaultStyledDocument doc;
    Directorio dir;
    File archivo;
    
    
    /**
     * Creates new form FeedIT
     */
    public FeedIT() {
        initComponents();
        iniciarComponentes();
    }   
    // Metodo para iniciar los componentes
    private void iniciarComponentes(){
        dir = new Directorio();
        setTitle("[#FeedIT]");
        setLocationRelativeTo(null);
        String [] options = new String[] {"Guardar y Continuar","Descargar"};
        
        //Se agregan las Lineas
        numerolinea = new NumeroLinea(jtpCode);
        scrollCode.setRowHeaderView(numerolinea);
    }//end iniciarComponentes
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollCode = new javax.swing.JScrollPane();
        jtpCode = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jPanel_Funciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btn_Sintactico = new javax.swing.JButton();
        btn_Lexico = new javax.swing.JButton();
        btn_CodigoMedio = new javax.swing.JButton();
        btn_CodigoObjeto = new javax.swing.JButton();
        btn_Compilar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnGuardarComo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jToolBar_Informacion = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btn_Simbolos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_Gramaticas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtpCode.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jtpCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtpCodeKeyPressed(evt);
            }
        });
        scrollCode.setViewportView(jtpCode);

        jPanel1.add(scrollCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1210, 400));

        txtLog.setColumns(20);
        txtLog.setRows(5);
        jScrollPane2.setViewportView(txtLog);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 425, 1210, 174));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 1230, 630));

        jPanel_Funciones.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon.png"))); // NOI18N

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btn_Sintactico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sintactico.png"))); // NOI18N
        btn_Sintactico.setContentAreaFilled(false);

        btn_Lexico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lexico.png"))); // NOI18N
        btn_Lexico.setContentAreaFilled(false);
        btn_Lexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LexicoActionPerformed(evt);
            }
        });

        btn_CodigoMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/intermdialcode.png"))); // NOI18N
        btn_CodigoMedio.setContentAreaFilled(false);

        btn_CodigoObjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/object.png"))); // NOI18N
        btn_CodigoObjeto.setContentAreaFilled(false);

        btn_Compilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compilar.png"))); // NOI18N
        btn_Compilar.setContentAreaFilled(false);

        btn_Salir.setBackground(new java.awt.Color(255, 51, 51));
        btn_Salir.setForeground(new java.awt.Color(255, 51, 51));
        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir1.png"))); // NOI18N

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newfile.png"))); // NOI18N
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnAbrir.setBackground(new java.awt.Color(255, 255, 255));
        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/openfile.png"))); // NOI18N
        btnAbrir.setContentAreaFilled(false);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardarComo.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarComo.png"))); // NOI18N
        btnGuardarComo.setContentAreaFilled(false);
        btnGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_FuncionesLayout = new javax.swing.GroupLayout(jPanel_Funciones);
        jPanel_Funciones.setLayout(jPanel_FuncionesLayout);
        jPanel_FuncionesLayout.setHorizontalGroup(
            jPanel_FuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FuncionesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel_FuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_FuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_Lexico, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardarComo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Sintactico, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Compilar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_CodigoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_CodigoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel_FuncionesLayout.setVerticalGroup(
            jPanel_FuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FuncionesLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnGuardarComo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_Lexico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_Sintactico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_Compilar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btn_CodigoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_CodigoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel_Funciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 690));

        jToolBar_Informacion.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar_Informacion.setRollover(true);
        jToolBar_Informacion.add(jSeparator2);

        btn_Simbolos.setText("Tabla de Simbolos");
        btn_Simbolos.setFocusable(false);
        btn_Simbolos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Simbolos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Simbolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SimbolosActionPerformed(evt);
            }
        });
        jToolBar_Informacion.add(btn_Simbolos);
        jToolBar_Informacion.add(jSeparator1);

        btn_Gramaticas.setText("Gramáticas Generadas");
        btn_Gramaticas.setFocusable(false);
        btn_Gramaticas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Gramaticas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Gramaticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GramaticasActionPerformed(evt);
            }
        });
        jToolBar_Informacion.add(btn_Gramaticas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar_Informacion, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar_Informacion, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1250, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtpCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtpCodeKeyPressed
         switch (evt.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                jtpCode.setCaretPosition(jtpCode.getCaretPosition());
                break;
            case KeyEvent.VK_RIGHT:
                jtpCode.setCaretPosition(jtpCode.getCaretPosition());
                break;
            case KeyEvent.VK_DOWN:
                jtpCode.setCaretPosition(jtpCode.getCaretPosition());
                break;
            case KeyEvent.VK_UP:
                jtpCode.setCaretPosition(jtpCode.getCaretPosition());
                break;
              case KeyEvent.VK_TAB:
                evt.consume();
                String tab = "  ";
                int posicion = jtpCode.getCaretPosition();
                Element e = doc.getCharacterElement(posicion);
                try {
                    doc.insertString(posicion, tab, e.getAttributes());
                } catch (BadLocationException ex) {
                    showMessageDialog(this, "Error en la posicion del cursor");
                }
                break;
            default:
                   colors();
         }//end swhitch
    }//GEN-LAST:event_jtpCodeKeyPressed

    private void btn_SimbolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SimbolosActionPerformed
        TablaSimbolos ts = new TablaSimbolos();
        ts.setVisible(true);
    }//GEN-LAST:event_btn_SimbolosActionPerformed

    private void btn_GramaticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GramaticasActionPerformed
        TablaGramaticas tg = new TablaGramaticas();
        tg.setVisible(true);
    }//GEN-LAST:event_btn_GramaticasActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       clearAllComp();
       dir.Nuevo(this);
       clearAllComp();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
       clearAllComp();
       dir.Abrir(this);
       clearAllComp();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        clearAllComp();
        dir.Guardar(this);
        clearAllComp();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComoActionPerformed
       clearAllComp();
       dir.guardarC(this);
       clearAllComp();
    }//GEN-LAST:event_btnGuardarComoActionPerformed

    private void btn_LexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LexicoActionPerformed
        AnalizadorLexico lex = new AnalizadorLexico();
        String r;
        
        if(archivo != null){ r = lex.lexico(archivo.getAbsolutePath(),jtpCode.getText());
        }else{ r = lex.lexico("",jtpCode.getText());}
        txtLog.setText(r);
    }//GEN-LAST:event_btn_LexicoActionPerformed

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
            java.util.logging.Logger.getLogger(FeedIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedIT().setVisible(true);
            }
        });
    }
        
    //---------------------------------------------------Metodos para pintar las palabras Reservadas-----------------------------------------------------------
  
    //Metodo para encontrar las ultimas cadenas
    private int findLastNonWordChar(String texto, int i){
        while(--i >= 0){
            if(String.valueOf(texto.charAt(i)).matches("[\\s;=(){}]")){
                break;
            }//if
        }//while
        
        return i;
    }//end findLast
    
    
    //Metodo para encontrar las primeras cadenas
    private int findFirstNonWordChar(String texto, int i){
        while(i < texto.length()){
            if(String.valueOf(texto.charAt(i)).matches("[\\s;=(){}]")){
                break;
            }//if
            i++;
        }//while
        return i;
    }//end findFirst
    
    //Metodo para pintar las palabras reservadas
    private void colors(){
        int p = jtpCode.getCaretPosition();
        final StyleContext cont = StyleContext.getDefaultStyleContext();
        //Colores
        final AttributeSet attAzul  =  cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(51,115,255));
        final AttributeSet attNegro =  cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(0,0,0));
        final AttributeSet attVerde =  cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(71,158,1));
        final AttributeSet attGris  =  cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(121,125,133));
         //Style
          doc = new DefaultStyledDocument(){
             public void insertString(int offset, String str, AttributeSet a)throws BadLocationException{
                 super.insertString(offset, str,  a);
                 String text = getText(0,getLength());
                 int before = findLastNonWordChar(text, offset);
                 if(before < 0){
                     before = 0;
                 }//if
                 int after = findFirstNonWordChar(text, offset + str.length());
                 int wordL = before;
                 int wordR = before;
                 while(wordR <= after){
                     if(wordR == after || String.valueOf(text.charAt(wordR)).matches("[\\s;=(){}]")){
                         if(text.substring(wordL,wordR).matches("[\\s]*(class|fun|main|int|float|string|double|null|boolean|"
                                 + "humedad|fagua|peso|fcomer|fpremio|fmasaje|fluz|fjuguete|candil|when|if|else|true|false|"
                                 + "for|forEach|do|const|goBack|loop|and|or|not|while|time)")){
                             setCharacterAttributes(wordL,wordR - wordL,  attAzul,false);
                         }//second if
                         else if(text.substring(wordL,wordR).matches("[\\s=(]*(\"\\w*\")")){
                             setCharacterAttributes(wordL,wordR - wordL,attVerde,false);
                         }//tercer if
                          else if(text.substring(wordL,wordR).matches("\\s*[#]+\\w*" )){
                             setCharacterAttributes(wordL,wordR - wordL,attGris,false);
                         }//tercer if
                         else{
                             setCharacterAttributes(wordL,wordR - wordL,attNegro,false);
                         }//end else 
                         
                         wordL = wordR;
                     }//first if
                     wordR++;
                 }//end while    
             }//end insertString

              
             public void remove(int offs, int len)throws BadLocationException{
                 super.remove(offs, len);
                 String text = getText(0,getLength());
                 int before = findLastNonWordChar(text, offs);
                 if(before < 0){
                     before = 0;
                 }//end if
                 
             }//end remove
             
         };//end doc
        
         JTextPane txt = new JTextPane(doc);
         String temp = jtpCode.getText();
         jtpCode.setStyledDocument(txt.getStyledDocument());
         jtpCode.setText(temp);
         jtpCode.setCaretPosition(p);     
    }//end colors
    
    
    //Metodo para limpiar 
    public void clearAllComp(){
        txtLog.setText("");
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarComo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btn_CodigoMedio;
    private javax.swing.JButton btn_CodigoObjeto;
    private javax.swing.JButton btn_Compilar;
    private javax.swing.JButton btn_Gramaticas;
    private javax.swing.JButton btn_Lexico;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_Simbolos;
    private javax.swing.JButton btn_Sintactico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Funciones;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar_Informacion;
    public javax.swing.JTextPane jtpCode;
    private javax.swing.JScrollPane scrollCode;
    public javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
}
