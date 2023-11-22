package com.application.logicliberators.modules.homepageguruberlangsung1eight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.homepageguruberlangsung1eight.`data`.model.HomepageguruBerlangsung1EightModel
import org.koin.core.KoinComponent

class HomepageguruBerlangsung1EightVM : ViewModel(), KoinComponent {
  val homepageguruBerlangsung1EightModel: MutableLiveData<HomepageguruBerlangsung1EightModel> =
      MutableLiveData(HomepageguruBerlangsung1EightModel())

  var navArguments: Bundle? = null
}
