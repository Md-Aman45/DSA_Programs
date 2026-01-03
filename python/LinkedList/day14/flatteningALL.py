class Node:
    def __init__(self, data, next=None, bottom=None):
        self.data = data
        self.next = next
        self.bottom = bottom

    


# def convertArrToLL(arr):
#     if not arr:
#         return None
    
#     head = Node(arr[0])
#     temp = head

#     for i in range(1, len(arr)):
#         newNode = Node(arr[i])
#         temp.bottom = newNode
#         temp = temp.bottom
    
#     return head




def mergeTwoLL(list1, list2):
    dNode = Node(-1)
    res = dNode

    while list1 and list2:
        if list1.data <= list2.data:
            res.bottom = list1
            list1 = list1.bottom
        else:
            res.bottom = list2
            list2 = list2.bottom
        
        res = res.bottom
        res.next = None
        
    if list1:
        res.bottom = list1
    else:
        res.bottom = list2
    
    return dNode.bottom





def flattenALL(head):
    # arr = []
    # temp = head

    # while temp:
    #     t2 = temp

    #     while t2:
    #         arr.append(t2.data)
    #         t2 = t2.bottom

    #     temp = temp.next
    
    # arr.sort()

    # head = convertArrToLL(arr)

    # return head





    # optimal approach...
    if head is None or head.next is None:
        return head

    mergedHead = flattenALL(head.next)
    return mergeTwoLL(head, mergedHead)









# -------- PRINT FUNCTION (horizontal output) --------
def printList(head):
    while head:
        print(head.data, end=" ")
        head = head.bottom
    print()


# -------- DRIVER CODE --------
n = int(input("Enter number of vertical lists: "))

head = None
prev = None

for i in range(n):
    values = list(map(int, input(f"Enter elements of list {i+1}: ").split()))

    verticalHead = None
    verticalTail = None

    for val in values:
        node = Node(val)
        if verticalHead is None:
            verticalHead = verticalTail = node
        else:
            verticalTail.bottom = node
            verticalTail = node

    if head is None:
        head = verticalHead
    else:
        prev.next = verticalHead

    prev = verticalHead


head = flattenALL(head)

print("Flattened List:")
printList(head)