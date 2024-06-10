my_list = [1,2,3,4,5,6]
elements = [2,4,6,8,10]

indexes = [i for i in range(len(my_list)) if my_list[i] in elements]

print(indexes)