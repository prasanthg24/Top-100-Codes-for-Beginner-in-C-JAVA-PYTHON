s=int (input("Enter the Start Range =  "))
e=int(input("Enter the End Range = "))
sum = 0
for i in range(s,e+1):
        sum=sum+i;

print("Sum of Range ",s,"to",e,"is",sum)