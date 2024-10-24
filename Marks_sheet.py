a=int(input("enter urdu marks = "))
b=int(input("enter English marks = "))
c=int(input("enter Math marks = "))
d=int(input("enter Physics marks = "))
e=int(input("enter computer marks = "))
f=int(input("enter Islamiat marks = "))
g=int(input("enter pakistan studies marks = "))

sum=a+b+c+d+e+f+g
print("marks = ",sum)
percentage=sum*100/700
print("percentage = ",percentage,"%")
if(percentage>=80):
    print("Grade = A+ ")
elif(percentage>=70 and percentage<79):
    print("A grade")
elif(percentage>=60 and percentage<69):
    print("B grade")
elif(percentage>=50 and percentage<59):
    print("C grade")
else:
    print("failed")
