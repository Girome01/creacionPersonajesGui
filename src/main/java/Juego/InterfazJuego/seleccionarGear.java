import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class seleccionarGear extends JFrame {
    private JButton jcomp1;
    private JComboBox gearSelection;
    private JTextField jcomp3;
    private JLabel gearName;
    private JLabel gearLlv;
    private JLabel gearRange;
    private JLabel gearDamage;

    public seleccionarGear() {
        //construct preComponents
        String[] gearSelectionItems = {"Item 1", "Item 2", "Item 3"};

        //construct components
        jcomp1 = new JButton ("Button 1");
        gearSelection = new JComboBox (gearSelectionItems);
        jcomp3 = new JTextField (5);
        gearName = new JLabel ("Gear Selected Name");
        gearLlv = new JLabel ("Llv.");
        gearRange = new JLabel ("range");
        gearDamage = new JLabel ("Damage");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 557));
        setLayout (null);

        //add components
        add (jcomp1);
        add (gearSelection);
        add (jcomp3);
        add (gearName);
        add (gearLlv);
        add (gearRange);
        add (gearDamage);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (430, 485, 100, 20);
        gearSelection.setBounds (350, 60, 300, 50);
        jcomp3.setBounds (135, 140, 255, 310);
        gearName.setBounds (485, 145, 295, 45);
        gearLlv.setBounds (485, 220, 100, 25);
        gearRange.setBounds (480, 275, 100, 25);
        gearDamage.setBounds (475, 325, 100, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new seleccionarGear());
        frame.pack();
        frame.setVisible (true);
    }
}
