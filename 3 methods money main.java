
static void showBalance(int loggedInUser) {
    if (!isValidUserIndex(loggedInUser)) {
        System.out.println("Invalid user.");
        return;
    }

    System.out.printf("Your current balance: %.2f EGP%n",
            balances[loggedInUser] / 100.0);
}

static void transferMoney(int loggedInUser) {
    if (!isValidUserIndex(loggedInUser)) {
        System.out.println("Invalid user.");
        return;
    }

    if (!active[loggedInUser]) {
        System.out.println("Your account is blocked.");
        return;
    }

    if (transactionCount >= MAX_TRANSACTIONS) {
        System.out.println("Transaction history is full.");
        return;
    }

    System.out.print("Enter recipient email or phone: ");
    String recipientId = input.nextLine().trim();

    int recipientIndex = findUserByEmailOrPhone(recipientId);

    System.out.print("Enter amount in EGP: ");
    long amountInPiastres = readMoneyInPiastres();

    String status = "FAILED";
    String reason;

    if (recipientIndex == -1) {
        reason = "Recipient does not exist.";
    } else if (recipientIndex == loggedInUser) {
        reason = "You cannot transfer money to yourself.";
    } else if (!active[recipientIndex]) {
        reason = "Recipient account is blocked.";
    } else if (amountInPiastres <= 0) {
        reason = "Amount must be greater than zero.";
    } else if (balances[loggedInUser] < amountInPiastres) {
        reason = "Insufficient balance.";
    } else if (Long.MAX_VALUE - balances[recipientIndex] < amountInPiastres) {
        reason = "Recipient balance limit exceeded.";
    } else {
        balances[loggedInUser] -= amountInPiastres;
        balances[recipientIndex] += amountInPiastres;
        status = "SUCCESS";
        reason = "Transfer completed successfully.";
    }

    recordTransaction(
            loggedInUser,
            recipientIndex,
            amountInPiastres,
            status
    );

    System.out.println(reason);
    System.out.println("Transaction status: " + status);
}

static void showTransactionHistory(int loggedInUser) {
    if (!isValidUserIndex(loggedInUser)) {
        System.out.println("Invalid user.");
        return;
    }

    System.out.println("\n===== YOUR TRANSACTION HISTORY =====");
    boolean found = false;

    for (int i = 0; i < transactionCount; i++) {
        if (senders[i] == loggedInUser
                || receivers[i] == loggedInUser) {

            found = true;

            System.out.println("Transaction ID: "
                    + transactionIds[i]);

            System.out.println("Sender: "
                    + getUserName(senders[i]));

            System.out.println("Receiver: "
                    + getUserName(receivers[i]));

            System.out.printf("Amount: %.2f EGP%n",
                    amounts[i] / 100.0);

            System.out.println("Status: " + statuses[i]);
            System.out.println("------------------------------");
        }
    }

    if (!found) {
        System.out.println("No transactions found.");
    }
}
