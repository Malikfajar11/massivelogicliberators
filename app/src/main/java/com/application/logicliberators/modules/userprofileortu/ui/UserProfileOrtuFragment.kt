package com.application.logicliberators.modules.userprofileortu.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseFragment
import com.application.logicliberators.databinding.FragmentUserProfileOrtuBinding
import com.application.logicliberators.modules.daftarmengajar.ui.DaftarMengajarActivity
import com.application.logicliberators.modules.userprofileortu.`data`.viewmodel.UserProfileOrtuVM
import kotlin.String
import kotlin.Unit

class UserProfileOrtuFragment :
    BaseFragment<FragmentUserProfileOrtuBinding>(R.layout.fragment_user_profile_ortu) {
  private val viewModel: UserProfileOrtuVM by viewModels<UserProfileOrtuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.userProfileOrtuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
    binding.btnDaftar.setOnClickListener {
      val destIntent = DaftarMengajarActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "USER_PROFILE_ORTU_FRAGMENT"


    fun getInstance(bundle: Bundle?): UserProfileOrtuFragment {
      val fragment = UserProfileOrtuFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
