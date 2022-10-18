import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ALMeth {
    public static void main(String[] args) {
        // ArrayList<String> supplyers = new ArrayList<String>();
        // ArrayList<String> product = new ArrayList<String>();
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        int[] ia = { 1, 5, 9, 7, 4, 8, 2, 3, 6, 0, 9, 3, 5, 2, 1, 5, 7, 4, 7, 8, 4, 23, 6, 3, 3, 3, 3, 3, 3, 3 };
        arrList = createArrayList(ia);

        // ArrayList<Integer> list2 = new
        // ArrayList<Integer>(Arrays.asList("1,2,3,4,5,6,7,8,8,6,5"));
        // System.out.println(arrList);
        System.out.println(mode(arrList));

    }

    public static ArrayList<Integer> createArrayList(int[] ia) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < ia.length; i++) {
            temp.add(ia[i]);
        }
        return temp;
    }
    // public static int min(ArrayList<Integer> listy){
    // return Collections.min(listy) ;
    // }

    public static int min(ArrayList<Integer> listy) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < listy.size(); i++) {
            if (listy.get(i) < min) {
                min = listy.get(i);
            }
        }
        return min;
    }

    public static int max(ArrayList<Integer> listy) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < listy.size(); i++) {
            if (listy.get(i) > max) {
                max = listy.get(i);
            }
        }
        return max;
    }

    public static int mode(ArrayList<Integer> listy) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < listy.size() + 1; i++) {
            temp.add(0);

        }
        for (int i = 0; i < listy.size(); i++) {
            temp.set(listy.get(i), temp.get(listy.get(i)) + 1);

        }
        return temp.indexOf(max(temp));
    }
}
