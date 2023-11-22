package com.application.logicliberators.modules.notifikasiaccguru.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class NotifikasiAccGuruModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKelasBerlangsu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kelas_berlangsu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaGuruSubje: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nama_guru_subje3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaGuruSubjeOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nama_guru_subje2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_yey_berdasar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTerimakasihA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terima_kasih_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTerimakasihAOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terima_kasih_a2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTerimaKasihP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terima_kasih_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTerimakasihATwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terima_kasih_a3)

)
