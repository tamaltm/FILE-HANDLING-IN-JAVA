import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class BufferedReaderwriter{
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("I am noob");
            writer.close();

        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String Line;
            while ((Line=reader.readLine())!=null) {
                System.out.println(Line);

           }
            reader.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}