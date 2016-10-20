import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.io.*;


/**
 * Reads properties of files and directories
 */
public class Browse {

    private String name;
    private String type;
    private String dayOfCreation;
    private double size;

    public static void browseDirectory() {
    /*



    Path path = Paths.get(".");
    BasicFileAttributes attr;
    try

    {
        attr = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Creation date: " + attr.creationTime());
        //System.out.println("Last access date: " + attr.lastAccessTime());
        //System.out.println("Last modified date: " + attr.lastModifiedTime());
    } catch(
    IOException e)

    {
        System.out.println("oops un error! " + e.getMessage());
    }


    String currentDirectory = System.getProperty("user.dir");
    File folder = new File(currentDirectory);
    BasicFileAttributes fileAttributes = new BasicFileAttributes();

    {

        @Override
        public FileTime creationTime () {
        return dayOfCreation;
    }

              public Browse(String name) {
        this.name = name;
    }

    public static void browseDirectory() {
        String userDirectory = System.getProperty("user.dir");
        String path = "/Users/alex/IdeaProjects/HelloName/";
        File folder = new File(path);
        Browse reader = new Browse();
        System.out.println(reader.name);


        File[] listOfFiles = folder.listFiles();
        for (File directoryItem : listOfFiles) {
            name = directoryItem.getName();
            fileAttributes.creationTime(directoryItem);


            directoryItem.listFiles(fileAttributes.creationTime());

        }


        System.out.println(directoryItem.getName());
        System.out.println(directoryItem.length() / 1024.0);

    }
}
*/
    }
}





