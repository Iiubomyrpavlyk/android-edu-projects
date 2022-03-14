package com.example.recyclerviewretrofit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewretrofit.data.User
import com.example.recyclerviewretrofit.databinding.ItemUserBinding

class UserAdapter(private val users: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    inner class UserViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            ItemUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            ),
        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        with(holder.binding) {
            tvUserName.text = users[position].name
            tvUserPhone.text = users[position].phone
            Glide.with(holder.binding.root)
                .load("https://icons.iconarchive.com/icons/designbolts/free-retro-style-social/256/Twitter-icon.png")
                .into(imvUserIcon)
        }
    }

    override fun getItemCount(): Int = users.size

}