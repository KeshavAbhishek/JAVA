public class Q26 {

    void withoutTen(int[] array, int[] newArray){
        int i = 0;
        int count = 0;
        while (i < array.length) {
            if(array[i]==10){
                count = count + 1;
            }
            i++;
        }
        i = 0;
        for(int x = 0; x < array.length; x++){
            if(array[x]!=10){
                newArray[i] = array[x];
                i++;
            }
        }
        for(int x = i; x < i + count; x++){
            newArray[x] = 0;
        }

        for(int x = 0; x < newArray.length; x++){
            System.out.print(newArray[x] + " ");
        }
    }
    public static void main(String[] args) {
        Q26 obj = new Q26();
        int[] array = {10,20,10};
        int[] newArray = new int[array.length];
        obj.withoutTen(array, newArray);
    }
}