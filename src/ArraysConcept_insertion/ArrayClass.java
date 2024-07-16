
public class ArrayClass{
    int[] arr = null;

    public ArrayClass(int Length){
        arr = new int[Length];
        for(int i = 0 ; i < Length ; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void Insert(int position , int valuetoinsert){
        try{
            if(arr[position] == Integer.MIN_VALUE){
                arr[position] = valuetoinsert;
                System.out.println("Value " + valuetoinsert + " inserted at position " + position);
            }
            else{
                System.out.println("Position " + position + " already occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array !");
        }
    }
}
