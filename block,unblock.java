static void block_Account(){
    System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
    System.out.println("Select a user :");

    int blocked_idx = -1 ;
    do {
        int number = 1 ;
        for (int i = 0; i < accounts_number; i++) {
            if (Status[i] == true) System.out.println((number) + ":" + user_full_name[i]);
            if (Status[i] != true) System.out.println((number) + ":" + user_full_name[i]+"    <blocked>");
            number++;
        }System.out.print("Enter your choice :");

        blocked_idx = (input.nextInt()-1);
        input.nextLine();

        if(Status[blocked_idx]==false){
            System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
            System.out.println("user is blocked actually");
            System.out.println("1:continue");
            System.out.println("2:Exit");
            System.out.print("Enter your choice :");
            int blocked_input = input.nextInt();
            if(blocked_input==2) break;}


        if(Status[blocked_idx]==true) {
            Status[blocked_idx] = false;
            System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
            System.out.println(user_full_name[blocked_idx] + ": is blocked now");

        }


        if(Status[blocked_idx]==false){
            System.out.println("1:continue");
            System.out.println("2:Exit");
            System.out.print("Enter your choice :");
            int blocked_input = input.nextInt();
            System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
            if(blocked_input==2) break;}

    }while (Status[blocked_idx]==false);


}
static void unblock_Account(){
    int unblocked_idx = -1 ;
    do {
        int number = 1 ;
        for (int i = 0; i < accounts_number; i++) {
            if (Status[i] == true) System.out.println((number) + ":" + user_full_name[i]);
            if (Status[i] != true) System.out.println((number) + ":" + user_full_name[i]+"    <blocked>");
            number++;
        }System.out.print("Enter your choice :");

        unblocked_idx = (input.nextInt()-1);
        input.nextLine();

        if(Status[unblocked_idx]!=false){
            System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
            System.out.println("user is active actually");
            System.out.println("1:continue");
            System.out.println("2:Exit");
            System.out.print("Enter your choice :");
            int blocked_input = input.nextInt();
            if(blocked_input==2) break;}


        if(Status[unblocked_idx]!=true) {
            Status[unblocked_idx] = true;
            System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
            System.out.println(user_full_name[unblocked_idx] + ": is active now");

        }


        if(Status[unblocked_idx]!=false){
            System.out.println("1:continue");
            System.out.println("2:Exit");
            System.out.print("Enter your choice :");
            int blocked_input = input.nextInt();
            System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
            if(blocked_input==2) break;}

    }while (Status[unblocked_idx]!=false);



}