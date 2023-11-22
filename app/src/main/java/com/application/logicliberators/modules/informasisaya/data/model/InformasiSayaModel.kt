package com.application.logicliberators.modules.informasisaya.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class InformasiSayaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInformasiSaya: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_informasi_saya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDokumenanda: String? = MyApp.getInstance().resources.getString(R.string.lbl_dokumen_anda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInput: String? = MyApp.getInstance().resources.getString(R.string.msg_pendidikan_tera)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInputOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_setifikat_pendu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDokumenandaOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dokumen_anda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInputTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_curriculum_vita)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDokumenandaTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dokumen_anda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInputThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_surat_aktif_kul)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInputFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_personal_brandi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etDokumenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etDokumenOneValue: String? = null
)
