import kotlin.system.measureTimeMillis
import java.util.concurrent.ForkJoinPool
import java.util.concurrent.RecursiveTask
import kotlin.coroutines.coroutineScope

val LIMIT = 50_000_000
val SEQUENTIAL_THRESHOLD = LIMIT / 19

suspend fun compute(array: IntArray, start: Int, end: Int): Long = coroutineScope {
    //println("start: $start, end: $end on ${Thread.currentThread().name}")
    return if (end - start <= SEQUENTIAL_THRESHOLD) {
        (start until end)
            .asSequence()
            .map { array[it] }
            .sum().toLong()
    } else {
        val mid = start + (end - start) / 2
        val left = async(Dispatchers.Default) { compute(array, start, mid) }
        val right = async(Dispatchers.Default) { compute(array, mid, end) }
        return left.await() + right.await()
    }
}

internal class Sum(private var values: List<Int>, private var low: Int, private var high: Int) : RecursiveTask<Long>() {
    override fun compute(): Long {
        //println("low: $low, high: $high on ${Thread.currentThread().name}")
        return if (high - low <= SEQUENTIAL_THRESHOLD) {
            (low until high)
                .asSequence()
                .map { values[it] }
                .sum().toLong()
        } else {
            val mid = (low + high) / 2
            val left = Sum(values, low, mid)
            val right = Sum(values, mid, high)
            left.fork()
            val rightAns = right.compute()
            val leftAns = left.join()
            leftAns + rightAns
        }
    }

    companion object {
        val LIMIT = 50_000_000L
        val SEQUENTIAL_THRESHOLD = LIMIT / 19

        fun sumArray(array: List<Int>): Long {
            println("Numnber of cores: ${ForkJoinPool.getCommonPoolParallelism()}")
            return ForkJoinPool.commonPool().invoke(Sum(array, 0, array.size))
        }
    }
}

/*fun compute(array: IntArray, start: Int, end: Int): Long {
    //println("start: $start, end: $end on ${Thread.currentThread().name}")
    return if (end - start <= SEQUENTIAL_THRESHOLD) {
        (start until end)
            .asSequence()
            .map { array[it] }
            .sum().toLong()
    } else {
        val mid = start + (end - start) / 2
        val left = compute(array, start, mid)
        val right = compute(array, mid, end)
        return left + right
    }
}*/

fun main() {
    val list = mutableListOf<Int>()
    var limit = LIMIT

    for (i in 0 until LIMIT) {
        list.add(1)
    }

    var result: Long

    val integers = list.toIntArray()
    val size = integers.size

    result = 0L
    measureTimeMillis {
        result = compute(integers, 0, size)
    }
    println("Start")
    val time: Long = measureTimeMillis {
        result = compute(integers, 0, size)
    }
    println("$result in ${time}ms")
    
    result = 0L
    measureTimeMillis {
        result = Sum.sumArray(list)
    }
    println("Start")
    val time2: Long = measureTimeMillis {
        result = Sum.sumArray(list)
    }
    println("$result in ${time2}ms")
}