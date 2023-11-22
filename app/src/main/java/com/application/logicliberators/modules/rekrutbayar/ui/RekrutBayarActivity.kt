package com.application.logicliberators.modules.rekrutbayar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityRekrutBayarBinding
import com.application.logicliberators.modules.rekrutbayar.`data`.viewmodel.RekrutBayarVM
import kotlin.String
import kotlin.Unit

class RekrutBayarActivity : BaseActivity<ActivityRekrutBayarBinding>(R.layout.activity_rekrut_bayar)
    {
  private val viewModel: RekrutBayarVM by viewModels<RekrutBayarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rekrutBayarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REKRUT_BAYAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RekrutBayarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
