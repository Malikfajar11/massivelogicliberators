package com.application.logicliberators.modules.informasiguruuntukortu.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class InformasiGuruUntukOrtuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNama: String? = MyApp.getInstance().resources.getString(R.string.msg_puspita_sari_de)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaOne: String? = MyApp.getInstance().resources.getString(R.string.msg_teknologi_infor2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_saya_merupakan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_rp_200_000_mont)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamaThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_banyak_sesi2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSesiCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_sesi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kuota_anak_didi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_pendidikan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputText: String? = MyApp.getInstance().resources.getString(R.string.msg_masasiswa_uni)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInput: String? = MyApp.getInstance().resources.getString(R.string.msg_curriculum_vita)

)
