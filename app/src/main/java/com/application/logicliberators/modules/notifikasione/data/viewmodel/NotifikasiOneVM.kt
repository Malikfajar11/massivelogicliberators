package com.application.logicliberators.modules.notifikasione.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.notifikasione.`data`.model.NotifikasiOneModel
import com.application.logicliberators.modules.notifikasione.`data`.model.SpinnerFrameSixteenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotifikasiOneVM : ViewModel(), KoinComponent {
  val notifikasiOneModel: MutableLiveData<NotifikasiOneModel> =
      MutableLiveData(NotifikasiOneModel())

  var navArguments: Bundle? = null

  val spinnerFrameSixteenList: MutableLiveData<MutableList<SpinnerFrameSixteenModel>> =
      MutableLiveData()
}
