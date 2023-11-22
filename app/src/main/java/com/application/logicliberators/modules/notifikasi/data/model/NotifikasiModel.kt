package com.application.logicliberators.modules.notifikasi.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class NotifikasiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKelasBerlangsu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kelas_berlangsu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaOrtuSubje: String? =
      MyApp.getInstance().resources.getString(R.string.msg_puspita_sari_de2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaOrtuSubjeOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_puspita_sari_de2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaOrtuSubjeTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_puspita_sari_de2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pembayaran_anda)
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
  var txtSelamatPermin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selamat_permin)
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
