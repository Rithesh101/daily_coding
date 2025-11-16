arr = [12, 74, 39, 10,91, 98, 35, 83, 90, 71, 34, 76]
k = 8
sum = 0
count = 0
for i in range(len(arr)):
    while(arr[i]>0):
        rem = arr[i]%10
        sum += rem
        arr[i]= arr[i]//10  
    print(sum)
    if (sum>k):
        count+=1
    sum = 0
print(count)
        
    
    
    