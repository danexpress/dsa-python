# Given a string s, reverse only all the vowels in the string and return it.

# The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.


# Example 1:

# Input: s = "hello"
# Output: "holle"
# Example 2:

# Input: s = "leetcode"
# Output: "leotcede"


class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = ""
        for i in s:
            if i in "aeiouAEIOU":
                vowels += i
        result_string = ""
        for char in s:
            if char in "aeiouAEIOU":
                result_string += vowels[-1]
                vowels = vowels[:-1]
            else:
                result_string += char
        return result_string
