package com.test.app.retrofitsample.view

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.test.app.R
import com.test.app.retrofitsample.data.UserService
import com.test.app.retrofitsample.model.Model
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RetrofitFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val view = inflater!!.inflate(R.layout.fragment_retrofit, null);
        initSetUpViews(view)
        return view
    }

    lateinit var mListRecyclerView: RecyclerView

    private fun initSetUpViews(view: View?) {

        mListRecyclerView = view!!.findViewById<View>(R.id.listRecyclerView) as RecyclerView
        val mLinearLayoutManager = LinearLayoutManager(activity)
        mLinearLayoutManager.orientation = LinearLayoutManager.VERTICAL;
        mListRecyclerView.layoutManager = mLinearLayoutManager

        initSetUpRetrofit()
    }

    private fun initSetUpRetrofit() {

        val call = UserService().create().getList()
        call.enqueue(object : Callback<List<Model>> {

            override fun onResponse(call: Call<List<Model>>?, response: Response<List<Model>>?) {
                mListRecyclerView.adapter = UserAdapter(response?.body(), activity) { itemDto: Model, position: Int ->
                    val stringBundle = Bundle()
                    stringBundle.putString("DETAILS",itemDto.getBio())
                    val mDetailsFragment = DetailsFragment();
                    mDetailsFragment.arguments = stringBundle
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.add(R.id.fragmentContent, mDetailsFragment)
                    fragmentTransaction.addToBackStack("DETAILS_FRAGMENT")
                    fragmentTransaction.commit()

                }
            }

            override fun onFailure(call: Call<List<Model>>?, t: Throwable?) {
                Toast.makeText(activity, t?.message, Toast.LENGTH_SHORT).show()
            }
        })

    }

}