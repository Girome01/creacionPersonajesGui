/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Juego.InterfazJuego;

import LogicaJuego.ContactWarrior;
import CreacionPersonajes.Logica.*;
import java.awt.Component;
import java.awt.Image;
import javax.swing.*;
import javax.swing.table.*;
import LogicaJuego.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author anagu
 */
public class seleccionarGear extends javax.swing.JFrame {
    protected ArrayList<CharacterGame> listaPersonajesUsuario;
    protected User usuario;
    protected ArrayList<Gear> listaGears;
    String imageDir = "src/main/java/imagenesJuego/";


    public seleccionarGear(ArrayList<CharacterGame> listaPersonajesUsuario, User usuario) {
        this.listaPersonajesUsuario = listaPersonajesUsuario;
        initComponents();
        Object valor=(ArrayList<Gear>) FileManager.readObject("src/main/java/CreacionPersonajes/Archivos/gears.juego");

        if(valor!=null){
            listaGears =(ArrayList<Gear>) FileManager.readObject("src/main/java/CreacionPersonajes/Archivos/gears.juego");
        }else{
            listaGears =new ArrayList<>();
        }

        generarComboBoxGears();
        generarComboBoxCharacters();
    }



    private void generarComboBoxGears(){
        ArrayList<String> listaNombresGears=new ArrayList<>();
        for(int i=0; i<listaGears.size(); i++){
            gearComboBox.addItem(listaGears.get(i).getgName());
        }
    }

    private void generarComboBoxCharacters(){
        ArrayList<String> listaNombresCharacters=new ArrayList<>();
        for(int i=0; i<listaPersonajesUsuario.size(); i++){
            characterComboBox.addItem(listaPersonajesUsuario.get(i).getcName().toString());
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        gearImg = new javax.swing.JPanel();
        imgGear = new javax.swing.JLabel();
        gearComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gearRange = new javax.swing.JLabel();
        gearDamage = new javax.swing.JLabel();
        gearLvl = new javax.swing.JLabel();
        gearBlast = new javax.swing.JLabel();
        selectGear = new javax.swing.JButton();
        characterComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cHit = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cLife = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cLvl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cStorage = new javax.swing.JLabel();
        startGameBtn = new javax.swing.JButton();
        imgChar = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(112, 136, 140));

        gearImg.setBackground(new java.awt.Color(112, 136, 140));

        imgGear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        javax.swing.GroupLayout gearImgLayout = new javax.swing.GroupLayout(gearImg);
        gearImg.setLayout(gearImgLayout);
        gearImgLayout.setHorizontalGroup(
            gearImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgGear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );
        gearImgLayout.setVerticalGroup(
            gearImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgGear, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        );

        gearComboBox.setBackground(new java.awt.Color(0, 102, 102));
        gearComboBox.setForeground(new java.awt.Color(255, 255, 255));
        gearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gearComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Range");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Damage");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Level");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Blast");

        gearRange.setForeground(new java.awt.Color(255, 255, 255));
        gearRange.setText("1");

        gearDamage.setForeground(new java.awt.Color(255, 255, 255));
        gearDamage.setText("1");

        gearLvl.setForeground(new java.awt.Color(255, 255, 255));
        gearLvl.setText("1");

        gearBlast.setForeground(new java.awt.Color(255, 255, 255));
        gearBlast.setText("1");

        selectGear.setBackground(new java.awt.Color(0, 102, 102));
        selectGear.setForeground(new java.awt.Color(255, 255, 255));
        selectGear.setText("Seleccionar");
        selectGear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectGearActionPerformed(evt);
            }
        });

        characterComboBox.setBackground(new java.awt.Color(0, 102, 102));
        characterComboBox.setForeground(new java.awt.Color(255, 255, 255));
        characterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                characterComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hit PS");

        cHit.setForeground(new java.awt.Color(255, 255, 255));
        cHit.setText("1");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Life");

        cLife.setForeground(new java.awt.Color(255, 255, 255));
        cLife.setText("1");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Level");

        cLvl.setForeground(new java.awt.Color(255, 255, 255));
        cLvl.setText("1");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Storage");

        cStorage.setForeground(new java.awt.Color(255, 255, 255));
        cStorage.setText("1");

        startGameBtn.setBackground(new java.awt.Color(149, 175, 174));
        startGameBtn.setText("Iniciar Partida");
        startGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameBtnActionPerformed(evt);
            }
        });

        imgChar.setForeground(new java.awt.Color(0, 102, 102));
        imgChar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gearImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gearRange, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gearDamage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gearLvl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gearBlast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(gearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imgChar, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cHit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cLife, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cLvl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(characterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectGear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startGameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gearImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(gearRange))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(gearDamage))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(gearLvl))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(gearBlast)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(characterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(cHit))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(cLife))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(cLvl))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(cStorage)))
                            .addComponent(imgChar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(selectGear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(startGameBtn)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        gearImg.getAccessibleContext().setAccessibleName("");
        gearImg.getAccessibleContext().setAccessibleDescription("");

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

    private void selectGearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectGearActionPerformed
        // TODO add your handling code here:
        Gear selectedGear = listaGears.get(gearComboBox.getSelectedIndex());
        CharacterGame selectedChar = listaPersonajesUsuario.get(characterComboBox.getSelectedIndex());
        HashMap<String,Gear> gearMap = new HashMap<String,Gear>();
        gearMap.put(selectedGear.getgName(),selectedGear);
        selectedChar.setcGear(gearMap);


    }//GEN-LAST:event_selectGearActionPerformed

    private void gearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gearComboBoxActionPerformed
        // TODO add your handling code here:
        // TODO: evt.getModifiers() GET OPTION
        Gear selected = listaGears.get(gearComboBox.getSelectedIndex());
        ImageIcon ii = new ImageIcon(selected.getgAppearanceURL());
        //            Resize image to fit jlabel
        Image image = ii.getImage().getScaledInstance(imgGear.getWidth(), imgGear.getHeight(), Image.SCALE_SMOOTH);
        imgGear.setIcon(new ImageIcon(image));

        gearBlast.setText(Integer.toString((selected.getgGearBLast())));
        gearLvl.setText(Integer.toString(selected.getgLevel()));
        gearRange.setText(Integer.toString(selected.getgRange()));
        gearDamage.setText(Integer.toString(selected.getgDamage()));

    }//GEN-LAST:event_gearComboBoxActionPerformed

    private void characterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_characterComboBoxActionPerformed
        // TODO add your handling code here:
        CharacterGame selected = listaPersonajesUsuario.get(characterComboBox.getSelectedIndex());
        ImageIcon ii = new ImageIcon(selected.getcAppearance(selected.getcSpawnLevel(),"WALKING"));
        //            Resize image to fit jlabel
        Image image = ii.getImage().getScaledInstance(imgChar.getWidth(), imgChar.getHeight(), Image.SCALE_SMOOTH);
        imgChar.setIcon(new ImageIcon(image));

        cHit.setText(Integer.toString(selected.getcHitPS()));
        cLvl.setText(Integer.toString(selected.getcLevel()));
        cStorage.setText(Integer.toString(selected.getcStorageSpace()));
        cLife.setText(Integer.toString(selected.getcLife()));

    }//GEN-LAST:event_characterComboBoxActionPerformed

    private void startGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameBtnActionPerformed
        // TODO add your handling code here:

        campoBatalla_Juego frame = new campoBatalla_Juego(listaPersonajesUsuario, usuario);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocation(290, 50);
        frame.setVisible(true);
    }//GEN-LAST:event_startGameBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cHit;
    private javax.swing.JLabel cLife;
    private javax.swing.JLabel cLvl;
    private javax.swing.JLabel cStorage;
    private javax.swing.JComboBox<String> characterComboBox;
    private javax.swing.JLabel gearBlast;
    private javax.swing.JComboBox<String> gearComboBox;
    private javax.swing.JLabel gearDamage;
    private javax.swing.JPanel gearImg;
    private javax.swing.JLabel gearLvl;
    private javax.swing.JLabel gearRange;
    private javax.swing.JLabel imgChar;
    private javax.swing.JLabel imgGear;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton selectGear;
    private javax.swing.JButton startGameBtn;
    // End of variables declaration//GEN-END:variables
}
