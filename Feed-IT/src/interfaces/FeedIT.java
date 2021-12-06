/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import java.awt.Color;
import java.awt.event.KeyEvent;
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
    /**
     * Creates new form FeedIT
     */
    public FeedIT() {
        initComponents();
        iniciarComponentes();
    }   
    // Metodo para iniciar los componentes
    private void iniciarComponentes(){
        setTitle("Feed-IT");
        setLocationRelativeTo(null);
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
        jToolBar1 = new javax.swing.JToolBar();
        scrollCode = new javax.swing.JScrollPane();
        jtpCode = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);
        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 50));

        jtpCode.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jtpCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtpCodeKeyPressed(evt);
            }
        });
        scrollCode.setViewportView(jtpCode);

        jPanel1.add(scrollCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 780, 440));

        txtLog.setColumns(20);
        txtLog.setRows(5);
        jScrollPane2.setViewportView(txtLog);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 1340, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 690));

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
                                 + "for|forEach|do|const|goBack|loop|and|or|not|while)")){
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
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextPane jtpCode;
    private javax.swing.JScrollPane scrollCode;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
}
