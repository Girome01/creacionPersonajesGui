package InterfazCreacionPersonajes;
//import Logica_Juego.FileManager;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monic
 */
public class ingresarGear extends javax.swing.JFrame {
    /**
     * Creates new form ingresarPersonajes_Jugo
     */
    public ingresarGear() {
        listaPersonajes=new Personajes();
        initComponents();
        addTableHeader();
        Object valor=(Personajes) FileManager.readObject("C:\\Users\\monic\\OneDrive - Estudiantes ITCR\\Documentos\\NetBeansProjects\\proyecto_HerenciaALTrono\\src\\archivosSerializados\\personajes.juego");   
        if(valor!=null)
            listaPersonajes=(Personajes) FileManager.readObject("C:\\Users\\monic\\OneDrive - Estudiantes ITCR\\Documentos\\NetBeansProjects\\proyecto_HerenciaALTrono\\src\\archivosSerializados\\personajes.juego");   
        generarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Fondo = new javax.swing.JPanel();
        lbl_Titulo0 = new javax.swing.JLabel();
        txt_AccionApariencia = new javax.swing.JTextField();
        lbl_Usuario = new javax.swing.JLabel();
        lbl_Usuario6 = new javax.swing.JLabel();
        txt_NivelApariencia = new javax.swing.JTextField();
        lbl_Usuario5 = new javax.swing.JLabel();
        lbl_Usuario1 = new javax.swing.JLabel();
        txt_Aparicion = new javax.swing.JTextField();
        lbl_Ruta = new javax.swing.JLabel();
        lbl_Usuario3 = new javax.swing.JLabel();
        txt_Vida = new javax.swing.JTextField();
        lbl_Usuario4 = new javax.swing.JLabel();
        txt_Ataque = new javax.swing.JTextField();
        combo_Tipos = new javax.swing.JComboBox<>();
        btn_ImagenOf = new javax.swing.JButton();
        btn_ImagenAt = new javax.swing.JButton();
        lbl_rutaA = new javax.swing.JLabel();
        lbl_rutaE = new javax.swing.JLabel();
        lbl_ImagenA = new javax.swing.JLabel();
        lbl_ImagenE = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_Personajes = new javax.swing.JTable();
        btn_Ingresar1 = new javax.swing.JButton();
        fondo_Juego = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(755, 456));

        panel_Fondo.setMaximumSize(new java.awt.Dimension(755, 456));
        panel_Fondo.setMinimumSize(new java.awt.Dimension(755, 456));
        panel_Fondo.setLayout(null);

        lbl_Titulo0.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Titulo0.setFont(new java.awt.Font("VCR OSD Mono", 0, 48)); // NOI18N
        lbl_Titulo0.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Titulo0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo0.setText("Ingresar gear");
        lbl_Titulo0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Titulo0.setOpaque(true);
        panel_Fondo.add(lbl_Titulo0);
        lbl_Titulo0.setBounds(130, 10, 500, 50);

        txt_AccionApariencia.setBackground(new java.awt.Color(102, 0, 102));
        txt_AccionApariencia.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        panel_Fondo.add(txt_AccionApariencia);
        txt_AccionApariencia.setBounds(550, 70, 170, 30);

        lbl_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Usuario.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Usuario.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Usuario.setText("Nivel personaje:");
        lbl_Usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Usuario.setOpaque(true);
        panel_Fondo.add(lbl_Usuario);
        lbl_Usuario.setBounds(30, 70, 140, 30);

        lbl_Usuario6.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Usuario6.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Usuario6.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Usuario6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Usuario6.setText("Acción personaje:");
        lbl_Usuario6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Usuario6.setOpaque(true);
        panel_Fondo.add(lbl_Usuario6);
        lbl_Usuario6.setBounds(390, 70, 140, 30);

        txt_NivelApariencia.setBackground(new java.awt.Color(102, 0, 102));
        txt_NivelApariencia.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        txt_NivelApariencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NivelAparienciaActionPerformed(evt);
            }
        });
        panel_Fondo.add(txt_NivelApariencia);
        txt_NivelApariencia.setBounds(190, 70, 170, 30);

        lbl_Usuario5.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Usuario5.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Usuario5.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Usuario5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Usuario5.setText("Aparición:");
        lbl_Usuario5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Usuario5.setOpaque(true);
        panel_Fondo.add(lbl_Usuario5);
        lbl_Usuario5.setBounds(390, 110, 140, 30);

        lbl_Usuario1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Usuario1.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Usuario1.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Usuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Usuario1.setText("Ruta imagen aliado:");
        lbl_Usuario1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Usuario1.setOpaque(true);
        panel_Fondo.add(lbl_Usuario1);
        lbl_Usuario1.setBounds(30, 190, 240, 30);

        txt_Aparicion.setBackground(new java.awt.Color(102, 0, 102));
        txt_Aparicion.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        txt_Aparicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AparicionActionPerformed(evt);
            }
        });
        panel_Fondo.add(txt_Aparicion);
        txt_Aparicion.setBounds(550, 110, 170, 30);

        lbl_Ruta.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Ruta.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Ruta.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Ruta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Ruta.setText("Ruta imagen enemigo:");
        lbl_Ruta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Ruta.setOpaque(true);
        panel_Fondo.add(lbl_Ruta);
        lbl_Ruta.setBounds(30, 230, 240, 30);

        lbl_Usuario3.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Usuario3.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Usuario3.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Usuario3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Usuario3.setText("Vida:");
        lbl_Usuario3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Usuario3.setOpaque(true);
        panel_Fondo.add(lbl_Usuario3);
        lbl_Usuario3.setBounds(30, 110, 140, 30);

        txt_Vida.setBackground(new java.awt.Color(102, 0, 102));
        txt_Vida.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        txt_Vida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_VidaActionPerformed(evt);
            }
        });
        panel_Fondo.add(txt_Vida);
        txt_Vida.setBounds(190, 110, 170, 30);

        lbl_Usuario4.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Usuario4.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Usuario4.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Usuario4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Usuario4.setText("Ataque:");
        lbl_Usuario4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Usuario4.setOpaque(true);
        panel_Fondo.add(lbl_Usuario4);
        lbl_Usuario4.setBounds(30, 150, 140, 30);

        txt_Ataque.setBackground(new java.awt.Color(102, 0, 102));
        txt_Ataque.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        panel_Fondo.add(txt_Ataque);
        txt_Ataque.setBounds(190, 150, 170, 30);

        combo_Tipos.setBackground(new java.awt.Color(0, 0, 0));
        combo_Tipos.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        combo_Tipos.setForeground(new java.awt.Color(102, 0, 102));
        combo_Tipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guerrero de contacto", "Guerrero de mediano alcance", "Guerrero aéreo" }));
        combo_Tipos.setToolTipText("Tipo guerrero");
        combo_Tipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_TiposActionPerformed(evt);
            }
        });
        panel_Fondo.add(combo_Tipos);
        combo_Tipos.setBounds(390, 150, 330, 30);

        btn_ImagenOf.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        btn_ImagenOf.setForeground(new java.awt.Color(102, 0, 102));
        btn_ImagenOf.setText("Seleccionar imagen de enemigo ");
        btn_ImagenOf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImagenOfActionPerformed(evt);
            }
        });
        panel_Fondo.add(btn_ImagenOf);
        btn_ImagenOf.setBounds(280, 230, 460, 30);

        btn_ImagenAt.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        btn_ImagenAt.setForeground(new java.awt.Color(102, 0, 102));
        btn_ImagenAt.setText("Seleccionar imagen de aliado");
        btn_ImagenAt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImagenAtActionPerformed(evt);
            }
        });
        panel_Fondo.add(btn_ImagenAt);
        btn_ImagenAt.setBounds(280, 190, 460, 30);

        lbl_rutaA.setBackground(new java.awt.Color(0, 0, 0));
        lbl_rutaA.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_rutaA.setForeground(new java.awt.Color(102, 0, 102));
        lbl_rutaA.setText("Ruta imagen aliado");
        lbl_rutaA.setOpaque(true);
        panel_Fondo.add(lbl_rutaA);
        lbl_rutaA.setBounds(30, 270, 350, 24);

        lbl_rutaE.setBackground(new java.awt.Color(0, 0, 0));
        lbl_rutaE.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_rutaE.setForeground(new java.awt.Color(102, 0, 102));
        lbl_rutaE.setText("Ruta imagen enemigo");
        lbl_rutaE.setOpaque(true);
        panel_Fondo.add(lbl_rutaE);
        lbl_rutaE.setBounds(30, 294, 350, 20);

        lbl_ImagenA.setToolTipText("Imagen aliado");
        lbl_ImagenA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_Fondo.add(lbl_ImagenA);
        lbl_ImagenA.setBounds(400, 270, 50, 60);

        lbl_ImagenE.setToolTipText("Imagen enemigo");
        lbl_ImagenE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_Fondo.add(lbl_ImagenE);
        lbl_ImagenE.setBounds(470, 270, 50, 60);

        table_Personajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_Personajes.setGridColor(new java.awt.Color(102, 0, 102));
        jScrollPane2.setViewportView(table_Personajes);

        panel_Fondo.add(jScrollPane2);
        jScrollPane2.setBounds(30, 350, 720, 130);

        btn_Ingresar1.setBackground(new java.awt.Color(0, 0, 0));
        btn_Ingresar1.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        btn_Ingresar1.setForeground(new java.awt.Color(102, 0, 102));
        btn_Ingresar1.setText("Ingresar");
        btn_Ingresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ingresar1ActionPerformed(evt);
            }
        });
        panel_Fondo.add(btn_Ingresar1);
        btn_Ingresar1.setBounds(580, 280, 150, 40);

        fondo_Juego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesJuego/FondoJuego.png"))); // NOI18N
        panel_Fondo.add(fondo_Juego);
        fondo_Juego.setBounds(0, -20, 790, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("Ingresar personajes al juego (ADMIN)");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NivelAparienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NivelAparienciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NivelAparienciaActionPerformed

    private void txt_AparicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AparicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AparicionActionPerformed

    private void btn_ImagenOfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImagenOfActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "JPG & PNG Images", "png", "jpg", "jpeg");
        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            lbl_rutaE.setText(chooser.getSelectedFile().getName());
            File selectedImageFile = chooser.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            //Display image on jlable
            ImageIcon ii = new ImageIcon(selectedImagePath);
            //            Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(lbl_ImagenE.getWidth(), lbl_ImagenE.getHeight(), Image.SCALE_SMOOTH);

            lbl_ImagenE.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_btn_ImagenOfActionPerformed

    private void btn_ImagenAtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImagenAtActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "JPG & PNG Images", "png", "jpg", "jpeg");
        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            lbl_rutaA.setText(chooser.getSelectedFile().getAbsolutePath());
            File selectedImageFile = chooser.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            //Display image on jlable
            ImageIcon ii = new ImageIcon(selectedImagePath);
            //            Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(lbl_ImagenA.getWidth(), lbl_ImagenA.getHeight(), Image.SCALE_SMOOTH);

            lbl_ImagenA.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_btn_ImagenAtActionPerformed

    private void btn_Ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ingresar1ActionPerformed
        // TODO add your handling code here:
        Object valor=(Personajes) FileManager.readObject("C:\\Users\\monic\\OneDrive - Estudiantes ITCR\\Documentos\\NetBeansProjects\\proyecto_HerenciaALTrono\\src\\archivosSerializados\\personajes.juego");
        if(valor!=null){
            listaPersonajes=(Personajes) FileManager.readObject("C:\\Users\\monic\\OneDrive - Estudiantes ITCR\\Documentos\\NetBeansProjects\\proyecto_HerenciaALTrono\\src\\archivosSerializados\\personajes.juego");
        }else{
            listaPersonajes=new Personajes();
        }
        String nombre=txt_NivelApariencia.getText();
        String vidaStr=txt_Vida.getText();
        String ataqueStr=txt_Ataque.getText();
        String camposStr=txt_AccionApariencia.getText();
        String aparicionStr=txt_Aparicion.getText();
        String rutaImagenE=lbl_rutaE.getText();
        String rutaImagenA=lbl_rutaA.getText();
        int guerreroEscogido= combo_Tipos.getSelectedIndex();
        String guerreroEscogidoStr= combo_Tipos.getItemAt(guerreroEscogido);
        
        if(!nombre.isBlank() && !vidaStr.isBlank() && !ataqueStr.isBlank() && !camposStr.isBlank() &&
            !aparicionStr.isBlank() && !rutaImagenE.isBlank() && !rutaImagenA.isBlank()){
            int vida=Integer.parseInt(vidaStr);
            int ataque=Integer.parseInt(ataqueStr);
            int campos=Integer.parseInt(camposStr);
            int aparicion=Integer.parseInt(aparicionStr);
            guerrero = listaPersonajes.generarGuerreros(guerreroEscogido, nombre, vida, ataque,aparicion,campos,1,rutaImagenA, rutaImagenE, guerreroEscogidoStr);
            listaPersonajes.agregarPersonajes(guerrero);
            FileManager.writeObject(listaPersonajes, "C:\\Users\\monic\\OneDrive - Estudiantes ITCR\\Documentos\\NetBeansProjects\\proyecto_HerenciaALTrono\\src\\archivosSerializados\\personajes.juego");
            listaPersonajes=(Personajes) FileManager.readObject("C:\\Users\\monic\\OneDrive - Estudiantes ITCR\\Documentos\\NetBeansProjects\\proyecto_HerenciaALTrono\\src\\archivosSerializados\\personajes.juego");
            JLabel imageLabel = new JLabel();
            ImageIcon imageicon = new ImageIcon(lbl_rutaA.getText());
            Image img = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(img));
            model.addRow(new Object[]{nombre,imageLabel, aparicion, campos, guerreroEscogidoStr,ataque});
            limpiarFields();
        }else{
            JOptionPane.showMessageDialog(panel_Fondo,"Los campos están vacíos.","Precaución guerrero",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_Ingresar1ActionPerformed

    private void txt_VidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_VidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_VidaActionPerformed

    private void combo_TiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_TiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_TiposActionPerformed
DefaultTableModel model;
    
//    byte imageJtable = new Byte(1024);
 
//Adding table headers
    public void addTableHeader() {
        model = (DefaultTableModel) table_Personajes.getModel();
        Object[] newIdentifiers = new Object[]{"Nombre", "Imagen","Nivel aparicion", "Campo","Tipo","Ataque"};
        model.setColumnIdentifiers(newIdentifiers);
        table_Personajes.setFillsViewportHeight(true);
        table_Personajes.getColumn("Imagen").setCellRenderer(new CellRenderer());
 
    }

 
    class CellRenderer implements TableCellRenderer {
 
        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {
 
            TableColumn tb = table_Personajes.getColumn("Imagen");
            tb.setMaxWidth(60);
            tb.setMinWidth(60);
 
            table_Personajes.setRowHeight(60);
 
            return (Component) value;
        }
 
    }
    private void generarTabla(){
        for(int i=0;i<listaPersonajes.getListaPersonajes().size();i++){
               String nombre=listaPersonajes.getListaPersonajes().get(i).getNombre();
               int aparicion=listaPersonajes.getListaPersonajes().get(i).getLvlAparicion();
               int campos=listaPersonajes.getListaPersonajes().get(i).getEspacios();
               String guerreroEscogidoStr=listaPersonajes.getListaPersonajes().get(i).getTipoGuerrero();
               int ataque=listaPersonajes.getListaPersonajes().get(i).getGolpes();
               JLabel imageLabel = new JLabel();
               ImageIcon imageicon = new ImageIcon(listaPersonajes.getListaPersonajes().get(i).getRutaImagenA());
               Image img = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
               imageLabel.setIcon(new ImageIcon(img));
                
        
               model.addRow(new Object[]{nombre,imageLabel, aparicion, campos, guerreroEscogidoStr,ataque});
    }
  }
 
   
    
    private void limpiarFields() {
        lbl_ImagenA.setIcon(new ImageIcon());
        lbl_ImagenE.setIcon(new ImageIcon());
        
        txt_NivelApariencia.setText("");
        txt_Vida.setText("");
        txt_Ataque.setText("");
        txt_NivelApariencia.setText("");
        txt_AccionApariencia.setText("");
        txt_Aparicion.setText("");
        lbl_rutaA.setText("Ruta imagen de aliado");
        lbl_rutaE.setText("Ruta imagen de enemigo");
        combo_Tipos.setSelectedIndex(0);
    }
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
            java.util.logging.Logger.getLogger(ingresarGear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresarGear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresarGear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresarGear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresarGear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ImagenAt;
    private javax.swing.JButton btn_ImagenOf;
    private javax.swing.JButton btn_Ingresar1;
    private javax.swing.JComboBox<String> combo_Tipos;
    private javax.swing.JLabel fondo_Juego;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_ImagenA;
    private javax.swing.JLabel lbl_ImagenE;
    private javax.swing.JLabel lbl_Ruta;
    private javax.swing.JLabel lbl_Titulo0;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JLabel lbl_Usuario1;
    private javax.swing.JLabel lbl_Usuario3;
    private javax.swing.JLabel lbl_Usuario4;
    private javax.swing.JLabel lbl_Usuario5;
    private javax.swing.JLabel lbl_Usuario6;
    private javax.swing.JLabel lbl_rutaA;
    private javax.swing.JLabel lbl_rutaE;
    private javax.swing.JPanel panel_Fondo;
    private javax.swing.JTable table_Personajes;
    private javax.swing.JTextField txt_AccionApariencia;
    private javax.swing.JTextField txt_Aparicion;
    private javax.swing.JTextField txt_Ataque;
    private javax.swing.JTextField txt_NivelApariencia;
    private javax.swing.JTextField txt_Vida;
    // End of variables declaration//GEN-END:variables
}
