

# for x in "hello":
#     print(x)
#
# print()
#
# for x in [11,22,33]:
#     print(x)

# for...in 的要求
# 1.__iter__            return itself as an iterator
# 2.__next__

class Reverse:
    def __init__(self,data):
        self.data = data        # data
        self.index = len(data)  # 5

    def __iter__(self):
        return self

    def __next__(self):
        if self.index == 0:
            raise StopIteration
        self.index -= 1
        return self.data[self.index]

class ReverseSkip1:
    def __init__(self,data):
        self.data = data        # data
        self.index = len(data)  # 5

    def __iter__(self):
        return self

    def __next__(self):
        if self.index <= 1:
            raise StopIteration
        if self.index == len(self.data):
            self.index -= 1
        else:
            self.index -= 2
        return self.data[self.index]

r1 = Reverse("hellosdkljfskd~")
r2 = ReverseSkip1("hellosdkljfskd~")

for x in r2:
    print(x)

# ReversSkip1