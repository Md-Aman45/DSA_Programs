def is_isomorphic(s, t):
    if len(s) != len(t):
        return False
    
    map_st = {}
    map_ts = {}

    for char_s, char_t in zip(s, t):
        # Check mapping s -> t...
        if char_s in map_st:
            if map_st[char_s] != char_t:
                return False
            
        else:
            map_st[char_s] = char_t


        # Check mapping t -> s...
        if char_t in map_ts:
            if map_ts[char_t] != char_s:
                return False
        
        else:
            map_ts[char_t] = char_s

    return True


if __name__ == "__main__":
    s = input("Enter first string: ")
    t = input("Enter second string: ")

    result = is_isomorphic(s, t)

    if result:
        print("Result: The strings ARE isomorphic.")
    else:
        print("Result: The strings are NOT isomorphic.")