class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next


def sortll(head):
    if head is None or head.next is None:
        return head
    

    arr = []
    temp = head
    
    while temp:
        arr.append(temp.data)
        temp = temp.next
    
    arr.sort()

    i = 0
    temp = head

    while temp:
        temp.data = arr[i]
        i = i + 1
        temp = temp.next
    
    return head




# ----------- print list -----------
def printList(head):
    while head:
        print(head.data, end=" ")
        head = head.next
    print()




# -------- DRIVER CODE --------
n = int(input("Enter number of nodes: "))
values = list(map(int, input("Enter elements: ").split()))

head = tail = None
for val in values:
    node = Node(val)
    if not head:
        head = tail = node
    else:
        tail.next = node
        tail = node

head = sortll(head)

print("Sorted List:")
printList(head)