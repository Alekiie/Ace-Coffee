package com.example.hello.ui.theme.Adapter

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hello.databinding.ViewholderItemBinding
import com.example.hello.ui.theme.Model.ItemsModel
import  android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import com.bumptech.glide.Glide
import com.example.hello.ui.theme.Activity.DetailActivity

class ListItemAdapter(val items:MutableList<ItemsModel>):
RecyclerView.Adapter<ListItemAdapter.Viewholder>(){
    @SuppressLint("RestrictedApi")
    private var context:Context?= null
    class Viewholder (val binding: ViewholderItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemAdapter.Viewholder {
        context=parent.context
        val binding = ViewholderItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return Viewholder(binding)
        }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ListItemAdapter.Viewholder, position: Int) {
        holder.binding.titleTxt.text = items[position].title
        holder.binding.priceTxt.text = "$"+items[position].price.toString()
        holder.binding.subtitleTxt.text=items[position].extra

        Glide.with(holder.itemView.context)
            .load(items[position].picUrl[0])
            .into(holder.binding.img)

        holder.itemView.setOnClickListener{
            val intent  = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("object",items[position])
            holder.itemView.context.startActivity(intent)

        }


    }

    override fun getItemCount(): Int =items.size
}