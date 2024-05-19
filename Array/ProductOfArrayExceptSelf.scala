object Solution {
    def productExceptSelf(nums: Array[Int]): Array[Int] = {
        val res = new Array[Int](nums.length)
        val rlProducts = new Array[Int](nums.length)

        rlProducts(nums.length -1) = nums(nums.length-1)
        for (i <- nums.length - 2 to (0, step = -1)) {
            rlProducts(i) = rlProducts(i + 1) * nums(i)
        }

        nums.indices.foldLeft(1) { case (leftProd, i) => 
            val r = if (i < nums.length-1) rlProducts(i+1) else 1
            res(i) = leftProd * r
            leftProd * nums(i)
        }
        res
    }
}