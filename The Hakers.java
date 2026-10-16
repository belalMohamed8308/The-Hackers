import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    //User data
    static String[] user_full_name = new String[150];
    static int [] user_ID = new int[150];
    static String [] email_addresses = new String[150];
    static String[] phone_numbers = new String[150];
    static String[] Passwords = new String[150];
    static long[] Balances= new long[150];
    static int user_count = 0;
    static boolean[] Status = new boolean[150];
    //admin data
    static String[] admin_email = new String[4];
    static String[] admin_password =new String[4];
    static int admin_count = 0 ;
    //Transaction data
    static int[] Transaction_IDs = new int [150];
    static String[] Transaction_senders = new String[150];
    static String[] Transaction_receivers = new String[150];
    static int[] Transaction_amounts = new int[150];
    static boolean[] Transaction_statuses = new boolean[150];
    static int transaction_count = 0;
    //Favorite data
    static  int [] [] Favorite_contacts =new int[150][5];
    static  int [] Favorite_count = new int[150];
    static int index;


    static {
        admin_email[0]="Malak@gmail.com";
        admin_password[0]="1234";
        admin_count++;

        admin_email[1]="Ahmed@gmail.com";
        admin_password[1]="4567";
        admin_count++;

        admin_email[2] ="blal@gmail.com";
        admin_password[2] ="blal_123";
        admin_count++;

        user_full_name[0] = "belal mohamed salah";
        user_ID[0] = 190000;
        email_addresses[0] = "belal@gmail.com";
        phone_numbers[0] = "01277190463";
        Passwords[0] = "belal_123";
        Balances[0] = 35;
        Status[0] = false;
        user_count++;

        user_full_name[1] = "Nada Mostafa";
        user_ID[1] = 190001;
        email_addresses[1] = "Nada@gmail.com";
        phone_numbers[1] = "01207201382";
        Passwords[1] = "Nada_123";
        Balances[1] = 18000;
        Status[1] = true;
        user_count++;

        user_full_name[2] = "Abdullah omera";
        user_ID[2] = 190002;
        email_addresses[2] = "Abdullah@gmail.com";
        phone_numbers[2] = "01282545826";
        Passwords[2] = "Abdullah_123";
        Balances[2] = 200999;
        Status[2] = true;
        user_count++;

        user_full_name[3] = "jana";
        user_ID[3] = 190003;
        email_addresses[3] = "jana@gmail.com";
        phone_numbers[3] = "01210912378";
        Passwords[3] = "jana_123";
        Balances[3] = 16000;
        Status[3] = true;
        user_count++;
    }
    static void admin_panel(int index) {
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
            input.nextLine();
            switch (admin_choice) {
                case 1:
                    showStatistics();
                    break;
                case 2:
                    admin_search();
                    break;
                case 3:
                    viewAllUsers();
                    break;
                case 4:
                    Update_User();
                    break;
                case 5:
                    adminShowTransactionHistory();
                    break;
                case 6:
                    block_Account();
                    break;
                case 7:
                    unblock_Account();
                    break;
                case 8:
                    viewUsersDetalis();
                    break;
                case 9:
                    System.out.println(" logging out \n Thank you for using our application ");
                    break;
                default:
                    System.out.println("Invalid choice , please try again ");

            }
        }
        while (admin_choice != 9);
    }

// Admin methods

    static  void admin_Login(){
        System.out.println("____________________________");
        System.out.print("Enter your email : ");
        String email=input.nextLine();
        System.out.print("Enter your password : ");
        String password=input.nextLine();
        boolean found_admin=false;
        for(int i =0 ; i<admin_count ; i++){
            if(email.equals(admin_email[i]) && password.equals(admin_password[i])) {
                System.out.println("____________________________");
                System.out.println("Login Successful");
                System.out.println("____________________________");
                found_admin = true;
                admin_panel(i);
            }
        }
        if(!found_admin){
            System.out.println("____________________________");
            System.out.println("Login Failed");
            System.out.println("____________________________");
        }
    }
    static void admin_search() {
        System.out.println("____________________________");
        System.out.print("Select Road to Search : ");
        System.out.println("1: ID");
        System.out.println("2: Full name");
        System.out.println("3: email addresses");
        System.out.println("4: phone number");
        //bonus
        System.out.print("Choose an option :");
        int search_admin_input = input.nextInt();
        input.nextLine();
        switch (search_admin_input) {
            case 1:
                System.out.println("____________________________");
                int serach_ID_admin = 0;
                do {
                    System.out.println("____________________________");
                    System.out.print("enter User ID :");
                    serach_ID_admin = input.nextInt();
                    int valid_ID_admin = 0;
                    if (serach_ID_admin >= user_ID[0] && serach_ID_admin <= user_ID[user_count - 1]) {
                        for (int i = 0; i < user_count; i++) {
                            if (user_ID[i] == serach_ID_admin) {
                                valid_ID_admin = user_ID[i];
                                break;
                            }
                        }
                        System.out.println("____________________________");
                        System.out.println("full name :" + user_full_name[valid_ID_admin - user_ID[0]]);
                        System.out.println("balance :" + Balances[valid_ID_admin - user_ID[0]]);
                        System.out.println("email addresses :" + email_addresses[valid_ID_admin - user_ID[0]]);
                        System.out.println("phone number :" + phone_numbers[valid_ID_admin - user_ID[0]]);

                    } else {
                        int search_admin_ID_notFound = 0;
                        System.out.println("Invalid ID");
                        System.out.println("1 :complet search");
                        System.out.println("2 :Exit");
                        search_admin_ID_notFound = input.nextInt();
                        input.nextLine();
                        if (search_admin_ID_notFound == 2) search_admin_ID_notFound = user_ID[0];
                    }
                } while (serach_ID_admin < user_ID[0] || serach_ID_admin > user_ID[user_count - 1]);
                break;

            case 2:
                int valid_Fullname_admin = -14;
                do {
                    System.out.println("____________________________");
                    System.out.print("enter User Full name :");
                    String search_name_admin = input.nextLine();
                    for (int i = 0; i < user_count; i++) {
                        if (search_name_admin.equalsIgnoreCase(user_full_name[i])) {
                            valid_Fullname_admin = i;
                            System.out.println("____________________________");
                            System.out.println("ID :" + user_ID[valid_Fullname_admin]);
                            System.out.println("balance :" + Balances[valid_Fullname_admin]);
                            System.out.println("email addresses :" + email_addresses[valid_Fullname_admin]);
                            System.out.println("phone number :" + phone_numbers[valid_Fullname_admin]);
                        }
                    }
                    int search_admin_name_notFound = 0;
                    if (valid_Fullname_admin == -14) {
                        System.out.println("name no found");
                        System.out.println("1 :complet search");
                        System.out.println("2 :Exit");
                        search_admin_name_notFound = input.nextInt();
                        input.nextLine();
                        if (search_admin_name_notFound == 2) {
                            valid_Fullname_admin = 0;
                        }
                    }
                }
                while (valid_Fullname_admin == -14);
                break;
            case 3:
                int valid_email_admin = -14;
                do {
                    System.out.println("____________________________");
                    System.out.print("enter User email addresses :");
                    String search_email_admin = input.nextLine();
                    for (int i = 0; i < user_count; i++) {
                        if (search_email_admin.equalsIgnoreCase(email_addresses[i])) {
                            valid_email_admin = i;
                            System.out.println("____________________________");
                            System.out.println("user name :" + user_full_name[valid_email_admin]);
                            System.out.println("ID :" + user_ID[valid_email_admin]);
                            System.out.println("balance :" + Balances[valid_email_admin]);
                            System.out.println("phone number :" + phone_numbers[valid_email_admin]);
                        }
                    }
                    int search_admin_email_notFound = 0;
                    if (valid_email_admin == -14) {
                        System.out.println("email no found");
                        System.out.println("1 :complet search");
                        System.out.println("2 :Exit");
                        search_admin_email_notFound = input.nextInt();
                        input.nextLine();
                        if (search_admin_email_notFound == 2) {
                            valid_email_admin = 0;
                        }
                    }
                } while (valid_email_admin == -14);
                break;
            case 4:
                int valid_phone_number_admin = -14;
                do {
                    System.out.println("____________________________");
                    System.out.print("enter User phone number :");
                    String search_Phone_number_admin = input.nextLine();
                    for (int i = 0; i < user_count; i++) {
                        if (search_Phone_number_admin.equalsIgnoreCase(phone_numbers[i])) {
                            valid_phone_number_admin = i;
                            System.out.println("____________________________");
                            System.out.println("User name :" + user_full_name[valid_phone_number_admin]);
                            System.out.println("ID :" + user_ID[valid_phone_number_admin]);
                            System.out.println("balance :" + Balances[valid_phone_number_admin]);
                            System.out.println("email addresses :" + email_addresses[valid_phone_number_admin]);
                        }
                    }

                    int search_admin_phone_notFound = 0;
                    if (valid_phone_number_admin == -14) {
                        System.out.println("phone number no found");
                        System.out.println("1 :complet search");
                        System.out.println("2 :Exit");
                        search_admin_phone_notFound = input.nextInt();
                        input.nextLine();
                        if (search_admin_phone_notFound == 2) {
                            valid_phone_number_admin = 0;
                        }
                    }
                } while (valid_phone_number_admin == -14);
                break;
        }
    }
    static void viewUsersDetalis(){
        admin_search();
    }
    static void viewAllUsers(){
        System.out.println("____________________________");
        for (int i =0 ; i< user_count ; i++){
            System.out.println("name :"+user_full_name[i]);
            System.out.println("ID :"+user_ID[i]);
            if (Status[i]==true)System.out.println("Status : active");
            else System.out.println("Status : blocked");
            System.out.println("____________________________");
        }
    }
    static void Update_User(){
        System.out.println("Choose User");
        for(int i =0 ; i< user_count; i++){
            System.out.println((i+1)+":"+user_full_name[i]);
        }
        System.out.print("Enter your choice :");
        int Update_User_input = input.nextInt();
        int Update_User_input_index = (Update_User_input-1) ;
        input.nextLine();
        System.out.println("____________________________");
        System.out.println("What do you want to edit?");
        System.out.println("1: name");
        System.out.println("2: phone number");
        System.out.println("3: email ");
        System.out.print("Enter your choice :");
        int Update_choice = input.nextInt();
        System.out.println("____________________________");

        System.out.println();
        input.nextLine();
        System.out.println("____________________________");
        switch (Update_choice){
            case 1 :
                System.out.println("old name is :"+user_full_name[Update_User_input_index]);
                System.out.print("enter new name :");
                String Update_name_admin = input.nextLine();
                user_full_name[Update_User_input_index] =Update_name_admin ;
                System.out.println("\nSuccessfully edited");
                System.out.println("now name :"+user_full_name[Update_User_input_index]);
                break;
            case 2 :
                System.out.println("old phone number is :"+phone_numbers[Update_User_input_index]);
                System.out.print("enter new phone number :");
                String Update_phone_number_admin = input.nextLine();
                phone_numbers[Update_User_input_index] =Update_phone_number_admin ;
                System.out.println("\nSuccessfully edited");
                System.out.println("now phone number :"+phone_numbers[Update_User_input_index]);
                break;
            case 3 :
                System.out.println("old email is :"+email_addresses[Update_User_input_index]);
                System.out.print("enter new email :");
                String Update_email_admin = input.nextLine();
                email_addresses[Update_User_input_index] =Update_email_admin ;
                System.out.println("____________________________");
                System.out.println("\nSuccessfully edited");
                System.out.println("now email addresse :"+email_addresses[Update_User_input_index]);
                break;
        }
    }

    static void block_Account(){
        System.out.println("____________________________");
        System.out.println("Select a user :");

        int blocked_idx = -1 ;
        do {
            int number = 1 ;
            for (int i = 0; i < user_count; i++) {
                if (Status[i] == true) System.out.println((number) + ":" + user_full_name[i]);
                if (Status[i] != true) System.out.println((number) + ":" + user_full_name[i]+"    <blocked>");
                number++;
            }
            System.out.print("Enter your choice :");

            blocked_idx = (input.nextInt()-1);
            input.nextLine();

            if(Status[blocked_idx]==false){
                System.out.println("____________________________");
                System.out.println("user is blocked actually");
                System.out.println("1:continue");
                System.out.println("2:Exit");
                System.out.print("Enter your choice :");
                int blocked_input = input.nextInt();
                if(blocked_input==2) break;}

            if(Status[blocked_idx]==true) {
                Status[blocked_idx] = false;
                System.out.println("____________________________");
                System.out.println(user_full_name[blocked_idx] + ": is blocked now");
            }

            if(Status[blocked_idx]==false){
                System.out.println("1:continue");
                System.out.println("2:Exit");
                System.out.print("Enter your choice :");
                int blocked_input = input.nextInt();
                System.out.println("____________________________");
                if(blocked_input==2) break;}

        }
        while (Status[blocked_idx]==false);
    }

    static void unblock_Account(){
        int unblocked_idx = -1 ;
        do {
            int number = 1 ;
            for (int i = 0; i < user_count; i++) {
                if (Status[i] == true) System.out.println((number) + ":" + user_full_name[i]);
                if (Status[i] != true) System.out.println((number) + ":" + user_full_name[i]+"    <blocked>");
                number++;
            }
            System.out.print("Enter your choice :");

            unblocked_idx = (input.nextInt()-1);
            input.nextLine();

            if(Status[unblocked_idx]!=false)
            {
                System.out.println("____________________________");
                System.out.println("user is active actually");
                System.out.println("1:continue");
                System.out.println("2:Exit");
                System.out.print("Enter your choice :");
                int blocked_input = input.nextInt();
                if(blocked_input==2) break;
            }

            if(Status[unblocked_idx]!=true)
            {
                Status[unblocked_idx] = true;
                System.out.println("____________________________");
                System.out.println(user_full_name[unblocked_idx] + ": is active now");
            }

            if(Status[unblocked_idx]!=false)
            {
                System.out.println("1:continue");
                System.out.println("2:Exit");
                System.out.print("Enter your choice :");
                int blocked_input = input.nextInt();
                System.out.println("____________________________");
                if(blocked_input==2) break;
            }

        }
        while (Status[unblocked_idx]!=false);
    }

    static void adminShowTransactionHistory() {
        System.out.print("Enter User ID: ");

        if (!input.hasNextInt())
        {
            System.out.println("Invalid ID.");
            input.nextLine();
            return;
        }

        int searchID = input.nextInt();
        input.nextLine();

        int userIndex = -1;

        for (int i = 0; i < user_count; i++) {
            if (user_ID[i] == searchID) {
                userIndex = i;
                break;
            }
        }

        if (userIndex == -1) {
            System.out.println("User not found.");
            return;
        }

        boolean found = false;

        System.out.println("\n===== TRANSACTION HISTORY =====");
        System.out.println("User: " + user_full_name[userIndex]);
        System.out.println("User ID: " + user_ID[userIndex]);

        for (int i = 0; i < transaction_count; i++) {
            if (user_full_name[userIndex].equals(Transaction_senders[i]) ||
                    user_full_name[userIndex].equals(Transaction_receivers[i])) {

                found = true;

                System.out.println("\nTransaction ID: " + Transaction_IDs[i]);
                System.out.println("Sender: " + Transaction_senders[i]);
                System.out.println("Receiver: " + Transaction_receivers[i]);
                System.out.println("Amount: " + Transaction_amounts[i]);
                System.out.println("Status: " +
                        (Transaction_statuses[i] ? "SUCCESS" : "FAILED"));
                System.out.println("---------------------------");
            }
        }

        if (!found) {
            System.out.println("No transactions found for this user.");
        }
    }
    static void showStatistics() {
        int activeUsers = 0;
        int blockedUsers = 0;
        int successfulTransactions = 0;
        int failedTransactions = 0;
        long totalBalance = 0;
        long totalTransferred = 0;

        for (int i = 0; i < user_count; i++) {
            if (Status[i]) {
                activeUsers++;
            } else {
                blockedUsers++;
            }

            totalBalance += Balances[i];
        }

        for (int i = 0; i < transaction_count; i++) {
            if (Transaction_statuses[i]) {
                successfulTransactions++;
                totalTransferred += Transaction_amounts[i];
            } else {
                failedTransactions++;
            }
        }

        System.out.println("\n------ QUICK PAY STATISTICS ------");
        System.out.println("Total Users: " + user_count);
        System.out.println("Active Users: " + activeUsers);
        System.out.println("Blocked Users: " + blockedUsers);
        System.out.println("Total Balance: " + totalBalance);
        System.out.println("Total Transactions: " + transaction_count);
        System.out.println("Successful Transactions: " + successfulTransactions);
        System.out.println("Failed Transactions: " + failedTransactions);
        System.out.println("Total Money Transferred: " + totalTransferred);
        System.out.println("-------------------------------");
    }

    static void user_panel(int index) {
        int user_choice;
        do {
            System.out.println("========= User panel ========");
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
            switch (user_choice) {
                case 1:
                    showBalance( index);
                    break;
                case 2:
                    transferMoney( index);
                    break;
                case 3:
                    showTransactionHistory( index);
                    break;
                case 4:
                    showFavorites(index);
                    break;
                case 5:
                    addFavorite(index);
                    break;
                case 6:
                    removeFavorites(index);
                    break;
                case 7:
                    searchRecipient(index);
                    break;
                case 8:
                    view_profile();
                    break;
                case 9:
                    update_profile(index);
                    break;
                case 10:
                    System.out.println(" logging out \n Thank you for using our application ");
                    break;
                default:
                    System.out.println("Invalid choice , please try again ");
            }
            input.nextLine();
        }

        while (user_choice != 10);
    }

//User methods

    static void showBalance(int index) {
        System.out.println("Your current balance: " + Balances[index]);
    }

    static void transferMoney(int index) {
        if (!Status[index]) {
            System.out.println("Your account is blocked.");
            return;
        }

        int recipient = searchRecipient(index);
        if (recipient == -1) return;

        if (!Status[recipient]) {
            System.out.println("Recipient account is blocked.");
            return;
        }

        if (transaction_count >= Transaction_IDs.length) {
            System.out.println("Transaction history is full.");
            return;
        }

        System.out.print("Enter transfer amount: ");
        if (!input.hasNextInt()) {
            System.out.println("Invalid amount.");
            input.nextLine();
            return;
        }

        int amount = input.nextInt();
        input.nextLine();

        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }

        if (Balances[index] < amount) {
            System.out.println("Insufficient balance.");
            return;
        }

        Balances[index] -= amount;
        Balances[recipient] += amount;

        Transaction_IDs[transaction_count] = transaction_count + 1;
        Transaction_senders[transaction_count] = user_full_name[index];
        Transaction_receivers[transaction_count] = user_full_name[recipient];
        Transaction_amounts[transaction_count] = amount;
        Transaction_statuses[transaction_count] = true;

        transaction_count++;

        System.out.println("Transfer successful!");
    }

    static void showTransactionHistory(int index) {
        String[][] transactions = new String[transaction_count][5];
        int count = 0;

        for (int i = 0; i < transaction_count; i++) {
            if (user_full_name[index].equals(Transaction_senders[i]) ||
                    user_full_name[index].equals(Transaction_receivers[i])) {

                transactions[count][0] = String.valueOf(Transaction_IDs[i]);
                transactions[count][1] = Transaction_senders[i];
                transactions[count][2] = Transaction_receivers[i];
                transactions[count][3] = String.valueOf(Transaction_amounts[i]);
                transactions[count][4] =
                        Transaction_statuses[i] ? "SUCCESS" : "FAILED";

                count++;
            }
        }

        if (count == 0) {
            System.out.println("No transactions found.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("\nTransaction ID: " + transactions[i][0]);
            System.out.println("Sender: " + transactions[i][1]);
            System.out.println("Receiver: " + transactions[i][2]);
            System.out.println("Amount: " + transactions[i][3]);
            System.out.println("Status: " + transactions[i][4]);
        }
    }

    static void view_profile(){
        String user_password = "belal_123";
        int valid_index = -1 ;
        for(int i =0 ; i<user_count ; i ++){
            if(user_password.equals(Passwords[i]))
            {
                valid_index=i ;
                break;
            }
        }
        System.out.println("____________________________");
        System.out.println("1.neme :"+user_full_name[valid_index]);
        System.out.println("2.ID :"+user_ID[valid_index]);
        System.out.println("3.email :"+email_addresses[valid_index]);
        System.out.println("1.Balance :"+Balances[valid_index]);
    }
    static void update_profile(int index){
        System.out.println("____________________________");
        input.nextLine();

        System.out.println("enter a password");
        String user_password= input.nextLine() ;
        int valid_index = -1 ;

        if(user_password.equals(Passwords[index])){
            valid_index=index ;
        }

        if(valid_index==-1){
            System.out.println("invalid password ");
            return;
        }

        System.out.print("Enter the password to change the account:");
        String  update_profile_password = input.nextLine();
        System.out.println("____________________________");
        if(update_profile_password.equals(Passwords[valid_index])){
            System.out.println("valid password :");
            do {
                System.out.println("____________________________");
                System.out.println("What do you want to change ");
                System.out.println("1: name");
                System.out.println("2: phone number ");
                System.out.println("3: email addresses");

                int number = input.nextInt();
                input.nextLine();
                System.out.println("____________________________");

                switch (number) {
                    case 1:
                        System.out.println("old name :" + user_full_name[valid_index]);
                        System.out.print("enter new name :");
                        String new_name = input.nextLine();
                        user_full_name[valid_index] = new_name;
                        break;
                    case 2:
                        System.out.println("old phone number :" + phone_numbers[valid_index]);
                        System.out.print("enter new phone number :");
                        String new_phone = input.nextLine();
                        phone_numbers[valid_index] = new_phone;
                        break;
                    case 3:
                        System.out.println("old email :" + email_addresses[valid_index]);
                        System.out.print("enter new email :");
                        String new_email = input.nextLine();
                        email_addresses[valid_index] = new_email;
                        break;
                }
                System.out.println("____________________________");
                System.out.println("1:continue");
                System.out.println("2:Exit");
                System.out.print("Enter your choice :");
                int update_input = input.nextInt();
                if(update_input==2)break;
            }
            while (true);
        }
    }
    static void user_login(){
        System.out.println("____________________________");
        System.out.print("Enter your email :");
        String user_email =input.nextLine();
        System.out.print("Enter your password : ");
        String user_password = input.nextLine();
        boolean user_found =false;
        for(int i =0 ;i<user_count ; i++){
            if(user_email.equals(email_addresses[i]) && user_password.equals(Passwords[i])){
                System.out.println("____________________________");
                System.out.println("Login Successful");
                System.out.println("____________________________");
                user_found=true;
                index = i ;
                user_panel(i);
                return;
            }
        }
        System.out.println("login failed ");
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
                    while (recipient_email.equals(email_addresses[index])){
                        System.out.println("This is the same person , please try again");
                        System.out.print("Enter the recipient's email again :");
                        recipient_email =input.nextLine();
                    }
                    for(int i =0 ; i <user_count ; i++) {

                        if (recipient_email.equals(email_addresses[i]) ) {
                            recipient_index = i;
                            System.out.println("Recipient found ");
                            System.out.println("Name : " +user_full_name[recipient_index]);
                            System.out.println("Email :" +email_addresses[recipient_index]);
                            System.out.println("phone number :"+ phone_numbers[recipient_index]);
                            return i ;
                        }
                    }
                    break;

                case 2 :
                    System.out.println("Enter the recipient's phone number : ");
                    String recipient_phone_number = input.nextLine();
                    while (recipient_phone_number.equals(phone_numbers[index])){
                        System.out.println("This is the same person , please try again");
                        System.out.println("Enter the recipient's phone number : ");
                        recipient_phone_number = input.nextLine();
                    }

                    for(int i =0 ; i <user_count ; i++) {
                        if (recipient_phone_number.equals(phone_numbers[i]) ) {
                            recipient_index = i;
                            System.out.println("Recipient found ");
                            System.out.println("Name : " +user_full_name[recipient_index]);
                            System.out.println("Email :" +email_addresses[recipient_index]);
                            System.out.println("phone number :"+ phone_numbers[recipient_index]);
                            return i ;
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
            if(recipient_index== -1) {
                System.out.println("Recipient Not found  ");
            }
        }
        return recipient_index;
    }
    public static  void addFavorite(int index){

        if (Favorite_count[index]> 5) {
            System.out.println("can't add more contacts to favourite");
            return;
        }

        //to make sure that number of fav contacts is not more than the number of places in fav list
        int fav_user_index= searchRecipient(index);
        // calling this method to bring me the index of the  one I searched to add to fav

        if (fav_user_index== index) {
            System.out.println("you cant add yourself ");
        }
        else if (fav_user_index==-1) {
            System.out.println("user not found !");

            //fav user index still -1 means that this user has number index so user is not found
        }
        else {

            for (int y =0; y<Favorite_count[index]; y++){
                if (Favorite_contacts[index][y]== fav_user_index){
                    System.out.println("This user is already in favourite contacts ");
                    return;}
			/*for loop to know if there is an index in
			fav contacts array equals the index of user required to be added to fav
			if true print user already in fav and return*/
            }

            int x = Favorite_count[index] ;
            //saving number. of fav of user (me) in var x
            Favorite_contacts[index][x]= fav_user_index;
            //saving index of fav user called from search to the first place with number users in my fav list
            Favorite_count[index]++;
            //inc fav count of me by one
            System.out.println(user_full_name[fav_user_index] + " is added to favourites ");
            //getting name of user with index (fav_user_index) to be printed
            System.out.println(" ");
        }

    }
    //method show fav
    public static void showFavorites(int index){
        if (Favorite_count[index]==0){
            System.out.println("no favourites found");
            return;}
        // to check if number of fav contacts =0 means there is number fav contacts saved
        System.out.println("your favourite contacts : ");
        for (int d=0; d<Favorite_count[index]; d++){
            int fav_index = Favorite_contacts[index][d];
            //saving index of favourite contact in var fav_index
            System.out.println("user name : "+ user_full_name[fav_index]+" "+" , id :"+ user_ID[fav_index]);
        }
        //printing fav user name and id
        System.out.println(" ");
    }
    //method remove fav
    public static void removeFavorites(int index){
        if (Favorite_count[index]==0){System.out.println("no favourites found");
            return;}
        //if number of fav contacts of the user (me) =0 , no fav will be shown and the function will be returned (stopped)
        Scanner input = new Scanner (System.in);
        showFavorites(index);
        // show the list of fav contacts for user to choose one to remove
        System.out.println("choose the id of user ");
        int user_to_remove = input.nextInt();
        input.nextLine();
        //saving id that user want to remove in var called user_to_remove
        int removed = -1 ;
        //using a var called remove and = -1 to check if the chosen user is in fav list or not
        for (int j =0; j<Favorite_count[index]; j++){
            // for loop that starts from 0 to the number just before count of fav contacts for user(me)
            int fav = Favorite_contacts[index][j];
            //saving fav contact in var of fav
            if (user_ID[fav]==user_to_remove){
                // if user_to_remove (entered by user (me)) = to user id of index 'fav' → 'remove' var will change to j
                removed = j;
                break;
            }
        }
        if (removed==-1){System.out.println("user is not in favourites list");
            return;}
        // 'remove'  var still -1 means the searched fav contact is not found in list of fav
        for (int t=removed;t<Favorite_count[index]-1;t++){
            Favorite_contacts[index][t]=Favorite_contacts[index][t+1];
        }// start loop with removed (index of user_to_remove) and loop till (fav count -1) as the elements move
        //one step back so count will dec by 1
        Favorite_count[index]--;
        // Fav counts decrease by one
        System.out.println("user removed from favourites list");
        System.out.println(" ");

    }
    void main(){
        int choice;
        do {
            System.out.println("========== Quick pay ==========");
            System.out.println("1.login as Admin ");
            System.out.println("2.login as User ");
            System.out.println("3.Exit");
            System.out.print("Choose an option : ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    admin_Login();
                    break;
                case 2 :
                    user_login();

                    break;
                case 3 :
                    System.out.println("Exiting...  \n Thank you for using our application");
                    break;
                default:
                    System.out.println("Invalid choice , please try again");

            }
        }
        while (choice != 3) ;
    }
}

