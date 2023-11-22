package com.application.logicliberators.modules.pagekelasberlangsung1eight.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class PageKelasBerlangsung1EightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKelasBerlangsu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kelas_berlangsu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_nama_guru_pus)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPerluKonfirmas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_perlu_konfirmas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLaporanPembela: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laporan_pembela)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laporan_sesi_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laporan_sesi_1)

)
