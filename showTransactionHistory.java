static void showTransactionHistory(int userIndex) {
    if (!isValidUserIndex(userIndex)) {
        System.out.println("Invalid user index.");
        return;
    }

    String[][] userTransactions =
            new String[transactionCount][5];

    int count = 0;

    for (int i = 0; i < transactionCount; i++) {
        if (senders[i] == userIndex || receivers[i] == userIndex) {

            userTransactions[count][0] = transactionIds[i];
            userTransactions[count][1] = getUserName(senders[i]);
            userTransactions[count][2] = getUserName(receivers[i]);
            userTransactions[count][3] =
                    String.format("%.2f", amounts[i] / 100.0);
            userTransactions[count][4] = statuses[i];

            count++;
        }
    }

    System.out.println("\n===== TRANSACTION HISTORY =====");

    if (count == 0) {
        System.out.println("No transactions found for this user.");
        return;
    }

    for (int i = 0; i < count; i++) {
        System.out.println("Transaction ID: " + userTransactions[i][0]);
        System.out.println("Sender: " + userTransactions[i][1]);
        System.out.println("Receiver: " + userTransactions[i][2]);
        System.out.println("Amount: " + userTransactions[i][3] + " EGP");
        System.out.println("Transaction Status: " + userTransactions[i][4]);
        System.out.println("------------------------------");
    }
}