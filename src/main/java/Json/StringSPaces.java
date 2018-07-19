package Json;


public class StringSPaces {
    public static String getStringOfSpaces(int n) {
        StringBuilder resultTermString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            resultTermString.append(" ");
        }
       return resultTermString.toString();

    }

}
