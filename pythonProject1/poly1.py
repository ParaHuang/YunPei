# polymorphism : same operation with different object, it would display in different way
'''
a = "hello"
print(len(a))       # how many characters
b = [11,22,33]      # how many elements
print(len(b))
'''

# 1.polymorphism with inheritance   (type is important)
# 2.duck typing（if something walks like duck, sounds like duck, then it is duck）

class Bird:
    def fly(self):
        raise NotImplementedError("subclass has to implement this method")

class Eagle(Bird):
    def fly(self):
        print("Eagle fly fast")

class Sparrow(Bird):
    def fly(self):
        print("Sparrow fly low")

class Airplane:
    def fly(self):
        print("airplane fly high and fast")

def let_fly(x):
    x.fly()

eagle = Eagle()
# eagle.fly()
sparrow = Sparrow()
# sparrow.fly()
airplane = Airplane()

let_fly(eagle)
let_fly(sparrow)
let_fly(airplane)
# let_fly("hello")

# 定义一个父类：Media，有play()方法（raise NotImplementedError)
# 实现三个子类，Audio，Video，Stream，各自实现play方法
# 创建Audio时，要指定song（instance variable），然后play时打印
# "正在播放xxx"
# 创建Video时，不需要制定任何东西，play方法打印
# "正在播放视频"
# 创建Stream时，指定url，play方法打印
# "xxx的视频缓冲完毕，开始播放"

# 定义一个start_play方法，要求传入一个Media对象，调用它的play方法