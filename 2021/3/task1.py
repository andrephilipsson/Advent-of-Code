lines = [[1 if c == "1" else -1 for c in line[:-1]] for line in open("input.txt")]

g = ""
e = ""
for i in range(0, len(lines[0])):
    s = sum(map(lambda x: x[i], lines))
    g += "1" if s > 0 else "0"
    e += "0" if s > 0 else "1"

print("Answer:", int(g, 2) * int(e, 2))
