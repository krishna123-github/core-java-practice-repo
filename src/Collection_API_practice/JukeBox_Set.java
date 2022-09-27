 
package Collection_API_practice;

import java.io.*;
import java.util.*;

 
public class JukeBox_Set {
     ArrayList<Song_Set> songs = new ArrayList<Song_Set>();         // here I change String to Song..because it have multiple properties

    public static void main(String[] args) throws IOException {
//        createFile();
        new JukeBox_Set().go();
    }
    
    //create here inner class that impleamment Comparator Interface
    class ArtistCompare implements Comparator<Song_Set>{

        @Override
        public int compare(Song_Set o1, Song_Set o2) {
            return o1.getArtist().compareTo(o2.getArtist());
        }
        
    }

    private void go() throws FileNotFoundException, IOException {
        getSongList();
        System.out.println("Songs list before Sort = " + songs);

        Collections.sort(songs);
        System.out.println("Song list after Sort = " + songs);
        
        ArtistCompare ac = new ArtistCompare();
        Collections.sort(songs, ac);
        System.out.println("After Artist Sort : "+songs);
        
        HashSet<Song_Set> hashSet = new HashSet<Song_Set>();
        hashSet.addAll(songs);                    // must override equal() and hashcode() method
        System.out.println("HashSet : "+hashSet);
        
        TreeSet<Song_Set> treeSet = new TreeSet<Song_Set>();
        treeSet.addAll(songs);                      // no need to override equals() and hashcode() method.. tree already sorted out the list
        System.out.println("TreeSet : "+treeSet);
    }

    private void getSongList() throws FileNotFoundException, IOException {
        FileReader reader = new FileReader("songList1.txt");
        BufferedReader br = new BufferedReader(reader);
        String str = null;
        while ((str = br.readLine()) != null) {
            addSong(str);
        }
    }

    private void addSong(String str) {
        String[] list = str.split("/");
        Song_Set nextSong = new Song_Set(list[0], list[1], list[2], list[3]);
        songs.add(nextSong);
    }
}
