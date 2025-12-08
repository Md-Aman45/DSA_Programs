def largest_odd_num_in_str(s):
    for i in range(len(s) - 1, -1, -1):
        if int(s[i]) % 2 != 0:
            return s[:i + 1]
    return ""


if __name__ == "__main__":
    num = input("Enter numeric string: ")
    ans = largest_odd_num_in_str(num)
    

    if ans == "":
        print("Largest odd number in string: NONE")
    else:
        print("Largest odd number in string:", ans)