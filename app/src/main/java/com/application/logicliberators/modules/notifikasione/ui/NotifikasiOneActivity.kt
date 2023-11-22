package com.application.logicliberators.modules.notifikasione.ui

import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityNotifikasiOneBinding
import com.application.logicliberators.modules.notifikasione.`data`.model.SpinnerFrameSixteenModel
import com.application.logicliberators.modules.notifikasione.`data`.viewmodel.NotifikasiOneVM
import com.application.logicliberators.modules.rekrutbayar.ui.RekrutBayarActivity
import kotlin.String
import kotlin.Unit

class NotifikasiOneActivity :
    BaseActivity<ActivityNotifikasiOneBinding>(R.layout.activity_notifikasi_one) {
  private val viewModel: NotifikasiOneVM by viewModels<NotifikasiOneVM>()

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
    binding.notifikasiOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnselamatpermin.setOnClickListener {
      val destIntent = RekrutBayarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NOTIFIKASI_ONE_ACTIVITY"

  }
}
