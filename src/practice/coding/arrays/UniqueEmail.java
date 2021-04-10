package practice.coding.arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class UniqueEmail {

    public static int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmail = new HashSet<>();
        for(String email: emails) {
            int i = email.indexOf('@');
            String local = email.substring(0,i);
            String rest = email.substring(i);
            if(local.contains("+")) {
                local = local.substring(0,local.indexOf('+'));
            }
            local = local.replaceAll(".","");
            uniqueEmail.add(local + rest);
        }
        return uniqueEmail.size();
    }

    public static void main(String[] s) {
        String [] emails = new String [] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.print(numUniqueEmails(emails));
    }
    
}
