class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None


def removeNthNodeFromEnd(head, N):
    if head is None:
        return None

    # ----------- Brute approach -----------
    # cnt = 0
    # temp = head

    # while temp is not None:
    #     cnt += 1
    #     temp = temp.next

    # if cnt == N:
    #     return head.next
    
    # res = cnt - N
    # temp = head

    # while res > 1:
    #     temp = temp.next
    #     res -= 1
    
    # temp.next = temp.next.next

    # return head



    # optimal approach...
    fast = head
    for i in range(N):
        fast = fast.next
    
    slow = head

    if fast is None:
        return head.next
    
    while fast.next is not None:
        slow = slow.next
        fast = fast.next
    
    slow.next = slow.next.next

    return head






def print_list(head):
    temp = head
    while temp:
        print(temp.data, end=" -> ")
        temp = temp.next
    print("None")


def create_list():
    n = int(input("Enter number of nodes: "))
    if n == 0:
        return None

    values = list(map(int, input("Enter node values: ").split()))
    head = Node(values[0])
    temp = head

    for i in range(1, n):
        temp.next = Node(values[i])
        temp = temp.next

    return head


# main flow (same style as your sort code)
head = create_list()

print("\nOriginal Linked List:")
print_list(head)

N = int(input("Enter N (from end): "))
head = removeNthNodeFromEnd(head, N)

print("\nLinked List after removing Nth node from end:")
print_list(head)