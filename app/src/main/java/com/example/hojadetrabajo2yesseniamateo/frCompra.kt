package com.example.hojadetrabajo2yesseniamateo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_comprar.*
import kotlinx.android.synthetic.main.fragment_fr_compra.*

class frCompra : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fr_compra,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnComprar.setOnClickListener {
            it.findNavController().navigate(R.id.action_frCompra_to_comprar)

}

    }
        }



