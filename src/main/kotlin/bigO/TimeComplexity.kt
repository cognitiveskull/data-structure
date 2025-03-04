package bigO

class TimeComplexity {

    /*
       This function given an input of n takes n iterations to process the input
       so the time complexity for this is O(n) ---> Linear Time
     */
    fun convertNumbersToString(numbers: IntArray): List<String> {
        val currentTime = System.currentTimeMillis()
        val mappedNumbers = numbers.map { it.toString() }
        println("Time take in milliseconds to process numbers is : ${System.currentTimeMillis() - currentTime} ")
        return mappedNumbers
    }

    /*
      This function given an input of any length it takes only 1 operation to get the return value
      So the time complexity for this is O(1) ---> Constant Time
      Doesn't matter how much large the input gets the operation takes the same time
    */
    fun getNthElement(intArray: IntArray, index: Int): Int {
        return intArray[index]
    }

    /*
    In the below function instead of having time complexity O(1). It is O(1) for getting 0th element and O(1) to get 1st element
    So it becomes O(2).
    So lets say we have to add 3 numbers then it becomes O(3)
    But it is not in proportion to the input. Instead it depends on the number of operations happening in the functions.
    So we represent it as O(1) for all such cases. ---> Constant Time
     */

    fun addFirst2Element(intArray: IntArray): Int {
        return intArray[0] + intArray[1]
    }

}


fun main() {
    val timeComplexity = TimeComplexity()

    println(timeComplexity.convertNumbersToString(intArrayOf(1,2,3,4,5,6,7,8,9)))
    println(timeComplexity.convertNumbersToString(intArrayOf(1,2,3,4,5,6,7,8,9)))
    timeComplexity.convertNumbersToString(IntArray(10000){1}) /* creating an integer array with size 10000 */

    println(timeComplexity.getNthElement(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 2))

}