def is_Anagram(str1, str2):
    str1 = str1.lower().replace(" ", "")
    str2 = str2.lower().replace(" ", "")

    if len(str1) != len(str2):
        return False
    
    counts = [0] * 26

    for ch in str1:
        counts[ord(ch) - ord('a')] += 1

    for ch in str2:
        counts[ord(ch) - ord('a')] -= 1

    for count in counts:
        if count != 0:
            return False
    
    return True



# -------- main --------
if __name__ == "__main__":
    s1 = input("Enter first string: ")
    s2 = input("Enter second string: ")

    result = is_Anagram(s1, s2)

    if result:
        print("Result: The strings ARE anagrams.")
    else:
        print("Result: The strings are NOT anagrams.")