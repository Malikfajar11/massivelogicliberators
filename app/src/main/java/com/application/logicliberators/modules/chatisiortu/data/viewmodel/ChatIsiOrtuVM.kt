package com.application.logicliberators.modules.chatisiortu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.chatisiortu.`data`.model.ChatIsiOrtuModel
import org.koin.core.KoinComponent

class ChatIsiOrtuVM : ViewModel(), KoinComponent {
  val chatIsiOrtuModel: MutableLiveData<ChatIsiOrtuModel> = MutableLiveData(ChatIsiOrtuModel())

  var navArguments: Bundle? = null
}
