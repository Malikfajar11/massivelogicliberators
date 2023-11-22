package com.application.logicliberators.modules.homepageguruberlangsung7eight.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class HomepageGuruBerlangsung7EightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKelasBerlangsu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kelas_berlangsu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_nama_ortu_bu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSesiberlangsun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sesi_berlangsun)
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
      MyApp.getInstance().resources.getString(R.string.msg_laporan_sesi_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laporan_sesi_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laporan_sesi_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laporan_sesi_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laporan_sesi_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionSix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laporan_sesi_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionSeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laporan_sesi_1)

)
