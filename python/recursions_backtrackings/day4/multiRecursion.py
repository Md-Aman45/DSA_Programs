# fibonacci number..
def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)


# -------- main --------
n = int(input("Enter n = "))

ans = fibonacci(n)
print("Fibonacci = ", ans)