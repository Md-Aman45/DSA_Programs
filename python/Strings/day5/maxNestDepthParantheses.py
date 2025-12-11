def maximum_nesting_depth(s):
    currOpen = 0
    maxOpen = 0

    for ch in s:
        if ch == '(':
            currOpen += 1
        elif ch == ')':
            currOpen -= 1
    
        maxOpen = max(currOpen, maxOpen)

    return maxOpen



# ----- main -----
if __name__ == "__main__":
    s = input("Enter parentheses string: ")
    ans = maximum_nesting_depth(s)
    print("Maximum nesting depth:", ans)