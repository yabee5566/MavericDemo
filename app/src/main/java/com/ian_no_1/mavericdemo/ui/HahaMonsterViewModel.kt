package com.ian_no_1.mavericdemo.ui

import com.airbnb.mvrx.MavericksViewModel

class HahaMonsterViewModel constructor(initialState: HahaMonsterState) :
    MavericksViewModel<HahaMonsterState>(initialState) {

    fun onResetClick() {
        setState { copy(count = 0) }
    }

    fun onTickleClick() {
        setState { copy(count = count + 1) }
    }
}