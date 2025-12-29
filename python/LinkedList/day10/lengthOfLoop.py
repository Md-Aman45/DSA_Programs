class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None


def lengthOfloop(head):
    # brute approach...
    # mpp = {}
    # temp = head
    # timer = 1

    # while temp:
    #     if temp in mpp:
    #         value = mpp[temp]
    #         return timer - value
        
    #     mpp[temp] = timer
    #     timer += 1
    #     temp = temp.next
    
    # return 0






    # optimal approach...
    slow = head
    fast = head

    while fast is not None and fast.next is not None:
        slow = slow.next
        fast = fast.next.next

        if slow == fast:
            return findLength(slow, fast)
        
    return 0




def findLength(slow, fast):
    cnt = 1
    fast = fast.next

    while slow is not fast:
        cnt += 1
        fast = fast.next
    
    return cnt







# ------------ MAIN -------------
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

# Create loop
pos = int(input("Enter position to create loop (0 for no loop): "))

if pos > 0:
    temp = head
    for _ in range(pos - 1):
        temp = temp.next
    prev.next = temp  # create cycle

# -------- CHECK LOOP LENGTH --------
length = lengthOfloop(head)

if length > 0:
    print("Length of loop:", length)
else:
    print("No loop present")
