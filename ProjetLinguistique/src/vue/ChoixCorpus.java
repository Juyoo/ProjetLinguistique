package vue;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maxime on 02/03/2015.
 */
public class ChoixCorpus extends JFrame implements ActionListener{
    private JPanel choixCorpus;
    private JButton aleatoireButton;
    private JButton retourMenu;
    private JPanel panelNiveau;
    private List<File> listeFichier;

    private List<JButton> listeButtonFichier;

    public ChoixCorpus() {
        listeFichier = rechercheFichier();
        listeButtonFichier = new ArrayList<JButton>();
        creerBoutonFichier();


        this.setContentPane(choixCorpus);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new DimensionUIResource(600, 400));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        retourMenu.addActionListener(this);
    }

    private void creerBoutonFichier() {
        for (File file : listeFichier){
            JButton newButton = new JButton();
            newButton.setName(file.getName());
            newButton.setText(file.getName());
            newButton.addActionListener(this);
            listeButtonFichier.add(newButton);
            panelNiveau.add(newButton);
        }

    }

    private List<File> rechercheFichier() {
        List<File> listeFichiers = new ArrayList<File>();
        File repertoire = new File("C:\\Users\\Maxime\\Documents\\IUT-Fac\\ProjetLinguistique\\src\\xml");
        File[] listeFiles = repertoire.listFiles();

        for (File file : listeFiles){
            if (file.isFile()){
                listeFichiers.add(file);
            }
        }
        return listeFichiers;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Menu")){
            Menu menu = new Menu();
            this.dispose();
        }
        else if (e.getActionCommand().equals("Aleatoire")){
            InterfaceJeu ij = new InterfaceJeu();
            this.dispose();
        }
        else {
            InterfaceJeu ij = new InterfaceJeu(e.getActionCommand());
            this.dispose();
        }
    }

    private void createUIComponents() {
        panelNiveau = new JPanel();
        panelNiveau.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelNiveau.setBackground(new Color(73,200,232));


    }
}
