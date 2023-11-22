package com.application.logicliberators.modules.notifikasione.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class NotifikasiOneModel(
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
      MyApp.getInstance().resources.getString(R.string.msg_nama_guru_subje)
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
  var txtSelamatPermin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selamat_permin)
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
  var txtTerimakasihA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terima_kasih_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTerimakasihte: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terima_kasih_te)

)
