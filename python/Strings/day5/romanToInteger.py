def romanToInt(s):
    roman_map = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    }

    s = s.upper()

    result = roman_map[s[-1]]

    for i in range(len(s) - 2, -1, -1):
        curr = roman_map[s[i]]
        next_val = roman_map[s[i + 1]]

        if curr < next_val:
            result -= curr

        else:
            result += curr
    
    return result





# ----- main -----
if __name__ == "__main__":
    s = input("Enter Roman numeral: ").strip()
    value = romanToInt(s)
    print("Integer value:", value)