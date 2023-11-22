package com.application.logicliberators.modules.homepageortu.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class HomepageOrtuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBeateacher: String? = MyApp.getInstance().resources.getString(R.string.lbl_be_a_teacher)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatdatang: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_selamat_datang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSriIrawati: String? = MyApp.getInstance().resources.getString(R.string.lbl_sri_irawati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_cari)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDaftarGuruKam: String? =
      MyApp.getInstance().resources.getString(R.string.msg_daftar_guru_kam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneValue: String? = null
)
