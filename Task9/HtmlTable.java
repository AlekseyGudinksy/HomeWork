import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Build HTML table
 * Display folder properties
 */
public class HtmlTable {
    private final String NAME = "ИМЯ";
    private final String TYPE = "ТИП";
    private final String DAYOFCREATION = "ДАТА СОЗДАНИЯ";
    private final String SIZE = "РАЗМЕР (в Kb)";

    private final String ENCODING_OF_TEXT = "utf-8";
    private final String FONT = "Helvetica";
    private final String BORDERCOLOR = "#fffff";
    private final String HEADERCOLOR = "#cecfce";
    private final String COLOR_OF_FIRST_LINE = "";
    private final String COLOR_OF_SECOND_LINE = "";
    private final String COLOR_OF_GRID = "#fffff";


    private final String HEADER = "<html>\n" +
            "<body>\n" +
            "<title>Folder Table</title>\n" +
            "<meta  charset=\"" + ENCODING_OF_TEXT + "\"/>\n" +
            "<font face=\"" + FONT + "\">\n" +
            "<table border=\"0\" bgcolor=\"" + BORDERCOLOR +
            "\" height=\"108px\" width=\"595,276\" align=\"center\"\n" +
            " cellspacing = \"1\" cellpadding=\"1\">\n" +
            "     <tr  bgcolor=\"" + HEADERCOLOR + "\" align=\"center\">\n" +
            "        <TH valign=\"top\" >" + NAME + "</TH>\n" +
            "        <TH valign=\"top\">" + TYPE + "</TH>\n" +
            "        <TH valign=\"top\" > <div>" + DAYOFCREATION + "</div> </TH>\n" +
            "        <TH valign=\"top\">" + SIZE + "</TH>\n" +
            "    </tr>\n" +
            "      <tr height = \"1px\"  bgcolor=\"" + COLOR_OF_GRID + "\">\n" +
            "        <td></td>\n" +
            "        <td></td>\n" +
            "        <td></td>\n" +
            "        <td></td>\n" +
            "    </tr>";

    private final String BOTTOM = "    </table>\n" +
            "    </font>\n" +
            "    </body>\n" +
            "    </html>";

    // Browse read = new Browse();

    /**
     * Adds lines with options o files and directories
     */
 //   public void addLineToTable() {
        String line = "<tr bgcolor=" + COLOR_OF_FIRST_LINE + "\">\n" +
                "        <td>" + NAME + "</td>\n" +
                "        <td>" + TYPE + "</td>\n" +
                "        <td>" + DAYOFCREATION + "</td>\n" +
                "        <td>" + SIZE + "</td>\n" +
                "    </tr>";
   // }

    /**
     * Connect Header + line + Bottom
     */
    public void fillTable() {
        String html = HEADER + line + BOTTOM;
        File Table = new File("/Users/alex/IdeaProjects/HelloName/src/bsu/rfikt/tat/ProjectHTML/HtmlTable.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(Table));
            bw.write(html);
            bw.close();
        } catch (IOException table) {
            table.printStackTrace();
        }
    }
}