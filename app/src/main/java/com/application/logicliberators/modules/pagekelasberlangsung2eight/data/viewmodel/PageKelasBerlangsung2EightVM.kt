package com.application.logicliberators.modules.pagekelasberlangsung2eight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.pagekelasberlangsung2eight.`data`.model.PageKelasBerlangsung2EightModel
import org.koin.core.KoinComponent

class PageKelasBerlangsung2EightVM : ViewModel(), KoinComponent {
  val pageKelasBerlangsung2EightModel: MutableLiveData<PageKelasBerlangsung2EightModel> =
      MutableLiveData(PageKelasBerlangsung2EightModel())

  var navArguments: Bundle? = null
}
