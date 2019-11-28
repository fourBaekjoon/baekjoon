n,m = input().split()
n,m = int(n),int(m)
union_set = []
for i in range(n+1):
    union_set.append(i)

def find(idx):
    if union_set[idx] == idx:
        return idx
    else:
        union_set[idx] = find(union_set[idx])
        return union_set[idx]

def union(a,b) :
    a_temp = find(a)
    b_temp = find(b)
    if a_temp == b_temp:
        return
    else:
        union_set[b_temp] = a_temp

for i in range(m) :
    cal, a, b = input().split()
    #print(union_set)
    if cal == '0':
        union(int(a),int(b))
    else:
        a_t = find(int(a))
        b_t = find(int(b))
        print('YES') if a_t == b_t else print('NO')
