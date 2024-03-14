public class Q29 {
    void middleWay(int[] array1, int[] array2){
        int[] array = new int[2];

        array[0] = array1[1];
        array[1] = array2[1];

        System.out.println(array[0] + " " + array[1]);
    }

    public static void main(String[] args){
        
        Q29 obj = new Q29();
        
        int[] a1 = {1,2,3};
        int[] a2 = {4,5,6};
        
        obj.middleWay(a1, a2);
    }
}