def isPalindrome(s):
    l = 0
    r = len(s) - 1
    while l < r:
        if s[l] != s[r]:
            return False
        l += 1
        r -= 1
    return True

# Main program
string = input("Enter a string: ")
if isPalindrome(string):
    print("The String is palindrome")
else:
    print("The String is not palindrome")
