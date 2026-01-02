class Node:
    def __init__(self, data, next=None, prev=None):
        self.data = data
        self.next = next
        self.prev = prev


def remove_duplicates(head):
    if head is None or head.next is None:
        return head
    
    temp = head

    while temp is not None and temp.next is not None:
        nextNode = temp.next

        while nextNode is not None and nextNode.data == temp.data:
            nextNode = nextNode.next
        
        temp.next = nextNode
        if nextNode is not None:
            nextNode.prev = temp
        temp = temp.next
    
    return head





# ---------- PRINT FUNCTION ----------
def print_list(head):
    while head:
        print(head.data, end=" ")
        head = head.next
    print()


# ---------- DRIVER CODE ----------
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
        node.prev = tail
        tail = node

head = remove_duplicates(head)

print("After removing duplicates:")
print_list(head)