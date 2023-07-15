from collections import deque
import sys
sys.setrecursionlimit(10**7)

n = int(input())

card_list = deque()
for i in range(n):
    card_list.append(i+1)

def card(card_list):
    if len(card_list) <= 2:
        return card_list[-1]
    else:
        card_list.popleft()
        top = card_list.popleft()
        card_list.append(top)
        return card(card_list)


print(card(card_list))