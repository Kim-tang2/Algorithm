import sys
import string
import operator

input = lambda: sys.stdin.readline().rstrip()
words = input().upper()

if len(words) != 1:
    not_overlap_word = []
    for word in words:
        if word not in not_overlap_word:
            not_overlap_word.append(word)

    words_dict = {}

    for alphabet in not_overlap_word:
        words_dict[alphabet] = words.count(alphabet)

    sorted_dict = sorted(words_dict.items(), key=operator.itemgetter(1), reverse=True)

    if sorted_dict[0][1] != sorted_dict[1][1]:
        print(sorted_dict[0][0])
    else:
        print("?")
else:
    print(words)
