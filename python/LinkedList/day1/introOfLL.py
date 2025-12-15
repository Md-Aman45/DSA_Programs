class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
    

n = int(input("Enter no. of elements: "))
arr = list(map(int, input(f"Enter {n} numbers: ").split()))

y = Node(arr[3])
print(y.data)