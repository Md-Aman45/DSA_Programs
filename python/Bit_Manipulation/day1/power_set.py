def get_subsets(arr):
    n = len(arr)
    result = []

    total = 1 << n

    for num in range(total):
        subset = []

        for i in range(n):
            if (num & (1 << i)) != 0:
                subset.append(arr[i])

        result.append(subset)

    return result


# main
n = int(input("Enter size of array: "))
arr = list(map(int, input("Enter elements: ").split()))

result = get_subsets(arr)

print("All subsets:")
for subset in result:
    print(subset)