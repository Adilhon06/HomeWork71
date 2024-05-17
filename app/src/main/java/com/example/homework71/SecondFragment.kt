package com.example.homework71

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework71.HomeFragment.Companion.players
import com.example.homework71.databinding.FragmentHomeBinding
import com.example.homework71.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {


    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addItem()
    }

    private fun addItem() {
        binding.btnAdd.setOnClickListener {
            players.add(
                PlayersModel(
                    name = binding.etName.text.toString(),
                    image = binding.etImage.text.toString()
                )
            )
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .remove(SecondFragment())
                .commit()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}