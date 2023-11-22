package com.application.logicliberators.modules.notifikasi2eight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.notifikasi2eight.`data`.model.Notifikasi2EightModel
import com.application.logicliberators.modules.notifikasi2eight.`data`.model.SpinnerFrameSixteenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Notifikasi2EightVM : ViewModel(), KoinComponent {
  val notifikasi2EightModel: MutableLiveData<Notifikasi2EightModel> =
      MutableLiveData(Notifikasi2EightModel())

  var navArguments: Bundle? = null

  val spinnerFrameSixteenList: MutableLiveData<MutableList<SpinnerFrameSixteenModel>> =
      MutableLiveData()
}
