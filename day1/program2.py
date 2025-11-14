n = int(input("enter a number:"))
count = 0
while ( n>0):
    
    rem = n%10
    if rem % 2==0:
        count+=1
        
    n = n//10
        
print(count)
        
    
    