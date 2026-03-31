# OOP: object oriented programing
# 1.how to define a class (class field, object field,constructor,function)

class Polygon:
    # constructor: special method to initialize object
    def __init__(self,side,lengths,color='red'):
        # self:current object
        # field/property
        # self.side = 3       # 1.create a field, the name is side   2.assign 3 into this field
        # self.color = "red"

        self.side = side
        self.lengths = lengths
        self.color = color
        self.circum = 0

    def show(self):
        print("this shape has {} sides, it's in {} color, the circumference is {}".format(self.side,self.color,self.circum))

    def circumference(self):
        for x in self.lengths:
            self.circum += x

if __name__ == '__main__':
    poly1 = Polygon(4,[11,22,33,11],"green")
    poly2 = Polygon(3,[11,22,33])

    poly1.circumference()
    poly2.circumference()

    poly1.show()
    poly2.show()


