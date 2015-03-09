package vue;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

/**
 * Created by Maxime on 03/03/2015.
 */
public class InterfaceJeu extends JFrame{
    private JPanel InterfaceJeu;
    private JLabel labelSante;
    private JLabel labelTemps;
    private JLabel labelMot;
    private JLabel labelChunck;

    public InterfaceJeu(){
        super();
        initFenetre();

    }

    public void initFenetre(){
        this.setContentPane(InterfaceJeu);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new DimensionUIResource(600, 400));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public InterfaceJeu(String fichierXML){
        super();
        initFenetre();
    }

}
