package com.example.jugueteria5_crud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private  var listaProductos:MutableList<dtJ> = mutableListOf()
    private lateinit var recycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaProductos.add(
            dtJ("001","Carrro","$100","$50","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/1.jpg?alt=media&token=f2190a54-7cc7-4a3e-b171-916515ce63e8"))
        listaProductos.add(
            dtJ("002","Tren","$150","$100","https://firebasestorage.googleapis.com/v0/b/luisajugueteria.appspot.com/o/2.1.jpg?alt=media&token=f78ec3ea-ccb0-41c8-b9c4-ad9dfafc1abf"))
        listaProductos.add(
            dtJ("003","Caja sorpresa","$79.99","$39.99","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/3.jpg?alt=media&token=8ab39a53-ee0a-4d20-bdce-3817d97e4f60"))
        listaProductos.add(
            dtJ("004","Bozz","$49.99","$39.99","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/4.jpg?alt=media&token=46a79a4e-0524-4c57-a308-6782f0e8a2ff"))
        listaProductos.add(
            dtJ("005","Cubo","$24.99","$19.99","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/5.jpg?alt=media&token=0bb1f049-7335-44ce-9c7d-773a0fd48884"))
        listaProductos.add(
            dtJ("006","Nave Espacial","$34.99","$29.99","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/6.png?alt=media&token=03ef3e88-82ec-4e97-893f-24785f16e3dd"))
        listaProductos.add(
            dtJ("007","Avion","$50","$30","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/7.jpg?alt=media&token=05a319e2-7af7-43be-a0da-8484938f189e"))
        listaProductos.add(
            dtJ("008","Pelota","$200","$150","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/8.jpg?alt=media&token=745d7908-7ae8-4785-b893-d1eea4bd5b97"))
        listaProductos.add(
            dtJ("009","Pocoyo","$39.99","$34.99","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/9.jpg?alt=media&token=d57f7346-7770-40b4-b558-712795cfed0c"))
        listaProductos.add(
            dtJ("010","carrito Osos","$29.99","$19.99","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/10.png?alt=media&token=3e413b85-392c-4128-8ec1-3ee28d5c7eae"))
        listaProductos.add(
            dtJ("011","Docto juguete","$600","$500","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/11.jpg?alt=media&token=1e7dda57-91a4-4bf7-af86-08dd94b6f258"))
        listaProductos.add(
            dtJ("012","Libro","$45","$30","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/12.jpg?alt=media&token=04e89e90-5046-47ea-bdf2-3e5e59bffbf0"))
        listaProductos.add(
            dtJ("013","Tren","$87.99","$65.99","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/13.png?alt=media&token=7f2502dc-be04-4dd8-b9ee-8e647bf97e18"))
        listaProductos.add(
            dtJ("014","Dragon","$65","$45","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/14.jpg?alt=media&token=7beb591a-da26-43f6-8ce2-6386e0e27672"))
        listaProductos.add(
            dtJ("015","Caballito","$78.99","$40","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/15.png?alt=media&token=28018777-a862-40a1-8e7f-6581693d6304"))
        listaProductos.add(
            dtJ("016","Woody","$50","$30","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/16.jpg?alt=media&token=7ae6c03f-5c68-4b9f-93ad-1d5a89c44ef1"))
        listaProductos.add(
            dtJ("017","Crayones","$65","$55","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/17.png?alt=media&token=27f25efe-37e3-4b43-8edd-b2df0c143b9e"))
        listaProductos.add(
            dtJ("018","Telefono","$100","$50","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/18.jpg?alt=media&token=07282e30-c417-4210-892a-7450275d913a"))
        listaProductos.add(
            dtJ("019","Bolso","$800","$500","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/19.jpg?alt=media&token=359d626c-cba7-4d2f-9552-fb1c9e17cd44"))
        listaProductos.add(
            dtJ("020","Iro Man","$180","$100","https://firebasestorage.googleapis.com/v0/b/prueba-cfa3e.appspot.com/o/20.jpg?alt=media&token=d975089f-fdeb-4fa1-883a-cbb9d5e41242"))
        var tabla = findViewById<RecyclerView>(R.id.tablasjuguetes)
        recycler=tabla
        recycler.layoutManager= LinearLayoutManager(this)
        recycler.adapter=Jadapter(this,listaProductos)


    }
    }
