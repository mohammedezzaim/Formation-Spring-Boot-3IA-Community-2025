import java.sql.SQLOutput;
import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
@author Mohammed Ezzaim
**/

public class Main {
    public static void main(String[] args) {
        ResourceBundle data_en = ResourceBundle.getBundle("resources.data_en");
        ResourceBundle data_fr = ResourceBundle.getBundle("resources.data_fr");

        Scanner scanner = new Scanner(System.in);
        boolean isAsk = true;

        while (isAsk) {
            System.out.println("Entrez un mot en anglais et le système fera la traduction (ou 'exit' pour quitter) : ");
            String value = scanner.nextLine();

            if (value.equalsIgnoreCase("exit")) {
                isAsk = false;
                continue;
            }

            String key = getKeyFromValue(data_en, value);

            if (key != null){
                System.out.println("Traduction : " + data_fr.getString(key));
            } else {
                System.out.println("Mot non trouvé dans le dictionnaire.");
            }
        }
    }

    private static String getKeyFromValue(ResourceBundle dataEn, String value) {
        Enumeration<String> keys = dataEn.getKeys();

        while (keys.hasMoreElements()){
            String key = keys.nextElement();

            if (dataEn.getString(key).equalsIgnoreCase(value)) {
                return key;
            }
        }

        return null;
    }
}
