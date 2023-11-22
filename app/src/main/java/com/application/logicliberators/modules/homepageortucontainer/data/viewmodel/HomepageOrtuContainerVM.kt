package com.application.logicliberators.modules.homepageortucontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.homepageortucontainer.`data`.model.HomepageOrtuContainerModel
import org.koin.core.KoinComponent

class HomepageOrtuContainerVM : ViewModel(), KoinComponent {
  val homepageOrtuContainerModel: MutableLiveData<HomepageOrtuContainerModel> =
      MutableLiveData(HomepageOrtuContainerModel())

  var navArguments: Bundle? = null
}
