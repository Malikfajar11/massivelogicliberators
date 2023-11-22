package com.application.logicliberators.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivitySignUpBinding
import com.application.logicliberators.modules.signin.ui.SignInActivity
import com.application.logicliberators.modules.signup.`data`.model.SpinnerFrameTenModel
import com.application.logicliberators.modules.signup.`data`.viewmodel.SignUpVM
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFrameTenList.value = mutableListOf(
    SpinnerFrameTenModel("Item1"),
    SpinnerFrameTenModel("Item2"),
    SpinnerFrameTenModel("Item3"),
    SpinnerFrameTenModel("Item4"),
    SpinnerFrameTenModel("Item5")
    )
    val spinnerFrameTenAdapter =
    SpinnerFrameTenAdapter(this,R.layout.spinner_item,viewModel.spinnerFrameTenList.value?:
    mutableListOf())
    binding.spinnerFrameTen.adapter = spinnerFrameTenAdapter
    binding.signUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDaftar.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtMasuk.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
