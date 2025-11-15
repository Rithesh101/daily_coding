n=6
for i in range(1,n+1):
    if i==1 or i==6:
        print("*" * n)
    else:
        print("*" + " " * (n-2)+ "*")