static void Login(){
    int num1 = 0, num2 = 0;
    do {
        System.out.println("enter your name");
        String user_name_login = input.nextLine();

        System.out.println("enter your password");
        String user_password = input.nextLine();



        for (int i = 0; i < Passwords.length; i++) {
            if (user_password.equals(Passwords[i]) == true) {
                user_password = Passwords[i];
                num1 = i;
                break;
            }
        }

        for (int i = 0; i < Passwords.length; i++) {
            if (user_name_login.equalsIgnoreCase(user_full_name[i]) == true) {
                user_name_login = user_full_name[i];
                num2 = i;
                break;
            }
        }

        if (num2 == num1) {
            System.out.println("welcome " + user_name_login);
        } else if (num2 != num1) System.out.println("\n*******************\n   invalid login\n*******************\n");

    }while (num2 != num1);
}
static void Overview(){
    System.out.println("========== QUICK PAY ==========\n");
    System.out.println("1. login as admin ");
    System.out.println("2. login as User ");
    System.out.print("3. Exit \nChoose an option :");



    int Login_input= input.nextInt();
    input.nextLine();
//حنحط الميثودز جوا السوتش

    switch (Login_input) {




        case 1://admin
            System.out.println();


            break;




        case 2://user
            Login();
            System.out.println("\n========== USER PANEL ==========\n\n1. Show Balance\n2. Transfer Money\n3. Transaction History\n4. Show Favorites\n5. Add Favorite\n6. Remove Favorite\n7. Search Recipient\n8. View Profile\n9. Update Profile\n10. Logout");


            break;





        case 3://Exit
            System.out.println(" البعنا خسر دلعنا  ");


            break;




        default:
            System.out.println("لا دانتا تتمينص بقا ! ! ! ");

    }
}
