import java.util.Scanner;
// user data
static Scanner input = new Scanner(System.in);
static String[] user_full_name = new String[150];
static int [] user_ID = new int [150];
static String[] email_addresses  =new String[150];
static String[] phone_numbers =new String[150];
static String[] Passwords  =new String[150];
static boolean [] Status = new boolean[150];
static long [] Balances = new long [150] ;
static int user_count =0;
static  String [] [] Favorite_contacts =new String[150][5];
static  int [] Favorite_count = new int[150];
// transaction data
static int[] Transaction_IDs =new int [200] ;
static String[] Transaction_senders=new String[200] ;
static String [] Transaction_receivers =new String[200];
static String [] Transaction_amounts=new String[200] ;
static boolean [] Transaction_statuses= new boolean[200];
//admin data
static String[] admin_email = new String[4];
static String[] admin_password =new String[4];
static int admin_count = 0 ;


static  void admin_Login(){
    System.out.print("Enter your email : ");
    input.nextLine();
     String email=input.nextLine();
    System.out.print("Enter your password : ");
    String password=input.nextLine();
    boolean found_admin=false;
    for(int i =0 ; i<admin_count ; i++){
        if(email.equals(admin_email[i]) && password.equals(admin_password[i])) {
            System.out.println("Login Successful");
            found_admin = true;
            admin_panel(i);
        }
    }
    if(!found_admin){
        System.out.println("Login Failed");
    }
}
static void admin_panel(int index){
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

static void user_login(){
            System.out.print("Enter your email :");
            input.nextLine();
            String user_email =input.nextLine();
            System.out.print("Enter your password : ");
            String user_password = input.nextLine();
            boolean user_found =false;
            for(int i =0 ;i<user_count ; i++){
                if(user_email.equals(email_addresses[i]) && user_password.equals(Passwords[i])){
                    System.out.println("Login Successful");
                    user_found=true;
                    user_panel(i);
                    return;
                }
            }
    System.out.println("login failed ");
}
static void user_panel(int index){
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
                searchRecipient(index);
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
static int searchRecipient(int index){
    int recipient_index = -1 ;
    boolean found_recipient=true;
    while (found_recipient){
        System.out.println("1. Search by email");
        System.out.println("2. Search by phone number ");
        System.out.println("3. Go back ");
        System.out.print ("Choose an option : ");
        int search = input.nextInt();
        input.nextLine();
        switch (search){
            case 1 :
                System.out.print("Enter the recipient's email :");
                String recipient_email =input.nextLine();
                for(int i =0 ; i <user_count ; i++) {
                    if (recipient_email.equals(email_addresses[i]) && i != index) {
                        recipient_index = i;
                        System.out.println("Recipient found ");
                        System.out.println("Name : " +user_full_name[recipient_index]);
                        System.out.println("Email :" +email_addresses[recipient_index]);
                        System.out.println("phone number :"+ phone_numbers[recipient_index]);
                        return recipient_index;
                    }
                }
                break;
            case 2 :
                System.out.println("Enter the recipient's phone number : ");
                String recipient_phone_number = input.nextLine();
                for(int i =0 ; i <user_count ; i++) {
                    if (recipient_phone_number.equals(phone_numbers[i]) && i != index) {
                        recipient_index = i;
                        System.out.println("Recipient found ");
                        System.out.println("Name : " +user_full_name[recipient_index]);
                        System.out.println("Email :" +email_addresses[recipient_index]);
                        System.out.println("phone number :"+ phone_numbers[recipient_index]);
                        return recipient_index;
                    }
                }
                break;
            case 3 :
                System.out.println("Going back.... ");
                found_recipient=false;
                break;
            default:
                System.out.println("Invalid choice , Please try again ");

        }
        if(recipient_index!= -1) {
            System.out.println("Recipient Not found  ");
        }
    }
return recipient_index;
}





void main() {
    user_full_name[0] ="belal mohamed salah";
    user_ID[0]= 190000;
    email_addresses[0]="belal@gmail.com";
    phone_numbers[0]="01277190463";
    Passwords[0]="blal_123";
    Status[0]=false;
    Balances[0]=35;
    user_count++;

    user_full_name[1] = "Nada Mostafa";
    user_ID[1] = 190001;
    email_addresses[1] = "Nada@gmail.com";
    phone_numbers[1] = "01207201382";
    Passwords[1] = "Nada_123";
    Balances[1] = 18000;
    Status[1]=true;
    user_count++ ;

    user_full_name[2] = "Abdullah omera";
    user_ID[2] = 190002;
    email_addresses[2] = "Abdullah@gmail.com";
    phone_numbers[2] = "01282545826";
    Passwords[2] = "Abdullah_123";
    Balances[2] = 200999;
    Status[2]=true;
    user_count++;

    user_full_name[3] = "jana";
    user_ID[3] = 190003;
    email_addresses[3] = "jana@gmail.com";
    phone_numbers[3] = "01210912378";
    Passwords[3] = "jana_123";
    Balances[3] = 16000;
    Status[3]=true;
    user_count++;

    admin_email[0]="Malak@gmail.com";
    admin_password[0]="1234";
    admin_count++;

    admin_email[1]="Ahmed@gmail.com";
    admin_password[1]="4567";
    admin_count++;


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
                admin_Login();
                break;
            case 2 :
                user_login();
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