package com.application.logicliberators.modules.homepageortu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.homepageortu.`data`.model.DaftarcardgurRowModel
import com.application.logicliberators.modules.homepageortu.`data`.model.HomepageOrtuModel
import com.application.logicliberators.modules.homepageortu.`data`.model.SpinnerFrameThreeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomepageOrtuVM : ViewModel(), KoinComponent {
  val homepageOrtuModel: MutableLiveData<HomepageOrtuModel> = MutableLiveData(HomepageOrtuModel())

  var navArguments: Bundle? = null

  val spinnerFrameThreeList: MutableLiveData<MutableList<SpinnerFrameThreeModel>> =
      MutableLiveData()

  val daftarcardgurList: MutableLiveData<MutableList<DaftarcardgurRowModel>> =
      MutableLiveData(mutableListOf())
}
