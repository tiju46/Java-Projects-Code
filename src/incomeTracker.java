import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class incomeTracker {
    int id;
    long amount;

    private static HashMap<Integer,Integer> map = new HashMap<>();

    public void showDue(int userid){
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(userid == entry.getKey()){
                System.out.println(entry.getValue());
            }
            
        }

    }

    public void postAmount(int userid,long postAmount){
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(userid == entry.getKey()){
                map.put(entry.getKey(), (int) (map.get(entry.getKey()) + postAmount));
            }

        }

    }

    public void collectAmount(int userid, long collectAmount){
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(userid == entry.getKey()){
                map.put(entry.getKey(), (int) (map.get(entry.getKey()) - collectAmount));
            }

        }

    }

    public void showOptions(){
        int option;

        System.out.println("1...Show Due");
        System.out.println("2...Post AMount");
        System.out.println("3...Collect Amount");
        System.out.println("4...Exit");
        do{
            System.out.println("Enter Your Choice");
            Scanner scan1 = new Scanner(System.in);
            option = scan1.nextInt();
            switch (option){
                case 1:
                    System.out.println("....Due For Your Unit....");
                    System.out.println("Enter your id number");
                    Scanner scan2 = new Scanner(System.in);
                    id = scan2.nextInt();
                    showDue(id);
                    break;
                case 2:
                    System.out.println("....Amount Posting....");
                    System.out.println("Enter your id");
                    Scanner scan3 = new Scanner(System.in);
                    id = scan3.nextInt();
                    System.out.println("Enter amount to post");
                    Scanner scan4 = new Scanner(System.in);
                    amount = scan4.nextInt();
                    postAmount(id,amount);
                    break;
                case 3:
                    System.out.println("....Collect Amount....");
                    System.out.println("Enter your id");
                    Scanner scan5 = new Scanner(System.in);
                    id = scan5.nextInt();
                    System.out.println("Enter amount to collect");
                    Scanner scan6 = new Scanner(System.in);
                    amount = scan6.nextInt();
                    collectAmount(id,amount);
                    break;


            }



        }while (option!=4);
    }

    public static void main(String[] args) {
        incomeTracker inc = new incomeTracker();
        map.put(123, 100);
        map.put(124, 200);
        map.put(125, 300);

        inc.showOptions();
    }

}
