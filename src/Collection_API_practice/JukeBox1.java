package Collection_API_practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class JukeBox1 {

    ArrayList<String> songs = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        createFile();
        new JukeBox1().go();
            }

    private void go() throws FileNotFoundException, IOException {
        getSongList();
        System.out.println("Songs list before Sort = "+ songs);
        
        Collections.sort(songs);
        System.out.println("Song list after Sort = "+songs);
    }

    private void getSongList() throws FileNotFoundException, IOException {
        FileReader reader = new FileReader("songList.txt");
        BufferedReader br = new BufferedReader(reader);
        String str = null;
        while((str = br.readLine()) !=null){
            addSong(str);
        }
    }
       private void addSong(String str) {
           String[] list =  str.split("/");
           songs.add(list[0]);
       }


    private static void createFile() throws IOException {
        File f = new File("songList.txt");
        f.createNewFile();
        System.out.println("File create Successfully");
        FileWriter writer = new FileWriter("songList.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("Pink Moon/Nick Dreake");
        bw.newLine();
        bw.write("Samoersult/Zero");
        bw.newLine();
        bw.write("Shiva Moon/Prem");
        bw.newLine();
        bw.write("Joshus Circles/BT Deep");
        bw.newLine();
        bw.write("Chennel/Afro Celts");
        bw.newLine();
        bw.write("Passenger/Headmix");
        bw.newLine();
        bw.write("Listem/Tahiti");
        bw.newLine();
        System.out.println("Successfully write the file ");
        bw.close();
        writer.close();
    }

 
}
