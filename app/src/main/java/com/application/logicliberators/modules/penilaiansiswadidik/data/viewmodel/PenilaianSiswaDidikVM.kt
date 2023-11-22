package com.application.logicliberators.modules.penilaiansiswadidik.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.penilaiansiswadidik.`data`.model.PenilaianSiswaDidikModel
import org.koin.core.KoinComponent

class PenilaianSiswaDidikVM : ViewModel(), KoinComponent {
  val penilaianSiswaDidikModel: MutableLiveData<PenilaianSiswaDidikModel> =
      MutableLiveData(PenilaianSiswaDidikModel())

  var navArguments: Bundle? = null
}
