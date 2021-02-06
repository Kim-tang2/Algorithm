import sys

input = lambda: sys.stdin.readline().rstrip()
T = int(input())

while T != 0:
    repeatNum, repeatStr = input().split()
    for str in repeatStr:
        print(str * int(repeatNum), end="")
    print()

    T -= 1