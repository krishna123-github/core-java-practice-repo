package String;

public class RemoveCharacter {

    public static void main(String[] args) {
        String str = "krishna pal patel";
        String s = str.replaceAll(Character.toString('a'), "--");       // jaha bi 'a' milega sb ko modify kr dega 
        System.out.println(s);

        String s1 = str.replaceFirst(Character.toString('a'), "---");    // String me first me 'a' milega usi ko bs modify karega 
        System.out.println(s1);

        String s2 = str.replaceAll("a", "===");
        System.out.println(s2);

        String s3 = str.replace('a', 'O');      // ya  (character, character)  lo
        System.out.println(s3);
        
        String s4 = str.replace("pal", "pooja");   // ya (String, String)  lo
        System.out.println(s4);
        
        
    }
}
