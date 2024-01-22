import java.util.Scanner;
public class SubStringPalindrome {
    private String str;
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        str = sc.nextLine();
    }
    public int isPalindrome(){
        int count = 0;
        String palindrome = "";
        for(int i = 0;i<str.length();i++) {
            for(int j = i+1;j<=str.length();j++){
                String s = str.substring(i,j);
                for(int k=0;k<s.length();k++){
                    palindrome = s.charAt(k)+palindrome;
                }
                if(palindrome.length() !=1 && palindrome.equals(s)){
                    count ++;
                }
                palindrome = "";
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SubStringPalindrome substring = new SubStringPalindrome();
        substring.getInput();
        System.out.println(substring.isPalindrome());
    }
}