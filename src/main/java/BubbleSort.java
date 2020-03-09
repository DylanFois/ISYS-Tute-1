package main.java;

import java.lang.reflect.Array;

public class BubbleSort {
public static void main(String[] args) {

    //    procedure bubbleSort(A : list of sortable items)
//    n := length(A)
// for i from 0 to N-1 do
//            for j from 0 to N-i-1 do
//            if a[j]>a[j+1] then
//    swap(a[j], a[j+1])
//    endif
//            endfor
//    endfor
//    end procedure

    int[] a = {70,61,72,83,38};
    int[] b = {7,2,76,4,99};
    int[] c = {28,9,13,78,19};
    int[] d = {68,84,41,62,18};


    int n = Array.getLength(a);
    for (int i=0; i<n-1;i++){
        for(int j=0; j<n-i-1; j++){
            if(a[j] > a[j+1]){

            }
        }
    }

}
}

