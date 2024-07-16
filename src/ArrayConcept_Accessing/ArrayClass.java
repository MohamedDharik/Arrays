import java.util.Arrays;

public class ArrayClass{
    int[] arr = null;

    public ArrayClass(int size){
        arr = new int[size];
        for(int i = 0; i < size ;i++ ){
            arr[i]= Integer.MIN_VALUE;
        }
    }
    public void add(int position , int value){
        if(arr[position]== Integer.MIN_VALUE){
            arr[position] = value;
        }
        else{
           System.out.println("ALREADY OCCUPIED");
        }
    }

    public void traversal(){
        for(int j =0 ; j < arr.length ; j++){
            System.out.println(arr[j]+ " ");
        }
    }
}