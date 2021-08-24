package com.example.convertor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.convertor.databinding.FragmentRulesBinding


class RulesFragment : Fragment() {

    private lateinit var _binding: FragmentRulesBinding

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRulesBinding.inflate(inflater)

        val view = binding.root
        return view
    }
}