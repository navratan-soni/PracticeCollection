package grokkingcodingpattern.slidingwindow

fun main() {
    SlidingPatterns.LargestSubStringAfterReplacingKLetters().run()
}

object SlidingPatterns {

    internal class LargestSubStringAfterReplacingKLetters {

        fun run() {
            print(largestSubStringAfterReplacingKLetters("aabccbb", 2) == 5)
        }

        private fun largestSubStringAfterReplacingKLetters(str: String, maxSubAllowed: Int): Int {
            var windowStart = 0
            var map = hashMapOf<Char, Int>()
            var maxFrequesncyCurrently = 0
            var maxLength = 0

            for(windowEnd in str.indices) {
                var endChar = str[windowEnd]
                map[endChar] = map.getOrDefault(endChar, 0) + 1
                maxFrequesncyCurrently = Math.max(map[endChar]!!, maxFrequesncyCurrently)

                if(windowEnd - windowStart + 1 - maxFrequesncyCurrently > maxSubAllowed) {
                    var startChar = str[windowStart]
                    map[startChar] = map.getOrDefault(startChar, 0) - 1
                    windowStart++
                }
                maxLength = Math.max(maxLength, windowEnd - windowStart + 1)
            }
            return maxLength
        }
    }

    internal class MinArrayWithSumK {

        fun run() {
            val inputArray = intArrayOf(1, 3, 2, 6, -1, 4, 1, 8, 9)
            println(finMinArrayWithSumK(inputArray, 9))
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

    internal class MaxSumSubArrayWithSizeK {

        fun run () {
            val inputArray = intArrayOf(1, 3, 2, 6, -1, 4, 1, 8, 2)
            println(maxSumSubArrayWithSizeK(inputArray, 3) == 13)
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
    }

    internal class AverageSizeOfK {

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

    internal class LongestSubStringWithKDistinct {

        fun run () {
            var testString1 = "jhjhjahjhjahsjahsjhjhjasasas"
            println(longestSubStringWithKDistinct(testString1, 3) == 12)
        }

        private fun longestSubStringWithKDistinct(str: String, maxChars: Int): Int {
            var map = hashMapOf<Char, Int>()
            var maxLength = Integer.MIN_VALUE
            var startIndex = 0
            for (endIndex in 0..str.length - 1) {
                var endChar: Char = str[endIndex]
                map[endChar] = map.getOrDefault(endChar, 0) + 1

                while(map.size > maxChars) {
                    var startChar = str[startIndex]
                    map[startChar] = map.get(startChar)!! - 1
                    if(map[startChar] == 0) {
                        map.remove(startChar)
                    }
                    startIndex++
                }

                maxLength = Math.max(maxLength, (endIndex - startIndex + 1))
            }

            return maxLength
        }
    }

    internal class FruitCountOfTwoTypes {

        fun run() {
            var inputArray = charArrayOf('A', 'B', 'C', 'B', 'B', 'C')
            println(maxFruitCountOfTwoTypes(inputArray) == 5)
        }

        private fun maxFruitCountOfTwoTypes(str: CharArray): Int {
            var maxFruitsType: Int = 2
            var map = hashMapOf<Char, Int>()
            var maxLength = Integer.MIN_VALUE
            var startIndex = 0
            for (endIndex in 0..str.size - 1) {
                var endChar: Char = str[endIndex]
                map[endChar] = map.getOrDefault(endChar, 0) + 1

                while(map.size > maxFruitsType) {
                    var startChar = str[startIndex]
                    map[startChar] = map.get(startChar)!! - 1
                    if(map[startChar] == 0) {
                        map.remove(startChar)
                    }
                    startIndex++
                }
                maxLength = Math.max(maxLength, (endIndex - startIndex + 1))
            }

            return maxLength
        }

    }

    internal class MaxStringLenghtWithDistinctChars {

        fun testMaxStringLenghtWithDistinctChars() {
            print(maxStringLenghtWithDistinctChars("aabccbb") == 3)
        }

        private fun maxStringLenghtWithDistinctChars(str: String): Int {
            var windowStart = 0
            val map = hashMapOf<Char, Int>()
            var maxWidnowLenght = 0;
            for (windowEnd in str.indices) {
                if (map.containsKey(str[windowEnd])) {
                    windowStart = map.get(str[windowEnd])!! + 1
                }
                map.put(str[windowEnd], windowEnd)
                maxWidnowLenght = Math.max(maxWidnowLenght, windowEnd-windowStart+1)
            }
            return maxWidnowLenght
        }
    }
}