package com.madden.ingot

import androidx.fragment.app.FragmentActivity
import com.madden.ingot.ui.main.SampleFragment

fun showSampleFragment(activity: FragmentActivity) {
    activity.supportFragmentManager.beginTransaction()
        .replace(R.id.container, SampleFragment.newInstance())
        .commitNow()
}