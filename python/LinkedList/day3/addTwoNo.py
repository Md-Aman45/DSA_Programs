class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None


def addTwoNum(num1, num2):
    temp1 = num1
    temp2 = num2

    dummy = Node(-1)
    curr = dummy
    carry = 0

    while temp1 is not None or temp2 is not None:
        total = carry

        if temp1 is not None:
            total += temp1.data
            temp1 = temp1.next

        if temp2 is not None:
            total += temp2.data
            temp2 = temp2.next

        carry = total // 10
        curr.next = Node(total % 10)
        curr = curr.next

    
    if carry > 0:
        curr.next = Node(carry)

    return dummy.next


# print method...
def printList(head):
    temp = head
    while temp:
        print(temp.data, end="")
        if temp.next:
            print(" -> ", end="")
        temp = temp.next
    print()



# -------- Main --------
# First number: 342 (stored as 2 -> 4 -> 3)
num1 = Node(2)
num1.next = Node(4)
num1.next.next = Node(3)

# Second number: 465 (stored as 5 -> 6 -> 4)
num2 = Node(5)
num2.next = Node(6)
num2.next.next = Node(4)

print("Number 1:", end=" ")
printList(num1)

print("Number 2:", end=" ")
printList(num2)

result = addTwoNum(num1, num2)

print("Sum:", end=" ")
printList(result)