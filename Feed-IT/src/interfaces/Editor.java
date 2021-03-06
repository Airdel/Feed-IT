/*
    FEED-IT
    INTERFAZ PRINCIPAL Y DE ENLACE.
 */
package interfaces;

import analizador_lexico.AnalizadorLexico;
import analizador_lexico.Tokens.*;
import controladores.*;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

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
       // setIconImage(new ImageIcon(getClass().getResource("src/Imagenes/icon.png")).getImage());
        this.setExtendedState(MAXIMIZED_BOTH);
        btntemaclaro.setEnabled(false);
        pintarclaro();

    }

    public void pintaroscuro() {
        //pintar jframe
        this.getContentPane().setBackground(Color.darkGray);

        //pintar botones
        btnCompilar.setBackground(Color.black);
        btnGuardar.setBackground(Color.black);

        //pintar interfaz
        txtEditor.setBackground(Color.black);
        txtEditor.setForeground(Color.white);
        txtLog.setBackground(Color.black);
        txtLog.setForeground(Color.white);
        txt_notificaciones.setBackground(Color.black);
        txt_notificaciones.setForeground(Color.white);
        jpanel_principal.setForeground(Color.black);
        jpanel_principal.setBackground(Color.black);
        jmenu_superior.setBackground(Color.black);

        //letra menus
        jmenu_Ver.setForeground(Color.white);
        jmenu_opciones.setForeground(Color.white);
        jmenu_superior.setForeground(Color.white);
        jmenu_Archivo.setForeground(Color.white);
        jmenu_Ejecutar.setForeground(Color.white);
        jmenu_Ayuda.setForeground(Color.white);
        jmi_nuevo.setForeground(Color.white);
        jmi_analisis_sintactico.setForeground(Color.white);
        jmi_abrir.setForeground(Color.white);
        jmi_guardar.setForeground(Color.white);
        jmi_guardar_como.setForeground(Color.white);
        //jmi_acerca_de.setForeground(Color.white);
        jmi_analisis_lexico.setForeground(Color.white);
        btntemaclaro.setForeground(Color.white);
        btntemaoscuro.setForeground(Color.white);

        //fondo menus
        jmenu_opciones.setBackground(Color.black);
        jmenu_superior.setBackground(Color.black);
        jMenu2.setBackground(Color.black);
        jmenu_Archivo.setBackground(Color.black);
        jmenu_Ejecutar.setBackground(Color.black);
        jmenu_Ayuda.setBackground(Color.black);
        jmi_nuevo.setBackground(Color.black);
        jmi_analisis_sintactico.setBackground(Color.black);
        jmi_abrir.setBackground(Color.black);
        jmi_guardar.setBackground(Color.black);
        jmi_guardar_como.setBackground(Color.black);
        //jmi_acerca_de.setBackground(Color.black);
        jmi_analisis_lexico.setBackground(Color.black);
        btntemaclaro.setBackground(Color.black);
        btntemaoscuro.setBackground(Color.black);
        jdp_workspace.setBackground(Color.darkGray);

        //BOTONES IMAGENES

        btnCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perrooscuro.png")));
    }

    public void pintarclaro() {
        // pintar jframe
        this.getContentPane().setBackground(Color.white);
        //pintar botones
        btnCompilar.setBackground(Color.white);
        btnGuardar.setBackground(Color.white);
        //pintar interfaz
        txtEditor.setBackground(Color.white);
        txtEditor.setForeground(Color.black);
        txtLog.setBackground(Color.white);
        txtLog.setForeground(Color.black);
        txt_notificaciones.setBackground(Color.white);
        txt_notificaciones.setForeground(Color.black);
        jpanel_principal.setForeground(Color.white);
        jpanel_principal.setBackground(Color.white);
        jmenu_superior.setBackground(Color.white);
        //letra menus
        jmenu_opciones.setForeground(Color.black);
        jmenu_superior.setForeground(Color.black);
        jMenu2.setForeground(Color.black);
        jmenu_Archivo.setForeground(Color.black);
        jmenu_Ejecutar.setForeground(Color.black);
        jmenu_Ayuda.setForeground(Color.black);
        jmi_nuevo.setForeground(Color.black);
        jmi_analisis_sintactico.setForeground(Color.black);
        jmi_abrir.setForeground(Color.black);
        jmi_guardar.setForeground(Color.black);
        jmi_guardar_como.setForeground(Color.black);
        //jmi_acerca_de.setForeground(Color.black);
        jmi_analisis_lexico.setForeground(Color.black);
        btntemaclaro.setForeground(Color.black);
        btntemaoscuro.setForeground(Color.black);
        //fondo menus
        jmenu_opciones.setBackground(Color.white);
        jmenu_superior.setBackground(Color.white);
        jMenu2.setBackground(Color.white);
        jmenu_Archivo.setBackground(Color.white);
        jmenu_Ejecutar.setBackground(Color.white);
        jmenu_Ayuda.setBackground(Color.white);
        jmi_nuevo.setBackground(Color.white);
        jmi_analisis_sintactico.setBackground(Color.white);
        jmi_abrir.setBackground(Color.white);
        jmi_guardar.setBackground(Color.white);
        jmi_guardar_como.setBackground(Color.white);
        //jmi_acerca_de.setBackground(Color.white);
        jmi_analisis_lexico.setBackground(Color.white);
        btntemaclaro.setBackground(Color.white);
        btntemaoscuro.setBackground(Color.white);
        jdp_workspace.setBackground(Color.white);

        //BOTONES IMAGENES

        btnCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perro_2.png")));
    }


    public void limpiar(){
        txtEditor.setText("");
        txtLog.setText("");
    }

    private void reacomodar() {
      //  jsp_editor.setBounds(jsp_editor.getX(), jsp_editor.getY(), 570, 350);
        txtEditor.setBounds(txtEditor.getX(), txtEditor.getY(), 570, 350);
    }

    /*-------------------------------------SECCION DE MANEJO DE ARCHIVOS (GUARDAR, GUARDARCOMO, ABRIR)-----------------------*/

    private File archivo;
    private boolean guardar = false;
    private boolean guardarComo = false;
    private boolean mostrar = true;

    private void guardarComo(){
        Editor manejador_txt = new Editor();
        Editor manejador_popup = new Editor();

        try {
            JFileChooser file = new JFileChooser();
            if (file.showSaveDialog(manejador_popup) == JFileChooser.APPROVE_OPTION) {
                archivo = file.getSelectedFile();
                if (archivo != null) {
                    FileWriter save = new FileWriter(archivo.getAbsolutePath() + ".fit");
                    String nombre = archivo.getName();
                    setTitle(nombre);
                    System.out.println(txtEditor.getText());
                    save.write(txtEditor.getText());
                    save.close();
                    guardarComo = false;
                    txt_notificaciones.setText("Se ha guardado un archivo");
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "El archivo no ha podido ser guardado!",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void guardar() {
        FileWriter save = null;
        try {
            System.out.println(archivo.getAbsolutePath() + "SA");
            save = new FileWriter(archivo.getAbsolutePath());
            save.write(txtEditor.getText());
            save.close();
            txt_notificaciones.setText("Se ha guardado un archivo");
            txt_notificaciones.setForeground(new java.awt.Color(0, 158, 58));
        } catch (IOException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                save.close();
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    private ArrayList<String> leerArchivo(String file) {
        ArrayList<String> texto = null;
        FileReader fr = null;
        BufferedReader br = null;
        String line = "";
        try {
            texto = new ArrayList<String>();
            archivo = new File(file);
            String nombre = archivo.getName();
            setTitle(nombre);
            if (archivo.exists()) {
                if (archivo.isFile()) {
                    fr = new FileReader(archivo);
                    br = new BufferedReader(fr);
                    line = br.readLine();
                    while (line != null) {
                        if (!line.equalsIgnoreCase("")) {
                            texto.add(line);
                        }
                        line = br.readLine();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return texto;
    }
/*
    public void abrirArchivo() {
        ArrayList<String> linea = null;
        int resp = 0;
        String codigo = "";
        txtEditor.setText("");
        resp = jFileChooser1.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            linea = leerArchivo(jFileChooser1.getSelectedFile().toString());
            if (linea.size() > 0) {
                for (int i = 0; i < linea.size(); i++) {
                    codigo = (String) linea.get(i);
                    txtEditor.append(codigo + "\n");

                }
            }
            jsp_editor.setBounds(jsp_editor.getX(), jsp_editor.getY(), 570, 350);
            txtEditor.setBounds(txtEditor.getX(), txtEditor.getY(), 570, 350);
            //lbCaracteres.setText(contarCar() + "");
            //lbPalabras.setText(contarPal() + "");
            guardarComo = false;
            txt_notificaciones.setText("Se ha abierto un archivo");
            txt_notificaciones.setForeground(new java.awt.Color(15, 136, 232));
        }
    }*/


    //-------------------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_principal = new javax.swing.JPanel();
        jdp_workspace = new javax.swing.JDesktopPane();
        jsp_log = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jsp_notificaciones = new javax.swing.JScrollPane();
        txt_notificaciones = new javax.swing.JTextArea();
        Fecha1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEditor = new javax.swing.JTextPane();
        jFileChooser1 = new javax.swing.JFileChooser();
        jpanel_botonera = new javax.swing.JPanel();
        btnCompilar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCodigoMedio = new javax.swing.JButton();
        btnCodigoObjeto = new javax.swing.JButton();
        btnAnalisisSintactico = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAnalisisLexico = new javax.swing.JButton();
        jmenu_superior = new javax.swing.JMenuBar();
        jmenu_Archivo = new javax.swing.JMenu();
        jmi_nuevo = new javax.swing.JMenuItem();
        jmi_abrir = new javax.swing.JMenuItem();
        jmi_guardar = new javax.swing.JMenuItem();
        jmi_guardar_como = new javax.swing.JMenuItem();
        jmenu_Ejecutar = new javax.swing.JMenu();
        jmi_analisis_lexico = new javax.swing.JMenuItem();
        jmi_analisis_sintactico = new javax.swing.JMenuItem();
        jmenu_Ver = new javax.swing.JMenu();
        jmi_tablaSimbolos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmenu_opciones = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        btntemaoscuro = new javax.swing.JMenuItem();
        btntemaclaro = new javax.swing.JMenuItem();
        jmenu_Ayuda = new javax.swing.JMenu();
        jmi_tabla_reservadas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Feed-IT");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(getIconImages());
        setName("editor"); // NOI18N

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setRows(5);
        jsp_log.setViewportView(txtLog);

        txt_notificaciones.setColumns(20);
        txt_notificaciones.setRows(5);
        txt_notificaciones.setEnabled(false);
        jsp_notificaciones.setViewportView(txt_notificaciones);

        Fecha1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        txtResultado.setEnabled(false);
        jScrollPane1.setViewportView(txtResultado);

        txtEditor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEditorKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtEditor);

        jdp_workspace.setLayer(jsp_log, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdp_workspace.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdp_workspace.setLayer(jsp_notificaciones, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdp_workspace.setLayer(Fecha1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdp_workspace.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdp_workspace.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdp_workspaceLayout = new javax.swing.GroupLayout(jdp_workspace);
        jdp_workspace.setLayout(jdp_workspaceLayout);
        jdp_workspaceLayout.setHorizontalGroup(
            jdp_workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdp_workspaceLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jdp_workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdp_workspaceLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jdp_workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jdp_workspaceLayout.createSequentialGroup()
                                .addComponent(jsp_log, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jsp_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jdp_workspaceLayout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha1)))
                        .addContainerGap())))
        );
        jdp_workspaceLayout.setVerticalGroup(
            jdp_workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdp_workspaceLayout.createSequentialGroup()
                .addGroup(jdp_workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdp_workspaceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdp_workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsp_log)
                    .addComponent(jsp_notificaciones)))
        );

        javax.swing.GroupLayout jpanel_principalLayout = new javax.swing.GroupLayout(jpanel_principal);
        jpanel_principal.setLayout(jpanel_principalLayout);
        jpanel_principalLayout.setHorizontalGroup(
            jpanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdp_workspace)
                .addContainerGap())
            .addGroup(jpanel_principalLayout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpanel_principalLayout.setVerticalGroup(
            jpanel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_principalLayout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdp_workspace))
        );

        btnCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perro_2.png"))); // NOI18N
        btnCompilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompilar.setInheritsPopupMenu(true);
        btnCompilar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCompilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCompilarMouseClicked(evt);
            }
        });
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 51, 102));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir1.png"))); // NOI18N
        btnSalir.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnSalir.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCodigoMedio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCodigoMedio.setInheritsPopupMenu(true);
        btnCodigoMedio.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCodigoMedio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCodigoMedioMouseClicked(evt);
            }
        });
        btnCodigoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodigoMedioActionPerformed(evt);
            }
        });

        btnCodigoObjeto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCodigoObjeto.setInheritsPopupMenu(true);
        btnCodigoObjeto.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCodigoObjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCodigoObjetoMouseClicked(evt);
            }
        });
        btnCodigoObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodigoObjetoActionPerformed(evt);
            }
        });

        btnAnalisisSintactico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnalisisSintactico.setInheritsPopupMenu(true);
        btnAnalisisSintactico.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAnalisisSintactico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnalisisSintacticoMouseClicked(evt);
            }
        });
        btnAnalisisSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisisSintacticoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconos_claro/guardar_claro.png"))); // NOI18N
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setInheritsPopupMenu(true);
        btnGuardar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAnalisisLexico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnalisisLexico.setInheritsPopupMenu(true);
        btnAnalisisLexico.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAnalisisLexico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnalisisLexicoMouseClicked(evt);
            }
        });
        btnAnalisisLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisisLexicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_botoneraLayout = new javax.swing.GroupLayout(jpanel_botonera);
        jpanel_botonera.setLayout(jpanel_botoneraLayout);
        jpanel_botoneraLayout.setHorizontalGroup(
            jpanel_botoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_botoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanel_botoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCodigoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCodigoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalisisSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalisisLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_botoneraLayout.setVerticalGroup(
            jpanel_botoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_botoneraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnalisisLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnalisisSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnCodigoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCodigoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jmenu_superior.setName("jmenu_Principal"); // NOI18N

        jmenu_Archivo.setText("Archivo");
        jmenu_Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_ArchivoActionPerformed(evt);
            }
        });

        jmi_nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_nuevo.setText("Nuevo");
        jmi_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_nuevoActionPerformed(evt);
            }
        });
        jmenu_Archivo.add(jmi_nuevo);

        jmi_abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_abrir.setText("Abrir");
        jmi_abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmi_abrirMouseClicked(evt);
            }
        });
        jmi_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_abrirActionPerformed(evt);
            }
        });
        jmenu_Archivo.add(jmi_abrir);

        jmi_guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_guardar.setText("Guardar");
        jmi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_guardarActionPerformed(evt);
            }
        });
        jmenu_Archivo.add(jmi_guardar);

        jmi_guardar_como.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmi_guardar_como.setText("Guardar como");
        jmi_guardar_como.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_guardar_comoActionPerformed(evt);
            }
        });
        jmenu_Archivo.add(jmi_guardar_como);

        jmenu_superior.add(jmenu_Archivo);

        jmenu_Ejecutar.setText("Ejecutar");

        jmi_analisis_lexico.setText("Analisis Lexico");
        jmi_analisis_lexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_analisis_lexicoActionPerformed(evt);
            }
        });
        jmenu_Ejecutar.add(jmi_analisis_lexico);

        jmi_analisis_sintactico.setText("Analisis Sintactico");
        jmenu_Ejecutar.add(jmi_analisis_sintactico);

        jmenu_superior.add(jmenu_Ejecutar);

        jmenu_Ver.setText("Ver");

        jmi_tablaSimbolos.setText("Tabla de Simbolos");
        jmi_tablaSimbolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_tablaSimbolosActionPerformed(evt);
            }
        });
        jmenu_Ver.add(jmi_tablaSimbolos);

        jMenuItem1.setText("Codigo Intermedio");
        jmenu_Ver.add(jMenuItem1);

        jmenu_superior.add(jmenu_Ver);

        jmenu_opciones.setBackground(new java.awt.Color(255, 255, 255));
        jmenu_opciones.setText("Opciones");
        jmenu_opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_opcionesActionPerformed(evt);
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

        jmenu_opciones.add(jMenu2);

        jmenu_superior.add(jmenu_opciones);

        jmenu_Ayuda.setText("Ayuda");

        jmi_tabla_reservadas.setText("Palabras Reservadas");
        jmenu_Ayuda.add(jmi_tabla_reservadas);

        jmenu_superior.add(jmenu_Ayuda);

        setJMenuBar(jmenu_superior);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpanel_botonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_abrirActionPerformed
        if(txtEditor.getText() == null){
            limpiar();
            //abrirArchivo();
        }
        else if(txtEditor.getText() != null){
                              int resp = JOptionPane.showConfirmDialog(null,
                "??Desea guardar el Archivo?", "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
            if (resp == 0) {
                jmi_guardar.doClick();
                limpiar();
               // abrirArchivo();
                reacomodar();
                txt_notificaciones.setText("Se ha abierto un archivo");
            }
            if (resp == 1) {
                limpiar();
               // abrirArchivo();
                reacomodar();
                txt_notificaciones.setText("Se ha abierto un archivo");
            }
        }
    }//GEN-LAST:event_jmi_abrirActionPerformed

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

    private void jmenu_opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_opcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmenu_opcionesActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void btnCompilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompilarMouseClicked
        correr();
    }//GEN-LAST:event_btnCompilarMouseClicked

    private void jmi_abrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmi_abrirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_abrirMouseClicked

    private void jmi_tablaSimbolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_tablaSimbolosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_tablaSimbolosActionPerformed

    private void jmi_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_nuevoActionPerformed
        archivos controlador = new archivos();
        if(controlador.nuevoArchivo() == true){

            guardarComo();
            System.out.println("^^Se invoc??: controlador.guardarComo()^^");
            limpiar();
            txt_notificaciones.setText("Se ha creado un nuevo archivo");
        }else if(controlador.nuevoArchivo() == false){
            limpiar();
            System.out.println("^^if(guardarComo == false);");
            txt_notificaciones.setText("Se ha creado un nuevo archivo");
        }

    }//GEN-LAST:event_jmi_nuevoActionPerformed

    private void jmi_guardar_comoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_guardar_comoActionPerformed
           try{
            guardarComo();
            txt_notificaciones.setText("Se ha guardado el nuevo archivo");
           } catch ( Exception e){
                JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
           }
    }//GEN-LAST:event_jmi_guardar_comoActionPerformed

    private void jmenu_ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_ArchivoActionPerformed
        System.out.println(archivo.getAbsolutePath());
    }//GEN-LAST:event_jmenu_ArchivoActionPerformed

    private void jmi_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_guardarActionPerformed
        
    }//GEN-LAST:event_jmi_guardarActionPerformed

    private void jmi_analisis_lexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_analisis_lexicoActionPerformed
        AnalizadorLexico lex = new AnalizadorLexico();
        String r = lex.lexico(archivo.getAbsolutePath(),txtEditor.getText());
        System.out.println("Lex: "+r);
        txtLog.setText(r.toString());
        txt_notificaciones.setText("Analisis l??xico realizado.");
    }//GEN-LAST:event_jmi_analisis_lexicoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCodigoMedioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCodigoMedioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCodigoMedioMouseClicked

    private void btnCodigoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodigoMedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCodigoMedioActionPerformed

    private void btnCodigoObjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCodigoObjetoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCodigoObjetoMouseClicked

    private void btnCodigoObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodigoObjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCodigoObjetoActionPerformed

    private void btnAnalisisSintacticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnalisisSintacticoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalisisSintacticoMouseClicked

    private void btnAnalisisSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisisSintacticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalisisSintacticoActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAnalisisLexicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnalisisLexicoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalisisLexicoMouseClicked

    private void btnAnalisisLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisisLexicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalisisLexicoActionPerformed

    private void txtEditorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorKeyPressed
       switch (evt.getKeyCode()) {
            default:
                colors();
                break;
        }
    }//GEN-LAST:event_txtEditorKeyPressed

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

    private void correr(){
        //lexico();
        //sintactico();
        //semantico();
    }

    private void analisisSintactico(){

        String ST = txtEditor.getText();
        //Sintax s = new Sintax(new analizador.LexerCup(new StringReader (ST)));
        //erroresSintacticos = erroresLexicos;
    }




    //Metodo para encontrar las ultimas cadenas
    private int findLastNonWordChar(String texto, int i){
        while(--i >= 0 ){
            if(String.valueOf(texto.charAt(i)).matches("\\W")){break;}
        }//end whille
        return i;
    }//end metodo

    //Metodo para encontrar las primeras cadenas
    private int findfirstNonWordChar(String texto, int i){
        while(i < texto.length()){
            if(String.valueOf(texto.charAt(i)).matches("\\W")){break;}
             i++;
        }//end while

        return i;
    }//end metodo


    //Metodo para dar color a las palabras reservadas

    private void colors(){

        final StyleContext  cont = StyleContext.getDefaultStyleContext();
        //colores
        final  AttributeSet atAzul = cont.addAttribute(cont.getEmptySet(),StyleConstants.Foreground, new Color(0,128,255)); //Azul para las palabras reservadas
        final  AttributeSet atVerde = cont.addAttribute(cont.getEmptySet(),StyleConstants.Foreground, new Color(0,153,0)); // Verda para el texto cadena
        final  AttributeSet atGris = cont.addAttribute(cont.getEmptySet(),StyleConstants.Foreground, new Color(128,128,128)); //Naranja para comentarios
        final  AttributeSet atNegro = cont.addAttribute(cont.getEmptySet(),StyleConstants.Foreground, new Color(0,0,0));

        //style
            DefaultStyledDocument doc = new DefaultStyledDocument(){
                public void insertarString(int offset, String str, AttributeSet a)throws BadLocationException {
                    super.insertString(offset,str,a);

                    String text = getText(0,getLength());
                    int before =  findLastNonWordChar(text, offset);
                    if(before < 0){before = 0;}
                    int after = findfirstNonWordChar(text, offset + str.length());
                    int wordL = before;
                    int wordR = before;

                    while(wordR <= after){
                        if(wordR == after || String.valueOf(text.charAt(wordR)).matches("\\W")){
                            if(text.substring(wordL,wordR).matches("(\\W)*(main|int|float|string|double|null|boolean)")){
                                setCharacterAttributes(wordL, wordR - wordL, atAzul , false);}
                            //}else if(text.substring(wordL,wordR).matches("\"(\\W)*\"")){
                              //      setCharacterAttributes(wordL, wordR - wordL, atVerde , false);
                                //   }//end segundo if
                          //  else {
                            //    setCharacterAttributes(wordL, wordR - wordL, atNegro , false);
                            //}

                            wordL = wordR;

                        }//end first if

                        wordR++;
                    }///end while
                } //public void insertarString

                public void remove(int offs,int len)throws BadLocationException {
                    super.remove(offs, len);
                    String text = getText(0,getLength());
                    int before = findLastNonWordChar(text, offs);
                     if(before < 0){before = 0;}
                }//end remove
            };

             JTextPane txt = new JTextPane(doc);
             String temp =  txtEditor.getText();
             txtEditor.setStyledDocument(txt.getStyledDocument());
             txtEditor.setText(temp);
             
    }//end metodo


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha1;
    private javax.swing.JButton btnAnalisisLexico;
    private javax.swing.JButton btnAnalisisSintactico;
    private javax.swing.JButton btnCodigoMedio;
    private javax.swing.JButton btnCodigoObjeto;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem btntemaclaro;
    private javax.swing.JMenuItem btntemaoscuro;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JDesktopPane jdp_workspace;
    private javax.swing.JMenu jmenu_Archivo;
    private javax.swing.JMenu jmenu_Ayuda;
    private javax.swing.JMenu jmenu_Ejecutar;
    private javax.swing.JMenu jmenu_Ver;
    private javax.swing.JMenu jmenu_opciones;
    private javax.swing.JMenuBar jmenu_superior;
    private javax.swing.JMenuItem jmi_abrir;
    private javax.swing.JMenuItem jmi_analisis_lexico;
    private javax.swing.JMenuItem jmi_analisis_sintactico;
    private javax.swing.JMenuItem jmi_guardar;
    private javax.swing.JMenuItem jmi_guardar_como;
    private javax.swing.JMenuItem jmi_nuevo;
    private javax.swing.JMenuItem jmi_tablaSimbolos;
    private javax.swing.JMenuItem jmi_tabla_reservadas;
    private javax.swing.JPanel jpanel_botonera;
    private javax.swing.JPanel jpanel_principal;
    private javax.swing.JScrollPane jsp_log;
    private javax.swing.JScrollPane jsp_notificaciones;
    public javax.swing.JTextPane txtEditor;
    public javax.swing.JTextArea txtLog;
    private javax.swing.JTextArea txtResultado;
    public javax.swing.JTextArea txt_notificaciones;
    // End of variables declaration//GEN-END:variables
}