class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None


def reverseLL(head):
    if head is None or head.next is None:
        return head
    
    # temp = head
    # st = []

    # while temp is not None:
    #     st.append(temp.data)
    #     temp = temp.next
    

    # temp = head

    # while temp is not None:
    #     temp.data = st.pop()
    #     temp = temp.next

    # return head





    # optimal approach...
    # temp = head
    # prev = None

    # while temp is not None:
    #     front = temp.next
    #     temp.next = prev
    #     prev = temp
    #     temp = front
    
    # return prev





    # recursive...
    newHead = reverseLL(head.next)
    front = head.next
    front.next = head
    head.next = None
    return newHead









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


head = reverseLL(head)
printDLL(head)