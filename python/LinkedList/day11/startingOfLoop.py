class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None


def startingPointOfLoop(head):
    # brute approach...
    # visited = set()
    # temp = head

    # while temp is not None:
    #     if temp in visited:
    #         return temp
        
    #     visited.add(temp)
    #     temp = temp.next

    # return None





    # optimal approach...
    slow = head
    fast = head

    while fast is not None and fast.next is not None:
        slow = slow.next
        fast = fast.next.next

        if slow == fast:
            slow = head
            while slow is not fast:
                slow = slow.next
                fast = fast.next
            return slow
    
    return None







# ----------- DRIVER CODE -----------
n = int(input("Enter number of nodes: "))

if n == 0:
    print("List is empty")
else:
    print("Enter node values:", end=" ")
    values = list(map(int, input().split()))

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

    pos = int(input("Enter position to create loop (-1 for no loop): "))

    if pos != -1:
        temp = head
        loop_node = None
        index = 0

        while temp:
            if index == pos:
                loop_node = temp
            if temp.next is None:
                temp.next = loop_node
                break
            temp = temp.next
            index += 1

    result = startingPointOfLoop(head)

    if result:
        print("Loop starts at node with value:", result.data)
    else:
        print("No loop detected")
    