import sys

input = lambda: sys.stdin.readline().rstrip()

T = int(input()) # 의미 없음
numbers = input()
answer = 0
for number in numbers:
    answer += int(number)

print(answer)
