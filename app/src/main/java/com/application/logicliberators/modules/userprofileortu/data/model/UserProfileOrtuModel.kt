package com.application.logicliberators.modules.userprofileortu.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class UserProfileOrtuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSriIrawati: String? = MyApp.getInstance().resources.getString(R.string.lbl_sri_irawati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_bergabung_sejak)
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
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_berikan_dampak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDaftarkandiri: String? =
      MyApp.getInstance().resources.getString(R.string.msg_daftarkan_diri)
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

)
