import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Interview {
    int interviewee;
    int seats;
    Queue<Integer> recep = new LinkedList<>();
    Queue<Integer> waiting = new LinkedList<>();
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of interviewee : ");
        interviewee = sc.nextInt();
        System.out.print("Enter number of seats in waiting room : ");
        seats = sc.nextInt();
    }
    public void addInterviewee(){
        for(int i = 1;i<=interviewee;i++){
            recep.add(i);
        }
        System.out.println( "Reception : "+recep);
    }
    public void addInWaitingRoom(){
        if(waiting.isEmpty()){
            for(int i = 1;i<=seats;i++){
                waiting.add(recep.peek());
                recep.remove(recep.peek());
            }
            System.out.println("Reception : "+recep);
            System.out.println();
            System.out.println("Waiting room : "+waiting);
            System.out.println();
        }
        else{
            waiting.add(recep.peek());
            recep.remove(recep.peek());
            if(!recep.isEmpty()){
            System.out.println("Reception : "+recep);
            System.out.println();
            }
            System.out.println("Waiting room : "+waiting);
            System.out.println();
        }
    }
    public void addInInterviewRoom(){
        if(!waiting.isEmpty()){
            System.out.println("Interview Room : "+waiting.peek());
            System.out.println();
            waiting.remove(waiting.peek());
            if(!waiting.isEmpty() && recep.isEmpty()) {
                System.out.println("Waiting : " + waiting);
                System.out.println();
            }
            if(waiting.isEmpty() && recep.isEmpty()){
                System.out.println("Interview completed successfully!!");
            }
        }
    }
    public void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to start interview : ");
        int n = sc.nextInt();
        if(n == 1){
            while(!recep.isEmpty()){
                addInWaitingRoom();
                addInInterviewRoom();
            }
            while(!waiting.isEmpty()){
                addInInterviewRoom();
            }
        }
    }
    public static void main(String[] args) {
        Interview interview = new Interview();
        interview.getInput();
        interview.addInterviewee();
        interview.start();   }
}