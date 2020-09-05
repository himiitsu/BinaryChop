package main;

import java.util.ArrayList;
import java.util.List;

public class BinaryChop {

    List list = new ArrayList();

    private int keyValue;
    private int leftElement;
    private int rightElement;
    private int middleElement;
    private int result;

    public int chop(int keyValue, List list){
        if(checkListIsEmpty(list) == false){
            return result = -1;
        }
        init(keyValue);
        executeComparison();
        return result;
    }

    private boolean checkListIsEmpty(List list){
        if(!list.isEmpty()){
            this.list = list;
            return true;
        }
        else return false;
    }

    private void init(int keyValue){
        this.keyValue = keyValue;
        leftElement = 0;
        rightElement = list.size() - 1;
    }

    private void executeComparison(){
        middleElement = findMiddleElementIndex(leftElement, rightElement);
        result = compareWithKeyValue(middleElement);
    }

    private int findMiddleElementIndex(int leftElement, int rightElement){
        if (list.size() == 1){
            return 0;
        }
        else {
            return Math.round((leftElement + rightElement) / 2);
        }
    }

    private int compareWithKeyValue(int middleElement){
        if(findMiddleElementValue(middleElement) == keyValue){
            return middleElement;
        }
        else {
            return cutBordersAndCompare(middleElement);
        }
    }

    private int cutBordersAndCompare(int middleElement) {
        if (findMiddleElementValue(middleElement) < keyValue) {
            middleElement = cutBorders("left");
            if(!checkListOnCorrectness(leftElement, rightElement, middleElement)){
                return -1;
            }
            return compareWithKeyValue(middleElement);
        }
        else if (findMiddleElementValue(middleElement) > keyValue) {
            middleElement = cutBorders("right");
            if(!checkListOnCorrectness(leftElement, rightElement, middleElement)){
                return -1;
            }
            return compareWithKeyValue(middleElement);
        }
        else return -1;
    }

    private int cutBorders(String side){
        if(side == "left"){
            leftElement++;
        }
        else if (side == "right"){
            rightElement--;
        }
        return middleElement = findMiddleElementIndex(leftElement, rightElement);
    }

    private boolean checkListOnCorrectness(int leftElement, int rightElement, int middleElement){
        if((leftElement > rightElement) || ((leftElement == rightElement) && (findMiddleElementValue(middleElement) != keyValue))){
            return false;
        }
        else return true;
    }

    private int findMiddleElementValue(int middleElement){
        return (int)list.get(middleElement);
    }
}
