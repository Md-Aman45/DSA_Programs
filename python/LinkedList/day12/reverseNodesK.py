class Node:
    def __init__(self, data, next=None, prev=None):
        self.data = data
        self.next = next
        self.prev = prev



def reverseLL(head):
    if head is None or head.next is None:
        return head
    
    temp = head
    prev = None

    while temp is not None:
        front = temp.next
        temp.next = prev
        prev = temp
        temp = front
    
    return prev



def findKthNode(temp, k):
    k -= 1

    while temp is not None and k > 0:
        k -= 1
        temp = temp.next
    
    return temp



def reverseNodeKth(head, k):
    temp = head
    prevNode = None

    while temp is not None:
        kthNode = findKthNode(temp, k)

        if kthNode == None:
            if prevNode:
                prevNode.next = temp
            break

        nextNode = kthNode.next
        kthNode.next = None

        reverseLL(temp)

        if temp == head:
            head = kthNode
        else:
            prevNode.next = kthNode
        
        prevNode = temp
        temp = nextNode
    
    return head







# ---------- PRINT FUNCTION ----------
def printList(head):
    while head:
        print(head.data, end=" ")
        head = head.next
    print()


# ---------- MAIN ----------
n = int(input("Enter number of nodes: "))
print("Enter elements:", end=" ")
values = list(map(int, input().split()))

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

head = reverseNodeKth(head, k)

print("Result:")
printList(head)
