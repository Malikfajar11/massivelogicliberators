package com.application.logicliberators.modules.homepageguru.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class HomepageGuruModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatdatang: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_selamat_datang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBqPuspitaSar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bq_puspita_sar)
  ,
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
      MyApp.getInstance().resources.getString(R.string.msg_budi_hartanto_b2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaOrtuSubje: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sri_irawati_tik2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifikasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_notifikasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPembayaranuntu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pembayaran_untu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAndamendapatt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_anda_mendapat_t)

)
