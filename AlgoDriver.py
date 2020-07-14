from algorithms.InsertionSort import  insertionSort
from algorithms.MergeSort import mergesort
from algorithms.HeapSort import heapsort
import time as time
import random as randy

def main():

    n = int(input("Input size array to be sorted: \n---->"))
    a = []
    for i in range(n):
        a.append(randy.randint(0,1000000000))
    print("a:",a)

    # merge sort
    start = time.time()
    aMerge = mergesort(a)
    end = time.time()
    elapsed = end - start
    print("Mergesort: {:.8e} s".format(elapsed))
    print("aMerge: ", aMerge)

    # insertion sort
    start = time.time()
    aInsert = insertionSort(a)
    end = time.time()
    elapsed = end - start
    print("InsertionSort: {:.8e} s".format(elapsed))
    print("aInsert: ",aInsert)

    # heapsort
    start = time.time()
    heapsort(a)
    end = time.time()
    elapsedd = end - start
    print("HeapSort: {:.8e} s".format(elapsedd))
    print("aHeap: ",a)


if __name__ == '__main__':
    main()

