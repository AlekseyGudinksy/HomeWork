package Reader;

import java.util.ArrayList;

/**
 * Class which read command line and parse commands arguments
 *
 * @author Alexey Gudinsky
 */
public class ReadCommandLIne {
//    private ArrayList<readInstructions> argumentsFromXml = new ArrayList<readInstructions>();

    private String argumentsFromCommandLine;
    private String line;

    /**
     * Class which read file and parse file for instructions's arguments
     *
     * @return get ArrayList or list of instructions's arguments
     */
    String getArguments() {

        return argumentsFromCommandLine;
    }

    public String getArgumentsFromCommandLine() {

        return argumentsFromCommandLine;
    }
}
