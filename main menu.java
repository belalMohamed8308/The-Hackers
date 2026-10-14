import java.util.Scanner;
static Scanner input = new Scanner(System.in);
static String[] user_full_name = {"belal mohamed salah","abdullah omera","jana","nada mostafa"};
static int [] user_ID = {190000,190001,190002,190003};
static String[] email_addresses  ={"belal@gmail.com","adbullah@gmail.com","jana@gmail.com","nada@gmail.com"};
static String[] phone_numbers ={"01277190463","","",""};
static String[] Passwords  = {"blal_123" , "abdullah_123", "jana_123" ,"nada_123"};
static boolean [] Status = {false,true,true,true} ;
static long [] Balances = new long [4] ;
static int[][] Transaction_IDs =new int [4][30] ;
static String[] Transaction_senders=new String[30] ;
static String [] Transaction_receivers =new String[30];
static String [] Transaction_amounts=new String[30] ;
static boolean [] Transaction_statuses= new boolean[30];
static String [] [] Favorite_contacts =new String[4][3];
static void admin_panel(){
    int admin_choice;
    do {
        System.out.println("========= Admin panel =======");
        System.out.println("1. Show Statistics ");
        System.out.println("2. Search User ");
        System.out.println("3. View All Users ");
        System.out.println("4. Update User ");
        System.out.println("5. View All Transactions ");
        System.out.println("6. Block Account ");
        System.out.println("7.Unblock Account ");
        System.out.println("8.View User Details ");
        System.out.println("9. Logout");
        System.out.print("Choose an option ");
        admin_choice = input.nextInt();
        switch (admin_choice){
            case 1 :
                //the method of show statistic
                break;
            case 2 :
                //the method of search user
                break;
            case 3 :
                //the method of view all users
                break;
            case 4 :
                //the method of update user
                break;
            case 5 :
                //the method of show transaction history
                break;
            case 6 :
                //the method of block account
                break;
            case 7 :
                //the method of unblock account
                break;
            case 8 :
                //the method of view user details
                break;
            case 9 :
                System.out.println(" logging out \n Thank you for using our application ");
                break;
            default:
                System.out.println("Invalid choice , please try again ");

            }
    }
            while (admin_choice!=9);
        }
static void user_panel(){
    int user_choice;
    do {
        System.out.println("======== User panel ======== ");
        System.out.println("1. Show Balance ");
        System.out.println("2. Transfer Money ");
        System.out.println("3. Transaction History");
        System.out.println("4. Show Favorite ");
        System.out.println("5. Add Favorite ");
        System.out.println("6. Remove Favorite ");
        System.out.println("7. Search Recipient ");
        System.out.println("8. View Profile ");
        System.out.println("9. Update Profile ");
        System.out.println("10. Logout");
        System.out.print("Choose an option :");
        user_choice = input.nextInt();
        switch (user_choice){
            case 1 :
                //the method of show balance
                break;
            case 2 :
                //the method of transfer money
                break;
            case 3 :
                //the method of transaction history
                break;
            case 4 :
                //the method of show favorite
                break;
            case 5 :
                //the method of add favorite
                break;
            case 6 :
                //the method of remove favorite
                break;
            case 7 :
                //the method of search recipient
                break;
            case 8 :
                //the method of view profile
                break;
            case 9 :
                //the method of update profile
                break;
            case 10 :
                System.out.println(" logging out \n Thank you for using our application ");
                break;
            default:
                System.out.println("Invalid choice , please try again ");
        }
    }
    while (user_choice!=10);
}


void main() {
    int choice;
    do {
        System.out.println("========== Quick pay ==========");
        System.out.println("1.login as Admin ");
        System.out.println("2.login as User ");
        System.out.println("3.Exit");
        System.out.print("Choose an option : ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                admin_panel();
                break;
            case 2 :
                user_panel();
                break;
            case 3 :
                System.out.println("Exiting  \n Thank you for using our application");
                break;
            default:
                System.out.println("Invalid choice , please try again");

        }
    }
        while (choice != 3) ;



}


