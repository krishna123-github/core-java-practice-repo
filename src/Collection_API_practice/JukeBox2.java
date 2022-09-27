package Collection_API_practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class JukeBox2 {

    ArrayList<Song> songs = new ArrayList<Song>();         // here I change String to Song..because it have multiple properties

    public static void main(String[] args) throws IOException {
//        createFile();
        new JukeBox2().go();
    }

    private void go() throws FileNotFoundException, IOException {
        getSongList();
        System.out.println("Songs list before Sort = " + songs);

        Collections.sort(songs);
        System.out.println("Song list after Sort = " + songs);
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
        Song nextSong = new Song(list[0], list[1], list[2], list[3]);
        songs.add(nextSong);
    }
//
//    private static void createFile() throws IOException {
//        File f = new File("songList.txt");
//        f.createNewFile();
//        System.out.println("File create Successfully");
//        FileWriter writer = new FileWriter("songList.txt");
//        BufferedWriter bw = new BufferedWriter(writer);
//        bw.write("Pink Moon/Nick Dreake");
//        bw.newLine();
//        bw.write("Samoersult/Zero");
//        bw.newLine();
//        bw.write("Shiva Moon/Prem");
//        bw.newLine();
//        bw.write("Joshus Circles/BT Deep");
//        bw.newLine();
//        bw.write("Chennel/Afro Celts");
//        bw.newLine();
//        bw.write("Passenger/Headmix");
//        bw.newLine();
//        bw.write("Listem/Tahiti");
//        bw.newLine();
//        System.out.println("Successfully write the file ");
//        bw.close();
//        writer.close();
//    }

}
