package com.application.logicliberators.modules.daftarmengajar.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class DaftarMengajarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDaftarMenjadi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_daftar_menjadi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadDokumen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_upload_dokumen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadDokumenOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_upload_dokumen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInput: String? = MyApp.getInstance().resources.getString(R.string.msg_pendidikan_tera)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameOne: String? = MyApp.getInstance().resources.getString(R.string.msg_pastikan_data)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInputOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sertifikat_pend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadDokumenTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_upload_dokumen)
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
  var txtJudulInputThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_personal_brandi2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInputFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_surat_aktif_kul)
  ,
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
  var etUploaddokumenThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etUploaddokumenFourValue: String? = null
)
