n = int(input())

fiboarr = []
fiboarr.append(0)
fiboarr.append(1)

def fibo(n):
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    else:
        for i in range(2,n+1):
            num = fiboarr[i-2] + fiboarr[i-1]
            fiboarr.append(num)
    return fiboarr[n]

print(fibo(n))