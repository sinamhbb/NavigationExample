package com.example.convertor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.view.*
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.convertor.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {


    private var _binding: FragmentTitleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTitleBinding.inflate(inflater, container, false)
        val view =binding.root

        setHasOptionsMenu(true)
        return view
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,requireView()!!.findNavController())
                || super.onOptionsItemSelected(item)
    }
}