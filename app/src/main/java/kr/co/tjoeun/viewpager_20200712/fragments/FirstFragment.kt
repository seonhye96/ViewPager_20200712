package kr.co.tjoeun.fragment_20200712.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.*
import kr.co.tjoeun.viewpager_20200712.R

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)  // 뒤에 null을 쓰면안된다!! 대신 container 넣기  // 여기까지 연결해둔것
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        changeInfoBtn.setOnClickListener {
            infoTxt.text = "변경된 문구"
        }

    }

}