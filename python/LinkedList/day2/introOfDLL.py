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
# delete in DLL...
def deleteHead(head):
    if head is None or head.next is None:
        return None
    
    prev = head
    head = head.next
    head.back = None
    prev.next = None

    return head





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
head = deleteHead(head)





# print statement...
printDLL(head)
printReverse(head)