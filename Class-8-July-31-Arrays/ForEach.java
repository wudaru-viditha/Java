public class ForEach {
    public static void main(String[] args){
        int []arr1D={10,20,30,40};
        //1D for-each loop
        for(int elem:arr1D){
            System.out.print(elem + " ");
        }
        System.out.println();

        //2D for-each loop
        System.out.println("below is 2D array");
        int [][]arr2D = { {1,2,3}, {4,5,6} };
        for(int arr[]:arr2D)
        {
            for(int elem:arr)
            {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
