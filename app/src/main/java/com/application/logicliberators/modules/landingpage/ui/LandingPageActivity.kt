package com.application.logicliberators.modules.landingpage.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityLandingPageBinding
import com.application.logicliberators.modules.landingpage.`data`.viewmodel.LandingPageVM
import com.application.logicliberators.modules.signin.ui.SignInActivity
import kotlin.String
import kotlin.Unit

class LandingPageActivity : BaseActivity<ActivityLandingPageBinding>(R.layout.activity_landing_page)
    {
  private val viewModel: LandingPageVM by viewModels<LandingPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.landingPageVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnStart.setOnClickListener {
        val destIntent = SignInActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LANDING_PAGE_ACTIVITY"

    }
  }
