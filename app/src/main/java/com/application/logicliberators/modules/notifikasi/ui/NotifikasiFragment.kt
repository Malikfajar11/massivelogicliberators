package com.application.logicliberators.modules.notifikasi.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseFragment
import com.application.logicliberators.databinding.FragmentNotifikasiBinding
import com.application.logicliberators.modules.notifikasi.`data`.model.SpinnerFrameSixteenModel
import com.application.logicliberators.modules.notifikasi.`data`.viewmodel.NotifikasiVM
import com.application.logicliberators.modules.pagekelasberlangsung1eight.ui.PageKelasBerlangsung1EightActivity
import com.application.logicliberators.modules.pagekelasberlangsung7eight.ui.PageKelasBerlangsung7EightActivity
import kotlin.String
import kotlin.Unit

class NotifikasiFragment : BaseFragment<FragmentNotifikasiBinding>(R.layout.fragment_notifikasi) {
  private val viewModel: NotifikasiVM by viewModels<NotifikasiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerFrameSixteenList.value = mutableListOf(
    SpinnerFrameSixteenModel("Item1"),
    SpinnerFrameSixteenModel("Item2"),
    SpinnerFrameSixteenModel("Item3"),
    SpinnerFrameSixteenModel("Item4"),
    SpinnerFrameSixteenModel("Item5")
    )
    val spinnerFrameSixteenAdapter =
    SpinnerFrameSixteenAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerFrameSixteenList.value?:
    mutableListOf())
    binding.spinnerFrameSixteen.adapter = spinnerFrameSixteenAdapter
    binding.notifikasiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowfotoprofilTwo.setOnClickListener {
      val destIntent = PageKelasBerlangsung7EightActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearRowfotoprofil.setOnClickListener {
      val destIntent = PageKelasBerlangsung1EightActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "NOTIFIKASI_FRAGMENT"


    fun getInstance(bundle: Bundle?): NotifikasiFragment {
      val fragment = NotifikasiFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
