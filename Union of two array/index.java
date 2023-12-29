import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"
class Main {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6} ;
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            set.add(i);
        }
        System.out.println(set);

    }
}
