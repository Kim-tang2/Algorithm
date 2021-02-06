import sys

input = lambda: sys.stdin.readline().rstrip()
T = int(input())

while T != 0:
    repeatNum, *repeatStr = input()
    for str in repeatStr:
        print(str.lstrip() * int(repeatNum), end="")
    print()

    T -= 1