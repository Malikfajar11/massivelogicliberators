package com.application.logicliberators.modules.homepageguru.ui

import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityHomepageGuruBinding
import com.application.logicliberators.modules.homepageguru.`data`.viewmodel.HomepageGuruVM
import com.application.logicliberators.modules.homepageguruberlangsung1eight.ui.HomepageguruBerlangsung1EightActivity
import com.application.logicliberators.modules.homepageguruberlangsung7eight.ui.HomepageGuruBerlangsung7EightActivity
import kotlin.String
import kotlin.Unit

class HomepageGuruActivity :
    BaseActivity<ActivityHomepageGuruBinding>(R.layout.activity_homepage_guru) {
  private val viewModel: HomepageGuruVM by viewModels<HomepageGuruVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageGuruVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowfotoprofil.setOnClickListener {
      val destIntent = HomepageGuruBerlangsung7EightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowfotoprofilOne.setOnClickListener {
      val destIntent = HomepageguruBerlangsung1EightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGE_GURU_ACTIVITY"

  }
}
