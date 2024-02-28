import sys
input = sys.stdin.readline

name = input().rstrip()
name_set = list(set(list(name))) # 중복제거
name_set.sort()
name_dic = dict.fromkeys(name_set, 0) # 중복제거된 값을을 키로 사용하는 딕셔너리 생성

for n in name:
    name_dic[n] += 1

torf = True
cnt = 0
temp = ''
palindrom_half = ''
for k in name_dic.keys():
    if name_dic[k] % 2 == 0:
        palindrom_half += k*(name_dic[k]//2)
    
    elif name_dic[k] % 2 == 1 and name_dic[k] > 2:
        palindrom_half += k*(name_dic[k]//2)
        cnt += 1
        temp = k
        if cnt == 2:
            torf = False
            break
    
    else:
        cnt += 1
        temp = k
        if cnt == 2:
            torf = False
            break

if torf:
    if temp:
        palindrom_half += temp + palindrom_half[::-1]
    else :
        palindrom_half += palindrom_half[::-1]
    print(palindrom_half)
else:
    print("I'm Sorry Hansoo")