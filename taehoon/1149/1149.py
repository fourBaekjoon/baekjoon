T = int(input())
color = [[0] * 3 for i in range(T)]
r,g,b = 0,1,2
for i in range(T):
    r_, g_, b_ = input().split(' ')
    color[i][r], color[i][g], color[i][b] = int(r_),int(g_),int(b_)
dp = [[0] * 3 for i in range(T)]
for j in range(T) :
    if j == 0:
        dp[j][r] = color[j][r]
        dp[j][g] = color[j][g]
        dp[j][b] = color[j][b]
    else :
        dp[j][r] = min(dp[j-1][g]+color[j][r],dp[j-1][b]+color[j][r])
        dp[j][g] = min(dp[j-1][r]+color[j][g],dp[j-1][b]+color[j][g])
        dp[j][b] = min(dp[j-1][r]+color[j][b],dp[j-1][g]+color[j][b])
print(min(dp[T-1]))
