T=int(input())
word_list=[]
for i in range(T):
    new_word = input()
    if new_word == new_word[::-1] :
        print('{} {}'.format(len(new_word), new_word[int(len(new_word)/2)]))
        break
    if i == 0 :
        word_list.append(new_word)
        continue
    for word in word_list :
        if word == new_word[::-1] :
            print('{} {}'.format(len(word), word[int(len(word)/2)]))
            break
    word_list.append(new_word)