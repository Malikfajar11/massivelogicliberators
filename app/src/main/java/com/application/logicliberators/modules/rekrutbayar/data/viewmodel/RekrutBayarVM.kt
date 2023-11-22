package com.application.logicliberators.modules.rekrutbayar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.rekrutbayar.`data`.model.RekrutBayarModel
import org.koin.core.KoinComponent

class RekrutBayarVM : ViewModel(), KoinComponent {
  val rekrutBayarModel: MutableLiveData<RekrutBayarModel> = MutableLiveData(RekrutBayarModel())

  var navArguments: Bundle? = null
}
