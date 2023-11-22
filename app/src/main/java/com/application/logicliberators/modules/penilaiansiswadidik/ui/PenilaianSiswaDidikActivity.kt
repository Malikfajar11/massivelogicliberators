package com.application.logicliberators.modules.penilaiansiswadidik.ui

import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityPenilaianSiswaDidikBinding
import com.application.logicliberators.modules.homepageguruberlangsung1eight.ui.HomepageguruBerlangsung1EightActivity
import com.application.logicliberators.modules.penilaiansiswadidik.`data`.viewmodel.PenilaianSiswaDidikVM
import kotlin.String
import kotlin.Unit

class PenilaianSiswaDidikActivity :
    BaseActivity<ActivityPenilaianSiswaDidikBinding>(R.layout.activity_penilaian_siswa_didik) {
  private val viewModel: PenilaianSiswaDidikVM by viewModels<PenilaianSiswaDidikVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.penilaianSiswaDidikVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSubmit.setOnClickListener {
      val destIntent = HomepageguruBerlangsung1EightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PENILAIAN_SISWA_DIDIK_ACTIVITY"

  }
}
