import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;
public class MarvelGuiSample extends JFrame
{
   private JPanel panel;
   //ARRAYLIST
    ArrayList movies;
    
    private JLabel hero;
    private JLabel year;
    private JLabel director;
    private JLabel title;
    
    private JButton posters;
    private JLabel welcome;
    
    private JTextField textTitle;
    private JTextField textDirector;
    private JTextField textYear;
    
    private JButton phase1Button;
    private JButton phase2Button;
    
    private JButton searchButton1;
    private JButton searchButton2;
    private JButton searchButton3;
    private JButton searchButton4;
    
    private final int width=300;
    private final int length=350;
    
    //POSTER SECTION
   private JLabel posterLabel;
   
   //Constructor----
    public MarvelGuiSample()
    {
        super("Marvel Cinematic Universe Database");
        
        setSize(width, length);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
       setVisible(true);
     }
    
   //Building panel method
    private void buildPanel()
    {
      //Creating components and what they say
     title= new JLabel("Enter a movie title");
      director= new JLabel("Enter a director's name");
      year= new JLabel ("Enter a year of movie release");
      //Welcome sign
      welcome= new JLabel("Welcome to the MCU Database");
      //Search text fields
      textYear= new JTextField(15);
      textDirector= new JTextField(15);
      textTitle= new JTextField(15);
      //Creating the buttons and they say
      phase1Button= new JButton("Phase 1");
      phase2Button= new JButton("Phase 2");
      searchButton1= new JButton("Go");
      searchButton2= new JButton("Go");
      searchButton3= new JButton("Go");
      searchButton4= new JButton("Go");
      posters= new JButton("Click for Posters window");
      
      //connecting button to function
      phase1Button.addActionListener(new Phase1ButtonListener());
      phase2Button.addActionListener(new Phase2ButtonListener());
      searchButton1.addActionListener(new SearchListener1());
      searchButton2.addActionListener(new SearchListener2());
      searchButton3.addActionListener(new SearchListener3());
      posters.addActionListener(new PosterListener());
      
     //Creating a panel
      panel= new JPanel();
     
    //Adding - Welcome label
      panel.add(welcome);
      // Adding - Title ops
      panel.add(title);
      panel.add(textTitle);
      panel.add(searchButton1);
      // Adding- Year ops
      panel.add(year);
      panel.add(textYear);
      panel.add(searchButton2);
      //Adding - Director ops
      panel.add(director);
      panel.add(textDirector);
      panel.add(searchButton3);
      //Adding phase 1 and phase 2 buttons
      panel.add(phase1Button);
      panel.add(phase2Button);
      //Adding poster button
      panel.add(posters);
      
      add(panel);
    }
  
    //Action Listeners
    private class Phase1ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            for(int i=0; i< movies.size();i++)
            {
                MarvelDatabase temp= (MarvelDatabase) movies.get(i);
                if(temp.getPhase()==1)
                {
                    System.out.println();
                    System.out.println(temp);
                    System.out.println();
                }
            }
        }
    }
    private class Phase2ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
           for(int n=0; n<movies.size();n++)
           {
               MarvelDatabase temp2= (MarvelDatabase)movies.get(n);
               if(temp2.getPhase()== 2)
               {
                   System.out.println();
                   System.out.println(temp2);
                   System.out.println();
                   System.out.println();
               }

           }
        }
    }
    //BUTTON THAT SEARCHES------ TITLE
    private class SearchListener1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            for(int i=0; i<movies.size();i++)
            {
                MarvelDatabase temp3= (MarvelDatabase)movies.get(i);
                if(textTitle.getText().equalsIgnoreCase(temp3.getTitle()))
                  {
                     System.out.println(temp3);
                     System.out.println();
                    ///System.out.println("Would you like to display posters? 1.Yes, 2. No");
                 
                  }
             }
        }
    }
    //BUTTON THAT SEARCHES------ YEAR
    private class SearchListener2 implements ActionListener
    {
       
        public void actionPerformed(ActionEvent e)
        {
            for(int i=0; i<movies.size();i++)
            {
                MarvelDatabase temp4= (MarvelDatabase)movies.get(i);
                if(textYear.getText().equalsIgnoreCase(temp4.getYear()))
                  {
                    System.out.println(temp4);
                    System.out.println();
                   }
           
            }
        }
    }
    
    //BUTTON SEARCHES---- DIRECTORS
    private class SearchListener3 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            for(int i=0; i<movies.size();i++)
            {
                MarvelDatabase temp5= (MarvelDatabase)movies.get(i);
                if(textDirector.getText().equalsIgnoreCase(temp5.getDirector()))
                  {
                     System.out.println(temp5);
                     System.out.println();
                  }
               
            }
        }
    }
    private class PosterListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new MarvelPoster();
        }
    }
    public void setArrayList(ArrayList hero)
    {
       movies= hero;   
    }
 }