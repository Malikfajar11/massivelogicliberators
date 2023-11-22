package com.application.logicliberators.modules.penilaiansiswadidik.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class PenilaianSiswaDidikModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLaporanSesiThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_laporan_sesi_3)

)
