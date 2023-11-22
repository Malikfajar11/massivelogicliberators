package com.application.logicliberators.modules.daftarchatguru.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.daftarchatguru.`data`.model.DaftarChatGuruModel
import org.koin.core.KoinComponent

class DaftarChatGuruVM : ViewModel(), KoinComponent {
  val daftarChatGuruModel: MutableLiveData<DaftarChatGuruModel> =
      MutableLiveData(DaftarChatGuruModel())

  var navArguments: Bundle? = null
}
