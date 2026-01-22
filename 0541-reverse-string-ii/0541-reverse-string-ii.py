class Solution(object):
    def reverseStr(self, s, k):
        ans = ""
        i = 0

        while i < len(s):
            ans += s[i:i+k][::-1]      # reverse first k
            ans += s[i+k:i+2*k]        # keep next k as it is
            i += 2 * k

        return ans
