package com.application.logicliberators.modules.pagekelasberlangsung1eight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.pagekelasberlangsung1eight.`data`.model.PageKelasBerlangsung1EightModel
import org.koin.core.KoinComponent

class PageKelasBerlangsung1EightVM : ViewModel(), KoinComponent {
  val pageKelasBerlangsung1EightModel: MutableLiveData<PageKelasBerlangsung1EightModel> =
      MutableLiveData(PageKelasBerlangsung1EightModel())

  var navArguments: Bundle? = null
}
