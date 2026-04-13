public class ExceptionExample {

    public static void main(String[] args) {
        int [] arr = {5,15,25,30};
        try{
            System.out.println(arr[3]/0);
        }
        catch(ArithmeticException e){
            System.out.println("divide by zero");
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of Bounds");
            e.printStackTrace();
        }

        catch(Exception e){
            System.out.println(e.toString());
        }

        for(int x: arr)
            System.out.println(x);

        int x = 10, y = 0, div;

        div = x/(y+1);
        System.out.println("The End!!");
        System.out.println("In main");
       try{ f1(5);}
       catch(Exception e){ e.printStackTrace();}

       Rectangle er = new Rectangle(-5,-7);
       er.display();

    }

    public static void f1(int x) throws Exception{
        System.out.println("In f1");
            f2(x);
    }

    public static void f2(int x) throws Exception{
        System.out.println("In f2");

            System.out.println(x/0);



        System.out.println("End of f2");
    }
}
