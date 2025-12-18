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



# position of LL...
def removesK(head, k):
    if head is None:
        return head
    
    if k == 1:
        head = head.next
        return head
    
    cnt = 0
    temp = head
    prev = None

    while temp is not None:
        cnt += 1
        if cnt == k:
            prev.next = temp.next
            break

        prev = temp
        temp = temp.next
    
    return head



# value in LL...
def removesEl(head, el):
    if head is None:
        return head
    
    if head.data == el:
        return head.next
    
    temp = head
    prev = None

    while temp is not None:
        if temp.data == el:
            prev.next = temp.next
            break

        prev = temp
        temp = temp.next
    
    return head





# ---------- Insertion ----------

# head of LL...
def insertHead(head, val):
    temp = Node(val)
    temp.next = head
    return temp


# tail of LL...
def insertTail(head, val):
    if head is None:
        return Node(val)
    
    temp = head
    while temp.next is not None:
        temp = temp.next

    newNode = Node(val)
    temp.next = newNode
    return head




# kth of LL...
def insertKth(head, el, k):
    if k == 1:
        temp = Node(el)
        temp.next = head
        return temp
    
    cnt = 0
    temp = head

    while temp is not None:
        cnt += 1

        if cnt == k - 1:
            x = Node(el)
            x.next = temp.next
            temp.next = x
            break
        temp = temp.next
    
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


# ----------- Deletion -----------
# head = removesHead(head)
# head = removesTail(head)
# head = removesK(head, 3)
# head = removesEl(head, 3)



# ----------- Insertion ------------
# head = insertHead(head, 100)
# head = insertTail(head, 20)
head = insertKth(head, 100, 2)




printStatement(head)