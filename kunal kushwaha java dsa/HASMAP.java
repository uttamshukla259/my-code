import java.util.*;

public class HASMAP {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 87);
        hm.put(2, 8755);
        hm.put(3, 874);
        System.err.println(hm.get(1));
        System.err.println(hm.getOrDefault(5, -1));
        System.err.println(hm);
        hm.remove(3);
        hm.containsKey(2,8755);
        System.err.println(hm);
        // int arr[] = { 1, 2, 3, 4, 5, 6, 6 };
        // for (int x : arr) {
        //     System.err.print(x+" ");
        // }
        //         for (int x : hm.keySet()) {
        //             // System.err.print(x+" ");
        //     System.err.println(x +">>"+ hm.get(x));
        // }
        for (int x : hm.values()) {
    System.err.println(x);
}
    }
}
