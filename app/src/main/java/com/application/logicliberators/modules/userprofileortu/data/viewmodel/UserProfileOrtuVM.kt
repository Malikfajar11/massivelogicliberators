package com.application.logicliberators.modules.userprofileortu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.userprofileortu.`data`.model.UserProfileOrtuModel
import org.koin.core.KoinComponent

class UserProfileOrtuVM : ViewModel(), KoinComponent {
  val userProfileOrtuModel: MutableLiveData<UserProfileOrtuModel> =
      MutableLiveData(UserProfileOrtuModel())

  var navArguments: Bundle? = null
}
