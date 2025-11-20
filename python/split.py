string = "My name is mehak Kushwaha"
Words = string.split()
Words1 = string.split(' ',maxsplit=2)
even = [ w for w in Words if len(w)%2 == 0 ]
s = " ".join(even)
print(s)
print(even)
print(Words)
print(Words1)
