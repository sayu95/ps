arr = []
for i in range(7) :
    num = int(input())

    if num % 2 :
        arr.append(num)
        
    if not arr: print("-1")

print(sum(arr), min(arr), sep="\n")
