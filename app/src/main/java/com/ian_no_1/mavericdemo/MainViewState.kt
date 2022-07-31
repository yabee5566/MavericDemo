package com.ian_no_1.mavericdemo

import com.airbnb.mvrx.MavericksState

data class MainViewState(val counter: Int = 0) : MavericksState
