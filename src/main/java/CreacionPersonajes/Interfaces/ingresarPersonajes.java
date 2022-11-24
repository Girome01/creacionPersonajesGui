package CreacionPersonajes.Interfaces;
import CreacionPersonajes.Logica.*;
import LogicaJuego.*;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
public class ingresarPersonajes extends javax.swing.JFrame {
    ArrayList<CharacterGame> personajes;
    String imageDir = "src/main/java/Juego/ImagenesJuego/";
    
    public ingresarPersonajes() {
       initComponents();
       addTableHeader();
       Object valor=(ArrayList<CharacterGame>) FileManager.readObject("src/main/java/CreacionPersonajes/Archivos/personajes.juego");   
       if(valor!=null){
            personajes=(ArrayList<CharacterGame>) FileManager.readObject("src/main/java/CreacionPersonajes/Archivos/personajes.juego");  
       }else{
           personajes=new ArrayList<>();
       }
        
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
        txt_Campos = new javax.swing.JTextField();
        lbl_Usuario = new javax.swing.JLabel();
        lbl_Usuario6 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        lbl_Usuario5 = new javax.swing.JLabel();
        txt_Aparicion = new javax.swing.JTextField();
        lbl_Usuario3 = new javax.swing.JLabel();
        txt_Vida = new javax.swing.JTextField();
        lbl_Nivel = new javax.swing.JLabel();
        txt_Nivel = new javax.swing.JTextField();
        combo_Tipos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_Personajes = new javax.swing.JTable();
        lbl_Usuario7 = new javax.swing.JLabel();
        txt_Ataque = new javax.swing.JTextField();
        lbl_Costo1 = new javax.swing.JLabel();
        txt_Costo = new javax.swing.JTextField();
        btn_Ingresar = new javax.swing.JButton();
        btn_Apariencia = new javax.swing.JButton();
        fondo_Juego = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar personajes");
        setResizable(false);
        setSize(new java.awt.Dimension(755, 456));

        panel_Fondo.setMaximumSize(new java.awt.Dimension(755, 456));
        panel_Fondo.setMinimumSize(new java.awt.Dimension(755, 456));
        panel_Fondo.setLayout(null);

        lbl_Titulo0.setBackground(new java.awt.Color(0, 0, 0));
        lbl_Titulo0.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbl_Titulo0.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Titulo0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo0.setText("Ingresar personajes");
        lbl_Titulo0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Titulo0.setOpaque(true);
        panel_Fondo.add(lbl_Titulo0);
        lbl_Titulo0.setBounds(130, 10, 500, 50);

        txt_Campos.setBackground(new java.awt.Color(102, 0, 102));
        txt_Campos.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        panel_Fondo.add(txt_Campos);
        txt_Campos.setBounds(550, 70, 170, 30);

        lbl_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Usuario.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Usuario.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Usuario.setText("Nombre:");
        lbl_Usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Usuario.setOpaque(true);
        panel_Fondo.add(lbl_Usuario);
        lbl_Usuario.setBounds(30, 70, 140, 30);

        lbl_Usuario6.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Usuario6.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Usuario6.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Usuario6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Usuario6.setText("Campos:");
        lbl_Usuario6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Usuario6.setOpaque(true);
        panel_Fondo.add(lbl_Usuario6);
        lbl_Usuario6.setBounds(390, 70, 140, 30);

        txt_Nombre.setBackground(new java.awt.Color(102, 0, 102));
        txt_Nombre.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        panel_Fondo.add(txt_Nombre);
        txt_Nombre.setBounds(190, 70, 170, 30);

        lbl_Usuario5.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Usuario5.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Usuario5.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Usuario5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Usuario5.setText("Aparición:");
        lbl_Usuario5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Usuario5.setOpaque(true);
        panel_Fondo.add(lbl_Usuario5);
        lbl_Usuario5.setBounds(390, 110, 140, 30);

        txt_Aparicion.setBackground(new java.awt.Color(102, 0, 102));
        txt_Aparicion.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        txt_Aparicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AparicionActionPerformed(evt);
            }
        });
        panel_Fondo.add(txt_Aparicion);
        txt_Aparicion.setBounds(550, 110, 170, 30);

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

        lbl_Nivel.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Nivel.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Nivel.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Nivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Nivel.setText("Nivel:");
        lbl_Nivel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Nivel.setOpaque(true);
        panel_Fondo.add(lbl_Nivel);
        lbl_Nivel.setBounds(390, 190, 140, 30);

        txt_Nivel.setBackground(new java.awt.Color(102, 0, 102));
        txt_Nivel.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        panel_Fondo.add(txt_Nivel);
        txt_Nivel.setBounds(550, 190, 170, 30);

        combo_Tipos.setBackground(new java.awt.Color(0, 0, 0));
        combo_Tipos.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        combo_Tipos.setForeground(new java.awt.Color(102, 0, 102));
        combo_Tipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guerrero de contacto", "Guerrero de mediano alcance", "Guerrero aéreo" }));
        combo_Tipos.setSelectedIndex(-1);
        combo_Tipos.setToolTipText("Tipo guerrero");
        combo_Tipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_TiposActionPerformed(evt);
            }
        });
        panel_Fondo.add(combo_Tipos);
        combo_Tipos.setBounds(390, 150, 330, 30);

        table_Personajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_Personajes.setGridColor(new java.awt.Color(102, 0, 102));
        jScrollPane2.setViewportView(table_Personajes);

        panel_Fondo.add(jScrollPane2);
        jScrollPane2.setBounds(30, 340, 720, 130);

        lbl_Usuario7.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Usuario7.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Usuario7.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Usuario7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Usuario7.setText("Ataque:");
        lbl_Usuario7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Usuario7.setOpaque(true);
        panel_Fondo.add(lbl_Usuario7);
        lbl_Usuario7.setBounds(30, 150, 140, 30);

        txt_Ataque.setBackground(new java.awt.Color(102, 0, 102));
        txt_Ataque.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        panel_Fondo.add(txt_Ataque);
        txt_Ataque.setBounds(190, 150, 170, 30);

        lbl_Costo1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Costo1.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_Costo1.setForeground(new java.awt.Color(102, 0, 102));
        lbl_Costo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Costo1.setText("Costo:");
        lbl_Costo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        lbl_Costo1.setOpaque(true);
        panel_Fondo.add(lbl_Costo1);
        lbl_Costo1.setBounds(30, 190, 140, 30);

        txt_Costo.setBackground(new java.awt.Color(102, 0, 102));
        txt_Costo.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        panel_Fondo.add(txt_Costo);
        txt_Costo.setBounds(190, 190, 170, 30);

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
        btn_Ingresar.setBounds(220, 260, 150, 40);

        btn_Apariencia.setBackground(new java.awt.Color(0, 0, 0));
        btn_Apariencia.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_Apariencia.setForeground(new java.awt.Color(102, 0, 102));
        btn_Apariencia.setText("Apariencia");
        btn_Apariencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AparienciaActionPerformed(evt);
            }
        });
        panel_Fondo.add(btn_Apariencia);
        btn_Apariencia.setBounds(400, 260, 150, 40);

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

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_AparicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AparicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AparicionActionPerformed

    private void txt_VidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_VidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_VidaActionPerformed

    private void combo_TiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_TiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_TiposActionPerformed

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        // TODO add your handling code here:
        
        
        String nombre=txt_Nombre.getText();
        String vidaStr=txt_Vida.getText();
        String ataqueStr=txt_Ataque.getText();
        String costoStr=txt_Costo.getText();
        String camposStr=txt_Campos.getText();
        String aparicionStr=txt_Aparicion.getText();
        String nivelStr=txt_Nivel.getText();
        int guerreroEscogido= combo_Tipos.getSelectedIndex();
        String guerreroEscogidoStr= combo_Tipos.getItemAt(guerreroEscogido);
        

        if(!nombre.isBlank() && !vidaStr.isBlank() && !ataqueStr.isBlank() && !camposStr.isBlank() &&
            !costoStr.isBlank() && !aparicionStr.isBlank() && !guerreroEscogidoStr.isBlank() && !nivelStr.isBlank()){
            int vida=Integer.parseInt(vidaStr);
            int ataque=Integer.parseInt(ataqueStr);
            int campos=Integer.parseInt(camposStr);
            int aparicion=Integer.parseInt(aparicionStr);
            int nivel=Integer.parseInt(nivelStr);
            double costo=Double.parseDouble(costoStr);
            
            Appearance defaultAppearance = new Appearance();
            defaultAppearance.addAppearance("lapida", imageDir+"lapida.png");
            defaultAppearance.addAppearance("puño", imageDir+"puño.png");
            defaultAppearance.addAppearance("STOP", imageDir+"rojoD.png");
            
            HashMap<Integer, Appearance> defaultAppearanceHM = new HashMap<>();
            defaultAppearanceHM.put(0, defaultAppearance);
            
            if(guerreroEscogido==0){
                ContactWarrior barbaro = (ContactWarrior) new ContactWarrior.ContactWarriorBuilder()
                        .setcName(nombre)
                        .setcLife(vida)
                        .setcHitPS(ataque)
                        .setcCost(costo)
                        .setcStorageSpace(campos)
                        .setcSpawnLevel(nivel)
                        .setcAppearance(defaultAppearanceHM)
                        .setcLevel(nivel).build();
                personajes.add(barbaro);
            }else if(guerreroEscogido==1){
                HalfRangeWarrior arquera = (HalfRangeWarrior) new HalfRangeWarrior.HalfRangeWarriorBuilder()
                        .setcName(nombre)
                        .setcLife(vida)
                        .setcHitPS(ataque)
                        .setcCost(costo)
                        .setcStorageSpace(campos)
                        .setcSpawnLevel(nivel)
                        .setcAppearance(defaultAppearanceHM)
                        .setcLevel(nivel).build();
                personajes.add(arquera);
            }else{
                AerialWarrior dragon = (AerialWarrior) new AerialWarrior.AerialWarriorBuilder()
                        .setcName(nombre)
                        .setcLife(vida)
                        .setcHitPS(ataque)
                        .setcCost(costo)
                        .setcStorageSpace(campos)
                        .setcSpawnLevel(nivel)
                        .setcAppearance(defaultAppearanceHM)
                        .setcLevel(nivel).build();
                personajes.add(dragon);
            }
            FileManager.writeObject(personajes,"src/main/java/CreacionPersonajes/Archivos/personajes.juego");
         
            
            //JLabel imageLabel = new JLabel();
            //ImageIcon imageicon = new ImageIcon(lbl_rutaA.getText());
            //Image img = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
            //imageLabel.setIcon(new ImageIcon(img));
            model.addRow(new Object[]{nombre,nivel, aparicion, vida, ataque, campos, costo});
            limpiarFields();
        }else{
            JOptionPane.showMessageDialog(panel_Fondo,"Los campos están vacíos.","Atención",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void btn_AparienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AparienciaActionPerformed
        // TODO add your handling code here:
            ingresarPersonajes window=this;
            window.setVisible(false);
            ingresarApariencia frame = new ingresarApariencia(personajes);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocation(290, 50);
            frame.setVisible(true);
    }//GEN-LAST:event_btn_AparienciaActionPerformed
DefaultTableModel model;
    
//    byte imageJtable = new Byte(1024);
 
//Adding table headers
    public void addTableHeader() {
        model = (DefaultTableModel) table_Personajes.getModel();
        Object[] newIdentifiers = new Object[]{"Nombre","Nivel", "Aparicion","Vida", "Ataque", "Campo","Costo"};
        model.setColumnIdentifiers(newIdentifiers);
        //table_Personajes.setFillsViewportHeight(true);
        //table_Personajes.getColumn("Imagen").setCellRenderer(new CellRenderer());
 
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
        for(int i=0;i<personajes.size();i++){
            String nombre=personajes.get(i).getcName();
            int nivel=personajes.get(i).getcLevel();
            int aparicion=personajes.get(i).getcSpawnLevel();
            int vida=personajes.get(i).getcLife();
            int ataque=personajes.get(i).getcHitPS();
            int campos=personajes.get(i).getcStorageSpace();
            double costo=personajes.get(i).getcCost();

            model.addRow(new Object[]{nombre, nivel, aparicion, vida, ataque, campos, costo});
        }
  }
 
    private void limpiarFields() {
        txt_Nombre.setText("");
        txt_Vida.setText("");
        txt_Nivel.setText("");
        txt_Nombre.setText("");
        txt_Campos.setText("");
        txt_Aparicion.setText("");
        txt_Costo.setText("");
        txt_Ataque.setText("");
        txt_Nivel.setText("");
        combo_Tipos.setSelectedIndex(-1);
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
            java.util.logging.Logger.getLogger(ingresarPersonajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresarPersonajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresarPersonajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresarPersonajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ingresarPersonajes frame = new ingresarPersonajes();
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocation(290, 50);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Apariencia;
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JComboBox<String> combo_Tipos;
    private javax.swing.JLabel fondo_Juego;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Costo1;
    private javax.swing.JLabel lbl_Nivel;
    private javax.swing.JLabel lbl_Titulo0;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JLabel lbl_Usuario3;
    private javax.swing.JLabel lbl_Usuario5;
    private javax.swing.JLabel lbl_Usuario6;
    private javax.swing.JLabel lbl_Usuario7;
    private javax.swing.JPanel panel_Fondo;
    private javax.swing.JTable table_Personajes;
    private javax.swing.JTextField txt_Aparicion;
    private javax.swing.JTextField txt_Ataque;
    private javax.swing.JTextField txt_Campos;
    private javax.swing.JTextField txt_Costo;
    private javax.swing.JTextField txt_Nivel;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Vida;
    // End of variables declaration//GEN-END:variables
}
