file = open("C:\\Users\\argal\\Documents\\Advent of Code\\day10.txt", "r")

cycleNumber = 0
x = 1
total = 0
addMe = [20, 60, 100, 140, 180, 220]

for line in file:
    split = line.split()
    if split[0] == "noop":
        cycleNumber += 1
        if cycleNumber in addMe:
            total += cycleNumber * x

    else:
        cycleNumber += 1
        if cycleNumber in addMe:
            total += cycleNumber * x

        cycleNumber += 1
        if cycleNumber in addMe:
            total += cycleNumber * x

        x += int(split[1])

print(total)