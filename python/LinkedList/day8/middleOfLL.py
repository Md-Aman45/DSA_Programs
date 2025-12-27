class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None



def middleLL(head):
    temp = head
    cnt = 0

    while temp is not None:
        cnt += 1
        temp = temp.next
    
    midNode = (cnt // 2) + 1

    temp = head

    while temp is not None:
        midNode -= 1
        if midNode == 0:
            break

        temp = temp.next
    
    return temp






# -------- MAIN --------
n = int(input("Enter number of nodes: "))
print("Enter elements:", end=" ")

values = list(map(int, input().split()))

head = None
prev = None

for val in values:
    newNode = Node(val)
    if head is None:
        head = newNode
    else:
        prev.next = newNode
    prev = newNode

mid = middleLL(head)
print("Middle element:", mid.data)
