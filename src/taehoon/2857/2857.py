res = []
for i in range(5) :
    line = input()
    if 'FBI' in line :
        res.append(str(i+1))
if len(res) == 0:
    print("HE GOT AWAY!")
else :
    print(' '.join(res))