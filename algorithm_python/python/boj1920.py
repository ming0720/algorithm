import sys
n = int(input())
arr = list(map(int,sys.stdin.readline().split()))

m = int(input())
data = list(map(int,sys.stdin.readline().split()))
arr = sorted(arr)

def binary(array, target, start, end):
    while start <= end :
        mid = (start + end) // 2
        if array[mid] == target:
            return 1
        elif array[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    return 0


for i in data:
    print(binary(arr, i, 0, n-1))