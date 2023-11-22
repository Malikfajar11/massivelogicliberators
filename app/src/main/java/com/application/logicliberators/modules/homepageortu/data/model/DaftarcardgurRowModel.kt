package com.application.logicliberators.modules.homepageortu.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class DaftarcardgurRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNama: String? = MyApp.getInstance().resources.getString(R.string.lbl_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_tik)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_puspita_sari_de)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_sd_kelas_1_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHargaRp: String? = MyApp.getInstance().resources.getString(R.string.lbl_harga_rp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne1: String? = MyApp.getInstance().resources.getString(R.string.lbl_banyak_sesi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_180_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lihat_lebih_lan)

)
