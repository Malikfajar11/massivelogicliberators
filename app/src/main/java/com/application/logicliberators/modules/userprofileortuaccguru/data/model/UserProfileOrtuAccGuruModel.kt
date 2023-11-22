package com.application.logicliberators.modules.userprofileortuaccguru.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class UserProfileOrtuAccGuruModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSriIrawati: String? = MyApp.getInstance().resources.getString(R.string.lbl_sri_irawati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt628137xxxx525: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_62_8137xxxx525)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJlnBumiCender: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jln_bumi_cender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBtn: String? = MyApp.getInstance().resources.getString(R.string.msg_terakhir_diliha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.msg_masuk_sebagai_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutUs: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPusatBantuan: String? = MyApp.getInstance().resources.getString(R.string.lbl_pusat_bantuan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKeluar: String? = MyApp.getInstance().resources.getString(R.string.lbl_keluar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_bergabung_sejak)

)
