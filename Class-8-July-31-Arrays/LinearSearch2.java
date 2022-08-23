public class LinearSearch2 {
    public static void main(String[] args){
        int []arr={ 10, 20, 30, 40};
        int key=70;
        
        for(int i=0;i<arr.length;i++)
        {
            if(key == arr[i])
            {
                System.out.println("key found at index "+ i);
                System.exit(0); // Exits when key is found
            }
        }
        System.out.println("key not found");
    }
}
