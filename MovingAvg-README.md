# PaytmLabs SDE Challenge - Moving Average

### 
1. Interface created with the name IMovingAverage
2. class Moving Average implements IMovingAverage

### EXPLANATION 

windowSize -  last N Elements
 
currWindowSize- 
currWindowSum -  

a) Since we don't want to go back or store any links in backward direction we
don't use any linked list / queue 

b) We use a arraylist and keep appending the number to it.

		arraylist.append(num)

c) We pass the windowSize to the constructor, and every time  we pass a number to the add method, we first add the number to the arraylist. 

Once the currentWindow size becomes equal to the windowSize then we subtract the leftmost value ( by subtracting the windowSize by arraylist ) and add the current number to get the correct window sum, otherwise initially we just increase currentWindowSum by adding the current num and increment the currentWindowSize.
 
		if currentWindowSize == windowSize
				currentWindowSum = currentWindowSum - LeftMostElment + num
		else
				currentWindowSum = currentWindowSum + num
				currentWindowSize = currentWindowSize + 1
		
d) Then in the end, we always calculate average by 

		average = currentWindowSum / currentWindowSize
		
e) This approach makes sure all functions i.e. add , getAvg , get are all in O(1).

f) 1 - > currentWindowSum = 1.0 , currentWindowSize = 1 , avg = 1.0
   1,2 -> currentWindowSum = 1.0 + 2 = 3.0, currentWindowSize = 1+1 =2 , avg = 3.0/2 = 1.5
   1,2,3 -> currentWindowSum = 3.0 + 3 = 6, currentWindowSize = 2+1 =3 , avg = 6/3   = 2.0
   1,2,3,4-> currentWindowSum = 6 - leftMostElement i.e. 1 + 4 = 9     , avg = (6-1+4)/3 = 3.0
   1,2,3,4,5-> currentWindowSum = 9 - leftMostElement i.e. 2 + 5 = 12  , avg = (9-2+5)/3 = 12.0