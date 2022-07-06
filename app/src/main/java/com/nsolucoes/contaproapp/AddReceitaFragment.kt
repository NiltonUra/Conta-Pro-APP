package com.nsolucoes.contaproapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import com.nsolucoes.contaproapp.tema.AppTheme

class AddReceitaFragment : Fragment() {

    //private val mainViewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflater.inflate(R.layout.fragment_criar_conta, container, false
        // Inflate the layout for this fragment
        return ComposeView(requireContext()).apply {
            setContent {
                AppTheme (darkTheme = false,
                content = {

                })
            }
        }
    }
}   return inflater.inflate(R.layout.fragment_add_receita, container, false)