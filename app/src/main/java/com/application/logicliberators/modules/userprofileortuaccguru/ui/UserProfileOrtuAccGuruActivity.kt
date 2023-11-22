package com.application.logicliberators.modules.userprofileortuaccguru.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityUserProfileOrtuAccGuruBinding
import com.application.logicliberators.modules.homepagegurustrat.ui.HomepageGuruStratActivity
import com.application.logicliberators.modules.signin.ui.SignInActivity
import com.application.logicliberators.modules.userprofileortuaccguru.`data`.viewmodel.UserProfileOrtuAccGuruVM
import kotlin.String
import kotlin.Unit

class UserProfileOrtuAccGuruActivity :
    BaseActivity<ActivityUserProfileOrtuAccGuruBinding>(R.layout.activity_user_profile_ortu_acc_guru)
    {
  private val viewModel: UserProfileOrtuAccGuruVM by viewModels<UserProfileOrtuAccGuruVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userProfileOrtuAccGuruVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowlogout.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBtn.setOnClickListener {
      val destIntent = HomepageGuruStratActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "USER_PROFILE_ORTU_ACC_GURU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserProfileOrtuAccGuruActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
