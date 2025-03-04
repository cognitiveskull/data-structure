package bigO

class TimeComplexity {

    /*
       This function given an input of n takes n iterations to process the input
       so the time complexity for this is O(n)
     */
    fun convertNumbersToString(numbers: IntArray): List<String> {
        val currentTime = System.currentTimeMillis()
        val mappedNumbers = numbers.map { it.toString() }
        println("Time take in milliseconds to process numbers is : ${System.currentTimeMillis() - currentTime} ")
        return mappedNumbers
    }

}


fun main() {
    val timeComplexity = TimeComplexity()

    println(timeComplexity.convertNumbersToString(intArrayOf(1,2,3,4,5,6,7,8,9)))
    println(timeComplexity.convertNumbersToString(intArrayOf(1,2,3,4,5,6,7,8,9)))
    timeComplexity.convertNumbersToString(IntArray(10000){1}) /* creating an integer array with size 10000 */
}