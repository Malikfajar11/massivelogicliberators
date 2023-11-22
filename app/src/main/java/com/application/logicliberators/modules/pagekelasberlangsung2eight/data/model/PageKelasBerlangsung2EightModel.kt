package com.application.logicliberators.modules.pagekelasberlangsung2eight.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class PageKelasBerlangsung2EightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKelasBerlangsu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kelas_berlangsu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_nama_guru_pus2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSesiberlangsun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sesi_berlangsun2)
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
