import heapq

class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next
    




# def convert_arr_to_ll(arr):
#     if not arr:
#         return None

#     head = Node(arr[0])
#     temp = head

#     for i in range(1, len(arr)):
#         temp.next = Node(arr[i])
#         temp = temp.next

#     return head





def mergeKSorted(lists):

    # arr = []

    # for head in lists:
    #     temp = head
    #     while temp:
    #         arr.append(temp.data)
    #         temp = temp.next
    
    # arr.sort()

    # head = convert_arr_to_ll(arr)
    # return head





    # optimal approach...
    heap = []

    for i, node in enumerate(lists):
        if node:
            heapq.heappush(heap, (node.data, i, node))
        
    dNode = Node(-1)
    temp = dNode

    while heap:
        val, i, node = heapq.heappop(heap)

        temp.next = node
        temp = node

        if node.next:
            heapq.heappush(heap, (node.next.data, i, node.next))

    return dNode.next





# ----------- print list -----------
def printList(head):
    while head:
        print(head.data, end=" ")
        head = head.next
    print()



k = int(input("Enter number of linked lists: "))
lists = []

for i in range(k):
    values = list(map(int, input(f"Enter elements of lists{i+1} : ").split()))

    head = tail = None
    for val in values:
        node = Node(val)
        if not head:
            head = tail = node
        else:
            tail.next = node
            tail = node
    
    lists.append(head)


mergedHead = mergeKSorted(lists)
print("Merged Sorted List:")
printList(mergedHead)
