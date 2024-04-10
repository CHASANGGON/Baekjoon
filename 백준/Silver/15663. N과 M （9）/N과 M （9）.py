import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = list(map(int, input().split()))
arr.sort()

set_arr = list(set(arr))
l = len(set_arr)

def permu(depth):
    if depth == m:
        print(*lst)
    else:
        prev = 0
        for i in range(n):    
            if visited[i] and prev != arr[i]:
                lst.append(arr[i])
                visited[i] = 0
                permu(depth+1)
                lst.pop()
                visited[i] = 1
                prev = arr[i]
lst = []
visited = [1] * n
permu(0)