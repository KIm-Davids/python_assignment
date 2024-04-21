print("numbers\tsquare\tcube")
for numbers in range(6):
    cube = numbers * numbers * numbers
    square = numbers * numbers
    print(f'{numbers}\t{square} \t{cube}')