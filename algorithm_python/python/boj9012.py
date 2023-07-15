import sys

n = int(input())

data = list(map(lambda x: sys.stdin.readline().split(), range(n)))

def vps(s):
    stack = []
    array = list(s)
    if array[0] == ")" or array[-1] == "(":
        return "NO"

    else:
        for i in range(len(array)):
            if array[i] == "(":
                stack.append("(")
            elif array[i] == ")":
                if not stack:
                    return "NO"
                else:
                    stack.pop()
        if stack:
            return "NO"
        else:
            return "YES"

for i in range(n):
    string = str(data[i])
    print(vps(string))