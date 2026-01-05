class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next




def findMiddle(head):
    if head is None or head.next is None:
        return head
    
    slow = head
    fast = head.next

    while fast is not None and fast.next is not None:
        slow = slow.next
        fast = fast.next.next

    return slow




def mergeTwoList(head1, head2):
    if head1 == None:
        return head2
    if head2 == None:
        return head1
    
    t1 = head1
    t2 = head2
    dNode = Node(-1)
    temp = dNode

    while t1 and t2:
        if t1.data < t2.data:
            temp.next = t1
            temp = t1
            t1 = t1.next
        
        else:
            temp.next = t2
            temp = t2
            t2 = t2.next
        
    if t1:
        temp.next = t1
    else:
        temp.next = t2

    return dNode.next





def sortll(head):
    if head is None or head.next is None:
        return head
    

    # arr = []
    # temp = head
    
    # while temp:
    #     arr.append(temp.data)
    #     temp = temp.next
    
    # arr.sort()

    # i = 0
    # temp = head

    # while temp:
    #     temp.data = arr[i]
    #     i = i + 1
    #     temp = temp.next
    
    # return head





    # optimal approach...
    middle = findMiddle(head)
    leftHead = head
    rightHead = middle.next
    middle.next = None

    leftHead = sortll(leftHead)
    rightHead = sortll(rightHead)

    return mergeTwoList(leftHead, rightHead)







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