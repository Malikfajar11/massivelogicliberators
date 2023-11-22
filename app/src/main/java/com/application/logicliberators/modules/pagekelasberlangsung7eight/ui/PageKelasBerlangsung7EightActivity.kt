package com.application.logicliberators.modules.pagekelasberlangsung7eight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityPageKelasBerlangsung7EightBinding
import com.application.logicliberators.modules.pagekelasberlangsung7eight.`data`.viewmodel.PageKelasBerlangsung7EightVM
import kotlin.String
import kotlin.Unit

class PageKelasBerlangsung7EightActivity :
    BaseActivity<ActivityPageKelasBerlangsung7EightBinding>(R.layout.activity_page_kelas_berlangsung_7_eight)
    {
  private val viewModel: PageKelasBerlangsung7EightVM by viewModels<PageKelasBerlangsung7EightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pageKelasBerlangsung7EightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PAGE_KELAS_BERLANGSUNG7EIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PageKelasBerlangsung7EightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
