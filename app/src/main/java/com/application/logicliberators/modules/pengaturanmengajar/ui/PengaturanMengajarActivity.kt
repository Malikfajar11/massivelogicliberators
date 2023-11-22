package com.application.logicliberators.modules.pengaturanmengajar.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityPengaturanMengajarBinding
import com.application.logicliberators.modules.pengaturanmengajar.`data`.model.SpinnerFrame1887Model
import com.application.logicliberators.modules.pengaturanmengajar.`data`.model.SpinnerFrame1887OneModel
import com.application.logicliberators.modules.pengaturanmengajar.`data`.viewmodel.PengaturanMengajarVM
import com.application.logicliberators.modules.userprofileguru.ui.UserProfileGuruActivity
import kotlin.String
import kotlin.Unit

class PengaturanMengajarActivity :
    BaseActivity<ActivityPengaturanMengajarBinding>(R.layout.activity_pengaturan_mengajar) {
  private val viewModel: PengaturanMengajarVM by viewModels<PengaturanMengajarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFrame1887List.value = mutableListOf(
    SpinnerFrame1887Model("Item1"),
    SpinnerFrame1887Model("Item2"),
    SpinnerFrame1887Model("Item3"),
    SpinnerFrame1887Model("Item4"),
    SpinnerFrame1887Model("Item5")
    )
    val spinnerFrame1887Adapter =
    SpinnerFrame1887Adapter(this,R.layout.spinner_item,viewModel.spinnerFrame1887List.value?:
    mutableListOf())
    binding.spinnerFrame1887.adapter = spinnerFrame1887Adapter
    viewModel.spinnerFrame1887OneList.value = mutableListOf(
    SpinnerFrame1887OneModel("Item1"),
    SpinnerFrame1887OneModel("Item2"),
    SpinnerFrame1887OneModel("Item3"),
    SpinnerFrame1887OneModel("Item4"),
    SpinnerFrame1887OneModel("Item5")
    )
    val spinnerFrame1887OneAdapter =
    SpinnerFrame1887OneAdapter(this,R.layout.spinner_item,viewModel.spinnerFrame1887OneList.value?:
    mutableListOf())
    binding.spinnerFrame1887One.adapter = spinnerFrame1887OneAdapter
    binding.pengaturanMengajarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSimpan.setOnClickListener {
      val destIntent = UserProfileGuruActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PENGATURAN_MENGAJAR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PengaturanMengajarActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
