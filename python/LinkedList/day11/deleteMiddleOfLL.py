class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None


def deleteMiddle(head):
    if head is None or head.next is None:
        return None
    
    # brute approach...
    # temp = head
    # n = 0

    # while temp:
    #     n += 1
    #     temp = temp.next

    # res = n // 2
    # temp = head

    # while temp:
    #     res -= 1
    #     if res == 0:
    #         temp.next = temp.next.next
    #         break

    #     temp = temp.next
    
    # return head




    # optimal approach...
    slow = head
    fast = head
    fast = fast.next.next

    while fast is not None and fast.next is  not None:
        slow = slow.next
        fast = fast.next.next

    slow.next = slow.next.next

    return head







def printList(head):
    temp = head
    while temp:
        print(temp.data, end=" -> ")
        temp = temp.next
    print("None")


# ---------- INPUT ----------
n = int(input("Enter number of nodes: "))
values = list(map(int, input("Enter values: ").split()))

head = None
tail = None

for val in values:
    node = Node(val)
    if head is None:
        head = node
        tail = node
    else:
        tail.next = node
        tail = node

# ---------- PROCESS ----------
head = deleteMiddle(head)

# ---------- OUTPUT ----------
print("Linked list after deleting middle:")
printList(head)



