/*
 *  Trabalhando com arquivos: leitura com BufferedReader e FileReader
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\allan\\OneDrive\\Documentos\\entrada.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
