INT_MAX = 2**31 - 1
INT_MIN = -2**31

def isAtoi(s: str) -> int:
    if s is None:
        return 0
    
    i = 0
    n = len(s)

    while i < n and s[i] == ' ':
        i += 1

    if i == n:
        return 0
    
    sign = 1
    if s[i] == '+' or s[i] == '-':
        if s[i] == '-':
            sign = -1
        i += 1

    ans = 0
    while i < n and s[i].isdigit():
        digit = ord(s[i]) - ord('0')
        ans = ans * 10 + digit

        if sign == 1 and ans > INT_MAX:
            return INT_MAX
        
        if sign == -1 and -ans < INT_MIN:
            return INT_MIN

        i += 1
    
    return sign * ans




# ---- main ----
if __name__ == "__main__":
    s = input("Enter a string: ")
    result = isAtoi(s)
    print("Converted Integer:", result)