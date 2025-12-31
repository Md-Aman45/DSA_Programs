class Node:
    def __init__(self, data, next=None, prev=None):
        self.data = data
        self.next = next
        self.prev = prev



def deleteallOccur(head, key):
    temp = head

    while temp is not None:
        if temp.data == key:
            if temp == head:
                head = head.next
            
            nextNode = temp.next
            prevNode = temp.prev

            if (nextNode):
                nextNode.prev = prevNode
            if (prevNode):
                prevNode.next = nextNode
            
            temp = nextNode
        
        else:
            temp = temp.next
        
    return head





def printList(head):
    temp = head
    while temp:
        print(temp.data, end=" <-> ")
        temp = temp.next
    print("None")


# ---------- DRIVER CODE ----------
n = int(input("Enter number of nodes: "))
values = list(map(int, input("Enter values: ").split()))

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

key = int(input("Enter value to delete: "))

head = deleteallOccur(head, key)

print("List after deletion:")
printList(head)