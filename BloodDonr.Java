public class BloodDonr(){
    public static void main(String[]args){
        BloodDonr pl=new BloodDonr("Hospital Blood Mangement");
        Scanner scan=new Scanner (System.in):

        MainLoop:{
            while(true){
                System.out.println("Enter 1,To display the ids:Donar id\t\n"+
                "Enter 2,New Donar.\t\n"+Enter 3,to showing the blood donar list\t\n"
                +Enter 0,to exit the system." );
                System.out.println(Enter an option");
                int option=scan.nextInt();
                switch(option){
                    case 1:pl.display();
                    break;

                    case 2:System.out.println("eNTER THE ID");
                    int id=scan.nextInt();
                    String bloodgrp=scan.next();
                    System.out.println("enter blood grp");
                    String bloodgrp=scan.next();
                    //String blooddnr=scan.next();
                    System.out.println("enter blood donar");
                    String blooddnr=scan.next();
                    pl.order(id,bloodgrp,blooddnr);
                    break;



                    case 3:
                    case 2:System.out.println("eNTER THE ID");
                    int id1=scan.nextInt();
                    String bloodgrp1=scan.next();
                    System.out.println("enter blood grp");
                    String bloodgrp1=scan.next();
                    //String blooddnr=scan.next();
                    System.out.println("enter blood donar");
                    String blooddnr1=scan.next();
                    pl.order(id1,bloodgrp1,blooddnr1);
                    break;

                    case 0:
                    break MainLoop;
                    

                }
            }
        }
    }
}