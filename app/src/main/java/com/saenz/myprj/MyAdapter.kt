package com.saenz.myprj

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_items.view.*
import android.content.res.Resources

class MyAdapter(private val myDataset: List<Level_1>) :  RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyAdapter.MyViewHolder {
        // create a new view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_items, parent, false)
        // set the view's size, margins, paddings and layout parameters

        return MyViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        val sonidos = myDataset[position]
        holder.setData( sonidos)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun setData(sonidos:Level_1?){
            itemView.txvTitle.text = sonidos!!.title

            itemView.imgShare.setImageResource(sonidos.img)

        }
    }
}