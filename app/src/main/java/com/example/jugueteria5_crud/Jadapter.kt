package com.example.jugueteria5_crud

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class Jadapter(var context: Context,
               var ListaProductos: MutableList<dtJ>) :
    RecyclerView.Adapter<Jadapter.vHolder>()
{
    inner class vHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        lateinit var txtid: TextView
        init{
            txtid=itemView.findViewById(R.id.txtId)
        }
        lateinit var txtnombre: TextView
        init{
            txtnombre=itemView.findViewById(R.id.txtNombre)

        }
        lateinit var txtprecio_menudeo: TextView
        init{
            txtprecio_menudeo=itemView.findViewById(R.id.txtPrecio_menudeo)
        }
        lateinit var txtprecio_mayoreo: TextView
        init{
            txtprecio_mayoreo=itemView.findViewById(R.id.txtprecio_mayoreo)
        }
        lateinit var txtimageView: ImageView
        init {
            txtimageView=itemView.findViewById(R.id.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Jadapter.vHolder {
        var itemView = LayoutInflater.from(context).inflate(
            R.layout.vistajuguete,parent,false)
        return vHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ListaProductos.size
    }

    override fun onBindViewHolder(holder: Jadapter.vHolder, position: Int) {
        var productos= ListaProductos[position]
        holder.txtid.text=productos.Id
        holder.txtnombre.text=productos.Nombre
        holder.txtprecio_menudeo.text=productos.Precio_menudeo
        holder.txtprecio_mayoreo.text=productos.Precio_mayoreo
        Picasso.get().load(productos.url).into(holder.txtimageView)

    }

}