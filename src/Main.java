import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by joe on 12/15/16.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> rawText = ReadFile.readFile("ArtificialLight.rtf");
        ArrayList<String> cleanedText = CleanFile.cleanFile(rawText);
        FindWordOccurrences.findWordOccurrences(cleanedText);


    }
}

