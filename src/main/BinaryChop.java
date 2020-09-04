package main;

import java.util.ArrayList;
import java.util.List;

public class BinaryChop {

    List list = new ArrayList();

    private int key;
    private int left;
    private int right;
    private int mid;

    public int chop(int key, List list){
        if(!list.isEmpty()){
            this.list = list;
        }
        else {
            return -1;
        }
        this.key = key;
        left = 0;
        right = list.size();

        mid = findMiddleIndex(left, right);
        int result = compare(mid);
        return result;
    }


    private int findMiddleIndex(int left, int right){
        if (list.size() == 1){
            return 0;
        }
        else {
            return Math.round((left + right) / 2);
        }
    }

    private int compare(int mid){
        if(findMiddleValue(mid) == key){
            return mid;
        }
        else {
            return compareWithNewSides(mid);
        }
    }

    private int compareWithNewSides(int mid) {
        if (findMiddleValue(mid) < key) {
            left = mid + 1;
            mid = findMiddleIndex(left, right);
            if((left > right) || ((left == right) && (findMiddleValue(mid) != key))){
                return -1;
            }
            return compare(mid);
        }
        else if (findMiddleValue(mid) > key) {
            right = mid - 1;
            mid = findMiddleIndex(left, right);
            if((left > right)  || ((left == right) && (findMiddleValue(mid) != key))){
                return -1;
            }
            return compare(mid);
        }
        else return -1;
    }

    private int findMiddleValue(int mid){
        return (int)list.get(mid);
    }
}
