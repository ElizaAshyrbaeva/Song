import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Song song = new Song(" Nothing else matters", " Metallika", "So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I don't just say\n" +
                "And nothing else matters\n");
        fileReader();
        try (FileWriter fileWriter = new FileWriter("Song.txt")) {
            fileWriter.write(song.getTitle());
            fileWriter.write(song.getAuthor());
            fileWriter.write(song.getText());
        } catch (IOException e) {
            System.out.println("dfjeb");
        }


    }

    public static void fileReader() {
        try (FileReader fileReader = new FileReader("Song.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}