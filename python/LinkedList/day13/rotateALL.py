class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next


def findNthNode(temp, k):
    cnt = 1
    while temp is not None:
        if cnt == k: return temp
        cnt += 1
        temp = temp.next
    return temp




def rotateAList(head, k):
    if head is None or k == 0:
        return head
    
    len = 1
    tail = head

    while tail.next is not None:
        len += 1
        tail = tail.next
    
    if k % len == 0:
        return head
    
    k = k % len
    tail.next = head

    newLastNode = findNthNode(head, (len - k))

    head = newLastNode.next
    newLastNode.next = None

    return head





# -------- PRINT FUNCTION --------
def printList(head):
    while head:
        print(head.data, end=" ")
        head = head.next
    print()


# -------- DRIVER CODE --------
n = int(input("Enter number of nodes: "))
values = list(map(int, input("Enter values: ").split()))

head = None
tail = None

for val in values:
    node = Node(val)
    if head is None:
        head = tail = node
    else:
        tail.next = node
        tail = node

k = int(input("Enter k: "))

head = rotateAList(head, k)

print("Rotated List:")
printList(head)
