height = 2 * int(input()) -1

for i in range(height):
    if i < (height//2+1):
        blank = i * ' '
        stars = '*' * (height-(2*i))
    else:
        blank = (height-i-1) * ' '
        stars = '*' * (i-(height-i)+2)
    print(blank + stars)