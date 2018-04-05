import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
public class MarvelPoster extends JFrame
{
    private final int width= 725;
    private final int length= 300;
    
 //*******PHASE 1
    JPanel panelIron;
    JButton ironman;
    JPanel panelHulk;
    JButton hulk;
    JPanel panelIron2;
    JButton ironman2;
    JPanel panelThor;
    JButton thor;
    JPanel panelCap;
    JButton captain;
    JPanel panelAvg;
    JButton avengers;
//********PHASE 2
    JPanel panelIron3;
    JPanel panelThor2;
    JPanel panelCap2;
    JPanel panelGuard;
    JPanel panelAvg2;
    JPanel panelAnt;
    JButton ironman3;
    JButton thor2;
    JButton captain2;
    JButton guardians;
    JButton avengers2;
    JButton antman;
           
  public MarvelPoster()
    {
        super("Marvel Movie Posters");
        setSize(width, length);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        setVisible(true);
        setLayout(new GridLayout(3,6)); //from awt.
    }
    private void buildPanel()
    {
     //BUILD PANEL---- PHASE 1 MOVIES
        ironman= new JButton("Iron Man");
        ironman.addActionListener(new IronManButton());
        panelIron= new JPanel();
        panelIron.add(ironman);
        add(panelIron);
        
        hulk= new JButton("Hulk"); 
        hulk.addActionListener(new HulkButton());
        panelHulk= new JPanel();
        panelHulk.add(hulk);
        add(panelHulk);
        
        ironman2= new JButton("Iron Man 2"); 
        ironman2.addActionListener(new IronMan2Button());
        panelIron2= new JPanel();
        panelIron2.add(ironman2);
        add(panelIron2);
        
        thor= new JButton("Thor"); 
        thor.addActionListener(new ThorButton());
        panelThor= new JPanel();
        panelThor.add(thor);
        add(panelThor);
        
        captain= new JButton("Captain America"); 
        captain.addActionListener(new CapButton());
        panelCap= new JPanel();
        panelCap.add(captain);
        add(panelCap);
        
        avengers= new JButton("Avengers");
        avengers.addActionListener(new AvengersButton());
        panelAvg= new JPanel();
        panelAvg.add(avengers);
        add(panelAvg);
        
    //BUILD PANEL----- PHASE 2 MOVIES
        ironman3= new JButton("Iron Man 3");
        ironman3.addActionListener(new IronMan3Button());
        panelIron3= new JPanel();
        panelIron3.add(ironman3);
        add(panelIron3);
        
        thor2= new JButton("Thor 2");
        thor2.addActionListener(new Thor2Button());
        panelThor2= new JPanel();
        panelThor2.add(thor2);
        add(panelThor2);
        
        captain2= new JButton("Captain America 2");
        captain2.addActionListener(new Cap2Button());
        panelCap2= new JPanel();
        panelCap2.add(captain2);
        add(panelCap2);
        
        guardians= new JButton("Guardians of the Galaxy");
        guardians.addActionListener(new GuardiansButton());
        panelGuard= new JPanel();
        panelGuard.add(guardians);
        add(panelGuard);
        
        avengers2= new JButton("Avengers 2");
        avengers2.addActionListener(new Avengers2Button());
        panelAvg2= new JPanel();
        panelAvg2.add(avengers2);
        add(panelAvg2);
        
        antman= new JButton("Ant-Man");
        antman.addActionListener(new AntManButton());
        panelAnt= new JPanel();
        panelAnt.add(antman);
        add(panelAnt);
    }
    
    //***** PHASE 1 ACTION LISTENERS*********************************
    private class IronManButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            PostersGui post= new PostersGui();
            post.displayIronMan();
        }
    }
    private class HulkButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            PostersGui post= new PostersGui();
            post.displayHulk();
        }
    }
    private class IronMan2Button implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            PostersGui post= new PostersGui();
            post.displayIron2();
        }
    }
    private class ThorButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            PostersGui post= new PostersGui();
            post.displayThor();
        }
    }
    
    private class CapButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            PostersGui post= new PostersGui();
            post.displayCaptain();
        }
    }
    private class AvengersButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            PostersGui post= new PostersGui();
            post.displayAvengers();
        }
    }
  //************ PHASE 2 ACTIONLISTENERS ********************************  
   private class IronMan3Button implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            PostersGui post= new PostersGui();
            post.displayIronMan3();
        }
    } 
   
   private class Thor2Button implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
          PostersGui post= new PostersGui();
          post.displayThor2();
       }
   }
   private class Cap2Button implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
          PostersGui post= new PostersGui();
          post.displayCap2();
       }
   }
   private class GuardiansButton implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
           PostersGui post= new PostersGui();
           post.displayGuardians();
       }
   }
   private class Avengers2Button implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
           PostersGui post= new PostersGui();
           post.displayAvengers2();
       }
   }
   
  private class AntManButton implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
      {
          PostersGui post= new PostersGui();
          post.displayAntMan();
      }
  }
   
  public static void main(String[] args)
    {
       MarvelPoster poster= new MarvelPoster();
       
       poster.setTitle("Posters");
       poster.setVisible(true);
       poster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}