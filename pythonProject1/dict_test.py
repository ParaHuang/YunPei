dict = {
    'name':'Mark',
    'age':18,
    'gender':'m'
}

dict['class'] = 'S1'
print(dict)

print(dict['name'])

# 删除
del dict['age']
print(dict)

# del dict
# print(dict)

# dict.clear()
# print(dict)

print(len(dict))

for item in dict.items():
    # print(item)
    print(item[1])

for k in dict.keys():
    print(dict[k])

for v in dict.values():
    print(v)

print()
for k,v in dict.items():
    # print(item)
    print(v)

print(str(dict))