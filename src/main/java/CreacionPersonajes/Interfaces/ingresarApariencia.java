package CreacionPersonajes.Interfaces;
//import Logica_Juego.FileManager;
import CreacionPersonajes.Logica.*;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
public class ingresarApariencia extends javax.swing.JFrame {
    private ArrayList<CharacterGame> personajes;
    String imageDir = "src/main/java/Juego/ImagenesJuego/";
    
    public ingresarApariencia(ArrayList<CharacterGame> personajesAgregados) {
        initComponents();
        addTableHeader();
        personajes=(ArrayList<CharacterGame>) FileManager.readObject("src/main/java/CreacionPersonajes/Archivos/personajes.juego");   
        generarTabla();
        generarComboBox();
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
        txt_AccionPersonaje = new javax.swing.JTextField();
        lbl_NivelPersonaje = new javax.swing.JLabel();
        lbl_AccionPersonaje = new javax.swing.JLabel();
        txt_NivelApariencia = new javax.swing.JTextField();
        txt_NombreImagen = new javax.swing.JTextField();
        btn_ImagenApariencia = new javax.swing.JButton();
        lbl_ImagenApariencia = new javax.swing.JLabel();
        btn_Ingresar = new javax.swing.JButton();
        btn_Gear = new javax.swing.JButton();
        combo_Personajes = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_Apariencias = new javax.swing.JTable();
        lbl_Usuario1 = new javax.swing.JLabel();
        fondo_Juego = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(755, 456));

        panel_Fondo.setMaximumSize(new java.awt.Dimension(755, 456));
        panel_Fondo.setMinimumSize(new java.awt.Dimension(755, 456));
        panel_Fondo.setLayout(null);

        lbl_Titulo0.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Titulo0.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbl_Titulo0.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Titulo0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo0.setText("Ingresar apariencia");
        lbl_Titulo0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Titulo0.setOpaque(true);
        panel_Fondo.add(lbl_Titulo0);
        lbl_Titulo0.setBounds(130, 10, 500, 50);

        txt_AccionPersonaje.setBackground(new java.awt.Color(102, 0, 102));
        txt_AccionPersonaje.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        panel_Fondo.add(txt_AccionPersonaje);
        txt_AccionPersonaje.setBounds(590, 70, 170, 30);

        lbl_NivelPersonaje.setBackground(new java.awt.Color(255, 255, 255));
        lbl_NivelPersonaje.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_NivelPersonaje.setForeground(new java.awt.Color(102, 0, 102));
        lbl_NivelPersonaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NivelPersonaje.setText("Personaje:");
        lbl_NivelPersonaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_NivelPersonaje.setOpaque(true);
        panel_Fondo.add(lbl_NivelPersonaje);
        lbl_NivelPersonaje.setBounds(70, 120, 140, 30);

        lbl_AccionPersonaje.setBackground(new java.awt.Color(255, 255, 255));
        lbl_AccionPersonaje.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_AccionPersonaje.setForeground(new java.awt.Color(102, 0, 102));
        lbl_AccionPersonaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_AccionPersonaje.setText("Acción personaje:");
        lbl_AccionPersonaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_AccionPersonaje.setOpaque(true);
        panel_Fondo.add(lbl_AccionPersonaje);
        lbl_AccionPersonaje.setBounds(410, 70, 160, 30);

        txt_NivelApariencia.setBackground(new java.awt.Color(102, 0, 102));
        txt_NivelApariencia.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        txt_NivelApariencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NivelAparienciaActionPerformed(evt);
            }
        });
        panel_Fondo.add(txt_NivelApariencia);
        txt_NivelApariencia.setBounds(220, 70, 180, 30);

        txt_NombreImagen.setBackground(new java.awt.Color(102, 0, 102));
        txt_NombreImagen.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        panel_Fondo.add(txt_NombreImagen);
        txt_NombreImagen.setBounds(410, 180, 350, 30);

        btn_ImagenApariencia.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        btn_ImagenApariencia.setForeground(new java.awt.Color(102, 0, 102));
        btn_ImagenApariencia.setText("Seleccionar imagen de apariencia");
        btn_ImagenApariencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImagenAparienciaActionPerformed(evt);
            }
        });
        panel_Fondo.add(btn_ImagenApariencia);
        btn_ImagenApariencia.setBounds(410, 110, 350, 50);

        lbl_ImagenApariencia.setToolTipText("Imagen enemigo");
        lbl_ImagenApariencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_Fondo.add(lbl_ImagenApariencia);
        lbl_ImagenApariencia.setBounds(130, 160, 160, 180);

        btn_Ingresar.setBackground(new java.awt.Color(0, 0, 0));
        btn_Ingresar.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_Ingresar.setForeground(new java.awt.Color(102, 0, 102));
        btn_Ingresar.setText("Ingresar");
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });
        panel_Fondo.add(btn_Ingresar);
        btn_Ingresar.setBounds(400, 250, 150, 40);

        btn_Gear.setBackground(new java.awt.Color(0, 0, 0));
        btn_Gear.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_Gear.setForeground(new java.awt.Color(102, 0, 102));
        btn_Gear.setText("Gears");
        btn_Gear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GearActionPerformed(evt);
            }
        });
        panel_Fondo.add(btn_Gear);
        btn_Gear.setBounds(600, 250, 150, 40);

        combo_Personajes.setBackground(new java.awt.Color(0, 0, 0));
        combo_Personajes.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        combo_Personajes.setForeground(new java.awt.Color(102, 0, 102));
        combo_Personajes.setToolTipText("");
        combo_Personajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_PersonajesActionPerformed(evt);
            }
        });
        panel_Fondo.add(combo_Personajes);
        combo_Personajes.setBounds(220, 120, 180, 30);

        table_Apariencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_Apariencias.setGridColor(new java.awt.Color(102, 0, 102));
        jScrollPane2.setViewportView(table_Apariencias);

        panel_Fondo.add(jScrollPane2);
        jScrollPane2.setBounds(30, 360, 720, 130);

        lbl_Usuario1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Usuario1.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Usuario1.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Usuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Usuario1.setText("Nivel personaje:");
        lbl_Usuario1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Usuario1.setOpaque(true);
        panel_Fondo.add(lbl_Usuario1);
        lbl_Usuario1.setBounds(70, 70, 140, 30);

        fondo_Juego.setIcon(new javax.swing.ImageIcon("D:\\Documents\\GitHub\\creacionPersonajesGui\\src\\main\\java\\CreacionPersonajes\\Interfaces\\ImagenesCreacionPersonajes\\FondoPantallas.png")); // NOI18N
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

    private void btn_ImagenAparienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImagenAparienciaActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "JPG & PNG Images", "png", "jpg", "jpeg");
        chooser.setFileFilter(filter);

       int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            txt_NombreImagen.setText(chooser.getSelectedFile().getName());
            File selectedImageFile = chooser.getSelectedFile();
            String selectedImagePath = imageDir+selectedImageFile.getName();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            //Display image on jlable
            ImageIcon ii = new ImageIcon(selectedImagePath);
            //            Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(lbl_ImagenApariencia.getWidth(), lbl_ImagenApariencia.getHeight(), Image.SCALE_SMOOTH);

            lbl_ImagenApariencia.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_btn_ImagenAparienciaActionPerformed

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        // TODO add your handling code here:
        String nivel=txt_NivelApariencia.getText();
        String accionStr=txt_AccionPersonaje.getText();
        String imagenStr=txt_NombreImagen.getText();
        int personajeEscogido= combo_Personajes.getSelectedIndex();
        String personajeEscogidoStr= combo_Personajes.getItemAt(personajeEscogido);
        
        
        if(!nivel.isBlank() && !accionStr.isBlank() && !imagenStr.isBlank() && !personajeEscogidoStr.isBlank()){
           for(int i=0;i<personajes.size();i++){
               if(personajes.get(i).getcName()==personajeEscogidoStr.strip()){
                   Appearance nuevaApariencia=new Appearance();
                   nuevaApariencia.addAppearance(nivel, accionStr);
                   personajes.get(i).setcAppearance(Integer.parseInt(nivel), nuevaApariencia);
               }
           }
            JLabel imageLabel = new JLabel();
            ImageIcon imageicon = new ImageIcon(imageDir+txt_NombreImagen.getText());
            Image img = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(img));
            model.addRow(new Object[]{personajeEscogido, nivel, accionStr, imageLabel});
            limpiarFields();
            
        }else{
            JOptionPane.showMessageDialog(panel_Fondo,"Los campos están vacíos.","Precaución guerrero",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void btn_GearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GearActionPerformed
        // TODO add your handling code here:
        ingresarGear juego = new ingresarGear();
        juego.setVisible(true);
    }//GEN-LAST:event_btn_GearActionPerformed

    private void combo_PersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_PersonajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_PersonajesActionPerformed
DefaultTableModel model;
    
//    byte imageJtable = new Byte(1024);
 
//Adding table headers
    public void addTableHeader() {
        model = (DefaultTableModel) table_Apariencias.getModel();
        Object[] newIdentifiers = new Object[]{"Nombre", "Nivel", "Acción", "Imagen"};
        model.setColumnIdentifiers(newIdentifiers);
        table_Apariencias.setFillsViewportHeight(true);
        table_Apariencias.getColumn("Imagen").setCellRenderer(new CellRenderer());
 
    }

 
    class CellRenderer implements TableCellRenderer {
 
        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {
 
            TableColumn tb = table_Apariencias.getColumn("Imagen");
            tb.setMaxWidth(60);
            tb.setMinWidth(60);
 
            table_Apariencias.setRowHeight(60);
 
            return (Component) value;
        }
 
    }
    private void generarTabla(){
        for(int i=0;i<personajes.size();i++){
          /* for(int j=0; j<personajes.get(i);i++){
                String nombre=personajes.get(i).getcName();
                int nivel=personajes.get(i).getcAppearance2().
            } 
        }
            
            JLabel imageLabel = new JLabel();
            ImageIcon imageicon = new ImageIcon(listaPersonajes.getListaPersonajes().get(i).getRutaImagenA());
            Image img = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(img));
                
        
               model.addRow(new Object[]{nombre,imageLabel, aparicion, campos, guerreroEscogidoStr,ataque});
   */ 
        }
  }
 
    private void generarComboBox(){
        ArrayList<String> listaNombres=new ArrayList<>();
        for(int i=0; i<personajes.size(); i++){
            combo_Personajes.addItem(personajes.get(i).getcName().toString());
        }
    }
   
    
    private void limpiarFields() {
        lbl_ImagenApariencia.setIcon(new ImageIcon());
        txt_NivelApariencia.setText("");
        txt_NombreImagen.setText("");
        txt_NivelApariencia.setText("");
        txt_AccionPersonaje.setText("");
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
            java.util.logging.Logger.getLogger(ingresarApariencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresarApariencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresarApariencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresarApariencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ingresarApariencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Gear;
    private javax.swing.JButton btn_ImagenApariencia;
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JComboBox<String> combo_Personajes;
    private javax.swing.JLabel fondo_Juego;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_AccionPersonaje;
    private javax.swing.JLabel lbl_ImagenApariencia;
    private javax.swing.JLabel lbl_NivelPersonaje;
    private javax.swing.JLabel lbl_Titulo0;
    private javax.swing.JLabel lbl_Usuario1;
    private javax.swing.JPanel panel_Fondo;
    private javax.swing.JTable table_Apariencias;
    private javax.swing.JTextField txt_AccionPersonaje;
    private javax.swing.JTextField txt_NivelApariencia;
    private javax.swing.JTextField txt_NombreImagen;
    // End of variables declaration//GEN-END:variables
}
