package com.company.Leetcode

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        val firstStr = strs[0]
        val newStr = strs.drop(1).toTypedArray()
        var index = 0
        var temp = ""
        var sol = ""
        var changed = true

        while (firstStr.length > index) {
            temp = firstStr.substring(index, index + 1)

            for (s in newStr) {
                if (s.length <= index) {
                    index = Integer.MAX_VALUE
                    changed = false
                    break
                }
                if (temp == s.substring(index, index + 1)) {
                    continue
                } else {
                    index = Integer.MAX_VALUE
                    changed = false
                    break
                }
            }

            if (changed) {
                sol += temp
                index++
                temp = ""
            }
        }

        return sol
    }
}