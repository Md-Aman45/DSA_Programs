class Node:
    def __init__(self, data, next=None, prev=None):
        self.data = data
        self.next = next
        self.prev = prev

    




def findTail(head):
    tail = head
    while tail.next is not None:
        tail = tail.next
    
    return tail



def pairWithSum(head, target):

    # brute approach...
    # ans = []
    # temp1 = head

    # if head is None:
    #     return ans
    
    # while temp1:
    #     temp2 = temp1.next

    #     while temp2:
    #         if temp1.data + temp2.data == target:
    #             ans.append((temp1.data, temp2.data))
    #         temp2 = temp2.next
        
    #     temp1 = temp1.next
    
    # return ans






    # optimal appproach...
    left = head
    right = findTail(head)
    ans = []

    if head is None:
        return ans

    while left.data < right.data:
        if left.data + right.data == target:
            ans.append((left.data, right.data))
            left = left.next
            right = right.prev
        
        elif left.data + right.data < target:
            left = left.next
        
        else:
            right = right.prev
        
    return ans








# ---------- INPUT ----------
n = int(input("Enter number of nodes: "))
values = list(map(int, input("Enter node values: ").split()))
target = int(input("Enter target sum: "))

# Create doubly linked list
head = None
tail = None

for val in values:
    node = Node(val)
    if head is None:
        head = node
        tail = node
    else:
        tail.next = node
        node.prev = tail
        tail = node

# Find pairs
result = pairWithSum(head, target)

# ---------- OUTPUT ----------
if result:
    print("Pairs with given sum:")
    for pair in result:
        print(pair)
else:
    print("No pairs found")