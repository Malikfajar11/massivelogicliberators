package com.application.logicliberators.modules.notifikasiaccguru.ui

import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityNotifikasiAccGuruBinding
import com.application.logicliberators.modules.notifikasiaccguru.`data`.model.SpinnerFrameSixteenModel
import com.application.logicliberators.modules.notifikasiaccguru.`data`.viewmodel.NotifikasiAccGuruVM
import com.application.logicliberators.modules.userprofileortuaccguru.ui.UserProfileOrtuAccGuruActivity
import kotlin.String
import kotlin.Unit

class NotifikasiAccGuruActivity :
    BaseActivity<ActivityNotifikasiAccGuruBinding>(R.layout.activity_notifikasi_acc_guru) {
  private val viewModel: NotifikasiAccGuruVM by viewModels<NotifikasiAccGuruVM>()

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
    binding.notifikasiAccGuruVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnlanguage.setOnClickListener {
      val destIntent = UserProfileOrtuAccGuruActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NOTIFIKASI_ACC_GURU_ACTIVITY"

  }
}
