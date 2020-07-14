'''
This file contains several implementations of the insertion sort algorithm

Author: Zack Cook
'''


def main():
    print("InsertionSort started...")

    a = [5, 2, 4, 6, 1, 3]
    b = [5, 48, 2, 51589, 5, 20, 15, 0, 15, 369, 1, 2, 3, 0]
    print(insertionSort(a))
    print(insertionSort(b))


def insertionSort(a):
    # O(n^2)
    for i in range(1, len(a)):
        key = a[i]  # key value is set to next value in array

        # insert a[i] into sorted sequence a[0..i-1]
        j = i - 1

        while (j >= 0 and a[j] > key):
            a[j + 1] = a[j]
            j -= 1

        a[j + 1] = key

    return a


def binaryInsertionSort(a):
    for i in range(1, len(a)):
        key = a[i]  # key value is set to next value in array

        # use binary search to find correct placement of key


    return a


def decreasingInsertionSort(a):
    # to do
    pass


def binaryDecreasingInsertionSort(a):
    # to do
    pass


def binary_search(arr, x):
    # O(log(n))
    low = 0
    high = len(arr) - 1
    mid = 0

    while low <= high:
        mid = (high + low) // 2

        if arr[mid] < x:
            low = mid + 1

        elif arr[mid] > x:
            high = mid - 1

        else:
            return mid

    # If we reach here, then the element was not present in a
    return -1,


main()
