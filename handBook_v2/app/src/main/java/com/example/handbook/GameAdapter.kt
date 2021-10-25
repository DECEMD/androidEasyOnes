package com.example.handbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.handbook.databinding.GameItemBinding

class GameAdapter:RecyclerView.Adapter<GameAdapter.GameHolder>() {
    val gameList = ArrayList<Game>()
    class GameHolder(item: View):RecyclerView.ViewHolder(item) {
        val binding = GameItemBinding.bind(item)

        fun bind(game: Game) = with(binding){
            im.setImageResource(game.imageId)
            tvTitle.text = game.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.game_item,parent,false)
        return GameHolder(view)
    }


    override fun onBindViewHolder(holder: GameHolder, position: Int) {
        holder.bind(gameList[position])
    }

    override fun getItemCount(): Int {
        return gameList.size
    }
    fun addGame(game : Game){
        gameList.add(game)
        notifyDataSetChanged()
    }
}