import org.w3c.dom.css.Rect;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        /*
        TextRectangle r1 = new TextRectangle(5.2,7.6,"a");
        System.out.println(r1.getText());
        System.out.println(r1.computeScope());
        System.out.println(r1.computeArea());
        r1.display();

        Rectangle r2 = new Rectangle(5.3, 7.8 );
        r2.display();
        System.out.println();
        TextRectangle r3 = new TextRectangle("$");
        Rectangle r4 = new TextRectangle("$$");
        r3.display();
        r4.display();
        f(r3);
        f(r4);
        f(r2);
        System.out.println("toString: " + r2);
        String s1 = "Avi bb", s2 = "bb Avi";
        System.out.println(hashCode(s1));
        System.out.println(hashCode(s2));

         */
        Rectangle r1 = new TextRectangle(5.1, 7.2, "a");
        Rectangle r2 = new TextRectangle(5, 7.2, "b");
        ArrayList<Rectangle> lst = new ArrayList<>();
        lst.add(new Rectangle(5, 7, "blue"));
        lst.add(new TextRectangle(4.9, 7.8, "A"));
        lst.add(r1);
        lst.add(r2);
        for (Rectangle r : lst) {
            r.display();
            System.out.println();
        }
        Collections.sort(lst);
        System.out.println("After Sort");
        for (Rectangle r : lst) {
            r.display();
            System.out.println();
        }

        r1.setLength(-150.0);
        r1.setWidth(1150);





        //System.out.println(r1.equals(r2));
        //System.out.println(r1.hashCode());
        //System.out.println(r2.hashCode());





    }

    public static void f(Rectangle r){
        if( r instanceof TextRectangle)
            System.out.println(((TextRectangle)r).getText());
    }

    public static int hashCode(String s){
        int h = 0;
        for(int i =0; i<s.length();i++){
            h = h*7 +s.charAt(i);
        }
        return h;
    }
}