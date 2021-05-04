package practice.coding.arrays;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        int valleys = 0;
        int level = 0;
        char [] stepArr = path.toCharArray();
        steps = stepArr.length;
        for(int i = 0; i < steps; i++) {
            if(stepArr[i] == 'D') {
                if(level == 0) {
                    valleys ++;
                }
                level --;
            } else {
                level ++;
            }


        }

        return valleys ;
    }

    public static void main(String s[]) {
        String str = "UDUUUDUDDD";
        int steps = 10;
        System.out.print(countingValleys(steps,str));
    }
}
