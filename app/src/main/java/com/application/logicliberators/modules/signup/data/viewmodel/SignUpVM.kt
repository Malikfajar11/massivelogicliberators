package com.application.logicliberators.modules.signup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.signup.`data`.model.SignUpModel
import com.application.logicliberators.modules.signup.`data`.model.SpinnerFrameTenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SignUpVM : ViewModel(), KoinComponent {
  val signUpModel: MutableLiveData<SignUpModel> = MutableLiveData(SignUpModel())

  var navArguments: Bundle? = null

  val spinnerFrameTenList: MutableLiveData<MutableList<SpinnerFrameTenModel>> = MutableLiveData()
}
