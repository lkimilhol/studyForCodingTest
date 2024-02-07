package com.company.etc.w20240205

class Test2 {
    fun solution(works: Array<IntArray>, wage: Int): Int {
        var answer: Int = 0
        var monthlyWorkingTime = MonthlyWorkingTime(mutableMapOf<Int, Int>())

        for (work in works) {
            val startDay = work[0]
            val startTime = work[1]
            val endDay = work[2]
            val endTime = work[3]

            val totalWorkingTime = calculateWorkingTime(startDay, startTime, endDay, endTime)
            val extendWorkingTime = calculateExtendTime(startDay, startTime, endDay, endTime, totalWorkingTime)
            val nightWorkingTime = calculateNightTime(startDay, startTime, endDay, endTime)
            val weekendWorkingTime = calculateWeekendTime(startDay, startTime, endDay, endTime)
            calculateMonthlyTime(startDay, startTime, endDay, endTime, monthlyWorkingTime)

            answer += totalWorkingTime

        }
        return answer
    }

    private fun changeToZero(endTime: Int): Int {
        if (endTime == 0) {
            return 24
        }
        return endTime
    }

    private fun calculateWorkingTime(startDay: Int, startTime: Int, endDay: Int, endTime: Int): Int {
        val dayDiff = endDay - startDay

        if (dayDiff == 0) {
            return endTime - startTime
        }

        if (dayDiff == 1) {
            return 24 - startTime + endTime
        }

        return ((endDay - startDay - 1) * 24) + (24 - startTime + endTime)
    }

    private fun calculateExtendTime(startDay: Int, startTime: Int, endDay: Int, endTime: Int, totalWorkingTime: Int): Int {
        val dayDiff = endDay - startDay

        if (dayDiff == 0) {
            return if (totalWorkingTime > 8) totalWorkingTime - 8 else 0
        }

        // 24 - 8 - 근무시간
        val firstDayExtendTime = if (24 - startTime > 8) 16 - startTime else 0
        val endDayExtendTime = if (endTime - 8 > 0) endTime - 8 else 0

        // 8시간을 제외한 16시간
        return firstDayExtendTime + endDayExtendTime + ((dayDiff - 1) * 16)
    }

    private fun calculateNightTime(startDay: Int, startTime: Int, endDay: Int, endTime: Int): Int {
        val dayDiff = endDay - startDay

        if (dayDiff == 0) {
            return if (startTime >= 22) startTime - 22 else 0
        }

        val firstDayNightTime = if (startTime > 22) return 1 else 2
        val endDayNightTime = if (changeToZero(endTime) >= 22) changeToZero(endTime) - 22 else 0

        return firstDayNightTime + endDayNightTime + ((dayDiff - 1) * 2)
    }

    private fun calculateWeekendTime(startDay: Int, startTime: Int, endDay: Int, endTime: Int): Int {
        var result = 0

        if (endDay - startDay == 0) {
            return if (isWeekend(startDay)) {
                endTime - startTime
            } else {
                0
            }
        }

        if (isWeekend(startDay)) {
            result = 24 - startTime
        }

        if (isWeekend(endDay)) {
            result += endTime
        }


        for (i in (startDay + 1) until endDay) {
            if (isWeekend(i)) {
                result += 24
            }
        }
        return result
    }

    private fun calculateMonthlyTime(startDay: Int, startTime: Int, endDay: Int, endTime: Int, monthlyWorkingTime: MonthlyWorkingTime) {
        if (endDay - startDay == 0) {
            monthlyWorkingTime.increase(calculateWeekNumber(startDay), endTime - startTime)
        }

        monthlyWorkingTime.increase(calculateWeekNumber(startDay), 24 - startTime)
        monthlyWorkingTime.increase(calculateWeekNumber(endDay), endTime)
        for (i in (startDay + 1) until endDay) {
            monthlyWorkingTime.increase(calculateWeekNumber(i), 24)
        }
    }

    fun calculateWeekNumber(day: Int): Int {
        return when (day) {
            in 1..7 -> 1
            in 8..14 -> 2
            in 15..21 -> 3
            in 22..28 -> 4
            in 29..31 -> 5
            else -> 0
        }
    }

    private fun isWeekend(day: Int): Boolean {
        val result = (day - 1) % 7 + 1
        return result == 6 || result == 7
    }

    class MonthlyWorkingTime(
            private var time: MutableMap<Int, Int>
    ) {
        fun increase(key: Int, value: Int) {
            val default = time.getOrDefault(key, 0)
            val result = default + value
            time[key] = result
        }
    }

    companion object {
        const val NIGHT_SALARY_START_TIME = 22
        const val NIGHT_SALARY_END_TIME = 24
        const val NIGHT_SALARY = 0.5
        const val WEEKEND_SALARY = 0.5
        const val HOLIDAY_WORK_TIME = 15
        const val HOLIDAY_SALARY = 0.2
    }
}