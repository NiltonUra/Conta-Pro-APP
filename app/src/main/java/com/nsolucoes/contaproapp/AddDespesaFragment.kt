package com.nsolucoes.contaproapp

import android.icu.util.Calendar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.nsolucoes.contaproapp.adapter.DespesaAdapter
import com.nsolucoes.contaproapp.data.database.entities.Despesa
import com.nsolucoes.contaproapp.databinding.FragmentAddDespesaBinding
import java.text.SimpleDateFormat
import java.util.*

class AddDespesaFragment : Fragment() {

    private lateinit var binding: FragmentAddDespesaBinding
    private val viewModel: DespesaViewModel by viewModels()
    private var adapter = DespesaAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddDespesaBinding.inflate(layoutInflater, container, false)
        binding.rvDespesas.adapter = adapter
        binding.rvDespesas.setHasFixedSize(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val date = Calendar.getInstance().time
        val formato = SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault())

        var total = 0

        viewModel.despesas.observe(viewLifecycleOwner) { despesas ->
            adapter.setarLista(despesas)
            total = despesas.size
        }

        binding.editTextTextDespesas.setOnClickListener {
            viewModel.addDespesa(
                Despesa(
                    id = 0,
                    tipo = "Teste $total",
                    valor = 10.3 + total,
                    dataHora = formato.format(date)
                )
            )
        }
    }

}