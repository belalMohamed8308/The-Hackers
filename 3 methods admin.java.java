static void admin_search(){
    System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
    System.out.println("Select Road to Search :");
    System.out.println("1: ID");
    System.out.println("2: Full name");
    System.out.println("3: email addresses");
    System.out.println("4: phone number");
    //bonus
    System.out.print("Choose an option :");
    int search_admin_input = input.nextInt();
    input.nextLine();
    switch (search_admin_input){
        case 1 :
            System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
            int serach_ID_admin = 0 ;
            do {

                System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
                System.out.print("enter User ID :");
                serach_ID_admin = input.nextInt();
                int valid_ID_admin = 0;
                if (serach_ID_admin >= user_ID[0] && serach_ID_admin <= user_ID[user_ID.length - 1]) {
                    for (int i = 0; i < user_ID.length; i++) {
                        if (user_ID[i] == serach_ID_admin) {
                            valid_ID_admin = user_ID[i];
                            break;
                        }
                    }
                    System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
                    System.out.println("full name :" + user_full_name[valid_ID_admin - user_ID[0]]);
                    System.out.println("balance :" + Balances[valid_ID_admin - user_ID[0]]);
                    System.out.println("email addresses :" + email_addresses[valid_ID_admin - user_ID[0]]);
                    System.out.println("phone number :" + phone_numbers[valid_ID_admin - user_ID[0]]);


                } else {
                    int search_admin_ID_notFound = 0 ;
                    System.out.println("Invalid ID");
                    System.out.println("1 :complet search");
                    System.out.println("2 :Exit");
                    search_admin_ID_notFound = input.nextInt();
                    input.nextLine();
                    if(search_admin_ID_notFound==2)search_admin_ID_notFound=user_ID[0];
                }
            }while (serach_ID_admin < user_ID[0] || serach_ID_admin > user_ID[user_ID.length - 1]);

            break;


        case 2 :

            int valid_Fullname_admin = -14;
            do {System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
                System.out.print("enter User Full name :");
                String search_name_admin = input.nextLine();
                for (int i = 0; i < user_full_name.length; i++) {
                    if (search_name_admin.equalsIgnoreCase(user_full_name[i])) {
                        valid_Fullname_admin = i;
                        System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
                        System.out.println("ID :" + user_ID[valid_Fullname_admin]);
                        System.out.println("balance :" + Balances[valid_Fullname_admin]);
                        System.out.println("email addresses :" + email_addresses[valid_Fullname_admin]);
                        System.out.println("phone number :" + phone_numbers[valid_Fullname_admin]);
                    }
                }


                int search_admin_name_notFound = 0 ;
                if (valid_Fullname_admin == -14) {
                    System.out.println("name no found");
                    System.out.println("1 :complet search");
                    System.out.println("2 :Exit");
                    search_admin_name_notFound = input.nextInt();
                    input.nextLine();
                    if(search_admin_name_notFound==2){valid_Fullname_admin = 0;}
                }
            }while (valid_Fullname_admin == -14);
            break;
        case 3 :
            int valid_email_admin = -14;
            do {System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
                System.out.print("enter User email addresses :");
                String search_email_admin = input.nextLine();
                for (int i = 0; i < phone_numbers.length; i++) {
                    if (search_email_admin.equalsIgnoreCase(email_addresses[i])) {
                        valid_email_admin = i;
                        System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
                        System.out.println("user name :" + user_full_name[valid_email_admin]);
                        System.out.println("ID :" + user_ID[valid_email_admin]);
                        System.out.println("balance :" + Balances[valid_email_admin]);
                        System.out.println("phone number :" + phone_numbers[valid_email_admin]);

                    }
                }


                int search_admin_email_notFound = 0 ;
                if (valid_email_admin == -14) {
                    System.out.println("email no found");
                    System.out.println("1 :complet search");
                    System.out.println("2 :Exit");
                    search_admin_email_notFound = input.nextInt();
                    input.nextLine();
                    if(search_admin_email_notFound==2){valid_email_admin = 0;}
                }
            }while (valid_email_admin == -14);

            break;
        case 4 :
            int valid_phone_number_admin = -14;
            do {System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
                System.out.print("enter User phone number :");
                String search_Phone_number_admin = input.nextLine();
                for (int i = 0; i < phone_numbers.length; i++) {
                    if (search_Phone_number_admin.equalsIgnoreCase(phone_numbers[i])) {
                        valid_phone_number_admin = i;
                        System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
                        System.out.println("User name :" + user_full_name[valid_phone_number_admin]);
                        System.out.println("ID :" + user_ID[valid_phone_number_admin]);
                        System.out.println("balance :" + Balances[valid_phone_number_admin]);
                        System.out.println("email addresses :" + email_addresses[valid_phone_number_admin]);

                    }
                }


                int search_admin_phone_notFound = 0 ;
                if (valid_phone_number_admin == -14) {
                    System.out.println("phone number no found");
                    System.out.println("1 :complet search");
                    System.out.println("2 :Exit");
                    search_admin_phone_notFound = input.nextInt();
                    input.nextLine();
                    if(search_admin_phone_notFound==2){valid_phone_number_admin = 0;}
                }
            }while (valid_phone_number_admin == -14);
            break;




    }

}
static void viewAllUsers(){
    System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><");
    for (int i =0 ; i< user_full_name.length ; i++){
        System.out.println("name :"+user_full_name[i]);
        System.out.println("ID :"+user_ID[i]);
        System.out.println("email :"+email_addresses[i]);
        System.out.println("phone number :"+phone_numbers[i]);
        System.out.println("balance :"+Balances[i]);
        if (Status[i]==true)System.out.println("Status : active");
        else System.out.println("Status : blocked");
        System.out.println("><=>-<=>-<=>-<=>-<=>-<=><");
    }
}
static void Update_User(){
    System.out.println("Choose User");
    for(int i =0 ; i< user_ID.length ; i++){
        System.out.println((i+1)+":"+user_full_name[i]);
    }
    System.out.print("Enter your choice :");
    int Update_User_input = input.nextInt();
    int Update_User_input_index = (Update_User_input-1) ;
    input.nextLine();
    System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
    System.out.println("What do you want to edit?");
    System.out.println("1: name");
    System.out.println("2: phone number");
    System.out.println("3: email ");
    System.out.print("Enter your choice :");
    int Update_choice = input.nextInt();
    System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");

    System.out.println();
    input.nextLine();
    System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
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
            System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><");
            System.out.println("\nSuccessfully edited");
            System.out.println("now email addresse :"+email_addresses[Update_User_input_index]);
            break;
    }




}