package Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class which read txt file and parse it for instructions with arguments
 *
 * @author Alexey Gudinsky
 */
public class ReadTxt extends Reader {
//    private ArrayList<readInstructions> argumentsFromTxt = new ArrayList<readInstructions>();

    private String argumentsFromTxt;
    private String path = "./instructions.txt";
    private String line;

    /**
     * Reads txt file and parse it for instructions with arguments
     *
     * @return get ArrayList or list of instructions's arguments
     */
    public String readInstructions() {
        String line;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return argumentsFromTxt;
    }

    public String getArgumentsFromTxt() {
        return argumentsFromTxt;
    }
}
