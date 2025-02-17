import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
/*
 * 27. couldnt solve it :(
 * 28.  for(Track filename : tracks) {
        }
 * 29. boolean found = false;
    while(found) {
    if(the keys are in the next place) {
    found = true;
    }}
*  31. int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }

        System.out.println("The sum of numbers from 1 to 10 is: " + sum);    
     */


public class MusicOrganizer 
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    public void multiplesOfFive(){
     //exercise 30
     int firstNumber=10;
      int lastNumber=95;
     int multiple=firstNumber;
      
     while (multiple<=lastNumber && multiple>=firstNumber){
        System.out.println(multiple);
         multiple=multiple+5;
          
       }}
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    public boolean isPrime(int n) { //exercise 33
    if (n < 2) {
        return false;
    }

    int i = 2;
    while (i < n) {
        if (n % i == 0) {
            return false;
        }
        i++;
    }

    return true;
}
    
    public int sum(int a, int b) { //Exercise 32
    int sum = 0;

    while (a<=b) {
        sum=sum+a;
        a++;
    }

    return sum;
}
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        int position=0; //exercise 24
        for(String filename : files) {
            position++;
            System.out.println(position + ": " + filename);
        }
    }
    
    public void listMatching(String searchString)
    {
        boolean found=false;
        for(String filename:files) {
            if(filename.contains(searchString)) {
                //A match.
                System.out.println(filename);
                found=true;
            }
            else if (!found) {
                System.out.println("no file names matched the search");
            }
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.startPlaying(filename);
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    /**
     * Play a file in the collection. Only return once playing has finished.
     * @param index The index of the file to be played.
     */
    public void playAndWait(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.playSample(filename);
        }
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        boolean valid;
        
        if(index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index >= files.size()) {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }
}
