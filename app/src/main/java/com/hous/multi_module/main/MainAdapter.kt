package com.hous.multi_module.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.hous.domain.entity.Follower
import com.hous.multi_module.databinding.ItemFollowerBinding

class MainAdapter :
    ListAdapter<Follower, MainAdapter.FollowerViewHolder>(FOLLOWER_COMPARATOR) {

    class FollowerViewHolder(
        private val binding: ItemFollowerBinding
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(follower: Follower) {
            binding.follower = follower
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowerViewHolder {
        val view = ItemFollowerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FollowerViewHolder(view)
    }

    override fun onBindViewHolder(holder: FollowerViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }

    companion object {
        private val FOLLOWER_COMPARATOR = object : DiffUtil.ItemCallback<Follower>() {
            override fun areItemsTheSame(oldItem: Follower, newItem: Follower): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(oldItem: Follower, newItem: Follower): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }
}
