# Banking-Operaations
# Exception Handling in Banking Application

This Java project demonstrates the implementation of exception handling in a banking application. The project consists of a `BankController` class and a supporting `BankAccount` class, along with an `IntegratedBankingApp` class and `AtmWithdrawal` class for integrated and ATM scenarios.

## BankController Class

### Overview
The `BankController` class simulates a basic banking portal where users can interact with their accounts. It includes features such as checking balance, depositing, and withdrawing money, all while handling exceptions like insufficient balance and pin mismatches.

### Usage
1. Create instances of `BankAccount` and store them in an array.
2. Users input a 4-digit PIN to access their accounts.
3. Menu options allow users to perform various transactions.
4. Exception handling ensures secure and error-free transactions.

## IntegratedBankingApp Class

### Overview
The `IntegratedBankingApp` class extends the functionality of the `BankController` by introducing a separate class for a more integrated and modular approach. It includes methods for finding a matching PIN and executing transactions based on user input.

### Usage
1. Users input a 4-digit PIN to access their accounts.
2. Menu options allow users to check balance, deposit, withdraw, or exit.
3. The program ensures secure and error-free transactions through exception handling.

## AtmWithdrawal Class

### Overview
The `AtmWithdrawal` class simulates a simple ATM withdrawal scenario. Users input a password, and based on the amount entered, the program informs users whether the withdrawal is successful or if the amount is invalid.

### Usage
1. Users input a password to access the ATM.
2. Enter the withdrawal amount.
3. The program provides feedback on the success or failure of the withdrawal.

## BankAccount Class

### Overview
The `BankAccount` class represents a basic bank account with features like withdrawal, deposit, and pin verification. It includes custom exceptions for handling insufficient balance and pin mismatches.

### Usage
1. Create instances of `BankAccount` with customer details and initial balance.
2. Withdraw, deposit, or verify pin as needed.
3. Handle exceptions for secure and error-free operations.

## Exceptions

### InsufficientBalanceException
This exception is thrown when a withdrawal is attempted with insufficient funds in the account.

### PinMismatchException
This exception is thrown when the entered PIN does not match the account's stored PIN.

## License
This project is open-source and available under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code.
