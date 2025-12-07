def reverse_words(s):
    words = s.strip().split()

    left, right = 0, len(words) - 1

    while left < right:
        words[left], words[right] = words[right], words[left]
        left += 1
        right -= 1
    
    return " ".join(words)



if __name__ == "__main__":
    s = input("Enter a sentence: ")
    ans = reverse_words(s)
    print("Reversed words:", ans)