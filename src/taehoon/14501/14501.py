def backtracking(i, cost):
    global max_P
    if i+T[i] == N+1:
        if cost + P[i] > max_P:
            max_P = cost + P[i]
    elif i+T[i] > N+1:
        if cost > max_P:
            max_P = cost
    else:
        for n_i in range(i+T[i], N+1):
            backtracking(n_i, cost+P[i])

if __name__ == "__main__":
    N = int(input().strip())
    T = [1]
    P = [0]
    max_P = 0
    for i in range(N):
        t, p = input().strip().split()
        T.append(int(t))
        P.append(int(p))
    backtracking(0, 0)
    print(max_P)
