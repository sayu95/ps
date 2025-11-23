num1, num2 = map(int, input().split())
maxNum = max(num1, num2)
minNum = min(num1, num2)

cnt = maxNum - minNum -1

if maxNum - minNum <= 1:
    cnt = 0
    
print(cnt)
for i in range(minNum+1, maxNum) :
    print(i, end=" ")
