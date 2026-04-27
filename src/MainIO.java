import java.io.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person = new Person("Avi", 36);
        ObjectOutputStream out = null;

        try{
            out = new ObjectOutputStream(new FileOutputStream("data.ser"));
            out.writeObject(person);
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally {
            if(out!=null){
                try{
                    out.close();
                }
                catch(IOException e){
                    System.out.println(e);
                }
            }
        }

        ObjectInputStream in = null;
        Person person2 = null;
        try{
            in = new ObjectInputStream(new FileInputStream("data.ser"));
             person2 = (Person)in.readObject();
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        finally {
            if(in !=null){
                try{
                    in.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

        System.out.println(person2);





    }
}