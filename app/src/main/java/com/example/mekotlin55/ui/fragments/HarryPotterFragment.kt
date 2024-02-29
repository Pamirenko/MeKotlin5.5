package com.example.mekotlin55.ui.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.mekotlin55.R
import com.example.mekotlin55.databinding.FragmentHarryPotterBinding
import com.example.mekotlin55.ui.adapters.HarryPotterAdapter
import com.example.mekotlin55.ui.viewModels.CharacterViewModel

class HarryPotterFragment : Fragment() {

    private var _binding: FragmentHarryPotterBinding? = null
    private val binding: FragmentHarryPotterBinding get() = _binding!!
    private val viewModel by viewModels<CharacterViewModel>()
    private val harryadapter = HarryPotterAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHarryPotterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        search()
        subscribeToHarryPotter()
    }

    private fun initialize() {
        binding.rvHarryPotters.adapter = harryadapter

    }

    private fun search() {
        binding.etSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s?.let {
                    viewModel.searchHarry(it.toString())
                }
            }

            override fun afterTextChanged(s: Editable?) {
            }

        })
    }

    private fun subscribeToHarryPotter() {
        viewModel.characterLiveData.observe(viewLifecycleOwner) { uiState ->
            uiState?.let {
                if (it.success != null) {
                    harryadapter.setHarryCharacter(it.success)

                } else {

                }
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}