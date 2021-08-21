import java.util.*;

public class facilityBooking {



    //String array[] = new String[]{"Gym","Hall","Pool","Auditorium"};

    int bookingoption;
    int cancelfac;
   private static HashMap<Integer,String> map = new HashMap<>();
    private static HashMap<Integer,String> tempmap = new HashMap<>();

    public void showFac(){

        for (Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getValue());
        }

    }
    public HashMap<Integer, String> bookfac(int booking){
        if (booking == 1){
            tempmap.remove(1);
        }else if(booking == 2){
            tempmap.remove(2);
        }else if(booking == 3){
            tempmap.remove(3);
        }
        return tempmap;

    }

    public void options() {

        int opt;

        System.out.println("1.Show Facilities");
        System.out.println("2.Book Facilities");
        //System.out.println("3.Facilities Booked");
        System.out.println("3.Available Facilities");
        System.out.println("4.Cancel Facility");
        System.out.println("5.Facilities Cancelled");
        System.out.println("6.Exit");
        do {
            System.out.println("Enter your option");
            Scanner scn =new Scanner(System.in);
            opt = scn.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Facilities Available For Booking");
                    showFac();
                    break;
                case 2:
                    System.out.println(".....Select Facilities for Booking.....");
                    showFac();
                    System.out.println("Choose Facility by entering number from 1 to 3");
                    Scanner scan = new Scanner(System.in);
                    bookingoption = scan.nextInt();
                    bookfac(bookingoption);
                    System.out.println("Facility booked successfully...." +map.get(bookingoption));
                    break;
                case 3:
                    System.out.println("Available Facilities"   +tempmap);
                    break;
                case 4:
                    System.out.println("Select facilities booked To Cancel ");
                    System.out.println("Booked .." +map.get(bookingoption));
                    System.out.println("Enter Facility number to cancel");
                    Scanner scancancel = new Scanner(System.in);
                    cancelfac = scancancel.nextInt();
                    if(cancelfac == 1){
                        tempmap.put(1,"1.Gym");
                    }else if(cancelfac ==2){
                        tempmap.put(1,"2.Pool");
                    }else if(cancelfac == 3){
                        tempmap.put(1,"3.Hall");
                    } else System.out.println("Enter valid inout");
                    System.out.println("Facility booking cancelled");
                    break;
                case 5:
                    System.out.println("Facilities Cancelled");
                    System.out.println(map.get(cancelfac));
                    break;
                case 6:
                    break;
                    default:
                        System.out.println("Enter Valid Input");


            }
        }while(opt != 6);

    }

    public static void main(String[] args) {
        facilityBooking fb = new facilityBooking();
        map.put(1, "1.Gym");
        map.put(2, "2.Pool");
        map.put(3, "3.Hall");
        tempmap.put(1, "1.Gym");
        tempmap.put(2, "2.Pool");
        tempmap.put(3, "3.Hall");
        fb.options();

    }

}
