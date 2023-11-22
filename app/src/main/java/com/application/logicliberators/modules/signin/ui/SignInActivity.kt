package com.application.logicliberators.modules.signin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.appcomponents.googleauth.GoogleHelper
import com.application.logicliberators.databinding.ActivitySignInBinding
import com.application.logicliberators.modules.homepageortucontainer.ui.HomepageOrtuContainerActivity
import com.application.logicliberators.modules.signin.`data`.viewmodel.SignInVM
import com.application.logicliberators.modules.signup.ui.SignUpActivity
import kotlin.String
import kotlin.Unit

class SignInActivity : BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
  private val viewModel: SignInVM by viewModels<SignInVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
      binding.frameStackgoogle.setOnClickListener {
        val destIntent = HomepageOrtuContainerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.imageGoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.btnMasukOne.setOnClickListener {
        val destIntent = HomepageOrtuContainerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtAppName.setOnClickListener {
        val destIntent = SignUpActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtMasukAkunRefe.setOnClickListener {
        val destIntent = SignUpActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "SIGN_IN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SignInActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
