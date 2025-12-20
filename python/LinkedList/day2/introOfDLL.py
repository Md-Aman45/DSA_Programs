class Node:
    def __init__(self, data, next=None, back=None):
        self.data = data
        self.next = next
        self.back = back





# Convert arr to DLL...
def convertArrToDLL(arr):
    if not arr:
        return None
    
    head = Node(arr[0])
    prev = head

    for i in range(1, len(arr)):
        temp = Node(arr[i], None, prev)
        prev.next = temp
        prev = temp
    
    return head





# ---------- Deletion -----------
# delete head in DLL...
def deleteHead(head):
    if head is None or head.next is None:
        return None
    
    prev = head
    head = head.next
    head.back = None
    prev.next = None

    return head


# delete tail in DLL...
def deleteTail(head):
    if head is None or head.next is None:
        return head
    
    tail = head
    while tail.next is not None:
        tail = tail.next
    
    prev = tail.back
    prev.next = None
    tail.back = None

    return head



# delete kth ele in DLL...
def deleteKthElement(head, k):
    if head == None: return None

    cnt = 0
    temp = head
    while temp is not None:
        cnt += 1
        if (cnt == k): break
        temp = temp.next

    prev = temp.back
    front = temp.next

    if prev is None and front is None:
        return None
    
    elif prev is None:
        return deleteHead(head)
    elif front is None:
        return deleteTail(head)
    
    prev.next = front
    front.back = prev
    temp.next = None
    temp.back = None

    return head



# delete the Node of the DLL...
def deleteNode(temp):
    if temp is None:
        return
    
    prev = temp.back
    front = temp.next

    if front is None:
        prev.next = None
        temp.back = None
        return
    
    prev.next = front
    front.back = prev
    temp.next = temp.back = None





# ---------- Insertion (before) ----------
# insert head in DLL...
def insertHead(head, val):
    if head == None:
        return val
    
    newHead = Node(val, head, None)
    head.back = newHead

    return newHead






# print Statement...
def printDLL(head):
    temp = head
    while temp is not None:
        print(temp.data, end=" ")
        temp = temp.next
    print()

def printReverse(head):
    if head is None:
        return
    
    temp = head

    while temp.next is not None:
        temp = temp.next

    while temp is not None:
        print(temp.data, end=" ")
        temp = temp.back
    print()








# -------- main --------
n = int(input("Enter no. of elements: "))
arr = list(map(int, input(f"Enter {n} numbers: ").split()))




# convert arr to DLL...
head = convertArrToDLL(arr)



# ---------- deletion ------------
# head = deleteHead(head)
# head = deleteTail(head)
# head = deleteKthElement(head, 3)
# deleteNode(head.next)





# ----------- Insertion ----------
head = insertHead(head, 2)





# print statement...
printDLL(head)
printReverse(head)