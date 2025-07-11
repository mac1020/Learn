age = int(input())
if(age>=18):
  print("Eligible for vote")
elif(age>=0 & age<18):
   print("Not Eligible for vote")
else:
  print("Invalid Input")