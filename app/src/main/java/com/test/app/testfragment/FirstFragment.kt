package com.test.app.testfragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.test.app.R
import com.test.app.retrofitsample.view.RetrofitFragment

class TestFragment : Fragment() {

    var string = "testString"

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val view = inflater!!.inflate(R.layout.test_layout, null);
        initAddButton(view)
        return view
    }

    private fun initAddButton(view: View?) {

        val mBtnBundle = view?.findViewById<View>(R.id.btnFirstButton) as Button
        val mBtnOpenRetrofit = view?.findViewById<View>(R.id.btnOpenRetrofit) as Button

        sendTxtThroughBundle(mBtnBundle);
        openRetrofitSample(mBtnOpenRetrofit);

    }

    private fun sendTxtThroughBundle(mBtnBundle: Button) {
        val stringBundle = Bundle()
        stringBundle.putString(string, "Second Button")
        val mSecondFragment = SecondFragment();
        mSecondFragment.arguments = stringBundle

        mBtnBundle.setOnClickListener {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.fragmentContent, mSecondFragment)
            fragmentTransaction.addToBackStack("FIRST_FRAGMENT")
            fragmentTransaction.commit()
        }
    }


    private fun openRetrofitSample(mBtnOpenRetrofit: Button) {
        mBtnOpenRetrofit.setOnClickListener {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.fragmentContent, RetrofitFragment())
            fragmentTransaction.addToBackStack("RETROFIT_FRAGMENT")
            fragmentTransaction.commit()
        }
    }

}