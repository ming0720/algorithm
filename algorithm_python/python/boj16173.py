import sys
from collections import deque

n = int(input())

board = [list(map(int,sys.stdin.readline().split())) for _ in range(n)]
visited = [[0]* n for _ in range(n)]
q = deque()

#아래, 오른쪽
d = [[1,0],[0,1]]
q.append([0,0])

win = False

while q :
    r, c = q.popleft()

    if board[r][c] == -1:
        win = True
        break

    num = board[r][c]

    for i in range(2):
        nr = r + d[i][0] * num
        nc = c + d[i][1] * num

        if nr < 0 or nc < 0 or nr >= n or nc >= n:
            continue

        if visited[nr][nc] == 0:
            visited[nr][nc] = 1
            q.append([nr,nc])

if win:
    print("HaruHaru")
else:
    print("Hing")

