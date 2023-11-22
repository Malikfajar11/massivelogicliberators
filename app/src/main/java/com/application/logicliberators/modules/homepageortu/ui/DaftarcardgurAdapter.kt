package com.application.logicliberators.modules.homepageortu.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.logicliberators.R
import com.application.logicliberators.databinding.RowDaftarcardgurBinding
import com.application.logicliberators.modules.homepageortu.`data`.model.DaftarcardgurRowModel
import kotlin.Int
import kotlin.collections.List

class DaftarcardgurAdapter(
  var list: List<DaftarcardgurRowModel>
) : RecyclerView.Adapter<DaftarcardgurAdapter.RowDaftarcardgurVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDaftarcardgurVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_daftarcardgur,parent,false)
    return RowDaftarcardgurVH(view)
  }

  override fun onBindViewHolder(holder: RowDaftarcardgurVH, position: Int) {
    val daftarcardgurRowModel = DaftarcardgurRowModel()
    // TODO uncomment following line after integration with data source
    // val daftarcardgurRowModel = list[position]
    holder.binding.daftarcardgurRowModel = daftarcardgurRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DaftarcardgurRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: DaftarcardgurRowModel
    ) {
    }
  }

  inner class RowDaftarcardgurVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDaftarcardgurBinding = RowDaftarcardgurBinding.bind(itemView)
  }
}
