package com.application.logicliberators.modules.notifikasi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.notifikasi.`data`.model.NotifikasiModel
import com.application.logicliberators.modules.notifikasi.`data`.model.SpinnerFrameSixteenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotifikasiVM : ViewModel(), KoinComponent {
  val notifikasiModel: MutableLiveData<NotifikasiModel> = MutableLiveData(NotifikasiModel())

  var navArguments: Bundle? = null

  val spinnerFrameSixteenList: MutableLiveData<MutableList<SpinnerFrameSixteenModel>> =
      MutableLiveData()
}
