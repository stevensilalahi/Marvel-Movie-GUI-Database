import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class MarvelDemo implements Serializable
{
    public static void main(String[] args) throws IOException 
   {
        int poster=0;
        Scanner keyboard= new Scanner(System.in);
        //Object from GUI class
        MarvelGuiSample gui= new MarvelGuiSample();
       
      //Movie objects
        //Phase 1
        MarvelDatabase ironman= new MarvelDatabase();
        MarvelDatabase hulk= new MarvelDatabase();
        MarvelDatabase ironman2= new MarvelDatabase();
        MarvelDatabase captain= new MarvelDatabase();
        MarvelDatabase thor= new MarvelDatabase();
        MarvelDatabase avengers= new MarvelDatabase();
        //Phase 2
        MarvelDatabase ironman3= new MarvelDatabase();
        MarvelDatabase thor2= new MarvelDatabase();
        MarvelDatabase captain2= new MarvelDatabase();
        MarvelDatabase guardians= new MarvelDatabase();
        MarvelDatabase avengers2= new MarvelDatabase();
        MarvelDatabase antman= new MarvelDatabase();
        
         try
         {
         
         ObjectOutputStream movieWrite= new ObjectOutputStream(
                                        new FileOutputStream("marvel.dat"));
         movieWrite.writeObject(ironman);
         movieWrite.close();
         System.out.println("Writing to file");
         }
         catch(IOException e)
         {
             System.out.println();
         }
        
        //Creating ArrayList
        ArrayList movies= new ArrayList();
       
        //Adding all objects to ArrayList
        //Phase 1
        movies.add(ironman);
        movies.add(hulk);
        movies.add(ironman2);
        movies.add(thor);
        movies.add(captain);          
        movies.add(avengers);
        //Phase 2
        movies.add(ironman3);
        movies.add(thor2);
        movies.add(captain2);
        movies.add(guardians);
        movies.add(avengers2);
        movies.add(antman);
      
       gui.setArrayList(movies);
       gui.setLocationRelativeTo(null);
       
  //******** MOVIE DATA **************************************************   
        
       //Iron Man 
       ironman.setTitle("Iron Man");
       ironman.setYear("2008");
       ironman.setDirector("Jon Favreau");
       ironman.setPhase(1);
       ironman.setCharacter("\nIron Man /Tony Stark -(Robert Downey Jr.)"+
                "\nJames Rhodes -(Terrence Howard)"
               +"\nPepper Potts -(Gwyneth Paltrow)"
               +"\nObadiah Stan -(Jeff Bridges)"
               +"\nNick Fury -(Samuel L.Jackson)");
     
       System.out.println();
       
       //The Incredible Hulk
       hulk.setTitle("The Incredible Hulk");
       hulk.setYear("2008");
       hulk.setDirector("Louis Leterrier");
       hulk.setPhase(1);
       hulk.setCharacter("\nHulk /Bruce Banner -(Edward Norton)"+
                        "\nBetty Ross -(Liv Tyler)"+
                        "\nAbomination / Emil Blonsky -(Tim Roth)"+
                        "\nGeneral Ross -(William Hurt)");
     
       System.out.println();
       
       //Iron Man 2
       ironman2.setTitle("Iron Man 2");
       ironman2.setYear("2010");
       ironman2.setDirector("Jon Favreau");
       ironman2.setPhase(1);
       ironman2.setCharacter("\nIron Man /Tony Stark -(Robert Downey Jr.)"+
                             "\nPepper Potts -(Gwyneth Paltrow)"+
                             "\nBlack Widow /Natasha Romanoff -(Scarlett Johanssen)"+
                             "\nNick Fury -(Samuel L. Jackson)"+
                             "\nWhiplash /Ivan Vanko -(Mickey Rourke)"+
                             "\nWar Machine /James Rhodes -(Don Cheadle)");
      
       System.out.println();
       
       //Captain America: The First Avenger
       captain.setTitle("Captain America: The First Avenger");
       captain.setDirector("Joe Johnston");
       captain.setYear("2011");
       captain.setPhase(1);
       captain.setCharacter("\nCaptain America /Steve Rogers -(Chris Evans)"+
                            "\nPeggy Carter -(Hayley Atwell)"+
                            "\nRed Skull -(Hugo Weaving)"+
                            "\nBucky Barnes -(Sebastian Stan)"+
                            "\nNick Fury -(Samuel L. Jackon)");
       
     
      System.out.println();
      
      //Thor
      thor.setTitle("Thor");
      thor.setYear("2011");
      thor.setDirector("Kenneth Branagh");
      thor.setPhase(1);
      thor.setCharacter("\nThor -(Chris Hemsworth)"+
                        "\nLoki -(Tom Hiddleston)"+
                        "\nJane Foster -(Natalie Portman)"+
                        "\nHeimdall -(Idris Elba)"+
                        "\nOdin -(Anthony Hopkins)"); 
     
      System.out.println();
      
      //The Avengers
      avengers.setTitle("The Avengers");
      avengers.setYear("2012");
      avengers.setDirector("Joss Wheedon");
      avengers.setPhase(1);
      avengers.setCharacter("\nIron Man /Tony Stark -(Robert Downey Jr.)"+
                            "\nCaptain America /Steve Rogers -(Chris Evans)"+
                            "\nThor -(Chris Hemsworth)"+
                            "\nHulk /Bruce Banner -(Mark Ruffalo)"+
                            "\nBlack Widow /Natasha Romanoff-(Scarlett Johanssen)"+
                            "\nHawkeye /Clint Barton -(Jeremy Renner)"+
                            "\nLoki -(Tom Hiddleston)"+
                            "\nNick Fury -(Samuel L. Jackson)");   
     
      System.out.println();
      
      //Iron Man 3
      ironman3.setTitle("Iron Man 3");
      ironman3.setYear("2013");
      ironman3.setDirector("Shane Black");
      ironman3.setPhase(2);
      ironman3.setCharacter("\nIron Man /Tony Stark -(Robert Downey.Jr)"+
                            "\nPepper Potts -(Gwyneth Paltrow)"+
                            "\nIron Patriot /James Rhodes -(Don Cheadle)"+
                            "\nAldrich Killian -(Guy Pearce)"+
                            "\nThe Mandarin -(Ben Kingsley)");  
      
      System.out.println();
      
      //Thor: The Dark World
      thor2.setTitle("Thor: The Dark World");
      thor2.setYear("2013");
      thor2.setDirector("Alan Taylor");
      thor2.setPhase(2);
      thor2.setCharacter("\nThor -(Chris Hemsworth)"+
                         "\nJane Foster -(Natalie Portman)"+
                         "\nLoki -(Tom Hiddleston)"+
                         "\nOdin -(Anthony Hopkins)"+
                         "\nMalekith -(Christopher Eccleston)"+
                         "\nHeimdall -(Idris Elba)");
      
    
      System.out.println();
      
      //Captain America: The Winter Soldier
      captain2.setTitle("Captain America: The Winter Soldier");
      captain2.setYear("2014");
      captain2.setDirector("Anthony Russo, Joe Russo");
      captain2.setPhase(2);
      captain2.setCharacter("\nCaptain America / Steve Rogers -(Chris Evans)"+
                            "\nWinter Soldier -(Sebastian Stan)"+
                            "\nNick Fury -(Samuel L.Jackson)"+
                            "\nBlack Widow/Natasha Romanoff -(Scarlett Johanssen)"+
                            "\nFalcon/Sam Wilson -(Anthony Mackie)"); 
      
     
     System.out.println();
     
     //Guardians of the Galaxy
     guardians.setTitle("Guardians of the Galaxy");
     guardians.setYear("2014");
     guardians.setDirector("James Gunn");
     guardians.setPhase(2);
     guardians.setCharacter("\nStar Lord -(Chris Pratt)"+
                            "\nGamora -(Zoe Saldana)"+
                            "\nDrax -(Dave Bautista)"+
                            "\nGroot -(Vin Diesel)"+
                            "\nRocket Racoon -(Bradley Cooper)"+
                            "\nRonan the Accuser -(Lee Pace)"+
                            "\nThanos -(Josh Brolin)");     
     
       System.out.println();
       
       //Avengers: Age of Ultron
       avengers2.setTitle("Avengers: Age of Ultron");
       avengers2.setDirector("Joss Wheedon");
       avengers2.setPhase(2);
       avengers2.setYear("2015");
       avengers2.setCharacter("\nIron Man /Tony Stark -(Robert Downey Jr.)"+
                            "\nCaptain America /Steve Rogers -(Chris Evans)"+
                            "\nThor -(Chris Hemsworth)"+
                            "\nHulk /Bruce Banner -(Mark Ruffalo)"+
                            "\nBlack Widow /Natasha Romanoff-(Scarlett Johanssen)"+
                            "\nHawkeye /Clint Barton -(Jeremy Renner)"+
                            "\nNick Fury -(Samuel L. Jackson)"+
                            "\nUltron -(James Spader)"+
                            "\nScarlett Witch /Wanda Maximoff -(Elizabeth Olsen)"+
                            "\nQuicksilver /Pietro Maximoff -(Aaron-Taylor Johnson)"+
                            "\nThe Vision -(Paul Bettany)"+
                            "\nWar Machine /James Rhodes -(Don Chedle)");
       
     System.out.println();
      
      //Ant-Man
      antman.setTitle("Ant-Man");
      antman.setPhase(2);
      antman.setYear("2015");
      antman.setDirector("Peyton Reed");
      antman.setCharacter("\nAnt-Man / Scott Lang -(Paul Rudd)"+
                          "\nHope Van Dyne -Evangeline Lilly"+
                          "\nHank Pym - Michael Douglas");
   
      System.out.println();
   }
}