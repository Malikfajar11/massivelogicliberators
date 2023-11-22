package com.application.logicliberators.modules.rekrutbayar.`data`.model

import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.di.MyApp
import kotlin.String

data class RekrutBayarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTentangGuru: String? = MyApp.getInstance().resources.getString(R.string.lbl_tentang_guru)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRp2000008s: String? = MyApp.getInstance().resources.getString(R.string.msg_rp_200_000_8_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPuspitaSariDe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_puspita_sari_de)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubjekMataPe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_subjek_mata_pe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTeknologiInfor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_teknologi_infor2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSistemKunjunga: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sistem_kunjunga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTentangAnda: String? = MyApp.getInstance().resources.getString(R.string.lbl_tentang_anda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSriIrawati: String? = MyApp.getInstance().resources.getString(R.string.lbl_sri_irawati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlamat: String? = MyApp.getInstance().resources.getString(R.string.lbl_alamat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJlnBumiCender: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jln_bumi_cender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentOption: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_option)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBankTransfer: String? = MyApp.getInstance().resources.getString(R.string.lbl_bank_transfer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_subtotal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_service_fee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_total_payment)

)
