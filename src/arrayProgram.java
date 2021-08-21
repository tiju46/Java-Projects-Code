public class arrayProgram {



    private static int array1[] = new int[]{10,12,13};
    int array2[] = new int[7];


    public void arraySwap(){
        for (int i = 0; i < array1.length; i++){
                array2[i]=array1[i];
            System.out.print(array2[i]);
            }


    }
        public static void duplicateElement() {
        for (int i = 0; i < array1.length; i++){
            for (int j= i+1; j < array1.length; j++){
                if(array1[i] == array1[j]){
                    System.out.println(array1[j]);
                }
            }
        }

        }
        public static void reverseArray(){
        for (int i = array1.length - 1; i >=0; i--){
            System.out.println(array1[i]);
        }
        }
        static int largestArray() {
        int max= array1[0];

        for (int i = 0; i < array1.length; i++){
            if (array1[i] > max){
                max = array1[i];
            }
        }
        return max;
        }

        public static void sortArray(){
            int temp = 0;
            for (int i = 0; i < array1.length; i++){
            for (int j = i + 1; j < array1.length; j++){
                if(array1[i] > array1[j]) {
                    temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }

        }

            System.out.println("Sorted Array");
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }

        }

    public static void main(String[] args) {
        //duplicateElement();
        //reverseArray();
        //System.out.println(largestArray());
        sortArray();
    }


}
