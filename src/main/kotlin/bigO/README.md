Big O 

Big O is a mathematical notation which determines the change in the function behaviour (in terms of time or space taken)
based on the input size change.


Rules :

1. Worst Case :
   Always find the worst case complexity of the function. Lets say in the input of size n you could either find the element
   in the first place or at the last case so it could be just 1 iteration or n iteration. But we always consider the worst case.

2. Remove Constants :
   Lets say you have a function which has 5 assignments and one loop which runs through all the elements and 
   we perform 2 operations inside the loop. So ideally the big O complexity is O(5+2n).
   But if input increases the constant becomes very small values. So we drop the constant and Big o complexity remains O(n)

3. Different terms for input :
   Let say we have a function which takes 2 input arrays and loops over it. So now if it had been a same array.
   Big O would have been O(2n) and after dropping the constants O(n). But in our case we have 2 different input arrays
   Which could ideally have different lengths. So the Big O for such cases are the addition of the input array sizes
   O(m+n)

4. 