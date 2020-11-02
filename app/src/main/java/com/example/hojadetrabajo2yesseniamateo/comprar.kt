package com.example.hojadetrabajo2yesseniamateo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_comprar.*
import kotlinx.android.synthetic.main.fragment_fr_compra.*
import kotlin.math.sqrt

class comprar : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_comprar,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       btnDetalle.setOnClickListener{
           it.findNavController().navigate(R.id.action_comprar_to_frCompra)
       }
        fun guardar (view: View){
            btnAgg.setOnClickListener(){
                var producto1N:String = txtNombre.text.toString()
                var producto1C:String = txtCantidad.text.toString()
                var producto1P:String = txtPrecio.text.toString()

            }
        }
    }


        }



