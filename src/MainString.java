import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class MainString {
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                System.out.print("Enter a line with comma seperated integers(no space): ");
                String input = in.nextLine(); // exp= 1, 2, 123,44
                StringTokenizer st;
                String delims = ",";
                st = new StringTokenizer(input, delims);
                while (st.hasMoreTokens()) {
                    String n = st.nextToken().trim();
                    System.out.println(n);

            }//end of function main

            String fileName = "C:\\Users\\u31_7007\\Downloads\\data.txt";
        BufferedReader br = null;
                try{
                    br = new BufferedReader(new FileReader(fileName));
                    String line;
                    while((line = br.readLine())!=null){
                        StringTokenizer str = new StringTokenizer(line,",");
                        String name = str.nextToken();
                        String date = str.nextToken();
                        System.out.println("Name: "+ name+", Date: " + date);
                    }
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                finally {
                    if(br!=null){
                        try{
                            br.close();
                        }
                        catch(IOException e){
                            e.printStackTrace();
                        }
                    }
                }


        }//end of class Mai

}
