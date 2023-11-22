package com.application.logicliberators.modules.userprofileortuafterdaftar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.userprofileortuafterdaftar.`data`.model.UserProfileOrtuAfterDaftarModel
import org.koin.core.KoinComponent

class UserProfileOrtuAfterDaftarVM : ViewModel(), KoinComponent {
  val userProfileOrtuAfterDaftarModel: MutableLiveData<UserProfileOrtuAfterDaftarModel> =
      MutableLiveData(UserProfileOrtuAfterDaftarModel())

  var navArguments: Bundle? = null
}
