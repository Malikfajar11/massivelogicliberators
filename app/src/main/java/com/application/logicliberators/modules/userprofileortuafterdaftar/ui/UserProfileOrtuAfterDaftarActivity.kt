package com.application.logicliberators.modules.userprofileortuafterdaftar.ui

import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityUserProfileOrtuAfterDaftarBinding
import com.application.logicliberators.modules.userprofileortuafterdaftar.`data`.viewmodel.UserProfileOrtuAfterDaftarVM
import kotlin.String
import kotlin.Unit

class UserProfileOrtuAfterDaftarActivity :
    BaseActivity<ActivityUserProfileOrtuAfterDaftarBinding>(R.layout.activity_user_profile_ortu_after_daftar)
    {
  private val viewModel: UserProfileOrtuAfterDaftarVM by viewModels<UserProfileOrtuAfterDaftarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userProfileOrtuAfterDaftarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "USER_PROFILE_ORTU_AFTER_DAFTAR_ACTIVITY"

  }
}
