class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None


def detectLoop(head):
    # brute approach...
    # visited = set()
    # temp = head

    # while temp is not None:
    #     if temp in visited:
    #         return True

    #     visited.add(temp)

    #     temp = temp.next
    
    # return False





    # optimal approach...
    slow = head
    fast = head

    while fast is not None and fast.next is not None:
        slow = slow.next
        fast = fast.next.next

        if slow == fast:
            return True
    
    return False








# ----------- MAIN ------------
n = int(input("Enter number of nodes: "))
print("Enter node values:", end=" ")

values = list(map(int, input().split()))

head = None
prev = None

for val in values:
    node = Node(val)
    if head is None:
        head = node
    else:
        prev.next = node
    prev = node

# Create cycle (optional)
pos = int(input("Enter position to create cycle (0 for no cycle): "))

if pos > 0:
    temp = head
    for _ in range(pos - 1):
        temp = temp.next
    prev.next = temp

# Detect cycle
if detectLoop(head):
    print("Cycle detected")
else:
    print("No cycle detected")
