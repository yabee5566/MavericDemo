package com.ian_no_1.mavericdemo.ui

import androidx.annotation.StringRes
import com.airbnb.mvrx.MavericksState
import com.ian_no_1.mavericdemo.R

data class HahaMonsterState(
    val count: Int = 0,
) : MavericksState {
    val hahaMonsterSize: Int = 100 + count * 10
    val hahaMonsterTextSize: Float = 8f + count

    @StringRes
    val hahaTextRes: Int =
        when (count) {
            in 0..3 -> R.string.haha_level1
            in 4..7 -> R.string.haha_level2
            in 8..11 -> R.string.haha_level3
            in 12..15 -> R.string.haha_level4
            in 16..19 -> R.string.haha_level5
            in 20..23 -> R.string.haha_level6
            in 24..27 -> R.string.haha_level7
            else -> R.string.haha_level7
        }


}
