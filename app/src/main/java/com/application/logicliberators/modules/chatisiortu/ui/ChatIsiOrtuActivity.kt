package com.application.logicliberators.modules.chatisiortu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityChatIsiOrtuBinding
import com.application.logicliberators.modules.chatisiortu.`data`.viewmodel.ChatIsiOrtuVM
import kotlin.String
import kotlin.Unit

class ChatIsiOrtuActivity :
    BaseActivity<ActivityChatIsiOrtuBinding>(R.layout.activity_chat_isi_ortu) {
  private val viewModel: ChatIsiOrtuVM by viewModels<ChatIsiOrtuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatIsiOrtuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CHAT_ISI_ORTU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChatIsiOrtuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
