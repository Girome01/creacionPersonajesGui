/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego.InterfazJuego;
import LogicaJuego.ContactWarrior;
import CreacionPersonajes.Logica.PFCharacter;
import CreacionPersonajes.Logica.PFGear;
import CreacionPersonajes.Logica.Gear;
import CreacionPersonajes.Logica.Appearance;
import CreacionPersonajes.Logica.CharacterGame;
import java.awt.Component;
import java.awt.Image;
import javax.swing.*;
import javax.swing.table.*;
import LogicaJuego.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author monic
 */
public class escogerPersonajes_Juego extends javax.swing.JFrame {
    protected ArrayList<CharacterGame> listaPersonajesUsuario;
    protected User usuario;
    
    String imageDir = "src/main/java/imagenesJuego/";
    /**
     * Creates new form escogerPersonajes_Juego
     * @param user     
     */
    public escogerPersonajes_Juego(User user) {
        initComponents();
        this.usuario = user;
        crearPersonajesBase();
        subirNivel(user);
        tabla();
        
    }
    /*
    public boolean creceNivel(String tipoGuerrero){
        if(tipoGuerrero.equalsIgnoreCase("Guerrero de Contacto") || tipoGuerrero.equalsIgnoreCase("Guerrero de mediano alcance") || tipoGuerrero.equalsIgnoreCase("Guerrero aéreo")){
            return true;
        }else{
            return false;
        }
    }
    */
    
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
    
    public void tabla(){
        DefaultTableModel model;
        model = (DefaultTableModel) table_Personajes.getModel();
        table_Personajes.getColumn("Imagen").setCellRenderer(new CellRenderer());
         for(int i=0;i<PFCharacter.CharacterList().size();i++){
            String nombre=PFCharacter.CharacterList().get(i).getcName();
            int aparicion=PFCharacter.CharacterList().get(i).getcSpawnLevel();
            int campos=PFCharacter.CharacterList().get(i).getcStorageSpace();
            int ataque=PFCharacter.CharacterList().get(i).getcHitPS();
            int vida=PFCharacter.CharacterList().get(i).getcLife();  
         
         
        JLabel imageLabel = new JLabel();
        ImageIcon imageicon = new ImageIcon(PFCharacter.CharacterList().get(i).getcAppearance(PFCharacter.CharacterList().get(i).getcLevel(),"STOP"));
        Image img = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(img));
        //if(listaPersonajes.getListaPersonajes().get(i).getLvlAparicion()<=nuevo.getNivelUsuario())           //AGREGRAR LUEGO
         model.addRow(new Object[]{nombre,imageLabel, ataque,vida,campos,0,false});

        }   
     }
         
   
    
    
    public void subirNivel(User user){
        
        //SOLO AUMENTA EL NIVEL, ACTUALIZAR SI SE OCUPA SUBIR OTRAS ESTADISTICAS EN CharacterGame
        PFCharacter.setLevels(user.getuLevel());
        
    }
    
    public void crearArmas(){
        /*
            private String gName;
            private int gRange;
            private int gDamage;
            private int gLevel;
            private int gGearBLast;
            private String gAppearanceURL;
            private boolean gActive; 
        */
        Gear espada = new Gear("espada",1, 10, 1, 0, imageDir+"arco.png", true);
        Gear bomba = new Gear("bomba",2, 20, 1,4 , "", true);
        Gear arco = new Gear("arco",5,5,1,0, "", true);
        
        PFGear.addPrototype("espada", espada);
        PFGear.addPrototype("bomba", bomba);
        PFGear.addPrototype("arco", arco);
        
    }
    
    public void crearPersonajesBase(){
        
        crearArmas();
        /*
            protected String cName; 
            protected HashMap<Integer, Appearance> cAppearance;
            protected int cSpawnLevel;
            protected int cHitPS;
            protected int cLife;
            //private int[][] cStorageSpace;
            protected int cStorageSpace;
            protected double cCost;
            protected int cLevel;
            protected HashMap<String, Gear> cGear = new HashMap<>();
        */
        
        //Barbaro Aspects
        Appearance cAppearance = new Appearance();
        cAppearance.addAppearance("STOP", imageDir+"rojoD.png");
        cAppearance.addAppearance("Walking", imageDir+"dragonI.png");
        cAppearance.addAppearance("attacking", imageDir+"heroeD.png");

        Appearance defaultAppearance = new Appearance();
        defaultAppearance.addAppearance("lapida", imageDir+"lapida.png");
        defaultAppearance.addAppearance("puño", imageDir+"puño.png");

/*
        Appearance arqueraAppearance = new Appearance();
        arqueraAppearance.addAppearance("lapida", imageDir+"lapida.png");
        arqueraAppearance.addAppearance("puño", imageDir+"puño.png");*/

        HashMap<Integer, Appearance> barbaroAppearance = new HashMap<>();
        barbaroAppearance.put(1, cAppearance);
        barbaroAppearance.put(0, defaultAppearance);


        //fin Barbaro aspects
        ContactWarrior barbaro = new ContactWarrior("barbaro", barbaroAppearance, 1, 5, 100, 2, 3, 1);
        barbaro.cAddGear("espada", PFGear.getPrototype("espada"));

        //Arquera
        /*HalfRangeWarrior arquera = new HalfRangeWarrior("arquera", barbaroAppearance, 1, 3, 80, 2, 2, 1);
        arquera.cAddGear("arco", PFGear.getPrototype("arco"));*/
        
        //Bombardera
        /*AerialWarrior bombardera = new AerialWarrior("bombardera", barbaroAppearance, 1, 10, 100, 6, 4, 1);
        bombardera.cAddGear("bomba", PFGear.getPrototype("bomba"));*/
        
        PFCharacter.addPrototype("barbaro", barbaro);
        /*PFCharacter.addPrototype("arquera", arquera);
        PFCharacter.addPrototype("bombardera", bombardera);*/
    }
    
    public boolean getValues(){
        listaPersonajesUsuario = new ArrayList<>();
        
        for(int i=0;i<table_Personajes.getModel().getRowCount();i++){
            if ((Boolean) table_Personajes.getModel().getValueAt(i,6)){
              String nombre=table_Personajes.getModel().getValueAt(i, 0).toString();
              int cantidad = (int) table_Personajes.getModel().getValueAt(i,5);
              ArrayList<CharacterGame> guerreros = PFCharacter.getPrototype(nombre,cantidad);
              if(guerreros!=null){
                  for (int j = 0; j < guerreros.size(); j++) {
                      listaPersonajesUsuario.add(guerreros.get(j));
                  }
                  
                  //nuevo.agregarColeccion(listaPersonajesUsuario);
                  //if(!listaPersonajesUsuario.sumatoriaCampos(nuevo)){ //nuevo da error
                  //    return false;
                  }
              }
              
            } 
        return true;
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Personajes = new javax.swing.JTable();
        btn_Escoger = new javax.swing.JButton();
        lbl_userLevel = new javax.swing.JLabel();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escoger personajes para jugar");
        setMinimumSize(new java.awt.Dimension(755, 456));
        setResizable(false);
        setSize(new java.awt.Dimension(755, 456));

        panel_Fondo.setBackground(new java.awt.Color(102, 0, 102));
        panel_Fondo.setLayout(null);

        table_Personajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Imagen", "Ataque", "Vida", "Campos", "Cantidad", "Escogido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_Personajes);

        panel_Fondo.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 740, 330);

        btn_Escoger.setBackground(new java.awt.Color(0, 0, 0));
        btn_Escoger.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        btn_Escoger.setForeground(new java.awt.Color(204, 0, 204));
        btn_Escoger.setText("Escoger personajes");
        btn_Escoger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EscogerActionPerformed(evt);
            }
        });
        panel_Fondo.add(btn_Escoger);
        btn_Escoger.setBounds(250, 390, 260, 40);

        lbl_userLevel.setBackground(new java.awt.Color(0, 0, 0));
        lbl_userLevel.setFont(new java.awt.Font("VCR OSD Mono", 0, 18)); // NOI18N
        lbl_userLevel.setForeground(new java.awt.Color(204, 0, 204));
        lbl_userLevel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        lbl_userLevel.setOpaque(true);
        panel_Fondo.add(lbl_userLevel);
        lbl_userLevel.setBounds(580, 10, 160, 30);
        panel_Fondo.add(lbl_Fondo);
        lbl_Fondo.setBounds(-260, -150, 0, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EscogerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EscogerActionPerformed
        getValues();
        this.usuario.setWarriors(listaPersonajesUsuario);
        System.out.println(listaPersonajesUsuario);
        
        this.setVisible(false);
        
        campoBatalla_Juego frame = new campoBatalla_Juego(listaPersonajesUsuario);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocation(290, 50);
        frame.setVisible(true);
                
    }//GEN-LAST:event_btn_EscogerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Escoger;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_userLevel;
    private javax.swing.JPanel panel_Fondo;
    private javax.swing.JTable table_Personajes;
    // End of variables declaration//GEN-END:variables
}
