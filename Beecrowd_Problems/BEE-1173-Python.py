N = []
for i in range(10):
    if i == 0:
        X = int(input())
        N.insert(i,X)
    else:
        X = X * 2
        N.insert(i,X)
for i in range(10):
    print('N[{0}] = {1}'.format(i,N[i]))
