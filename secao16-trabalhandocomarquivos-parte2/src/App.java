/*
 * Trabalhando com arquivos (parte 2): escrita em arquivos com FileWriter e BufferedWriter
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String[] new_lines = new String[] { "Roberto", "Darc", "Pedro"};
        String path = "C:\\Users\\allan\\OneDrive\\Documentos\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : new_lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
