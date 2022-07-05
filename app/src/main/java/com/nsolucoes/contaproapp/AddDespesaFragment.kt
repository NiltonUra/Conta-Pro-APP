package com.nsolucoes.contaproapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nsolucoes.contaproapp.databinding.FragmentAddDespesaBinding

class AddDespesaFragment : Fragment() {

    private lateinit var binding: FragmentAddDespesaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_despesa, container, false)
    }

}