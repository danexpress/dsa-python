# You have two types of tiles: a 2 x 1 domino shape and a tromino shape. You may rotate these shapes.


# Given an integer n, return the number of ways to tile an 2 x n board. Since the answer may be very large, return it modulo 109 + 7.

# In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two 4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied by a tile.


# Example 1:


# Input: n = 3
# Output: 5
# Explanation: The five different ways are show above.
# Example 2:

# Input: n = 1
# Output: 1


class Solution:
    def numTilings(self, n: int) -> int:
        dp = {}
        return self.helper(n, 0, 0, dp) % (10**9 + 7)

    def helper(self, n, x, y, dp):
        if x > n or y > n:
            return 0
        if x == n and y == n:
            return 1
        if (x, y) in dp:
            return dp[(x, y)]
        ans = 0
        if x == y:
            ans += self.helper(n, x + 1, y + 1, dp)
            ans += self.helper(n, x + 2, y + 2, dp)
            ans += self.helper(n, x + 1, y + 2, dp)
            ans += self.helper(n, x + 2, y + 1, dp)
        elif (x - y) == 1:
            ans += self.helper(n, x + 1, y + 2, dp)
            ans += self.helper(n, x, y + 2, dp)
        else:
            ans += self.helper(n, x + 2, y + 1, dp)
            ans += self.helper(n, x + 2, y, dp)
        dp[(x, y)] = ans
        return ans
