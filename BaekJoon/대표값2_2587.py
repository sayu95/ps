numList = []
for _ in range(5) :
   numList.append(int(input()))

numList.sort()

print(int((sum(numList)/len(numList))), numList[2], sep="\n")
