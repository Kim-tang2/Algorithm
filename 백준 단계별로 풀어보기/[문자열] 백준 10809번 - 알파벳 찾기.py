import sys
import string

input = lambda: sys.stdin.readline().rstrip()

value = input()

for alphabet in string.ascii_lowercase:
    print(value.find(alphabet), end=" ")