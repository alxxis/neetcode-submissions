class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        map = {")": "(", "}": "{", "]": "["}
        for c in s:
            if c in map and stack and stack[-1] == map[c]:
                stack.pop()
            else :
                stack.append(c)
        return True if not stack else False
        