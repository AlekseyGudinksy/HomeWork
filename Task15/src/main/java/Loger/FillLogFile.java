package Loger;

import Instructions.*;

/**
 * Class which fill statistics from classes-instructions to log file
 *
 * @author Alexey Gudinsky
 */
public class FillLogFile {
    private String logFile;
    private String logFilePath;

    CreateLogFile createLogFile = new CreateLogFile();
    CheckLinkPresentByHref checkLinkPresentByHref = new CheckLinkPresentByHref();
    CheckLinkPresentByName checkLinkPresentByName = new CheckLinkPresentByName();
    CheckPageContains checkPageContains = new CheckPageContains();
    CheckPageTitle checkPageTitle = new CheckPageTitle();
    Open open = new Open();

    FillLogFile(String log, String logPath) {
        logFile = log;
        logFilePath = logPath;
    }

    /**
     * Method which fills log file from classes-instructions
     *
     * @return logfile with written information from classes-commands
     */
    public String fill() {
        return logFile;
    }

    public String getLogfile() {
        return logFile;
    }
}
