import sys
n, m = map(int, input().split())

data = {}
find = []

for i in range(n):
    key, value = map(str, sys.stdin.readline().split())
    data[key] = value


for i in range(m):
    find.append(sys.stdin.readline().rstrip())

def find_pw(find):
    for i in find:
        print(data[i])

find_pw(find)