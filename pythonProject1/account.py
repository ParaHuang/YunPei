#inheritance:   reuse

# superclass/parentclass
class Account:
    def __init__(self,owner,balance=0):
        self.owner = owner
        self.balance = balance

    def deposit(self):
        print("try to deposit")

    def get_info(self):
        print(f"owner:{self.owner},balance:{self.balance}")

# subclass/childclass
class SavingAccount(Account):
    def __init__(self,interest,owner,balance):
        super().__init__(owner,balance)
        self.interest = interest

    # override
    def get_info(self):
        super().get_info()
        print(f"the interest is {self.interest}")

if __name__ == '__main__':
    acc1 = Account("Mark",4000)
    acc1.deposit()
    acc1.get_info()

    acc2 = SavingAccount(0.12,"Jack",1000)          # Jack,1000
    acc2.deposit()
    acc2.get_info()

    acc3 = SavingAccount(0.11,"Tom",500)          # Tom,500
    acc3.deposit()
    acc3.get_info()