package com.application.logicliberators.modules.signup.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
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
  var txtJudulInput: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInputOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_e_mail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputText: String? = MyApp.getInstance().resources.getString(R.string.lbl_masukkan_e_mail2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInputTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_nomor_telepon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInputThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_kata_sandi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInputFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_konfirmasi_kata)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukAkunRefe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sudah_punya_aku)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneThreeValue: String? = null
)
