package com.application.logicliberators.modules.daftarchatortu.ui

import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityDaftarChatOrtuBinding
import com.application.logicliberators.modules.chatisiortu.ui.ChatIsiOrtuActivity
import com.application.logicliberators.modules.daftarchatortu.`data`.viewmodel.DaftarChatOrtuVM
import kotlin.String
import kotlin.Unit

class DaftarChatOrtuActivity :
    BaseActivity<ActivityDaftarChatOrtuBinding>(R.layout.activity_daftar_chat_ortu) {
  private val viewModel: DaftarChatOrtuVM by viewModels<DaftarChatOrtuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.daftarChatOrtuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowfotoprofil.setOnClickListener {
      val destIntent = ChatIsiOrtuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DAFTAR_CHAT_ORTU_ACTIVITY"

  }
}
