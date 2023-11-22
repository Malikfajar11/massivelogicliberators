package com.application.logicliberators.modules.notifikasiaccguru.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.notifikasiaccguru.`data`.model.NotifikasiAccGuruModel
import com.application.logicliberators.modules.notifikasiaccguru.`data`.model.SpinnerFrameSixteenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotifikasiAccGuruVM : ViewModel(), KoinComponent {
  val notifikasiAccGuruModel: MutableLiveData<NotifikasiAccGuruModel> =
      MutableLiveData(NotifikasiAccGuruModel())

  var navArguments: Bundle? = null

  val spinnerFrameSixteenList: MutableLiveData<MutableList<SpinnerFrameSixteenModel>> =
      MutableLiveData()
}
