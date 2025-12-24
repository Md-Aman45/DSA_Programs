class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None
    

def sortzeroOneTwo(head):
    if head is None or head.next is None:
        return head
    
    temp = head
    cnt0 = 0
    cnt1 = 0
    cnt2 = 0

    while temp is not None:
        if temp.data == 0:
            cnt0 += 1
        elif temp.data == 1:
            cnt1 += 1
        else:
            cnt2 += 1
        
        temp = temp.next
    

    temp = head

    while temp is not None:
        if cnt0 > 0:
            temp.data = 0
            cnt0 -= 1
        elif cnt1 > 0:
            temp.data = 1
            cnt1 -= 1
        else:
            temp.data = 2
            cnt2 -= 1
        
        temp = temp.next
    

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

    values = list(map(int, input("Enter node values (0,1,2): ").split()))
    head = Node(values[0])
    temp = head

    for i in range(1, n):
        temp.next = Node(values[i])
        temp = temp.next

    return head


# main flow (prints happen here)
head = create_list()

print("\nOriginal Linked List:")
print_list(head)

head = sortzeroOneTwo(head)

print("\nSorted Linked List:")
print_list(head)