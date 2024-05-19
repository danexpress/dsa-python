object Solution {
    def productExceptSelf(nums: Array[Int]): Array[Int] = {
        val result = new Array[Int](nums.length)
        result(0) = 1

        def iterateForward(index: Int, previous: Int): Unit = index match {
            case i if i == nums.length => ()
            case i =>
            result(i) = result(i - 1) * previous
            iterateForward(i + 1, nums(i))
        }

        def iterateBackward(index: Int, previous: Int): Unit = index.match {
            case i if i == -1 => ()
            case i => 
            result(i) = result(i) * previous
            iterateBackward(i - 1, nums(i) * previous)
        }

        iterateForward(1, nums(0))
        iterateBackward(nums.length-1, 1)

        result
}
}