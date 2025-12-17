class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
    

def convert_arr_to_LL(arr):
    head = Node(arr[0])
    mover = head

    for i in range(1, len(arr)):
        temp = Node(arr[i])
        mover.next = temp
        mover = temp
        # mover = mover.next
    
    return head


def lengthOfLL(head):
    cnt = 0
    temp = head

    while temp is not None:
        temp = temp.next
        cnt += 1
    
    return cnt


def checkIfPresent(head, val):
    temp = head

    while temp is not None:
        if temp.data == val:
            return 1
        temp = temp.next

    return 0




def printStatement(head):
    while head is not None:
        print(head.data, end=" ")
        head = head.next
    
    print()




# ---------- deletion ----------

# head of LL...
def removesHead(head):
    if head is None:
        return head
    head = head.next
    return head


# tail of LL...
def removesTail(head):
    if (head is None or head.next is None):
        return None
    
    temp = head

    while temp.next.next is not None:
        temp = temp.next
    
    temp.next = None

    return head




# main...
n = int(input("Enter no. of elements: "))
arr = list(map(int, input(f"Enter {n} numbers: ").split()))



# Node...
# y = Node(arr[3])
head = convert_arr_to_LL(arr)



# print(head.data)
# print(lengthOfLL(head))
# print(checkIfPresent(head, 1))
# head = removesHead(head)
head = removesTail(head)




printStatement(head)