class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None
    
def odd_even_ll(head):
    if head is None or head.next is None:
        print("List is too short. No changes needed.")
        return head
    


    # ---------- Brute Approach ----------
    # arr = []
    # temp = head

    # print("\nCollecting odd indexed nodes:")

    # while temp:
    #     print(temp.data, end=" ")
    #     arr.append(temp.data)

    #     if temp.next is None:
    #         break

    #     temp = temp.next.next
    # print()

    # temp = head.next
    # print("Collecting even indexed nodes:")

    # while temp:
    #     print(temp.data, end=" ")
    #     arr.append(temp.data)

    #     if temp.next is None:
    #         break

    #     temp = temp.next.next
    # print()

    # print("List after collecting values:")
    # print(arr)

    # temp = head
    # i = 0
    # print("\nRewriting linked list:")

    # while temp:
    #     print(f"Replacing node value {temp.data} with {arr[i]}")
    #     temp.data = arr[i]
    #     i += 1
    #     temp = temp.next

    # return head




    # optimal approach...
    odd = head
    even = head.next
    evenHead = head.next

    while even is not None and even.next is not None:
        odd.next = odd.next.next
        even.next = even.next.next

        odd = odd.next
        even = even.next

    
    odd.next = evenHead

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



head = create_list()

print("\nOriginal Linked List:")
print_list(head)

head = odd_even_ll(head)

print("\nAfter Odd-Even Arrangement:")
print_list(head)