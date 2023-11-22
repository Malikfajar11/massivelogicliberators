package com.application.logicliberators.modules.homepageguru.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.homepageguru.`data`.model.HomepageGuruModel
import org.koin.core.KoinComponent

class HomepageGuruVM : ViewModel(), KoinComponent {
  val homepageGuruModel: MutableLiveData<HomepageGuruModel> = MutableLiveData(HomepageGuruModel())

  var navArguments: Bundle? = null
}
