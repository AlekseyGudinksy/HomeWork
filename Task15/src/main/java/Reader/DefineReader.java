package Reader;

import Instructions.*;
import Loger.CreateLogFile;

/**
 * CLass which provides choose from what instructions to read :
 * From commandline
 * From txt file
 * From xml file
 * From json file
 *
 * @author Alexey Gudinsky
 */
public class DefineReader {
    final String ZERO_IPUT = "Command line is empty. Commands and arguments required";
    final String TXT = "txt";
    final String XML = "xml";
    final String JSON = "json";
    final String CHECKLINKPRESENTBYHREF = "checkLinkPresentByHref";
    final String CHECKLINKPRESENTBYNAME = "checkLinkPresentByName";
    final String CHECKPAGECONTAINS = "checkPageContains";
    final String CHECKPAGETITLE = "checkPageTitle";
    final String OPEN = "open";

    ReadTxt rtf = new ReadTxt();
    ReadXmlFile rxf = new ReadXmlFile();
    ReadJsonFile rjf = new ReadJsonFile();
    CreateLogFile createLogFile = new CreateLogFile();
    CheckLinkPresentByHref checkLinkPresentByHref = new CheckLinkPresentByHref();
    CheckLinkPresentByName checkLinkPresentByName = new CheckLinkPresentByName();
    CheckPageContains checkPageContains = new CheckPageContains();
    CheckPageTitle checkPageTitle = new CheckPageTitle();
    Open open = new Open();

    /**
     * Method which checks commandline for equal file's type
     * or to commands
     *
     * @param args is an command line argument
     */
    public void define(String[] args) {
        try {
            if (args[0].equals(TXT)) {
                rtf.readInstructions();
                System.out.println(rtf.getArgumentsFromTxt());
            } else if (args[0].equals(XML)) {
                rxf.readInstructions();
                System.out.println(rxf.getArgumentsFromXml());
            } else if (args[0].equals(JSON)) {
                rjf.readInstructions();
                System.out.println(rjf.getArgumentsFromJson());
            } else {
                if (args[0].equals(CHECKLINKPRESENTBYHREF)) {
                    checkLinkPresentByHref.linkPresentByHref();
                }
                if (args[0].equals(CHECKLINKPRESENTBYNAME)) {
                    checkLinkPresentByName.linkPresentByName();
                }
                if (args[0].equals(checkPageContains)) {
                    checkPageContains.pageContains();
                }
                if (args[0].equals(open)) {
                    open.open();
                }
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException zeroInput) {
            System.out.println(ZERO_IPUT);
        }
    }
}
