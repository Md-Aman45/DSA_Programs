n = int(input("Enter the size of array: "))

arr = list(map(int, input(f"Enter {n} numbers: ").split()))

if not arr:
	print('Maximum product subarray: 0')
	exit()
	        
	        
maxProd = arr[0]
minProd = arr[0]
result = arr[0]
		
for i in range(1, len(arr)):
	curr = arr[i]
		    
	if curr < 0:
		maxProd, minProd = minProd, maxProd
		       
		    
	maxProd = max(curr, maxProd * curr)
	minProd = min(curr, minProd * curr)
		    
	result = max(result, maxProd)
		  
print("Maximum product subarray:", result)