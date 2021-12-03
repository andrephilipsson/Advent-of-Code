lines = [[1 if c == "1" else -1 for c in line[:-1]] for line in open("input/3.txt")]

g = ""
e = ""
for i in range(0, len(lines[0])):
    s = sum(map(lambda x: x[i], lines))
    g += "1" if s > 0 else "0"
    e += "0" if s > 0 else "1"

print("Answer 1:", int(g, 2) * int(e, 2))


o = [[1 if c == "1" else -1 for c in line[:-1]] for line in open("input/3.txt")]
c = [[1 if c == "1" else -1 for c in line[:-1]] for line in open("input/3.txt")]
for i in range(0, len(lines[0])):
    sum_o = sum(map(lambda x: x[i], o))
    sum_c = sum(map(lambda x: x[i], c))

    if sum_o >= 0 and len(o) > 1:
        o = list(filter(lambda x: x[i] == 1, o))
    elif len(o) > 1:
        o = list(filter(lambda x: x[i] == -1, o))

    if sum_c >= 0 and len(c) > 1:
        c = list(filter(lambda x: x[i] != 1, c))
    elif len(c) > 1:
        c = list(filter(lambda x: x[i] != -1, c))

o_rate = "".join(["1" if b == 1 else "0" for b in o[0]])
c_rate = "".join(["1" if b == 1 else "0" for b in c[0]])

print("Answer 2:", int(o_rate, 2) * int(c_rate, 2))
