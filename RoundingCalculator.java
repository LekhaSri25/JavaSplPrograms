import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class RoundingCalculator {
    private double n;
    private String[] num;
    public void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ROUNDING CALCULATOR");
        System.out.println("Enter hundreds for rounding to nearest hundred \n " +
                            "Enter tens for rounding to nearest ten \n " +
                            "Enter ones for rounding to nearest one \n " +
                            "Enter tenths for rounding to nearest tenth \n " +
                            "Enter hundredths for rounding to nearest hundredths \n");
        String choice = scan.nextLine();
        System.out.println("Enter Number : ");
        n = scan.nextDouble();
        String str = String.valueOf(n);
        num = str.split("\\.");
        if(choice.equalsIgnoreCase("hundreds")){
            System.out.println(hundredsRounding());
        }
        if(choice.equalsIgnoreCase("tens")){
            System.out.println(tensRounding());
        }
        if(choice.equalsIgnoreCase("ones")){
            System.out.println(onesRounding());
        }
        if(choice.equalsIgnoreCase("tenths")){
            try {
                System.out.println(tenthsRounding());
            }
            catch (StringIndexOutOfBoundsException e){
                System.out.println("Invalid input");
            }

        }
        if(choice.equalsIgnoreCase("hundredths")){
            try {
                System.out.println(hundredthsRounding());
            }
            catch (StringIndexOutOfBoundsException e){
                System.out.println("Invalid input");
            }
        }
    }
    public int hundredsRounding(){
        String idx = num[0];
        int res;
        String a = String.valueOf(idx.charAt(idx.length()-2));
        int  i = parseInt(a);
        int rem = parseInt(idx)%100;
        if (i >= 5){
            res = parseInt(idx);
            return (res-rem+100);
        }
        else {
            res = parseInt(idx);
            return (res-rem);
        }
    }
    public int tensRounding(){
        String idx = num[0];
        int res;
        String a = String.valueOf(idx.charAt(idx.length()-1));
        int  i = parseInt(a);
        int rem = parseInt(idx)%10;
        if ( i >= 5){
            res = parseInt(idx);
            return (res-rem+10);
        }
        else {
            res = parseInt(idx);
            return (res-rem);
        }
    }
    public int onesRounding(){
        String idx = num[0];
        String idx2 = num[1];
        int res;
        String a = String.valueOf(idx2.charAt(0));
        int  i = parseInt(a);
        if ( i >= 5){
            res = parseInt(idx);
            return (res+1);
        }
        else {
            res = parseInt(idx);
            return res;
        }
    }

    public double tenthsRounding(){
        String idx = num[1];
        String res;
        String a = String.valueOf(idx.charAt(1));
        int  i = parseInt(a);
        if ( i >= 5){
            res = num[0] + "." + idx.charAt(0);
            double result = Double.parseDouble(res);
            return (result + 0.1);
        }
        else {
            res = (num[0] + "." + idx.charAt(0));
            double result = Double.parseDouble(res);
            return result;
        }
    }
    public double hundredthsRounding(){
        String idx = num[1];
        String res;
        String a = String.valueOf(idx.charAt(2));
        int  i = parseInt(a);
        if ( i >= 5){
            res = num[0] + "." + idx.charAt(0)+ idx.charAt(1);
            double result = Double.parseDouble(res);
            return (result + 0.01);
        }
        else {
            res = (num[0] + "." + idx.charAt(0)+ idx.charAt(1));
            double result = Double.parseDouble(res);
            return result;
        }
    }
    public static void main(String[] args) {
        RoundingCalculator rc = new RoundingCalculator();
        rc.getInput();
    }
}