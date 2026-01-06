class Node:
    def __init__(self, data, next=None, random=None):
        self.data = data
        self.next = next
        self.random = random
    


def cloneALinkedList(head):
    if head is None:
        return None
    



    # mpp = {}
    # temp = head

    # while temp:
    #     newNode = Node(temp.data)
    #     mpp[temp] = newNode
    #     temp = temp.next
        
    
    # temp = head

    # while temp:
    #     copyNode = mpp[temp]
    #     copyNode.next = mpp.get(temp.next)
    #     copyNode.random = mpp.get(temp.random)
    #     temp = temp.next

    
    # return mpp[head]






    # optimal approach...

    # (1) Insert copy nodes in between...
    temp = head
    while temp:
        copyNode = Node(temp.data)
        copyNode.next = temp.next
        temp.next = copyNode
        temp = temp.next.next
    

    # (2) Connect the random pointer...
    temp = head

    while (temp):
        copyNode = temp.next
        
        if (temp.random):
            copyNode.random = temp.random.next
        else:
            copyNode.random = None
        
        temp = temp.next.next

    
    # (3) Connect the next pointer...
    dNode = Node(-1)
    res = dNode
    temp = head

    while temp:
        res.next = temp.next
        temp.next = temp.next.next
        res = res.next
        temp = temp.next
    
    return dNode.next







def printList(head):
    temp = head
    while temp:
        rand = temp.random.data if temp.random else -1
        print(f"{temp.data}({rand})", end=" -> ")
        temp = temp.next
    print("None")




# ------------ MAIN METHOD ------------
n = int(input("Enter number of nodes: "))
values = list(map(int, input("Enter node values: ").split()))

nodes = [Node(val) for val in values]

# Link next pointers...
for i in range(n - 1):
    nodes[i].next = nodes[i + 1]

print("Enter random pointer index for each node (-1 for null):")
rand_indices = list(map(int, input().split()))

for i in range(n):
    if rand_indices[i] != -1:
        nodes[i].random = nodes[rand_indices[i]]

head = nodes[0]

clonedHead = cloneALinkedList(head)

print("\nOriginal List:")
printList(head)

print("\nCloned List:")
printList(clonedHead)
