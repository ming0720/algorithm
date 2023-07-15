import sys
from collections import deque
n, m = map(int, input().split())

data = []
shark = []
for i in range(n):
    data.append(list(map(int,sys.stdin.readline().split())))
    for j in range(m):
        if data[i][j] == 1:
            shark.append((i,j))
#상 하 좌 우 좌상 좌하 우상 우하
drow = [0, 0, -1, 1, -1, -1, 1, 1]
dcol = [-1, 1, 0, 0, -1, 1, -1, 1]

q = deque(shark)

while q :
    row, col = q.popleft()

    for i in range(8):
        nrow = row + drow[i]
        ncol = col + dcol[i]

        if nrow < 0 or ncol < 0 or nrow >= n or ncol >= m:
            continue

        elif data[nrow][ncol] == 0:
            data[nrow][ncol] = data[row][col] + 1
            q.append((nrow,ncol))

print(max(map(max,data))-1)