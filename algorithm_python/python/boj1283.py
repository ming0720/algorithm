import sys
n = int(input())

arr = []

for _ in range(n):
    option = sys.stdin.readline().split()
    isSave = False
    for i in range(len(option)):
        if option[i][0].upper() not in arr:
            arr.append(option[i][0].upper())
            option[i] = '[' + option[i][0] + ']' + option[i][1:]
            print(" ".join(option))
            isSave = True
            break

    if not isSave:
        for i in range(len(option)):
            check = False
            for j in range(len(option[i])):
                if option[i][j].upper() not in arr:
                    arr.append(option[i][j].upper())
                    isSave = True
                    check = True
                    option[i] = option[i][:j] + '[' + option[i][j] + ']' + option[i][j+1:]
                    print(' '.join(option))
                    break
            if check :
                break
    if not isSave:
        print(' '.join(option))