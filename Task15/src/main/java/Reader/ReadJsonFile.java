package Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class which read json file and parse it for instructions with arguments
 *
 * @author Alexey Gudinsky
 */
public class ReadJsonFile extends Reader {
//    private ArrayList<readInstructions> argumentsFromXml = new ArrayList<readInstructions>();

    private String argumentsFromJson;
    private String path = "./instructions.json";
    private String line;

    /**
     * Read json file and parse it for instructions with arguments
     *
     * @return get ArrayList or list of instructions's arguments
     */
    public String readInstructions() {
        BufferedReader br = null;
        String sCurrentLine;
        try {

            br = new BufferedReader(new java.io.FileReader(path));
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
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
        return argumentsFromJson;
    }

    public String getArgumentsFromJson() {
        return argumentsFromJson;
    }
}
