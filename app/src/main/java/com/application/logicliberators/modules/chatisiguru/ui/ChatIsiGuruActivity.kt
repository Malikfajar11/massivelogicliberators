package com.application.logicliberators.modules.chatisiguru.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityChatIsiGuruBinding
import com.application.logicliberators.modules.chatisiguru.`data`.viewmodel.ChatIsiGuruVM
import kotlin.String
import kotlin.Unit

class ChatIsiGuruActivity :
    BaseActivity<ActivityChatIsiGuruBinding>(R.layout.activity_chat_isi_guru) {
  private val viewModel: ChatIsiGuruVM by viewModels<ChatIsiGuruVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatIsiGuruVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CHAT_ISI_GURU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChatIsiGuruActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
