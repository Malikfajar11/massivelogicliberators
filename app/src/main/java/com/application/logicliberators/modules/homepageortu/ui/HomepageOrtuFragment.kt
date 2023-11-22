package com.application.logicliberators.modules.homepageortu.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseFragment
import com.application.logicliberators.databinding.FragmentHomepageOrtuBinding
import com.application.logicliberators.modules.homepageortu.`data`.model.DaftarcardgurRowModel
import com.application.logicliberators.modules.homepageortu.`data`.model.SpinnerFrameThreeModel
import com.application.logicliberators.modules.homepageortu.`data`.viewmodel.HomepageOrtuVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomepageOrtuFragment :
    BaseFragment<FragmentHomepageOrtuBinding>(R.layout.fragment_homepage_ortu) {
  private val viewModel: HomepageOrtuVM by viewModels<HomepageOrtuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerFrameThreeList.value = mutableListOf(
    SpinnerFrameThreeModel("Item1"),
    SpinnerFrameThreeModel("Item2"),
    SpinnerFrameThreeModel("Item3"),
    SpinnerFrameThreeModel("Item4"),
    SpinnerFrameThreeModel("Item5")
    )
    val spinnerFrameThreeAdapter =
    SpinnerFrameThreeAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerFrameThreeList.value?:
    mutableListOf())
    binding.spinnerFrameThree.adapter = spinnerFrameThreeAdapter
    val daftarcardgurAdapter =
    DaftarcardgurAdapter(viewModel.daftarcardgurList.value?:mutableListOf())
    binding.recyclerDaftarcardgur.adapter = daftarcardgurAdapter
    daftarcardgurAdapter.setOnItemClickListener(
    object : DaftarcardgurAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DaftarcardgurRowModel) {
        onClickRecyclerDaftarcardgur(view, position, item)
      }
    }
    )
    viewModel.daftarcardgurList.observe(requireActivity()) {
      daftarcardgurAdapter.updateData(it)
    }
    binding.homepageOrtuVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerDaftarcardgur(
    view: View,
    position: Int,
    item: DaftarcardgurRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGE_ORTU_FRAGMENT"


    fun getInstance(bundle: Bundle?): HomepageOrtuFragment {
      val fragment = HomepageOrtuFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
