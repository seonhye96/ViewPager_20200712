package kr.co.tjoeun.viewpager_20200712.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.fragment_20200712.fragments.FirstFragment
import kr.co.tjoeun.fragment_20200712.fragments.SecondFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        if(position == 0){
            return "첫페이지"
        }else{
            return "두번째페이지"
        }
    }

    override fun getItem(position: Int): Fragment {
        if(position == 0){
            return FirstFragment()
        }else{
            return SecondFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}