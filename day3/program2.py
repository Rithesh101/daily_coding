n = int(input("number: "))

even = 0
odd = 0
while(n>0):
    rem = n%10
    if(rem%2==0):
        even+=1
    else:
        odd+=1
    n = n//10
print(f"even:{even}, odd: {odd}")