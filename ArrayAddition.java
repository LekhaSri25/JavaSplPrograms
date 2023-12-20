import java.util.Scanner;
public class ArrayAddition {
    private int[] arr = {1,2,3,4,5,6,7,8,9,10};
    private int key;
    private int sum;
    public void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter key: ");
        key = scan.nextInt();
    }
    public void add() {
        int count = -1;
        for(int j=0;j<key;j++){
            for (int i = count+1; i < arr.length; i = i+key){
                if(i>count){
                    sum += arr[i];
                }
            }
            count++;
            System.out.println(sum);
            sum = 0;
        }
    }
    public static void main(String[] args) {
        ArrayAddition ad = new ArrayAddition();
        ad.getInput();
        ad.add();
    }
}
