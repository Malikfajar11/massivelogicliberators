package com.application.logicliberators.modules.homepageguruberlangsung7eight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityHomepageGuruBerlangsung7EightBinding
import com.application.logicliberators.modules.homepageguruberlangsung7eight.`data`.viewmodel.HomepageGuruBerlangsung7EightVM
import kotlin.String
import kotlin.Unit

class HomepageGuruBerlangsung7EightActivity :
    BaseActivity<ActivityHomepageGuruBerlangsung7EightBinding>(R.layout.activity_homepage_guru_berlangsung_7_eight)
    {
  private val viewModel: HomepageGuruBerlangsung7EightVM by
      viewModels<HomepageGuruBerlangsung7EightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageGuruBerlangsung7EightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGE_GURU_BERLANGSUNG7EIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageGuruBerlangsung7EightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
