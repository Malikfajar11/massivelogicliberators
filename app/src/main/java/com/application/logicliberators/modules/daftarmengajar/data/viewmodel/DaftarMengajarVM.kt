package com.application.logicliberators.modules.daftarmengajar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.daftarmengajar.`data`.model.DaftarMengajarModel
import org.koin.core.KoinComponent

class DaftarMengajarVM : ViewModel(), KoinComponent {
  val daftarMengajarModel: MutableLiveData<DaftarMengajarModel> =
      MutableLiveData(DaftarMengajarModel())

  var navArguments: Bundle? = null
}
