import sys
input = sys.stdin.readline

for _ in range(3):
    n = int(input())
    total = 0
    for _ in range(n):
        a = int(input())
        total += a
    
    if total > 0:
        print('+')
    elif total < 0:
        print('-')
    else:
        print('0')