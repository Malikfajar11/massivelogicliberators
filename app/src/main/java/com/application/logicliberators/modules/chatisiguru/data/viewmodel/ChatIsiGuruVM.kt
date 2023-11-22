package com.application.logicliberators.modules.chatisiguru.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.chatisiguru.`data`.model.ChatIsiGuruModel
import org.koin.core.KoinComponent

class ChatIsiGuruVM : ViewModel(), KoinComponent {
  val chatIsiGuruModel: MutableLiveData<ChatIsiGuruModel> = MutableLiveData(ChatIsiGuruModel())

  var navArguments: Bundle? = null
}
