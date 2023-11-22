package com.application.logicliberators.modules.pagekelasberlangsung7eight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.logicliberators.modules.pagekelasberlangsung7eight.`data`.model.PageKelasBerlangsung7EightModel
import org.koin.core.KoinComponent

class PageKelasBerlangsung7EightVM : ViewModel(), KoinComponent {
  val pageKelasBerlangsung7EightModel: MutableLiveData<PageKelasBerlangsung7EightModel> =
      MutableLiveData(PageKelasBerlangsung7EightModel())

  var navArguments: Bundle? = null
}
