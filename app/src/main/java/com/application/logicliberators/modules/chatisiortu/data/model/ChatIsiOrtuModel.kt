package com.application.logicliberators.modules.chatisiortu.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class ChatIsiOrtuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBqPuspitaSar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bq_puspita_sar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1137: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_37)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIsichat: String? = MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1137One: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_37)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIsichatOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1137Two: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_37)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1138: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_38)
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
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1417: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_17)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIsichatThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1417One: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_17)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneValue: String? = null
)
