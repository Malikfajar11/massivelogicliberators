package com.application.logicliberators.modules.landingpage.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class LandingPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppName: String? = MyApp.getInstance().resources.getString(R.string.lbl_males)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_selamat_datang)

)
