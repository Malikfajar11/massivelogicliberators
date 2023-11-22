package com.application.logicliberators.modules.homepageguruberlangsung1eight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityHomepageguruBerlangsung1EightBinding
import com.application.logicliberators.modules.homepageguruberlangsung1eight.`data`.viewmodel.HomepageguruBerlangsung1EightVM
import kotlin.String
import kotlin.Unit

class HomepageguruBerlangsung1EightActivity :
    BaseActivity<ActivityHomepageguruBerlangsung1EightBinding>(R.layout.activity_homepageguru_berlangsung_1_eight)
    {
  private val viewModel: HomepageguruBerlangsung1EightVM by
      viewModels<HomepageguruBerlangsung1EightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageguruBerlangsung1EightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGEGURU_BERLANGSUNG1EIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageguruBerlangsung1EightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
