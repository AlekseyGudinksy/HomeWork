package Loger;

/**
 * Class which creates log file and next in
 * FillLogFile.class log is filling by information
 * from instructions-classes
 *
 * @author Alexey Gudinsky
 */
public class CreateLogFile {
    String log = "log.txt";
    String path = "./";

    FillLogFile flf = new FillLogFile(log, path);

    /**
     * Method which creates log file
     */
    public void create() {
    }
}
