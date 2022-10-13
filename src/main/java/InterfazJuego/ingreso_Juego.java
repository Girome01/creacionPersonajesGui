/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazJuego;

import LogicaJuego.Appearance;
import LogicaJuego.CharacterGame;
import LogicaJuego.Gear;
import LogicaJuego.HalfRangeWarrior;
import LogicaJuego.User;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author monic
 */
public class ingreso_Juego extends javax.swing.JFrame {

    /**
     * Creates new form ingreso_Juego
     */
    public ingreso_Juego() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        txt_NombreUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Ingresar1 = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("FrameBienvenida"); // NOI18N
        setPreferredSize(new java.awt.Dimension(755, 456));
        setResizable(false);
        getContentPane().setLayout(null);

        PanelFondo.setBackground(new java.awt.Color(102, 0, 102));
        PanelFondo.setMaximumSize(new java.awt.Dimension(755, 456));
        PanelFondo.setMinimumSize(new java.awt.Dimension(755, 456));
        PanelFondo.setPreferredSize(new java.awt.Dimension(755, 456));
        PanelFondo.setVerifyInputWhenFocusTarget(false);
        PanelFondo.setLayout(null);

        txt_NombreUsuario.setBackground(new java.awt.Color(102, 0, 102));
        txt_NombreUsuario.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        txt_NombreUsuario.setToolTipText("Ingrese su nombre");
        txt_NombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreUsuarioActionPerformed(evt);
            }
        });
        PanelFondo.add(txt_NombreUsuario);
        txt_NombreUsuario.setBounds(250, 360, 290, 30);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText(" BIENVENIDXS A HERENCIA AL TRONO ");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        PanelFondo.add(jLabel1);
        jLabel1.setBounds(170, 10, 470, 100);

        btn_Ingresar1.setBackground(new java.awt.Color(0, 0, 0));
        btn_Ingresar1.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        btn_Ingresar1.setForeground(new java.awt.Color(102, 0, 102));
        btn_Ingresar1.setText("Ingresar");
        btn_Ingresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ingresar1ActionPerformed(evt);
            }
        });
        PanelFondo.add(btn_Ingresar1);
        btn_Ingresar1.setBounds(320, 410, 150, 40);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesJuego/fondoBienvenida.jpg"))); // NOI18N
        lblFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFondo.setMaximumSize(new java.awt.Dimension(755, 456));
        lblFondo.setMinimumSize(new java.awt.Dimension(755, 456));
        lblFondo.setPreferredSize(new java.awt.Dimension(755, 456));
        PanelFondo.add(lblFondo);
        lblFondo.setBounds(0, 0, 786, 462);

        getContentPane().add(PanelFondo);
        PanelFondo.setBounds(0, 0, 780, 460);
        PanelFondo.getAccessibleContext().setAccessibleParent(lblFondo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ingresar1ActionPerformed
        // TODO add your handling code here:
       /* User usuario = new User(txt_NombreUsuario.getText(), 1);
        
        Object valor=(Personajes) FileManager.readObject("C:\\Users\\monic\\OneDrive - Estudiantes ITCR\\Documentos\\NetBeansProjects\\proyecto_HerenciaALTrono\\src\\archivosSerializados\\personajes.juego");
        if(valor!=null){
            listaPersonajes=(Personajes) FileManager.readObject("C:\\Users\\monic\\OneDrive - Estudiantes ITCR\\Documentos\\NetBeansProjects\\proyecto_HerenciaALTrono\\src\\archivosSerializados\\personajes.juego");
        }else{
            listaPersonajes=new Personajes();
        }
        String nombre=txt_NivelApariencia.getText();
        String vidaStr=txt_Vida.getText();
        String ataqueStr=txt_NombreImagen.getText();
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
        */
    }//GEN-LAST:event_btn_Ingresar1ActionPerformed

    private void txt_NombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(ingreso_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingreso_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingreso_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingreso_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        String imageDir = "src/main/java/imagenesJuego/";
        
        /* Create and display the form */
        Appearance aBarbara = new Appearance();
        aBarbara.addAppearance("STOP", imageDir+"rojoD.png");
        
        HashMap<Integer, Appearance> cAppearance = new HashMap<>();
        cAppearance.put(1, aBarbara);
        
        HalfRangeWarrior arquera = (HalfRangeWarrior) new HalfRangeWarrior.HalfRangeWarriorBuilder()
                .setcName("arquera")
                .setcCost(0)
                .setcAppearance(cAppearance)
                .setcLife(10)
                .setcLevel(0)
                .setcSpawnLevel(0)
                .setcStorageSpace(0)
                .setcHitPS(2)
                .build();
        
        Gear newGear = new Gear("Arco", 4, 2, 0, 0, imageDir+"arco.png", true);
        arquera.cAddGear("Arco", newGear);
        
        System.out.println(arquera.getcName());
        
        ArrayList<CharacterGame> listaPersonajesUsuario = new ArrayList<>();
        listaPersonajesUsuario.add(arquera);
        
        /*campoBatalla_Juego frame = new campoBatalla_Juego(listaPersonajesUsuario);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocation(290, 50);
        frame.setVisible(true);*/
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                campoBatalla_Juego frame = new campoBatalla_Juego(listaPersonajesUsuario);
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocation(290, 50);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JButton btn_Ingresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextField txt_NombreUsuario;
    // End of variables declaration//GEN-END:variables
}
