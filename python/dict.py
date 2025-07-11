person = {
    "name" : "Mehak",
    "age" :"25"
}
print(person)
Student = {
    "name" : "Mehak Kushwaha",
    "marks" : {
        "phy" : 97,
        "chem" : 78,
        "Math" : 86
    }
}

print(Student)
print(Student["marks"])
print(Student["marks"]["chem"])
print(Student.keys())
print(list(Student.keys()))
print(Student.values())
print(Student.items())
print(Student.get("marks"))
#print(Student["name1"]) #error
print(Student.get("name1")) #return none
Student.update({"city":"Kasganj"})
print(Student)
dict={
    "age" : 25,
    "Language" : "Hindi"
}
Student.update(dict)
print(dict)
print(Student)
