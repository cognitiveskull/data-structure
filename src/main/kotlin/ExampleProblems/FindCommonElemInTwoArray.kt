package ExampleProblems


/*
Given two arrays figure out if they have any common elements
arr1 = ['a', 'b', 'c', 'd']
arr2 = ['x', 'y', 'z', 'a']
 */
class FindCommonElemInTwoArray {

    /* the below function is the brute force approach to figure out if any of the common elements are present in the array1
    and array2. So the complexity to solve this is O(m*n) due to 2 nested loops. And as per the big o rule the two different inputs are
    are represented with their own constants as their size might vary
     */
    fun findCommonElementsInArrays(array1: CharArray, array2: CharArray): Boolean {
        for (array1Char in array1) {
            for (array2Char in array2) {
                if (array1Char == array2Char) return true
            }
        }
        return false
    }

    /*
    Here is the better solution - In the below case we are converting an input array to a hashset which leads to efficient
    lookup in this case. So our time complexity would be O(m+n). But here we introduced space complexity which could be O(n)
     */

    fun findCommonElementsInArrays2(array1: CharArray, array2: CharArray): Boolean {
        val charSet = hashSetOf<Char>() // converting array 1 into a data structure which has efficient accessibility
        array1.forEach { charSet.add(it) } // O(m)

        for (char in array2) { // O(n)
            if (charSet.contains(char)) return true
        }

        return false
    }

    /* Making it more readable using language features */
    fun findCommonElementsInArrays3(array1: CharArray, array2: CharArray): Boolean {
      return array1.any { array2.contains(it)}
    }


}


fun main() {
    val array1 = charArrayOf('a', 'b', 'c', 'd')
    val array2 = charArrayOf('x', 'y', 'z')
    val hasCommonElement = FindCommonElemInTwoArray().findCommonElementsInArrays3(array1, array2)

    println(hasCommonElement)
}