package Homework.Homework1.homework2;

public class ArrayUtil {
    public static void main(String[] args){
        int[] MyArray = {1,5,7,6,9,21,35,37,12,50};
        int i;
        for (i = 0; i < MyArray.length; i++){
            System.out.println(MyArray[i]);
        }
        //Ամենամեծ արժեք
        System.out.println("Maximum value: " + MyArray[MyArray.length - 1]);
        //Ամենափոքր արծեք
        System.out.println("Minimum value: " + MyArray[0]);
    }
}
