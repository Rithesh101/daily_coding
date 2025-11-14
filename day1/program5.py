nums = [2,2,3,10]
count = 0
sum = 0
for i in nums:
    sum += i
n = len(nums)
avg = sum/n
for i in nums:
    if i > avg:
        count+=1
print(avg)
print(count)
        