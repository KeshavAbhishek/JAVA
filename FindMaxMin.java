public class FindMaxMin {
    public static void main(String[] args){
        int data[] = {3,2,1,4,5};
        int min = data[0], max = data[0];
        for(int i = 0; i < 5; i++){
            if(min > data[i]){
                min = data[i];
            }

            if(max < data[i]){
                max = data[i];
            }
        }
        System.out.println("Max : " + max + "\n" + "Min : " + min);
    }
}
