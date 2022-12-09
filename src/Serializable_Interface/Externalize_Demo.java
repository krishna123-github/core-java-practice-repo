
package Serializable_Interface;
import java.io.*;

/**
 * Externalization means(not markerInterface) - converting to Partial object to
 * byte stream to write that object to File or Network
 *
 * @author krishna
 */
public class Externalize_Demo {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        User u = new User("krishna", 27);

        System.out.println("==== Writing partial  object to file");
        File f = new File("User_externalize.txt");
        ObjectOutputStream o1 = new ObjectOutputStream(new FileOutputStream(f));
        o1.writeObject(u);

        System.out.println("==== Reading partial  object to file");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
        u = (User) in.readObject();
        System.out.println("After De externalization username: " + u.getName() + " and age is:" + u.getAge());

    }
}

class User implements Externalizable {

    private String name;
    private int age;
    private String loginId;
    private String password;

    public User() {
    }

    
    public User(String userName, int age) {
        this.name = userName;
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = in.readInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
