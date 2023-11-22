package com.application.logicliberators.modules.notifikasi2eight.ui

import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityNotifikasi2EightBinding
import com.application.logicliberators.modules.notifikasi2eight.`data`.model.SpinnerFrameSixteenModel
import com.application.logicliberators.modules.notifikasi2eight.`data`.viewmodel.Notifikasi2EightVM
import kotlin.String
import kotlin.Unit

class Notifikasi2EightActivity :
    BaseActivity<ActivityNotifikasi2EightBinding>(R.layout.activity_notifikasi_2_eight) {
  private val viewModel: Notifikasi2EightVM by viewModels<Notifikasi2EightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFrameSixteenList.value = mutableListOf(
    SpinnerFrameSixteenModel("Item1"),
    SpinnerFrameSixteenModel("Item2"),
    SpinnerFrameSixteenModel("Item3"),
    SpinnerFrameSixteenModel("Item4"),
    SpinnerFrameSixteenModel("Item5")
    )
    val spinnerFrameSixteenAdapter =
    SpinnerFrameSixteenAdapter(this,R.layout.spinner_item,viewModel.spinnerFrameSixteenList.value?:
    mutableListOf())
    binding.spinnerFrameSixteen.adapter = spinnerFrameSixteenAdapter
    binding.notifikasi2EightVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NOTIFIKASI2EIGHT_ACTIVITY"

  }
}
