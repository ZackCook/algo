'''
mergesort implementation
O(nlog(n))
'''
def merge(left, right):
    result = []
    i,j = 0,0
    while i < len(left) and j < len(right):#neither is empty
        if left[i] < right[j]:
            result.append(left[i])
            i+=1
        else:
            result.append(right[j])
            j+=1
    '''
        if first loop does not run then only ONE of the following loops will run,
        thus perserving the O(n) complexity of the merge() routine
    '''
    while i < len(left):#if right is empty
        result.append(left[i])
        i+=1
    while j < len(right):#if left is empty
        result.append(right[j])
        j+=1
    return result

def mergesort(a):
    if (len(a)>1):
        q = len(a)//2
        left = mergesort(a[:q])
        right = mergesort(a[q:])
        #print("q, left, right -->",q,left,right)#debug
        a = merge(left, right)
    return a

def main():
    a = [2,5,8,4,8,0]
    aprime = mergesort(a)
    print("____a:",a)
    print("____aprime:",aprime)


main()