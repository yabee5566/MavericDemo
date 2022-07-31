package com.ian_no_1.mavericdemo

import com.airbnb.mvrx.MavericksViewModel

class MainViewModel : MavericksViewModel<MainViewState>(MainViewState()) {

    fun addCount() {
        setState { copy(counter = counter + 1) }
    }

    fun minusCount() {
        setState { copy(counter = counter - 1) }
    }
}