package com.application.logicliberators.modules.userprofileguru.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.userprofileguru.`data`.model.UserProfileGuruModel
import org.koin.core.KoinComponent

class UserProfileGuruVM : ViewModel(), KoinComponent {
  val userProfileGuruModel: MutableLiveData<UserProfileGuruModel> =
      MutableLiveData(UserProfileGuruModel())

  var navArguments: Bundle? = null
}
