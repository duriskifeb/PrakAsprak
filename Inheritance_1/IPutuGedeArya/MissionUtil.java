import java.text.NumberFormat;
import java.util.Locale;

public class MissionUtil {
    public static String formatCurrency(int amount) {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMANY);
        return "Rp." + nf.format(amount);
    }
}