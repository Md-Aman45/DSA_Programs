n1 = int(input("Enter the size of n1 array: "))
a = list(map(int, input(f"Enter {n1} numbers for n1 array: ").split()))

n2 = int(input("Enter the size of n2 array: "))
b = list(map(int, input(f"Enter {n2} numbers for n2 array: ").split()))

# Optimal approach...
# 2 pointer approach...
a.sort()
b.sort()
i = j = 0

ans = []

while i < n1 and j < n2:
    if a[i] < b[j]:
        i += 1
    
    elif a[i] > b[j]:
        j += 1
    else:
        if len(ans) == 0 or ans[-1] != a[i]:
            ans.append(a[i])
        i += 1
        j += 1
    
print("Intersection: ", ans)