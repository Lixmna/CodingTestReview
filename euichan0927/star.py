a=int(input())
n=a*2 - 1
k=a-1
for i in range(n + 1):
    if(i<a):
        print(' '*i,end='')
        print('*'*(n-2*i))
    if(i>a):
        k=k-1
        i=(i-a)*2+1
        print(' '*(k)+'*'*i)