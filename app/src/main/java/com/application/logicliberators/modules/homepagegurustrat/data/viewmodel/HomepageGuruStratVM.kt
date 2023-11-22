package com.application.logicliberators.modules.homepagegurustrat.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.homepagegurustrat.`data`.model.HomepageGuruStratModel
import org.koin.core.KoinComponent

class HomepageGuruStratVM : ViewModel(), KoinComponent {
  val homepageGuruStratModel: MutableLiveData<HomepageGuruStratModel> =
      MutableLiveData(HomepageGuruStratModel())

  var navArguments: Bundle? = null
}
