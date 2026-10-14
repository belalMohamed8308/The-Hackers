
import java.util.Queue;
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    //==============User==============\\
    static String[] user_full_name = new String[50];
    static int user_ID[] = new int[50];
    static String email_addresses[] = new String[50];
    static String phone_numbers[] = new String[50];
    static String Passwords[] = new String[50];
    static long Balances[] = new long[user_full_name.length];
    int accounts_number = 4;
    static boolean Status[] = new boolean[50];
    //=============Transaction==============\\
    static int Transaction_IDs[][] = new int[50][50];
    static String Transaction_senders[][] = new String[50][50];
    static String Transaction_receivers[][] = new String[50][50];
    static int Transaction_amounts[][] = new int[50][50];
    static boolean Transaction_statuses[][] = new boolean[50][50];
    //==============Favorite==============\\
    static String Favorite_contacts[][] = new String[50][49];

    //=================================
    static {
        user_full_name[0] = "belal mohamed salah";
        user_ID[0] = 190000;
        email_addresses[0] = "belal@gmail.com";
        phone_numbers[0] = "01277190463";
        Passwords[0] = "belal_123";
        Balances[0] = 35;
        Status[0]=false;
        //=========================
        user_full_name[1] = "Nada Mostafa";
        user_ID[1] = 190001;
        email_addresses[1] = "Nada@gmail.com";
        phone_numbers[1] = "01207201382";
        Passwords[1] = "Nada_123";
        Balances[1] = 18000;
        Status[1]=true;
        //=============================
        user_full_name[2] = "Abdullah omera";
        user_ID[2] = 190002;
        email_addresses[2] = "Abdullah@gmail.com";
        phone_numbers[2] = "01282545826";
        Passwords[2] = "Abdullah_123";
        Balances[2] = 200999;
        Status[2]=true;
        //======================
        user_full_name[3] = "jana";
        user_ID[3] = 190003;
        email_addresses[3] = "jana@gmail.com";
        phone_numbers[3] = "01210912378";
        Passwords[3] = "jana_123";
        Balances[3] = 16000;
        Status[3]=true;
    }
}
