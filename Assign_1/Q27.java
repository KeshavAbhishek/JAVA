public class Q27 {
    void evenOdd(int[] array, int[] newArray){
        int x = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i]%2==0){
                newArray[x] = array[i];
                x++;
            }
        }

        for(int i = 0; i < array.length; i++){
            if(array[i]%2!=0){
                newArray[x] = array[i];
                x++;
            }
        }
    }
    public static void main(String[] args) {
        Q27 obj = new Q27();
        int[] array = {3,3,2};
        int[] newArray = new int[array.length];
        obj.evenOdd(array, newArray);


        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }
}