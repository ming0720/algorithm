from collections import deque
import sys

n = int(input())

q = deque()

for i in range(n):
  k = sys.stdin.readline().rstrip().split()
  if k[0] == 'push':
    q.appendleft(k[1])
  elif k[0] == 'pop':
    if not q:
      print(-1)
    else :
      pop = q.pop()
      print(pop)
  elif k[0] == 'size':
    print(len(q))
  elif k[0] == 'empty':
    if not q:
      print(1)
    else :
      print(0)
  elif k[0] == 'front':
    if not q:
      print(-1)
    else:
      print(q[-1])
  elif k[0] == 'back':
    if not q:
      print(-1)
    else:
      print(q[0])