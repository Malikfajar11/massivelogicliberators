package com.application.logicliberators.modules.pagekelasberlangsung2eight.ui

import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityPageKelasBerlangsung2EightBinding
import com.application.logicliberators.modules.pagekelasberlangsung2eight.`data`.viewmodel.PageKelasBerlangsung2EightVM
import kotlin.String
import kotlin.Unit

class PageKelasBerlangsung2EightActivity :
    BaseActivity<ActivityPageKelasBerlangsung2EightBinding>(R.layout.activity_page_kelas_berlangsung_2_eight)
    {
  private val viewModel: PageKelasBerlangsung2EightVM by viewModels<PageKelasBerlangsung2EightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pageKelasBerlangsung2EightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PAGE_KELAS_BERLANGSUNG2EIGHT_ACTIVITY"

  }
}
