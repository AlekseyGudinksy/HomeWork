import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 */

public class Main {
    private static String name;
    private static String type;
    private static String dayOfCreation;
    private static double size;
    private static String list[];
    private static File file;


    public static void main(String[] args) {
        Browse reader = new Browse();
        reader.browseDirectory();
        HtmlTable table = new HtmlTable();
        table.fillTable();

        String currentDirectory = System.getProperty("user.dir");
        Path path = Paths.get(currentDirectory);

        BasicFileAttributes attr;

        try {
            File folder = new File(currentDirectory);
            File[] listOfFiles = folder.listFiles();
            attr = Files.readAttributes(path, BasicFileAttributes.class);
            for (File directoryItem : listOfFiles) {
                String nameList[] = directoryItem.getName();

            }
            System.out.println("Creation date: " + attr.creationTime());
        } catch (IOException e) {
            System.out.println("oops un error! " + e.getMessage());
        }


//   String currentDirectory = System.getProperty("user.dir");
        //      File folder = new File(currentDirectory);
        //    File[] listOfFiles = folder.listFiles();
        //  for (File directoryItem : listOfFiles) {

        // System.out.println(directoryItem.length()/1024.0 );
        // System.out.println(directoryItem.getAbsolutePath());

    }
}


