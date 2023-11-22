package com.application.logicliberators.modules.informasisaya.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityInformasiSayaBinding
import com.application.logicliberators.modules.informasisaya.`data`.viewmodel.InformasiSayaVM
import com.application.logicliberators.modules.userprofileguru.ui.UserProfileGuruActivity
import kotlin.String
import kotlin.Unit

class InformasiSayaActivity :
    BaseActivity<ActivityInformasiSayaBinding>(R.layout.activity_informasi_saya) {
  private val viewModel: InformasiSayaVM by viewModels<InformasiSayaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.informasiSayaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnSimpan.setOnClickListener {
      val destIntent = UserProfileGuruActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INFORMASI_SAYA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InformasiSayaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
