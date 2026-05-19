def balanced(s):

    st = []

    for ch in s:

        if ch in "({[":
            st.append(ch)

        elif ch in ")}]":

            if not st:
                return "Not Balanced"

            top = st.pop()

            if ((ch == ')' and top != '(') or
                (ch == '}' and top != '{') or
                (ch == ']' and top != '[')):

                return "Not Balanced"

    if not st:
        return "Balanced"

    return "Not Balanced"


s = input("Enter String: ")

print(balanced(s))