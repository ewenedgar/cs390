
/**
 * @author Edgar Ntende
 * 615930
 */


import java.util.*;

public class Prog1{
    static Random random;


    /**
     *  Use this method to get a random integer, with a call like this:
     *     int myInt = RandomNumbers.getRandomInt();
     */
    public static int getRandomInt() {
        if(random == null) new RandomNumbers();
        return random.nextInt();
    }
    /**
     * Returns a random integer x satisfying
     * lower <= x <= upper. If lower > upper, returns 0.
     * @param lower
     * @param upper
     * @return
     */
    public static int getRandomInt(int lower, int upper) {
        if(lower > upper) return 0;
        if(lower == upper) return lower;
        int difference = upper - lower;
        int start = getRandomInt();

        //nonneg int in the range 0..difference - 1
        start = Math.abs(start) % (difference+1);

        start += lower;
        return start;
    }

    // qn 2
    public static void prog2(String str) {
        String[] str1 = str.split(":");
        for (String i : str1) {
            System.out.println(i.substring(0, i.indexOf(',')));
        }

    }
    // qn 3
    public static void removeDups(String[] str) {
        String[] str2 = new String[str.length];
        for (int i = 0; i < str.length - 1; i++) {
            for (int x = 0; x < str2.length - 1; x++) {
                if (str[i] == str2[x])
                    break;
                if (str[i] != str2[x]) {
                    str2[i] = str[i];
                }
            }
        }
        System.out.println(Arrays.toString(str2));
    }
    // qn 4
    public static void sumFloats() {
        float x = (float) 1.27, m = (float) 3.881, n = (float) 9.6;
        float sum = x + m + n;

        System.out.println((int) sum);
        System.out.println(Math.round(sum));

    }
    // qn 5
    public static int[] combine(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0;
        for (; i < a.length; i++) {
            res[i] = a[i];
        }
        for (int n = 0; n < b.length; n++, i++) {
            res[i] = b[n];
        }
        return res;
    }
    // qn 6
    public static int minNum(int[] arrayOfInts) {
        int min1 = arrayOfInts[1];

        for (int i = 0; i < arrayOfInts.length; i++) {
            /* if (arrayOfInts[i] < min1)
                min1 = arrayOfInts[i]; */
            min1 = Math.min(min1, arrayOfInts[i]);
        }
        return min1;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Random 1..9: " + Math.pow(Math.PI, 1 + (double) Prog1.getRandomInt(9,1)));

        double res = Math.pow((3 + (double) Prog1.getRandomInt(14,3)), Math.PI);
        System.out.println("Random 3..14: " + res);

        String records = "231A,Light Bulb,123,Wilco,1.75:" +
                "113D,Hairbrush,19,Aamco,3.75:" +
                "521W,Shampoo,24,Acme,6.95:" +
                "440Q,Dishwashing Detergent,20,Wilco,1.75:" +
                "009G,Toothbrush,77,Wilco,0.85:" +
                "336C,Comb,34,Wilco,0.99:" +
                "523E,Paper Pad Set,109,Congdon and Chrome,2.45:" +
                "888A,Fake Diamond Ring,111,AmericusDiamond,3.95:" +
                "176A,Romance Nove1 1,20,Barnes and Noble,3.50:" +
                "176B,Romance Nove1 2,20,Barnes and Noble,3.50:" +
                "176C,Romance Nove1 3,20,Barnes and Noble,3.50:" +
                "500D,Floss,44,Wilco,1.25:" +
                "135B,Ant Farm,5,Wilco,8.00:" +
                "211Q,Bicycle,9,Schwinn,75.95:" +
                "932V,Pen Set,50,Congdon and Chrome,9.95:" +
                "678Q,Pencil 50,123,Congdon and Chrome,9.95:" +
                "239A,Colored Pencils,25,Congdon and Chrome,4.75:" +
                "975B,Shower Curtain,25,Wilco,6.50:" +
                "870K,Dog Bowl,15,Wilco,4.75:" +
                "231S,Cat Bowl,15,Wilco,4.75:" +
                "562M,Kitty Litter,15,Wilco,3.25:" +
                "777X,Dog Bone,15,Wilco,4.15:" +
                "933W,Cat Toy,15,Wilco,2.35:" +
                "215A,Hair Ball,0,Little Jimmy,0.00:";

       
        System.out.println("\n QN2");
    // qn 2
    Prog1.prog2(records);
        System.out.println("\n QN3");

    // qn 3
    String[] rem = {"horse", "dog", "cat", "horse", "dog"};
    Prog1.removeDups(rem);
        System.out.println("\n QN4");

    // qn 4
    Prog1.sumFloats();
        System.out.println("\n QN5");

    // qn 5
    int[] a = {5,6,-4,3,1};
     int[] b = {3,8,9,11};
     System.out.println(Arrays.toString(Prog1.combine(a, b)));
        System.out.println("\n QN6");
    
    // qn 6
    int[] minArr = { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22 };
    System.out.println(Prog1.minNum(minArr));
        System.out.println("\n");


    }

    
    
    
}