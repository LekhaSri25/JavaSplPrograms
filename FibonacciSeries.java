import java.util.Scanner;

public class FibonacciSeries {
    private int limit;
    private int firstNum = 0;
    private int secondNum = 1;
    private int fibonacciNum = 0;
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit : ");
        limit = sc.nextInt();
    }
    public void printFibonacci(){
        System.out.println(firstNum+"\n"+secondNum);
        while(fibonacciNum < limit){
            fibonacciNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = fibonacciNum;
            if(fibonacciNum < limit) {
                System.out.println(fibonacciNum);
            }
        }
    }
    public static void main(String[] args) {
        FibonacciSeries fs = new FibonacciSeries();
        fs.getInput();
        fs.printFibonacci();
    }
}