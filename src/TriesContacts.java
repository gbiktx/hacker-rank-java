import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TriesContacts {

    public static void main(String[] args) {
        // ArrayList<String> contacts = new ArrayList<>();
        StringBuilder contacts = new StringBuilder();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String operation = in.next();
            String value = in.next();
            if (operation.equals("add")) {
                contacts.append(value);
            } else {
                System.out.println(contacts.toString().split(value).length - 1);
                // findPartial(contacts, value);
            }
        }
    }

    private static void findPartial(ArrayList<String> contacts, String value) {
        int c = 0;
        boolean match;
        String contact;
        for (int i = 0; i < contacts.size(); i++) {
            contact = contacts.get(i);
            match = true;
            if (contact.length() > value.length()) {
                for (int j = 0; j < value.length(); j++) {
                    if (contact.charAt(j) != value.charAt(j)) {
                        match = false;
                        break;
                    }
                }
            } else {
                match = false;
            }
            if(match) {
                c++;
            }
        }
        System.out.println(c);
    }

//    private static void findPartial(ArrayList<String> contacts, String value) {
//        int c = 0;
//        Pattern p = Pattern.compile(value);
//        Matcher m;
//        for (int i = 0; i < contacts.size(); i++) {
//            m = p.matcher(contacts.get(i));
//            if (m.find()) {
//                c++;
//            }
//        }
//        System.out.println(c);
//    }
}
