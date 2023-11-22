package com.application.logicliberators.modules.daftarmengajar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityDaftarMengajarBinding
import com.application.logicliberators.modules.daftarmengajar.`data`.viewmodel.DaftarMengajarVM
import kotlin.String
import kotlin.Unit

class DaftarMengajarActivity :
    BaseActivity<ActivityDaftarMengajarBinding>(R.layout.activity_daftar_mengajar) {
  private val viewModel: DaftarMengajarVM by viewModels<DaftarMengajarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.daftarMengajarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DAFTAR_MENGAJAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DaftarMengajarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
