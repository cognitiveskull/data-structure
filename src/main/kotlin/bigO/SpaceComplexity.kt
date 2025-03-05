package bigO

class SpaceComplexity {

    /*
       This function given a size of N takes N space to create an array. So the space taken is O(n)
     */
    fun insertNElementsIntoArray(size: Int): IntArray {
        val numberArray = IntArray(size)
        var counter = 0

        while (counter < size) {
            numberArray[counter] = counter;
            counter++
        }
        return numberArray
    }

}


fun main() {
    val spaceComplexity = SpaceComplexity()

    println(spaceComplexity.insertNElementsIntoArray(5))

}