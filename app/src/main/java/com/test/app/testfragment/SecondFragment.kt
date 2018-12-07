package com.test.app.testfragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.test.app.R

class SecondFragment : Fragment() {

    var string = "testString"

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val mSecondView = inflater!!.inflate(R.layout.fragment_second, null);
        val mTxtTestView = mSecondView.findViewById<View>(R.id.txtTestView) as TextView
        if (null != arguments) {
            mTxtTestView.text = arguments.getString(string) as String
        }
        return mSecondView
    }
}