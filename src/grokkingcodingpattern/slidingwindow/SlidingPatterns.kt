package grokkingcodingpattern.slidingwindow

fun main() {
   // SlidingPatterns.testAverageSizeOfK()
   // SlidingPatterns.testMaxSumSubArrayWithSizeK()
    SlidingPatterns.testFinMinArrayWithSumK()
}

object SlidingPatterns {

    fun testFinMinArrayWithSumK() {
        val inputArray = intArrayOf(1, 3, 2, 6, -1, 4, 1, 8, 9)
        println(finMinArrayWithSumK(inputArray, 9))
    }

    fun testMaxSumSubArrayWithSizeK() {
        val inputArray = intArrayOf(1, 3, 2, 6, -1, 4, 1, 8, 2)
        println(maxSumSubArrayWithSizeK(inputArray, 3) == 13)
    }

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

    private fun maxSumSubArrayWithSizeK(array: IntArray, windowSize: Int): Int {
        var maxSumInt = 0
        var minIndex = 0
        var currentSum = 0;

        for(endIndex in 0..array.size -1) {
            currentSum = currentSum + array[endIndex]

            if(endIndex >= windowSize-1) {
                maxSumInt = Math.max(currentSum, maxSumInt)
                currentSum -= array[minIndex]
                minIndex++
            }
        }
        return maxSumInt
    }

    private fun finMinArrayWithSumK(array: IntArray, sum: Int): Int {
        var windowStart = 0;
        var currentSum = 0;
        var currentSize = 0;
        var minSize = Integer.MAX_VALUE;
        for(windowEnd in 0..array.size-1) {
            currentSum += array[windowEnd]
            currentSize++
            while (currentSum >= sum && windowStart <= windowEnd) {
                minSize = Math.min(minSize, currentSize)
                currentSize--
                currentSum -= array[windowStart]
                windowStart++
            }
        }
        return minSize
    }
}