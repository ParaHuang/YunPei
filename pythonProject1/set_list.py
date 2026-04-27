# remove duplicate
set1 = {11,22,33,44,33,22,11}
print(len(set1))

set1.add(55)
print(set1)

set2 = {44,55,77,99}
print(set2)
print()
# intersection
set3 = set1 & set2
print(set3)
# union set
set4 = set1 | set2
print(set4)

set5 = set1 - set2
print(set5)

set6 = set2 - set1
print(set6)

list = [11,22,88,33,55,66,55,44,33]
set7 = set(list)
print(set7)

for x in set7:
    print(x)
