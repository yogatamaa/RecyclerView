package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdapter(private val context: Context, private val superhero: List<Superhero>, val listeaner: (Superhero) -> Unit)
    : RecyclerView.Adapter<SuperheroAdapter.SuperheroViewHolder>(){

    class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val Imgsuperhero = view.findViewById<ImageView>(R.id.img_item_photo)
        val Namesuperhero = view.findViewById<TextView>(R.id.tv_item_name)
        val Descsuperhero = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(superhero: Superhero, listener: (Superhero) -> Unit){
            Imgsuperhero.setImageResource(superhero.Imgsuperhero)
            Namesuperhero.text = superhero.Namesuperhero
            Descsuperhero.text = superhero.Descsuperhero
            itemView.setOnClickListener {
                listener(superhero)}


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(
            LayoutInflater.from(context).inflate((R.layout.item_superhero), parent, false)
        )
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        holder.bindView(superhero[position], listeaner)
    }

    override fun getItemCount(): Int = superhero.size
    }

