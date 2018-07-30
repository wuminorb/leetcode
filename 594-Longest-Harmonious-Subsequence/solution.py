class Solution:
    def findLHS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        from collections import defaultdict
        count = defaultdict(int)
        for num in nums:
            count[num] += 1

        count = [(key, value) for key, value in sorted(count.items())]

        result = 0
        for i in range(len(count) - 1):
            if count[i][0] + 1 == count[i + 1][0]:
                if result < count[i][1] + count[i + 1][1]:
                    result = count[i][1] + count[i + 1][1]

        return result


num = [1, 3, 2, 2, 5, 2, 3, 7]
print(Solution().findLHS(num))
