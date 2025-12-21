class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None


def reverseDLL(head):
    if head is None:
        return head
    
    temp = head
    st = []

    # push data into stack...
    while temp is not None:
        st.append(temp.data)
        temp = temp.next

    
    # replace data from stack...
    temp = head
    while temp is not None:
        temp.data = st.pop()
        temp = temp.next

    return head


def printDLL(head):
    temp = head
    while temp is not None:
        print(temp.data, end=" ")
        temp = temp.next
    print()


# -------- main --------
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
        newNode.back = prev

    prev = newNode


head = reverseDLL(head)
printDLL(head)