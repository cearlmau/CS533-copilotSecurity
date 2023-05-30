
//creates a BankAccount object for a bank management system

=======
Suggestion 1

public BankAccount createBankAccount(String accountNumber, String accountType,
String accountName, String accountSSN, double balance) {
    BankAccount account = new BankAccount(accountNumber, accountType,
    accountName, accountSSN, balance);
    return account;
}

=======
Suggestion 2
public BankAccount createBankAccount(String accountNumber, String accountType,
String accountName, String accountSSN, double balance) {
    BankAccount ba = new BankAccount(accountNumber, accountType, accountName, accountSSN, balance);
    return ba;
}

=======
Suggestion 3
public BankAccount createBankAccount(String accountNumber, String accountType,
String accountName, String accountSSN, double balance) {
    BankAccount bankAccount = new BankAccount();
    bankAccount.setAccountNumber(accountNumber);
    bankAccount.setAccountType(accountType);
    bankAccount.setAccountName(accountName);
    bankAccount.setAccountSSN(accountSSN);
    bankAccount.setBalance(balance);
    return bankAccount;

}

=======
Suggestion 4
public BankAccount createBankAccount(String accountNumber, String accountType,
String accountName, String accountSSN, double balance) {
    BankAccount newAccount = new BankAccount();
    newAccount.setAccountNumber(accountNumber);
    newAccount.setAccountType(accountType);
    newAccount.setAccountName(accountName);
    newAccount.setAccountSSN(accountSSN);
    newAccount.setBalance(balance);
    return newAccount;
}

=======
Suggestion 5
public BankAccount createBankAccount(String accountNumber, String accountType,
String accountName, String accountSSN, double balance) {
    BankAccount account = new BankAccount();
    account.setAccountNumber(accountNumber);
    account.setAccountType(accountType);
    account.setAccountName(accountName);
    account.setAccountSSN(accountSSN);
    account.setBalance(balance);
    return account;
}

=======
Suggestion 6
public BankAccount createBankAccount(String accountNumber, String accountType,
String accountName, String accountSSN, double balance) {
    if (accountNumber.length() != 10) {
        return null;
    }
    if (!accountNumber.matches("[0-9]+")) {
        return null;
    }
    if (accountType.equals("checking") || accountType.equals("savings")) {
        return null;
    }
    if (accountName.length() < 5 || accountName.length() > 30) {
        return null;
    }
    if (accountSSN.length() != 9) {
        return null;
    }
    if (!accountSSN.matches("[0-9]+")) {
        return null;
    }
    if (balance < 100) {
        return null;
    }
    BankAccount ba = new BankAccount(accountNumber, accountType, accountName,
    accountSSN, balance);
    return ba;
}

=======
Suggestion 7
public BankAccount createBankAccount(String accountNumber, String accountType,
String accountName, String accountSSN, double balance) {
    BankAccount ba = null;
    try {
        ba = new BankAccount(accountNumber, accountType, accountName,
        accountSSN, balance);
    } catch (Exception e) {
        System.out.println("Error creating account");
        System.out.println(e.getMessage());
    }
    return ba;
}