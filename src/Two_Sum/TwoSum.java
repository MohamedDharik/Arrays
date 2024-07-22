
class TwoSum{
    public static int[] TwoSum(int[] array , int target){
        int[] result = new int[array.length];
        for(int i =0; i<array.length; i++){
            for(int j = i+1;j<array.length; j++){
                if(array[i]+array[j] == target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result; 
    }
    public static void main(String[] args){
        int[] array = {2,7,11,15};
        int target = 9;
        int[] result = TwoSum(array,target);
        System.out.println(result[0]+"   "+ result[1]);
        }
}

