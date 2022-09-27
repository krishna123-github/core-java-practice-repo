//package File_Handling;
//
//import java.io.BufferedInputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import static java.lang.System.exit;
//import java.util.Scanner;
//import javazoom.jl.player.Player;
//
//public class Read_mp3_file {
//
//    public static void main(String[] args) {
//        try {
//            File file = new File("E:\\dowload\\Rubaru.mp4");
//            FileInputStream fis = new FileInputStream(file);
//            
//            BufferedInputStream bis = new BufferedInputStream(fis);
//            
//            Player player = new Player(bis);
//            Scanner kb = new Scanner(System.in);
//            System.out.print("Do You want to play song: ");
//            String choose = kb.next();
//            if(choose.equals("y") || choose.equals("Y")){
//                player.play();
//            }
//            else{
//                exit(0);
//            }
////            player.play();
//            player.close();
//        } catch (Exception e) {
//            System.out.println("Error");
//        }
//    }
//
//}
