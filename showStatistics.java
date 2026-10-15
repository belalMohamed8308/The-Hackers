static void showStatistics() {
    int activeAccounts = 0;
    int blockedAccounts = 0;
    int successfulTransactions = 0;
    int failedTransactions = 0;
    long totalSuccessfulTransfers = 0;

    for (int i = 0; i < userCount; i++) {
        if (active[i]) {
            activeAccounts++;
        } else {
            blockedAccounts++;
        }
    }

    for (int i = 0; i < transactionCount; i++) {
        if ("SUCCESS".equalsIgnoreCase(statuses[i])) {
            successfulTransactions++;
            totalSuccessfulTransfers += amounts[i];
        } else if ("FAILED".equalsIgnoreCase(statuses[i])) {
            failedTransactions++;
        }
    }

    System.out.println("\n===== SYSTEM STATISTICS =====");
    System.out.println("Active Accounts: " + activeAccounts);
    System.out.println("Blocked Accounts: " + blockedAccounts);
    System.out.println("Successful Transactions: " + successfulTransactions);
    System.out.println("Failed Transactions: " + failedTransactions);

    System.out.printf("Total Successful Transfers: %.2f EGP%n",
            totalSuccessfulTransfers / 100.0);
}