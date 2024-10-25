import java.io.PrintWriter;
import java.io.IOException;
public class PrintWriterDemo {
    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter("New File.txt");
            int age = 22;
            pw.printf("Me noob at %d",age);
            pw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
