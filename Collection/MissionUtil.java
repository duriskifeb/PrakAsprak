package Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asthiseta
 */
public class MissionUtil {
    static BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

    public static String getUserInput() {
        String input = "";
        try {
            input = inputReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(MissionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return input;
    }
}