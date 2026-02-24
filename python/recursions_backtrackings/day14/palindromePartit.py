def palindrome_partition(s):
    res = []
    path = []

    def isPalindrome(start, end):
        while start <= end:
            if s[start] != s[end]:
                return False
            start += 1
            end -= 1
            
        return True
    
    def backtrack(ind):
        if ind == len(s):
            res.append(path.copy())
            return
        
        for i in range(ind, len(s)):
            if isPalindrome(ind, i):
                path.append(s[ind:i+1])
                backtrack(i + 1)
                path.pop()
    
    backtrack(0)
    return res



# -------- MAIN --------
s = input("Enter string: ")
result = palindrome_partition(s)

print("Palindrome Partitions:")
for r in result:
    print(r)