package grokkingcodingpattern.slidingwindow

fun main() {
    SlidingPatterns.testAverageSizeOfK()
}

object SlidingPatterns {

    fun testAverageSizeOfK() {
        val inputArray = intArrayOf(1, 3, 2, 6, -1, 4, 1, 8, 2)
        (getAverageOfSizeK(inputArray, 5).forEach { print("${it}, ") })
    }

    private fun getAverageOfSizeK(array: IntArray, windowSize: Int): Array<Float?> {
        val avgArray = arrayOfNulls<Float>(array.size - windowSize + 1)
        var startIndex = 0
        var sum = 0.0f
        for(endIndex in 0..array.size-1) {
            sum += array[endIndex]
            if(endIndex >= windowSize - 1) {
                avgArray[startIndex] = sum/windowSize
                sum -= array[startIndex]
                startIndex++
            }
        }
        return avgArray
    }
}