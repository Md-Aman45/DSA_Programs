def min_bit_flips(a, b):
    xor = a ^ b
    count = 0

    while xor != 0:
        if (xor & 1) == 1:
            count += 1
        xor >>= 1

    return count


# main
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

result = min_bit_flips(a, b)

print("Minimum bit flips required:", result)