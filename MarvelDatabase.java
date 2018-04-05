//CS 112 - Programming Style Sheet

/* FINAL PROJECT
   File Name :         MarvelDatabase.java
   Programmer:         Steven Silalahi
   Date Last Modified: May 17 2015

   Problem Statement: (what you want the code to do)
   Creating a database of Marvel movies and its details using GUI
   
   Overall Plan (step-by-step, how you want the code to make it happen):
   1. Create base class of MarvelDatabase
   2. In the base class create a constructor and no-arg constructor, as well
      as mutator and accessors for Title, Year and Director
   3. Create a toString and equals method also
   4. Create MarvelGuiSample class, to create the GUI database menu. Containing
      1 panel, JLabels, JButtons and JTextField.
   5. Create actionListeners to connect the buttons to function. 
   6. Create a PostersGui class. This class gets the movie posters from the 
      folder "posters" and also has methods that projects it to the window.
      Make sure to have ImageIcon and JLabel for each movie.
   7. Create a MarvelPoster class where it creates a GUI displaying buttons
      that will display the posters by calling the methods from PostersGui
      using the ActionListeners. Make sure to have ActionListeners for each
      movie.
   8. Create a MarvelDemo class which is the main class. 
   9 . Enter all the data using the Marvel Database, setting the title, year,
       director and characters, and assign each movie to one object.
  10. Create an ArrayList, and put all the objects in the arrayList.
  11. Use ObjectOutputStream to write each object to a file. That way the file
      is portable.
  12. Create a method in MarvelGuiSample called setArrayList
  13. setArrayList will connect the data to the JTextFields on the Gui, which
      will search the data using the text field. Make sure to typecast
  14. Create an object of type MarvelGuiSample in the demo.
  15. Call the method that creates the Gui from MarvelGuiSample
  16. Set the location relative to: null. So that it projects on the center of
      the screen.
  17. Test running the program by doing the searches.
  18. Test posters make sure they projects properly.
  19. Print results.

 Classes needed and Purpose (Input, Processing, Output)
   main class – MarvelDatabase
   */
public class MarvelDatabase
{
    private int phase;
    private String title, year, character, director;
    
    public MarvelDatabase()
    {
    }
    public MarvelDatabase(int thePhase, String theTitle, String theYear, 
                                            String characters, String direct)
    {
        title= theTitle;
        year= theYear;
        director= direct;
        phase= thePhase;
        character=characters;
        
    }
    //Mutator
    public void setTitle(String newTitle)
    {
        title= newTitle;
    }
    public void setYear(String newYear)
    {
        year= newYear;
    }
    public void setDirector(String theDirector)
    {
        director= theDirector;
    }
    public void setPhase (int inPhase)
    {
        phase= inPhase;
    }
    public void setCharacter(String heroes)
    {
        character= heroes;
    }
    //Accessors
    public String getTitle()
    {
        return title;
    }
    public String getYear()
    {
        return year;
    }
    public String getDirector()
    {
        return director;
    }
    public int getPhase()
    {
        return phase;
    }
    public String getCharacter()
    {
        return character;
    }
    
    public String toString()
    {
        return  "Title        : "+title+ 
                "\nYear         : "+year+
                "\nDirector     : "+director+
                "\nPhase        : "+phase+
                "\nCharacters   : "+character;
    }
}
