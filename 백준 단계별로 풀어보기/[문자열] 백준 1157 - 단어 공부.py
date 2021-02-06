import sys
import string

input = lambda: sys.stdin.readline().rstrip()
words = input().upper()
rank_word = []

for alphabet in string.ascii_uppercase:
    rank_word.append(words.count(alphabet))

if rank_word.count(max(rank_word)) > 1:
    print("?")
else:
    print(string.ascii_uppercase[rank_word.index(max(rank_word))])

