import java.util.ArrayList;
import java.util.Scanner;

public class Hm {



    public static class book {


        String name;



        int no_of_days;
        int no_of_rooms;
        int room_quality;
        boolean service;
        boolean laundary;
        boolean spa;


        public void getName(String n){
            this.name=n;
        }
        public void numofdays(int n){
            this.no_of_days=n;
        }
        public void  noofrooms(int n){
            this.no_of_rooms=n;
        }
        public  void roomquality(int n){
            this.room_quality=n;
        }
        public  void setService(boolean n){
            this.service=n;
        }
        public  void setLaundary(boolean n){
            this.laundary=n;
        }
        public void setSpa(boolean n){
            this.spa=n;
        }


    }

    public  static class billstorage{
        ArrayList<String> name=new ArrayList<>();
        ArrayList<Integer> noofday= new ArrayList<>();
        ArrayList<Integer> noofrooms=new ArrayList<>();
        ArrayList<int[]>roomquality= new ArrayList<>();
        ArrayList<int[]>services=new ArrayList<>();
        ArrayList<Integer>totalprice=new ArrayList<>();

        public void  setName(String n){
            name.add(n);

        }
        public void setNoofday(int n){
            noofday.add(n);
        }
        public  void setNoofrooms(int n){
            noofrooms.add(n);
        }
public  void setRoomquality(int[] arr){
            roomquality.add(arr);
}
public  void setServices(int[] arr){
            services.add(arr);
}
public  void setTotalprice(int n){
            totalprice.add(n);
}

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        book p1=new book();
        billstorage b= new billstorage();
        System.out.println("Enter customer name");
        String newuser=sc.nextLine();
        p1.getName(newuser);
        System.out.println("How much days u want to stay?");
        int day= sc.nextInt();
        p1.numofdays(day);
        System.out.println("No of rooms?");
        int rooms=sc.nextInt();
        p1.noofrooms(rooms);
        System.out.println("Now set room quality (1-3) 1 for bronze,2 for silver,3 for gold");
        int price=0;
        for (int i = 1; i <=rooms ; i++) {
            System.out.println("room quality for room : "+i);
            int quality=sc.nextInt();
            if (quality==1){
                price=price+1000;
            }if (quality==2){
                price=price+2000;
            }if (quality==3){
                price=price+3000;
            }
        }
        System.out.println(price*day);
        int totalP=price*day;
        System.out.println("Do you want laundary and spa ? ");
        for (int i = 1; i <=rooms ; i++) {
            System.out.println("(for laundary :1 and for spa :2 or for both :3 )");
            System.out.println("for room : "+i);
            int ser=sc.nextInt();
            if (ser==1){
                totalP=totalP+500;
            }if (ser==2){
                totalP=totalP+1000;
            }
            if (ser==3){
                totalP=totalP+1500;
            }
        }

        System.out.println("total price is :  "+totalP );



    }
}
