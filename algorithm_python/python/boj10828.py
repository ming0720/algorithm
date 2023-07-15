import sys
n = int(input())

s = []

for i in range(n):
    data = sys.stdin.readline().rstrip().split()
    if data[0] == 'push':
        s.append(data[1])
    elif data[0] == 'pop':
        if len(s) == 0:
            print(-1)
        else:
            print(s.pop())
    elif data[0] == 'size':
        print(len(s))
    elif data[0] == 'empty':
        if len(s) == 0:
            print(1)
        else :
            print(0)
    elif data[0] == 'top':
        if len(s) == 0:
            print(-1)
        else:
            print(s[-1])