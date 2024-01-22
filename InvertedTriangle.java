import java.util.Scanner;

public class InvertedTriangle {
    private int n;
    public void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = scan.nextInt();
    }
    public void pattern(){
        for(int i = n; i > 0 ;i--){
            for(int j = 0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 0;k < i ;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvertedTriangle it = new InvertedTriangle();
        it.getInput();
        it.pattern();
    }
}