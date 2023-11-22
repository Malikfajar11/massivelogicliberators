package com.application.logicliberators.modules.userprofileortuaccguru.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.userprofileortuaccguru.`data`.model.UserProfileOrtuAccGuruModel
import org.koin.core.KoinComponent

class UserProfileOrtuAccGuruVM : ViewModel(), KoinComponent {
  val userProfileOrtuAccGuruModel: MutableLiveData<UserProfileOrtuAccGuruModel> =
      MutableLiveData(UserProfileOrtuAccGuruModel())

  var navArguments: Bundle? = null
}
