movies = []
mov1 = "jn" 
mov2 = "ihj"
movies.append(mov1)
movies.append(mov2)
print(movies)
mov = "yug"
movies.append(mov)
mov = "uyg"
movies.append(mov)
print(movies)
movies.append("ytfhgfd")
print(movies)


list = [1,2,3,2,1]
list_cp = list.copy() #shallow copy
if(list==list_cp):
    print("Palindrome")
else:
    print("Not Palindrome")