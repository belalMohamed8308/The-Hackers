static void update_profile(){


    
    int valid_index = -1 ;
    for(int i =0 ; i<user_count ; i ++){
        if(user_password.equals(Passwords[i])){valid_index=i ;
            break;}
    }

    System.out.print("Enter the password to change the account:");
    String  update_profile_password = input.nextLine();
    System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
    if(update_profile_password.equals(Passwords[valid_index])){
        System.out.println("valid password :");
        do {
            System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
            System.out.println("What do you want to change ");
            System.out.println("1: name");
            System.out.println("2: phone number ");
            System.out.println("3: email addresses");

            int number = input.nextInt();
            input.nextLine();
            System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");

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
            System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
            System.out.println("1:continue");
            System.out.println("2:Exit");
            System.out.print("Enter your choice :");
            int update_input = input.nextInt();
            if(update_input==2)break;


        }while (true);


    }

}
