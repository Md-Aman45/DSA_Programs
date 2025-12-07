def remove_outer_paranthesis(s: str) -> str:
    cnt = 0
    ans = []

    for ch in s:
        if ch == '(':
            if cnt > 0:
                ans.append(ch)
            cnt += 1
        
        else:
            cnt -= 1
            if cnt > 0:
                ans.append(ch)

    return "".join(ans)


if __name__ == "__main__":
    s = input("Enter parentheses string: ").strip()
    result = remove_outer_paranthesis(s)
    print("Result after removing outer parentheses:", result)