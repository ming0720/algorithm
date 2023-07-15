import sys
from collections import deque

n = int(input())
q = deque()

packet = int(sys.stdin.readline().rstrip())

while packet != -1:
    if packet > 0 and len(q) < n :
        q.append(packet)
    elif packet == 0:
        q.popleft()
    packet = int(sys.stdin.readline().rstrip())

if not q:
    print('empty')

while q :
    print(q.popleft(), end= ' ')
