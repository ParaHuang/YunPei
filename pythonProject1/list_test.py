names = ['Jack','Zack','Mark','Allen','Lily','Zack','Lucy']

# access by index
print(names[1])
#slice
print(names[::2])


# operators
# +
print(names + [11,22,33])
# *
print(names * 3)
# in
print("Mark" in names)




#append
# names.append("张三")
# print(names)

# remove by index
# del names[-1]

# remove object
names.remove("Mark")
print(names)

print(len(names))
print(max(names))
print(min(names))

# the methods of list
print(names.count('Zack'))
# names.extend([11,22])
# print(names)
print(names.index('Zack',3))
names.insert(3,'New')
print(names)
names.reverse()
print(names)
names.sort(key=len,reverse=True)

names[2] = 'AA'
print(names)


# for i in range(len(names)):
#     print(i)
#     print(names[i])

list = [
    [11,22,33],
    [44,55,77]
]
# index: change element of list



# every element increase by 1

# for x in list:        # save value of element in a temporary variable,suit when you want to view element
#     for y in x:
#         y += 1
#         print(y,end=' ')
#     print()

for x in range(len(list)):
    for y in range(len(list[x])):
        list[x][y]+=1

print(list)