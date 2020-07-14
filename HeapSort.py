
import random as randy
import time

'''

heapsort implementation

'''


def minHeapify(a, i):
    pass


def buildMinHeap(a):
    pass


def maxHeapify(a, i,heapsize):
    #heapsize = len(a)
    leftChild = left(i)
    rightChild = right(i)

    if leftChild < heapsize and a[leftChild] > a[i]:
        largest = leftChild
    else:
        largest = i
    if rightChild < heapsize and a[rightChild] > a[largest]:
        largest = rightChild
    if largest != i:
        exchange(a,i,largest)
        maxHeapify(a,largest,heapsize)



def buildMaxHeap(a):
    for i in range(len(a)//2,-1,-1):
        maxHeapify(a, i,len(a))


def heapsort(a):
    heapSize = len(a)
    buildMaxHeap(a)
    #print(a)
    for i in range(len(a)-1,0,-1):
        exchange(a,0,i)
        heapSize -= 1
        maxHeapify(a, 0,heapSize)

def parent(i):
    return i//2

def left(i):
    return (2 * i) + 1

def right(i):
    return (2 * i) + 2

def exchange(a,i,j):
    temp = a[i]
    a[i] = a[j]
    a[j] = temp


def main():
    n = int(input("Input size array to be sorted: \n---->"))
    a = list()
    for i in range(n):
        a.append(randy.randint(0, 100))
    print("a:", a)

    start = time.time()
    heapsort(a)
    end = time.time()
    elapsedd = end - start
    print("HeapSort: {:.8e} s".format(elapsedd))
    print("aHeap: ", a)


if __name__ == '__main__':
    main()
