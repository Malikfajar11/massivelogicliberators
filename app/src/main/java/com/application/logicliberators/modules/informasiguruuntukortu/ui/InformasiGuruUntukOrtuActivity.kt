package com.application.logicliberators.modules.informasiguruuntukortu.ui

import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityInformasiGuruUntukOrtuBinding
import com.application.logicliberators.modules.informasiguruuntukortu.`data`.viewmodel.InformasiGuruUntukOrtuVM
import kotlin.String
import kotlin.Unit

class InformasiGuruUntukOrtuActivity :
    BaseActivity<ActivityInformasiGuruUntukOrtuBinding>(R.layout.activity_informasi_guru_untuk_ortu)
    {
  private val viewModel: InformasiGuruUntukOrtuVM by viewModels<InformasiGuruUntukOrtuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.informasiGuruUntukOrtuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "INFORMASI_GURU_UNTUK_ORTU_ACTIVITY"

  }
}
