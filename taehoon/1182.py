N, S = input().split(' ')
N, S = int(N),int(S)
bs = input().split(' ')
for i in range(N) :
    bs[i] = int(bs[i])
ps = []
x = len(bs)
for i in range(1 << x):
    ps.append([bs[j] for j in range(x) if (i & (1 << j))])
ps.remove(ps[0])
res = 0
for j in ps :
    if sum(j) == S :
        res+=1
print(res)
