package com.application.logicliberators.modules.pagekelasberlangsung1eight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityPageKelasBerlangsung1EightBinding
import com.application.logicliberators.modules.pagekelasberlangsung1eight.`data`.viewmodel.PageKelasBerlangsung1EightVM
import kotlin.String
import kotlin.Unit

class PageKelasBerlangsung1EightActivity :
    BaseActivity<ActivityPageKelasBerlangsung1EightBinding>(R.layout.activity_page_kelas_berlangsung_1_eight)
    {
  private val viewModel: PageKelasBerlangsung1EightVM by viewModels<PageKelasBerlangsung1EightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pageKelasBerlangsung1EightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PAGE_KELAS_BERLANGSUNG1EIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PageKelasBerlangsung1EightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
