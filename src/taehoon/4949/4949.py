while True :
    line = input()
    if line == '.' :
        break
    else:
        bracket = []
        res = True
        for l in line :
            if l == '(':
                bracket.append(l)
            elif l == ')':
                if len(bracket) > 0 and bracket[-1] == "(":
                    bracket.pop(-1)
                else :
                    res = False
                    break
            if l == '[':
                bracket.append(l)
            elif l == ']':
                if len(bracket) > 0 and bracket[-1] == "[":
                    bracket.pop(-1)
                else :
                    res = False
                    break
        if len(bracket) != 0:
            res = False
        print("yes") if res else print("no")