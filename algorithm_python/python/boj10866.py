import sys
from collections import deque
n = int(input())
d = deque()

for i in range(n):
    data = sys.stdin.readline().rstrip().split()
    if data[0] == 'push_front':
        d.append(data[1])
    elif data[0] == 'push_back':
        d.appendleft(data[1])
    elif data[0] == 'pop_front':
        if d:
            print(d.pop())
        else:
            print(-1)
    elif data[0] == 'pop_back':
        if d:
            print(d.popleft())
        else:
            print(-1)
    elif data[0] == 'size':
        print(len(d))
    elif data[0] == 'empty':
        if d:
            print(0)
        else:
            print(1)
    elif data[0] == 'front':
        if d:
            print(d[-1])
        else:
            print(-1)
    elif data[0] == 'back':
        if d:
            print(d[0])
        else:
            print(-1)