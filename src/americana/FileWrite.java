package americana;
import java.io.*;

public class FileWrite {
    public static void main(String[] args){
        String myfile = "example.txt";

        try {
            FileWriter fileWriter = new FileWriter(myfile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Thank you");
            bufferedWriter.newLine();
            bufferedWriter.close();


            FileReader fileReader = new FileReader(myfile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}