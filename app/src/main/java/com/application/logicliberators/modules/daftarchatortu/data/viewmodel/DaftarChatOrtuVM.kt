package com.application.logicliberators.modules.daftarchatortu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.daftarchatortu.`data`.model.DaftarChatOrtuModel
import org.koin.core.KoinComponent

class DaftarChatOrtuVM : ViewModel(), KoinComponent {
  val daftarChatOrtuModel: MutableLiveData<DaftarChatOrtuModel> =
      MutableLiveData(DaftarChatOrtuModel())

  var navArguments: Bundle? = null
}
