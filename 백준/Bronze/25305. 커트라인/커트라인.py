n, k = map(int,input().split())
arr = list(map(int,input().split()))
# 버블 정렬
for i in range(n-1,0,-1):
    for j in range(0,i):
        if arr[j] > arr[j+1]:
            arr[j],arr[j+1] = arr[j+1],arr[j]
print(arr[-k])