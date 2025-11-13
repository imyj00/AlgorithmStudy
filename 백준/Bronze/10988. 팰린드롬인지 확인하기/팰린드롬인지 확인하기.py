T = list(input())
RT = []

for i in range(len(T)):
    RT.append(T[-i-1])

if(T == RT):
    print(1)
else:
    print(0)
    
