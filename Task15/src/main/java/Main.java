import Instructions.*;
import Loger.FillLogFile;
import Reader.DefineReader;
import Reader.ReadJsonFile;
import Reader.ReadTxt;
import Reader.ReadXmlFile;
import Loger.CreateLogFile;

import java.util.ArrayList;


/**
 * Main is an entry point
 *
 * @author Alexey Gudinsky
 */
public class Main {
    /**
     * Creating log file, defining type of input commands and filling log file
     *
     * @param args is an argument of command line
     */
    public static void main(String[] args) {

        final String[] inputline = args;
        ReadTxt rtf = new ReadTxt();
        ReadXmlFile rxf = new ReadXmlFile();
        ReadJsonFile rjf = new ReadJsonFile();
        CreateLogFile clf = new CreateLogFile();
        DefineReader dr = new DefineReader();
        FillLogFile flf = new FillLogFile();
        CheckLinkPresentByHref checkLinkPresentByHref = new CheckLinkPresentByHref();
        CheckLinkPresentByName checkLinkPresentByName = new CheckLinkPresentByName();
        CheckPageContains checkPageContains = new CheckPageContains();
        CheckPageTitle checkPageTitle = new CheckPageTitle();
        Open open = new Open();

        clf.create();
        dr.define(args);
        flf.fill();
    }
}

