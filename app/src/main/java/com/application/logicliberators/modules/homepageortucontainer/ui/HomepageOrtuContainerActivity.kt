package com.application.logicliberators.modules.homepageortucontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.logicliberators.R
import com.application.logicliberators.appcomponents.base.BaseActivity
import com.application.logicliberators.databinding.ActivityHomepageOrtuContainerBinding
import com.application.logicliberators.extensions.loadFragment
import com.application.logicliberators.modules.daftarchatguru.ui.DaftarChatGuruFragment
import com.application.logicliberators.modules.homepageortu.ui.HomepageOrtuFragment
import com.application.logicliberators.modules.homepageortucontainer.`data`.viewmodel.HomepageOrtuContainerVM
import com.application.logicliberators.modules.notifikasi.ui.NotifikasiFragment
import com.application.logicliberators.modules.userprofileortu.ui.UserProfileOrtuFragment
import kotlin.String
import kotlin.Unit

class HomepageOrtuContainerActivity :
    BaseActivity<ActivityHomepageOrtuContainerBinding>(R.layout.activity_homepage_ortu_container) {
  private val viewModel: HomepageOrtuContainerVM by viewModels<HomepageOrtuContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageOrtuContainerVM = viewModel
    val destFragment = HomepageOrtuFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = HomepageOrtuFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.imageRefresh.setOnClickListener {
      val destFragment = DaftarChatGuruFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = DaftarChatGuruFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.imageLock.setOnClickListener {
      val destFragment = NotifikasiFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = NotifikasiFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.imageUser.setOnClickListener {
      val destFragment = UserProfileOrtuFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = UserProfileOrtuFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.frameMingcutehome5.setOnClickListener {
      val destFragment = HomepageOrtuFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = HomepageOrtuFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGE_ORTU_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageOrtuContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
