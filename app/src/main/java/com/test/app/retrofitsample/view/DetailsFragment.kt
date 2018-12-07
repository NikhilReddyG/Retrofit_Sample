package com.test.app.retrofitsample.view

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.test.app.R

class DetailsFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val view = inflater!!.inflate(R.layout.fragment_details, null);

        initSetUpViews(view)
        return view
    }

    private fun initSetUpViews(view: View?) {
        val mTxtDetailsView = view?.findViewById<View>(R.id.txtDetailsView) as TextView
        if (null != arguments) {
            mTxtDetailsView.text = arguments.getString("DETAILS") as String
        }

    }
}