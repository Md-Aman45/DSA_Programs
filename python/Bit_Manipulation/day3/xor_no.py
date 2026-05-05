def xor_upto_n(n):
    if n % 4 == 0:
        return n
    elif n % 4 == 1:
        return 1
    elif n % 4 == 2:
        return n + 1
    else:
        return 0


# main
# n = int(input("Enter n: "))

# ans = xor_upto_n(n)

# print("XOR from 1 to n:", ans)





L = int(input("Enter L: "))
R = int(input("Enter R: "))

ans = xor_upto_n(R) ^ xor_upto_n(L - 1)

print("XOR from L to R:", ans)