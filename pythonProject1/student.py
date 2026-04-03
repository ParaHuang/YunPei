class Student:

    teacher_name = "Yang"
    def __init__(self,name):
        self.name = name

    def show(self):
        print(f"My name is {self.name}")

    @classmethod
    def showTeacher(cls):
        # process
        print(f"Teacher is {cls.teacher_name}")

    @staticmethod
    def sayHi():
        print("hi")

if __name__ == '__main__':
    stu1 = Student("Jack")
    stu1.show()

    print(stu1.teacher_name)
    print(Student.teacher_name)
    stu1.showTeacher()
    Student.showTeacher()

    stu1.sayHi()
    Student.sayHi()



'''
class 有 variable + method

variable 包括 instance variable + class variable
method   包括 instance method   + class method

method: code block


'''


