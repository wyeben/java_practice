package americana.sampling;
   import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class BufferedReaderDemo {

        public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.print("Please enter your name: ");
                String name = reader.readLine();
                System.out.println("Your name is: " + name);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


