package com.test.app.retrofitsample.view

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.test.app.R
import com.test.app.retrofitsample.model.Model
import kotlinx.android.synthetic.main.recyclerview_row.view.*

class UserAdapter(val items: List<Model>?, val context: Context,val clickListener: (Model, Int) -> Unit) : RecyclerView .Adapter<ViewHolder >() {

    override fun getItemCount(): Int {
       return items!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.mTxtRowHeaderName?.text = items!!.get(position).getName()
        holder?.mTxtRowHeaderTeamName?.text = items!!.get(position).getTeam()
        holder?.mTxtRowHeaderActualName?.text = items!!.get(position).getRealname()
        Glide.with(context).load(items!!.get(position).getImageurl()).into(holder?.mImgURL)

        var item : Model = items[position]
        holder?.mHeaderLayout.setOnClickListener {
            clickListener(item, position)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val mView = LayoutInflater.from(context).inflate(R.layout.recyclerview_row, parent, false)
        return ViewHolder(mView)
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    val mImgURL = view.imgURL
    val mTxtRowHeaderName = view.txtName
    val mHeaderLayout = view.headerLayout
    val mTxtRowHeaderTeamName = view.txtTeam
    val mTxtRowHeaderActualName = view.txtActualName

}