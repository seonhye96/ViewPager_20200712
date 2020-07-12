package kr.co.tjoeun.viewpager_20200712.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.fragment_20200712.fragments.FirstFragment
import kr.co.tjoeun.fragment_20200712.fragments.SecondFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "첫페이지"
            else -> "두번째 페이지"
        }
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            else -> SecondFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}