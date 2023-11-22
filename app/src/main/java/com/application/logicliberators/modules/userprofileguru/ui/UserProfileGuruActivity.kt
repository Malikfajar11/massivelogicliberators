package com.application.logicliberators.modules.userprofileguru.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityUserProfileGuruBinding
import com.application.logicliberators.modules.informasisaya.ui.InformasiSayaActivity
import com.application.logicliberators.modules.pengaturanmengajar.ui.PengaturanMengajarActivity
import com.application.logicliberators.modules.signin.ui.SignInActivity
import com.application.logicliberators.modules.userprofileguru.`data`.viewmodel.UserProfileGuruVM
import kotlin.String
import kotlin.Unit

class UserProfileGuruActivity :
    BaseActivity<ActivityUserProfileGuruBinding>(R.layout.activity_user_profile_guru) {
  private val viewModel: UserProfileGuruVM by viewModels<UserProfileGuruVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userProfileGuruVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBtnOne.setOnClickListener {
      val destIntent = PengaturanMengajarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtBtn.setOnClickListener {
      val destIntent = InformasiSayaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowlogout.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "USER_PROFILE_GURU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserProfileGuruActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
