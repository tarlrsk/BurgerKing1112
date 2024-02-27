package com.android.burgerking1112app.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.burgerking1112app.databinding.AddressItemBinding
import com.android.burgerking1112app.models.Address
import com.google.firebase.storage.FirebaseStorage

class AddressAdapter (private val context: Context, private val addresses: List<Address>)
    : RecyclerView.Adapter<AddressAdapter.RecyclerViewHolder>()  {
    class RecyclerViewHolder(val binding: AddressItemBinding): RecyclerView.ViewHolder(binding.root)
    private val storage = FirebaseStorage.getInstance()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddressAdapter.RecyclerViewHolder {
        val binding = AddressItemBinding.inflate(LayoutInflater.from(context), parent, false)

        return AddressAdapter.RecyclerViewHolder(binding)
    }
    override fun getItemCount(): Int = addresses.size

    override fun onBindViewHolder(holder: AddressAdapter.RecyclerViewHolder, position: Int) {
        val address = addresses[position]

        holder.binding.tvAddressName.text = address.title.toString()
        holder.binding.tvAddress.text = address.address.toString()

    }

}