package com.ian_no_1.mavericdemo.ui

import android.os.Bundle
import android.util.TypedValue
import android.view.View
import androidx.core.view.updateLayoutParams
import androidx.fragment.app.Fragment
import com.airbnb.mvrx.MavericksView
import com.airbnb.mvrx.fragmentViewModel
import com.airbnb.mvrx.viewbinding.viewBinding
import com.airbnb.mvrx.withState
import com.ian_no_1.mavericdemo.R
import com.ian_no_1.mavericdemo.databinding.FragmentHahaMonsterBinding

class HahaMonsterFragment : Fragment(R.layout.fragment_haha_monster), MavericksView {

    private val binding: FragmentHahaMonsterBinding by viewBinding()
    private val viewModel: HahaMonsterViewModel by fragmentViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding) {
            resetBtn.setOnClickListener { viewModel.onResetClick() }
            tickleBtn.setOnClickListener { viewModel.onTickleClick() }
        }
    }

    override fun invalidate() {
        withState(viewModel) {
            with(binding) {
                hahaMonster.setText(it.hahaTextRes)
                hahaMonster.setTextSize(TypedValue.COMPLEX_UNIT_SP, it.hahaMonsterTextSize)
                hahaMonster.updateLayoutParams {
                    width = it.hahaMonsterSize
                    height = it.hahaMonsterSize
                }
            }
        }
    }
}