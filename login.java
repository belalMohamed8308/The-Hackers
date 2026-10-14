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
