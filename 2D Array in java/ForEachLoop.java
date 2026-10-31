public class ForEachLoop {
    public static void main(String[] args){
        int[][]  mat = {{1,2,3},{4,5,6},{7,8,9}};

        for( int[] a : mat){ // to traverse 2 d array we will use array type for itetration 
            // now we are considering only first row of 2D Array 
             for(int b : a){
                System.out.print(b+" ");
             }
             System.out.println(); // Adding new line for better Formatting 
        }

    }
}
