package com.application.logicliberators.modules.homepageguruberlangsung1eight.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class HomepageguruBerlangsung1EightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKelasBerlangsu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kelas_berlangsu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_nama_ortu_sr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLaporansesite: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laporan_sesi_te)
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
