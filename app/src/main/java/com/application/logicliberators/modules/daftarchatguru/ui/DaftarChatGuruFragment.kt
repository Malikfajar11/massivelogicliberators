package com.application.logicliberators.modules.daftarchatguru.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseFragment
import com.application.logicliberators.databinding.FragmentDaftarChatGuruBinding
import com.application.logicliberators.modules.chatisiguru.ui.ChatIsiGuruActivity
import com.application.logicliberators.modules.daftarchatguru.`data`.viewmodel.DaftarChatGuruVM
import kotlin.String
import kotlin.Unit

class DaftarChatGuruFragment :
    BaseFragment<FragmentDaftarChatGuruBinding>(R.layout.fragment_daftar_chat_guru) {
  private val viewModel: DaftarChatGuruVM by viewModels<DaftarChatGuruVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.daftarChatGuruVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowfotoprofil.setOnClickListener {
      val destIntent = ChatIsiGuruActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "DAFTAR_CHAT_GURU_FRAGMENT"


    fun getInstance(bundle: Bundle?): DaftarChatGuruFragment {
      val fragment = DaftarChatGuruFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
