def longest_palindrome(s: str) -> str:
    if s is None or len(s) <= 1:
        return s

    start = 0
    max_Len = 1

    for i in range(len(s)):
        low = i
        high = i

        while low >= 0 and high < len(s) and s[low] == s[high]:
            if high - low + 1 > max_Len:
                start = low
                max_Len = high - low + 1

            low -= 1
            high += 1


        low = i
        high = i + 1

        while low >= 0 and high < len(s) and s[low] == s[high]:
            if high - low + 1 > max_Len:
                start = low
                max_Len = high - low + 1
            
            low -= 1
            high += 1

    return s[start:start + max_Len]





# ---- main ----
if __name__ == "__main__":
    s = input("Enter a string: ")
    result = longest_palindrome(s)
    print("Longest Palindromic Substring:", result)

        