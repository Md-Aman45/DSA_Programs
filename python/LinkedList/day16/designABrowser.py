class BrowserNode:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.back = None



class Browser:
    def __init__(self, homepage):
        self.curr = BrowserNode(homepage)

    def visit(self, url):
        # clear forward history
        self.curr.next = None

        new_node = BrowserNode(url)
        new_node.back = self.curr
        self.curr.next = new_node
        self.curr = new_node

    def back_page(self, steps):
        while steps > 0 and self.curr.back:
            self.curr = self.curr.back
            steps -= 1
        return self.curr.data

    def forward_page(self, steps):
        while steps > 0 and self.curr.next:
            self.curr = self.curr.next
            steps -= 1
        return self.curr.data





home = input("Enter home page: ")
browser = Browser(home)

while True:
    print("\n1. Visit")
    print("2. Back")
    print("3. Forward")
    print("4. Exit")

    choice = int(input("Choose option: "))

    if choice == 1:
        url = input("Enter URL: ")
        browser.visit(url)
        print("Current Page:", url)

    elif choice == 2:
        steps = int(input("Steps to go back: "))
        print("Current Page:", browser.back_page(steps))

    elif choice == 3:
        steps = int(input("Steps to go forward: "))
        print("Current Page:", browser.forward_page(steps))

    else:
        break
