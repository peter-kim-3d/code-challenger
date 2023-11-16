# create function finding number
# input: array, output: number as answer 
def findMissingNumber(numbers):
    # sum of numbers - total sum of array 
    # sum of first n natual numbers -> n * (n+1) / 2
    n = len(numbers);
    total = n * (n+1) / 2
    return total - sum(numbers)

print(findMissingNumber([3, 0, 1]))
