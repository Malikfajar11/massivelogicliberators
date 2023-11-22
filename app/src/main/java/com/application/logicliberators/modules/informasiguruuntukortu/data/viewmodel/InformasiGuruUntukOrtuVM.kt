package com.application.logicliberators.modules.informasiguruuntukortu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.informasiguruuntukortu.`data`.model.InformasiGuruUntukOrtuModel
import org.koin.core.KoinComponent

class InformasiGuruUntukOrtuVM : ViewModel(), KoinComponent {
  val informasiGuruUntukOrtuModel: MutableLiveData<InformasiGuruUntukOrtuModel> =
      MutableLiveData(InformasiGuruUntukOrtuModel())

  var navArguments: Bundle? = null
}
