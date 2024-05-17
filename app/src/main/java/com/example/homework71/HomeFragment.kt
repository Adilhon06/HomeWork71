package com.example.homework71

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework71.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private var playersAdapter: PlayersAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        addPlayers()
        addNewItem()
    }

    private fun setupRecyclerView() {
        playersAdapter = PlayersAdapter(players)
        binding.rvPlayers.adapter = playersAdapter
    }

    private fun addPlayers() {
        addPlayer(
            name = "Cristiano Ronaldo",
            image = "https://assets.architecturaldigest.in/photos/638dc400d8be961106a0cdc1/16:9/w_2560%2Cc_limit/GettyImages-1443064180.jpg"
        )
        addPlayer(
            name = "Cristiano Ronaldo",
            image = "https://assets.architecturaldigest.in/photos/638dc400d8be961106a0cdc1/16:9/w_2560%2Cc_limit/GettyImages-1443064180.jpg"
        )
        addPlayer(
            name = "Cristiano Ronaldo",
            image = "https://assets.architecturaldigest.in/photos/638dc400d8be961106a0cdc1/16:9/w_2560%2Cc_limit/GettyImages-1443064180.jpg"
        )
        addPlayer(
            name = "Cristiano Ronaldo",
            image = "https://assets.architecturaldigest.in/photos/638dc400d8be961106a0cdc1/16:9/w_2560%2Cc_limit/GettyImages-1443064180.jpg"
        )
        addPlayer(
            name = "Cristiano Ronaldo",
            image = "https://assets.architecturaldigest.in/photos/638dc400d8be961106a0cdc1/16:9/w_2560%2Cc_limit/GettyImages-1443064180.jpg"
        )
        addPlayer(
            name = "Cristiano Ronaldo",
            image = "https://assets.architecturaldigest.in/photos/638dc400d8be961106a0cdc1/16:9/w_2560%2Cc_limit/GettyImages-1443064180.jpg"
        )
        addPlayer(
            name = "Cristiano Ronaldo",
            image = "https://assets.architecturaldigest.in/photos/638dc400d8be961106a0cdc1/16:9/w_2560%2Cc_limit/GettyImages-1443064180.jpg"
        )
        addPlayer(
            name = "Cristiano Ronaldo",
            image = "https://assets.architecturaldigest.in/photos/638dc400d8be961106a0cdc1/16:9/w_2560%2Cc_limit/GettyImages-1443064180.jpg"
        )
        addPlayer(
            name = "Cristiano Ronaldo",
            image = "https://assets.architecturaldigest.in/photos/638dc400d8be961106a0cdc1/16:9/w_2560%2Cc_limit/GettyImages-1443064180.jpg"
        )
        addPlayer(
            name = "Cristiano Ronaldo",
            image = "https://assets.architecturaldigest.in/photos/638dc400d8be961106a0cdc1/16:9/w_2560%2Cc_limit/GettyImages-1443064180.jpg"
        )
        addPlayer(
            name = "Cristiano Ronaldo",
            image = "https://assets.architecturaldigest.in/photos/638dc400d8be961106a0cdc1/16:9/w_2560%2Cc_limit/GettyImages-1443064180.jpg"
        )
        addPlayer(
            name = "Cristiano Ronaldo",
            image = "https://assets.architecturaldigest.in/photos/638dc400d8be961106a0cdc1/16:9/w_2560%2Cc_limit/GettyImages-1443064180.jpg"
        )
    }

    private fun addNewItem() {
        binding.btnNewItem.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container,SecondFragment())
                .addToBackStack(null)
                .commit()
        }
    }

    private fun addPlayer(name: String, image: String) {
        players.add(
            PlayersModel(
                name = name,
                image = image
            )
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        playersAdapter = null
    }
    companion object {
        val players = mutableListOf<PlayersModel>()
    }
}