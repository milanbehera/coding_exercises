package practice.coding.strings;

public class StrongPassword {

    public static int minNumber(int n, String password) {
        n = password.length();
        int lc=0,uc=0,no=0,sc=0;
        int sum=0;

        String lowercase = ".*[a-z]+.*";
        String uppercase = ".*[A-Z]+.*";
        String num = ".*[0-9]+.*";
        String specialchar = ".*[-!@#$%^&*()+]+.*";
        //Regex for pattern matching

        if(!(password.matches(lowercase)))
            lc++;

        if(!(password.matches(uppercase)))
            uc++;

        if(!(password.matches(num)))
            no++;

        if(!(password.matches(specialchar)))
            sc++;


        sum=lc+uc+sc+no;

        return (sum>(6-n))?sum:(6-n);
    }

    public static void main(String [] s) {
        System.out.println(minNumber(3,"#HackerRank"));
    }
}
