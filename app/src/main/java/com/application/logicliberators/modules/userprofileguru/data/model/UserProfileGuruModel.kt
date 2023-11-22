package com.application.logicliberators.modules.userprofileguru.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class UserProfileGuruModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBqPuspitaSar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bq_puspita_sar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_bergabung_sejak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt628137xxxx008: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_62_8137xxxx008)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPRMHAlamPunca: String? =
      MyApp.getInstance().resources.getString(R.string.msg_prmh_alam_punca)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt00208182234700: String? =
      MyApp.getInstance().resources.getString(R.string.msg_002_08182234700)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBtn: String? = MyApp.getInstance().resources.getString(R.string.lbl_informasi_saya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBtnOne: String? = MyApp.getInstance().resources.getString(R.string.msg_pengaturan_meng)
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
