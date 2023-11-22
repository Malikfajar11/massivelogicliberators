package com.application.logicliberators.modules.pengaturanmengajar.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class PengaturanMengajarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPengaturanMeng: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pengaturan_meng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInput: String? = MyApp.getInstance().resources.getString(R.string.msg_jumlah_sesi_per)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputText: String? = MyApp.getInstance().resources.getString(R.string.lbl_jumlah_sesi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInputOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_harga_per_bulan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudulInputTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sistem_bimbinga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameOneOneValue: String? = null
)
