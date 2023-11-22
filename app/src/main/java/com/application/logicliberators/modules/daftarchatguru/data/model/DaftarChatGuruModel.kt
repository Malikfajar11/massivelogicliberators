package com.application.logicliberators.modules.daftarchatguru.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class DaftarChatGuruModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChat: String? = MyApp.getInstance().resources.getString(R.string.lbl_chat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCariPesan: String? = MyApp.getInstance().resources.getString(R.string.lbl_cari_pesan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSriIrawati: String? = MyApp.getInstance().resources.getString(R.string.lbl_sri_irawati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIsichat: String? = MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1417: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_17)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBudiHartanto: String? = MyApp.getInstance().resources.getString(R.string.lbl_budi_hartanto)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIsichatOne: String? = MyApp.getInstance().resources.getString(R.string.msg_baik_dimengert)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0921: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_21)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKetutNyana: String? = MyApp.getInstance().resources.getString(R.string.lbl_ketut_nyana)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIsichatTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0911: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_11)

)
