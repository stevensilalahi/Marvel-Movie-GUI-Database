import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PostersGui extends JFrame
{
  //************************** Phase 1
   private ImageIcon ironman;
   private JLabel labelIron;
   
   private ImageIcon hulk;
   private JLabel labelHulk;
   
   private ImageIcon ironman2;
   private JLabel labelIron2;
           
   private ImageIcon thor;
   private JLabel labelThor;
           
   private ImageIcon captain;
   private JLabel labelCap;
           
   private ImageIcon avengers;
   private JLabel labelAvg;
   
   //********************* Phase 2
   private ImageIcon ironman3;
   private JLabel labelIron3;  
   
   private ImageIcon thor2;
   private JLabel labelThor2;  
   
   private ImageIcon captain2;
   private JLabel labelCap2; 
   
   private ImageIcon guardians;
   private JLabel labelGuard;
   
   private ImageIcon avengers2;
   private JLabel labelAvg2; 
   
   private ImageIcon antman;
   private JLabel labelAnt;     
   
   public PostersGui()
   {
   }
  public void displayIronMan()
  {
    ironman= new ImageIcon(getClass().getResource("posters/iron1.jpg"));
    labelIron = new JLabel(ironman);
    add(labelIron);
    pack();
    setVisible(true);
    setTitle("Iron Man");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
  }
  public void displayHulk()
  {
   hulk= new ImageIcon(getClass().getResource("posters/hulk.jpg"));
   labelHulk= new JLabel(hulk);
   add(labelHulk);
   pack();
   setVisible(true);
   setTitle("The Incredible Hulk");
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new FlowLayout());
  }
  public void displayIron2()
  {
    ironman2= new ImageIcon(getClass().getResource("posters/iron2.jpg"));
    labelIron2= new JLabel(ironman2);
    add(labelIron2);
    pack();
    setVisible(true);
    setTitle("Iron Man 2");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
  }
 public void displayThor()
 {
   thor= new ImageIcon (getClass().getResource("posters/thor.jpg"));
   labelThor= new JLabel(thor);
   add(labelThor);
   pack();
   setVisible(true);
   setTitle("Thor");
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new FlowLayout());
 }
 public void displayCaptain()
 {
   captain= new ImageIcon(getClass().getResource("posters/cap1.jpg"));
   labelCap= new JLabel(captain);
   add(labelCap);
   setVisible(true);
   pack();
   setTitle("Captain America: The First Avenger");
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new FlowLayout());
 }
 public void displayAvengers()
 {
   avengers= new ImageIcon(getClass().getResource("posters/avg.jpg")); 
   labelAvg= new JLabel(avengers);
   add(labelAvg);
   setVisible(true);
   pack();
   setTitle("The Avengers");
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new FlowLayout());
   
 }
 public void displayIronMan3()
 {
   ironman3= new ImageIcon(getClass().getResource("posters/iron3.jpg"));
   labelIron3= new JLabel(ironman3);
   add(labelIron3);
   setVisible(true);
   pack();
   setTitle("Iron Man 3");
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new FlowLayout());   
 }
 public void displayThor2()
 {
  thor2 = new ImageIcon(getClass().getResource("posters/thor2.jpg"));
  labelThor2= new JLabel(thor2);
  add(labelThor2);
  setVisible(true);
  pack();
  setTitle("Thor: The Dark World");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLayout(new FlowLayout());   
 }
 public void displayCap2()
 {
  captain2 = new ImageIcon (getClass().getResource("posters/captain2.jpg"));
  labelCap2= new JLabel(captain2);
  add(labelCap2);
  setVisible(true);
  pack();
  setTitle("Captain America: The Winter Soldier");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLayout(new FlowLayout());   
 }
 public void displayGuardians()
 {
  guardians = new ImageIcon (getClass().getResource("posters/guardians.jpg"));
  labelGuard= new JLabel(guardians);
  add(labelGuard);
  setVisible(true);
  pack();
  setTitle("Guardians of the Galaxy");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLayout(new FlowLayout());   
 }
 public void displayAvengers2()
 {
  avengers2 = new ImageIcon(getClass().getResource("posters/avg2.jpg"));
  labelAvg2= new JLabel(avengers2);
  add(labelAvg2);
  setVisible(true);
  pack();
  setTitle("Avengers: Age of Ultron");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLayout(new FlowLayout());   
 }
 public void displayAntMan()
 {
  antman = new ImageIcon(getClass().getResource("posters/ant.jpg"));
  labelAnt= new JLabel(antman);
  add(labelAnt);
  setVisible(true);
  pack();
  setTitle("Ant-Man");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLayout(new FlowLayout());   
 }
   
}