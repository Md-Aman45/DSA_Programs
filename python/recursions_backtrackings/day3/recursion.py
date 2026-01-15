# # reverse an array...
# def reverse(l, r, arr):
#     if (l >= r): 
#         return
#     arr[l], arr[r] = arr[r], arr[l]

#     reverse(l + 1, r - 1, arr)


# # -------- main --------
# n = int(input("Enter size of array: "))

# arr = list(map(int, input("Enter array elements: ").split()))

# reverse(0, n - 1, arr)

# print("Reversed array:", arr)






# # reverse an array...
# def reverse(i, arr):
#     n = len(arr)
#     if i >= n // 2:
#         return
#     arr[i], arr[n - i - 1] = arr[n - i - 1], arr[i]

#     reverse(i + 1, arr)


# # -------- main --------
# n = int(input("Enter size of array: "))

# arr = list(map(int, input("Enter array elements: ").split()))

# reverse(0, arr)

# print("Reversed array:", arr)






# check if a string is palindrome or not...
def palindrome(i, s):
    n = len(s)
    if i >= n // 2:
        return True
    
    if s[i] != s[n - i - 1]:
        return False
    
    return palindrome(i + 1, s)


# -------- main --------
s = input("Enter a string: ")

if palindrome(0, s):
    print("String is a Palindrome")
else:
    print("String is NOT a Palindrome")