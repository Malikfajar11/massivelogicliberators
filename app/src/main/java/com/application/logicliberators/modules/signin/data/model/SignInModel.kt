package com.application.logicliberators.modules.signin.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class SignInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMasuk: String? = MyApp.getInstance().resources.getString(R.string.lbl_masuk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppName: String? = MyApp.getInstance().resources.getString(R.string.lbl_daftar_akun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInput: String? = MyApp.getInstance().resources.getString(R.string.msg_e_mail_nomor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInputOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputText: String? = MyApp.getInstance().resources.getString(R.string.lbl_input_text)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNama: String? = MyApp.getInstance().resources.getString(R.string.msg_lupa_kata_sandi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAtaumasukdeng: String? =
      MyApp.getInstance().resources.getString(R.string.msg_atau_masuk_deng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukAkunRefe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_belum_punya_aku)

)
