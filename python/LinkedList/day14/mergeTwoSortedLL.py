class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next
    



def convertArrToLL(arr):
    if not arr:
        return None

    head = Node(arr[0])
    temp = head

    for i in range(1, len(arr)):
        temp.next = Node(arr[i])
        temp = temp.next

    return head



def mergeTwoSorted(head1, head2):
    arr = []

    temp1 = head1
    temp2 = head2

    while temp1:
        arr.append(temp1.data)
        temp1 = temp1.next
    
    while temp2:
        arr.append(temp2.data)
        temp2 = temp2.next
    
    arr.sort()

    head = convertArrToLL(arr)

    return head






# -------- PRINT FUNCTION --------
def printList(head):
    while head:
        print(head.data, end=" ")
        head = head.next
    print()


# -------- DRIVER CODE --------
n1 = int(input("Enter number of nodes in first list: "))
values1 = list(map(int, input("Enter first sorted list: ").split()))

head1 = None
tail1 = None
for val in values1:
    node = Node(val)
    if head1 is None:
        head1 = tail1 = node
    else:
        tail1.next = node
        tail1 = node


n2 = int(input("Enter number of nodes in second list: "))
values2 = list(map(int, input("Enter second sorted list: ").split()))

head2 = None
tail2 = None
for val in values2:
    node = Node(val)
    if head2 is None:
        head2 = tail2 = node
    else:
        tail2.next = node
        tail2 = node


mergedHead = mergeTwoSorted(head1, head2)

print("Merged Sorted List:")
printList(mergedHead)