Imagine you're developing a banking application. You want to represent different types of bank accounts such as savings accounts and current accounts. Both types of accounts share some common functionality like depositing and withdrawing money, but they also have some distinct features.

1 - Create an abstract class called BankAccount with instance variables such as accountNumber, balance, and methods like deposit() and withdraw(). These methods will be abstract as their implementation will differ for savings and current accounts.

2 - Create subclasses SavingsAccount and CurrentAccount that extend the BankAccount class. Implement the deposit() and withdraw() methods for each subclass according to their specific requirements. For example, a savings account might have a limit on withdrawals, while a current account might allow overdrafts.

3 - Additionally, you might want to add methods such as calculateInterest() for the SavingsAccount class to compute interest based on the balance.

4 - Finally, create a main class to test the functionality of the bank accounts. You can create instances of both SavingsAccount and CurrentAccount, perform transactions like depositing and withdrawing money, and observe how the account balances and functionalities behave differently based on their types.

This exercise not only practices abstract classes but also demonstrates how abstract classes can be used to model real-world scenarios and promote code reusability and maintainability.