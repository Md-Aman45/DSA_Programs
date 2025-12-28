class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None



def getIntersection(head1, head2):
    # brute approach...
    visited = set()
    temp = head1
    while temp is not None:
        visited.add(temp)
        temp = temp.next

    temp = head2

    while temp is not None:
        if temp in visited:
            return temp
        
        temp = temp.next
        
    return None








# ---------- MAIN ----------
n1 = int(input("Enter number of nodes in list 1: "))
print("Enter elements of list 1:", end=" ")
vals1 = list(map(int, input().split()))

head1 = None
prev = None
for v in vals1:
    node = Node(v)
    if head1 is None:
        head1 = node
    else:
        prev.next = node
    prev = node

n2 = int(input("Enter number of nodes in list 2: ",))
print("Enter elements of list 2:", end=" ")
vals2 = list(map(int, input().split()))

head2 = None
prev2 = None
for v in vals2:
    node = Node(v)
    if head2 is None:
        head2 = node
    else:
        prev2.next = node
    prev2 = node

# Connect intersection
pos = int(input("Enter intersection position (1-based, 0 for no intersection): "))
if pos > 0:
    temp = head1
    for _ in range(pos - 1):
        temp = temp.next
    prev2.next = temp

# Find intersection
ans = getIntersection(head1, head2)

if ans:
    print("Intersection Node:", ans.data)
else:
    print("No intersection found")