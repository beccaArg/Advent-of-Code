file = open("C:\\Users\\argal\\Documents\\Advent of Code\\day10.txt", "r")

cycleNumber = 0
spritePos = [0, 1, 2]
CRTrow = ""

for line in file:
    split = line.split()
    if split[0] == "noop":
        cycleNumber += 1
        if (cycleNumber-1) % 40 in spritePos:
            CRTrow = CRTrow + "#"
        else:
            CRTrow = CRTrow + "."

    else:
        cycleNumber += 1
        if (cycleNumber-1) % 40 in spritePos:
            CRTrow = CRTrow + "#"
        else:
            CRTrow = CRTrow + "."

        cycleNumber += 1
        if (cycleNumber-1) % 40 in spritePos:
            CRTrow = CRTrow + "#"
        else:
            CRTrow = CRTrow + "."

        spritePos = [int(split[1]) + spritePos[0], int(split[1]) + spritePos[1], int(split[1]) + spritePos[2]]

print(CRTrow[0:40])
print(CRTrow[40:80])
print(CRTrow[80:120])
print(CRTrow[120:160])
print(CRTrow[160:200])
print(CRTrow[200:240])
