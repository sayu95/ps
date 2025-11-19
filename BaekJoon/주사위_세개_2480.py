noon1, noon2, noon3 = map(int, input().split())

if noon1 == noon2 == noon3 : 
    result = 10000 + (noon1) * 1000
elif noon1 == noon2 :
    result = 1000 + (noon1) * 100
elif noon2 == noon3 :
    result = 1000 + (noon2) * 100
elif noon1 == noon3 :
    result = 1000 + (noon1) * 100
else :
    result = max(noon1, noon2, noon3) * 100
    
print(result)
