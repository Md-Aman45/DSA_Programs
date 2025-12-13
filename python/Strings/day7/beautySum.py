def beautySum(s: str) -> int:
    total_beauty = 0
    n = len(s)

    for i in range(n):
        freq = [0] * 26

        for j in range(i, n):
            freq[ord(s[j]) - ord('a')] += 1

            max_cnt = 0
            min_cnt = float('inf')

            for f in freq:
                if f > 0:
                    max_cnt = max(max_cnt, f)
                    min_cnt = min(min_cnt, f)

            total_beauty += (max_cnt - min_cnt)
    
    return total_beauty



# -------- main --------
if __name__ == "__main__":
    s = input("Enter string: ")
    result = beautySum(s)

    print("Beauty Sum:", result)