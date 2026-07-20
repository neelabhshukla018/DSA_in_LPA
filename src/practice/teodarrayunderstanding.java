package practice;

public class teodarrayunderstanding {
    public static void main(String[] args) {

//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        for (int[] row : arr) {
//            for (int x : row) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }
//    //maximum element

//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        int max=arr[0][0];
//        for (int[] row : arr) {
//            for (int x : row) {
//                if(x>max)
//                max=x;
//            }
//        }
//        System.out.println(max);

        //minimum element
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        int min=arr[0][0];
//        for (int[] row : arr) {
//            for (int x : row) {
//                if(x<min)
//                    min=x;
//            }
//        }
//        System.out.println(min);


        //unique element
        int arr[][] = {{1, 2, 2}, {4, 5, 1}, {7, 7, 9}};

        for(int[] row:arr){
            for(int x:row){

                int count=0;

                for(int[] row2:arr){
                    for(int y:row2){
                        if(x==y){
                            count++;
                        }
                    }
                }
                if (count == 1) {
                    System.out.print(x+" ");
            }
        }




    }
}}
