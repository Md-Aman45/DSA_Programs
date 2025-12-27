class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None



# def reverseLL(head):
#     if head is None or head.next is None:
#         return head
    
#     temp = head
#     prev = None

#     while temp is not None:
#         front = temp.next
#         temp.next = prev
#         prev = temp
#         temp = front

#     return prev



# def addOnetoLL(head):
#     head = reverseLL(head)
#     temp = head
#     carry = 1

#     while temp is not None:
#         temp.data = temp.data + carry

#         if temp.data < 10:
#             carry = 0
#             break

#         else:
#             temp.data = 0
#             carry = 1
        
#         temp = temp.next

#     if carry == 1:
#         newNode = Node(1)
#         head = reverseLL(head)
#         newNode.next = head
#         return newNode
    
#     head = reverseLL(head)
#     return head




# recursion...
def helper(temp):
    if temp == None:
        return 1
    
    carry = helper(temp.next)
    temp.data += carry

    if temp.data < 10:
        return 0
    
    temp.data = 0
    return 1



def addOnetoLL(head):
    carry = helper(head)

    if carry == 1:
        newNode = Node(1)
        newNode.next = head
        return newNode
    
    return head








def printLL(head):
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


head = addOnetoLL(head)
print("Result:")
printLL(head)