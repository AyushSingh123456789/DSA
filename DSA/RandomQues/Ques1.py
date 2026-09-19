# Ques: From the given text, return the first character that appears only once, else return NULL.

text = "aabbcddee"
charDict = {}

for char in text:
    if char not in charDict:
        charDict[char] = 1
    else:
        charDict[char] += 1
flag = False
for k, v in charDict.items():
    if v == 1:
        flag = True
        print(k)
        break
if flag == False:
    print("NULL")