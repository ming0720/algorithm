import sys
from collections import deque
n, m = map(int,input().split())

board = [0 for _ in range(101)]
for i in range(n+m):
    a,b = map(int, sys.stdin.readline().split())
    board[a] = b

visited = [0 for _ in range(101)]


def bfs(x):
    start = deque([[x,0]])
    visited[x] = 1

    while start:
        space, num = start.popleft()
        if space == 100:
            return num

        for i in range(1,7):
            if space + i <= 100:
                if visited[space + i] == 0: #주사위 돌렸을때 한칸씩 확인하면서 방문했는지
                    if board[space + i] != 0: #방문 안했다면, 뱀이나 사다리 칸인지
                        if visited[board[space+i]] == 0:
                            start.append([board[space + i], num+1])
                            visited[board[space+i]] = 1

                    else : #뱀이나 사다리가 없으면
                        start.append([space+i, num+1])
                        visited[space+i] = 1

print(bfs(1))