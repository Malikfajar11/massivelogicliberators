package com.application.logicliberators.modules.homepagegurustrat.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityHomepageGuruStratBinding
import com.application.logicliberators.modules.homepagegurustrat.`data`.viewmodel.HomepageGuruStratVM
import kotlin.String
import kotlin.Unit

class HomepageGuruStratActivity :
    BaseActivity<ActivityHomepageGuruStratBinding>(R.layout.activity_homepage_guru_strat) {
  private val viewModel: HomepageGuruStratVM by viewModels<HomepageGuruStratVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageGuruStratVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOMEPAGE_GURU_STRAT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageGuruStratActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
