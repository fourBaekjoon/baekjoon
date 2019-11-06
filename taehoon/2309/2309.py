d_list,d_case,results = [],[],[]
for i in range(9): # input
    T_str = input()
    d_list.append(int(T_str))
def combination(arr, r): # combination
    arr = sorted(arr)
    def generate(chosen):
        if len(chosen) == r:
            d_case.append(chosen.copy())
            return
        start = arr.index(chosen[-1]) + 1 if chosen else 0
        for nxt in range(start, len(arr)):
            chosen.append(arr[nxt])
            generate(chosen)
            chosen.pop()
    generate([])
combination(d_list,7)
for d_index in d_case :
    d_sum = sum(d_index)
    if d_sum == 100:
        results = d_index
        break
for res in results:
    print(res)
