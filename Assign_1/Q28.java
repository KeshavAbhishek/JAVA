public class Q28 {
    void only14(int[] array){
        boolean permission = true;

        for(int i = 0; i < array.length; i++){
            if(!(array[i] == 1 || array[i] == 4)){
                permission = false;
                break;
            }
        }

        if(permission == true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static void main(String[] args){
        Q28 obj = new Q28();

        int[] array = {1,4,1,4};
        obj.only14(array);
    }
}