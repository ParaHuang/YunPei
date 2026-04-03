# encapsulation:make field private, access it by public method
class SecureAccount:
    # class property: shared by all objects, belongs to class
    bank_name = "Python Bank"
    total_accounts = 0

    # private attribute:    __name
    def __init__(self,owner,password,balance=0):
        self.owner = owner                  # public instance property
        self.__password = password          # private instance property
        self.__balance = balance
        SecureAccount.total_accounts += 1

    # def setPassword(self,oldPassword,newPassword):
    def get_balance(self,password):
        if password == self.__password:
            return self.__balance
        else:
            return "you have no permission"

    def deposit(self,password,amount):
        if password == self.__password:
            self.__balance += amount
            return f"deposit {amount} successfully"
        else:
            return "you have no permission"



if __name__ == '__main__':
    acc1 = SecureAccount("Jack",123456,1000)
    print("the owner of this account is {}".format(acc1.owner))
    print(acc1.get_balance(1234566))

    print(acc1.deposit(123456,500))
    print(acc1.get_balance(123456))

    acc2 = SecureAccount("Mark",999)
    print("the owner of this account is {}".format(acc2.owner))
    print(acc2.get_balance(999))

    print(acc1.bank_name)
    print(acc2.bank_name)
    print(SecureAccount.bank_name)
    print("now {} has {} accounts".format(SecureAccount.bank_name,SecureAccount.total_accounts))