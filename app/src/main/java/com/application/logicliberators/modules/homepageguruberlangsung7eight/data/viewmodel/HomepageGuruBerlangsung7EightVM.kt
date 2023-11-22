package com.application.logicliberators.modules.homepageguruberlangsung7eight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.homepageguruberlangsung7eight.`data`.model.HomepageGuruBerlangsung7EightModel
import org.koin.core.KoinComponent

class HomepageGuruBerlangsung7EightVM : ViewModel(), KoinComponent {
  val homepageGuruBerlangsung7EightModel: MutableLiveData<HomepageGuruBerlangsung7EightModel> =
      MutableLiveData(HomepageGuruBerlangsung7EightModel())

  var navArguments: Bundle? = null
}
