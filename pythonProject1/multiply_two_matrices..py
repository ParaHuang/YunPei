def multiply_matrics(A,B):
    #value -> false
    #0, 0.0 , "",[],{}
   if not A or not B:
        return None

   minA = min([len(x) for x in A])
   if minA != len(B):
       return None
   m = len(A)           # A的行数  rows
   n = len(A[0])        # A的列数  columns   <=>  B的行数
   p = len(B[0])        # B的列数

   result = [[0 for _ in range(p)] for _ in range(m)]

   for i in range(m):      # 走的是A的每一行
      for j in range(p):   # 走的是B的每一列
         total = 0
         for k in range(n):   # 走的是某行A里面的每一个小数据，与某列B里面的每一个小数据
            total += A[i][k] * B[k][j]
         result[i][j] = total
   return result

A = [[1, 2, 3],
     [4, 5, 6]]
# A = [[1, 2, 3],
#      [4, 5, 6],
#      [7, 8, 9]]
B = [[7, 8],
     [9, 10],
     [11, 12]]
result = multiply_matrics(A,B)
print(result)

print(multiply_matrics([], [[1]]))
print(multiply_matrics([[1, 2], [3]], [[4, 5], [6, 7]]))