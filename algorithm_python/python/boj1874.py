import sys

n = int(input())

arr = list(map(lambda x : sys.stdin.readline().rstrip(), range(n)))
blank = []
list_num = list(range(1,n+1))
for i in list_num:
    if i != arr[0]:
        blank.append(i)
    else :
        blank.pop()