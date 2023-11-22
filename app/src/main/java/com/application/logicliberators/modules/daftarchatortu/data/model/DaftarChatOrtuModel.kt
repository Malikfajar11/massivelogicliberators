package com.application.logicliberators.modules.daftarchatortu.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class DaftarChatOrtuModel(
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
  var txtBqPuspitaSar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bq_puspita_sar)
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
  var txtNama: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIsichatOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_lorem_ipsum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0921: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_21)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama)
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
