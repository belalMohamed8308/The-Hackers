static void view_profile(){

    //السطر دا يتشال بدل ما يولع في الكود
    int valid_index = -1 ;
    for(int i =0 ; i<user_count ; i ++){
        if(user_password.equals(Passwords[i])){valid_index=i ;
            break;}
    }
    System.out.println("\n><=>-<=>-<=>-<=>-<=>-<=><\n");
    System.out.println("1.neme :"+user_full_name[valid_index]);
    System.out.println("2.ID :"+user_ID[valid_index]);
    System.out.println("3.email :"+email_addresses[valid_index]);
    System.out.println("1.Balance :"+Balances[valid_index]);
}