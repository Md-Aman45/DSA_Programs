class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None




def reverseLL(head):
    if head is None or head.next is None:
        return head
    
    temp = head
    prev = None

    while temp is not None:
        front = temp.next
        temp.next = prev
        prev = temp
        temp = front

    return prev


def isPalindromeLL(head):
    if head is None or head.next is None:
        return True
    
    # temp = head
    # st = []

    # while temp is not None:
    #     st.append(temp.data)
    #     temp = temp.next

    # temp = head

    # while temp is not None:
    #     if temp.data != st.pop():
    #         return False
    #     temp = temp.next

    # return True




    # optimal approach...
    slow = head
    fast = head

    while fast.next is not None and fast.next.next is not None:
        slow = slow.next
        fast = fast.next.next

    newHead = reverseLL(slow.next)

    first = head
    second = newHead

    while second is not None:
        if first.data != second.data:
            reverseLL(newHead)
            return False
        
        first = first.next
        second = second.next

    reverseLL(newHead)
    return True








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


if isPalindromeLL(head):
    print("Palindrome")
else:
    print("Not Palindrome")