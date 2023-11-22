package com.application.logicliberators.modules.pengaturanmengajar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.pengaturanmengajar.`data`.model.PengaturanMengajarModel
import com.application.logicliberators.modules.pengaturanmengajar.`data`.model.SpinnerFrame1887Model
import com.application.logicliberators.modules.pengaturanmengajar.`data`.model.SpinnerFrame1887OneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PengaturanMengajarVM : ViewModel(), KoinComponent {
  val pengaturanMengajarModel: MutableLiveData<PengaturanMengajarModel> =
      MutableLiveData(PengaturanMengajarModel())

  var navArguments: Bundle? = null

  val spinnerFrame1887List: MutableLiveData<MutableList<SpinnerFrame1887Model>> = MutableLiveData()

  val spinnerFrame1887OneList: MutableLiveData<MutableList<SpinnerFrame1887OneModel>> =
      MutableLiveData()
}
