n = int(input("Enter the size of Array: "))
arr = list(map(int, input(f"Enter {n} numbers: ").split()))


pos = []
neg = []

for num in arr:
    if num >= 0:
        pos.append(num)
    else:
        neg.append(num)

i = j = k = 0


while i < len(pos) and j < len(neg):
    arr[k] = pos[i]
    k += 1
    i += 1

    arr[k] = neg[j]
    k += 1
    j += 1


while i < len(pos):
    arr[k] = pos[i]
    k += 1
    i += 1


while j < len(neg):
    arr[k] = neg[j]
    k += 1
    j += 1

print("Rearranged Array:", arr)
