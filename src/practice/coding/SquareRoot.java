package practice.coding;

public class SquareRoot {

    public static int square(int x){
        if (x == 0)
            return 0;
        int left = 1, right = x+1;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }

    public static void main(String[] args)
    {
        int number = 8;
        int root;
        root = square(number);
        System.out.println("Number : "+number);
        System.out.println("Square Root : "+root);
    }
}
