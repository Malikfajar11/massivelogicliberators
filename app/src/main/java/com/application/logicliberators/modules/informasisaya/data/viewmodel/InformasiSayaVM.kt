package com.application.logicliberators.modules.informasisaya.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.informasisaya.`data`.model.InformasiSayaModel
import org.koin.core.KoinComponent

class InformasiSayaVM : ViewModel(), KoinComponent {
  val informasiSayaModel: MutableLiveData<InformasiSayaModel> =
      MutableLiveData(InformasiSayaModel())

  var navArguments: Bundle? = null
}
