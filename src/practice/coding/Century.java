package practice.coding;

public class Century {

    static int centuryFromYear(int year) {

        if(year == 0) return 0;

        int century = year%100;

        return century;

    }

    public static void main(String [] s) {

        System.out.println(centuryFromYear(1905));

    }
}
