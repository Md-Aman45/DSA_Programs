class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None


def isPalindromeLL(head):
    if head is None or head.next is None:
        return True
    
    temp = head
    st = []

    while temp is not None:
        st.append(temp.data)
        temp = temp.next

    temp = head

    while temp is not None:
        if temp.data != st.pop():
            return False
        temp = temp.next

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