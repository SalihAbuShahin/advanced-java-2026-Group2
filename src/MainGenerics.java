//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String [] arr1 = {"A","B","C"};
        Integer [] arr2 = {1 ,2,3};
        Double [] arr3 = {1.5,2.6,3.7};

        printArr(arr1);
        printArr(arr2);
        printArr(arr3);
        Node<String> lst = new Node<>("5.0");
        lst.add("12.0");
        lst.add("AAA");
        System.out.println(lst);

        NumericFns<Integer> intObj = new NumericFns<>(6);
        NumericFns<Double> doubleObj = new NumericFns<>(-6.0);
        NumericFns<Float> floatObj = new NumericFns<>(-6.0f);

        System.out.println(intObj.absEqual(doubleObj));
        System.out.println(intObj.absEqual(floatObj));





    }
    /*
    public static void printArr(String [] arr){
        for (String st: arr)
            System.out.print(st + " ");
        System.out.println();
    }

    public static void printArr(int [] arr){
        for (int st: arr)
            System.out.print(st + " ");
        System.out.println();
    }

    public static void printArr(double [] arr){
        for (double st: arr)
            System.out.print(st + " ");
        System.out.println();
    }
    public static void printArr(Object [] arr){
        for(Object o : arr)
            System.out.print(o.toString()+" ");
        System.out.println();
    }
     */

    public static <T> void printArr(T [] arr){
        for( T value: arr)
            System.out.print(value + " ");
        System.out.println();
    }


}