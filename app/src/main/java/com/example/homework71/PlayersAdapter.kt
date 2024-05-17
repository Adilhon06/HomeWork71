package com.example.homework71

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.homework71.databinding.ItemPlayerBinding

class PlayersAdapter(
    private val players: MutableList<PlayersModel>,
) : RecyclerView.Adapter<PlayersAdapter.PlayerViewHolder>() {

    inner class PlayerViewHolder(private val binding: ItemPlayerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(celebritiesModel: PlayersModel) {
            Glide.with(binding.ivPlayerImage)
                .load(celebritiesModel.image)
                .into(binding.ivPlayerImage)
            binding.tvPlayerName.text = celebritiesModel.name

            itemView.setOnLongClickListener{
                removeItem(adapterPosition)
                true
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val binding = ItemPlayerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlayerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val celebritiesModel: PlayersModel = players[position]
        holder.bind(celebritiesModel)

    }

    private fun removeItem(position: Int) {
        players.removeAt(position)
        notifyItemRemoved(position)
    }

    override fun getItemCount(): Int = players.size

}
