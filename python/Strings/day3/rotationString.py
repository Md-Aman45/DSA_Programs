def are_rotations(s1, s2):
    if len(s1) != len(s2):
        return False
    
    concat = s1 + s1
    return s2 in concat



if __name__ == "__main__":
    s1 = input("Enter first string: ")
    s2 = input("Enter second string: ")

    result = are_rotations(s1, s2)

    if result:
        print("Result: The strings ARE rotations of each other.")
    else:
        print("Result: The strings are NOT rotations of each other.")