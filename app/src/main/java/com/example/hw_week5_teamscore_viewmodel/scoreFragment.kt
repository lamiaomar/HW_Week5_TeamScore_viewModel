package com.example.hw_week5_teamscore_viewmodel

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.hw_week5_teamscore_viewmodel.databinding.FragmentScoreBinding


class scoreFragment : Fragment() {

    private val viewModel : scoreViewModel by viewModels()

private lateinit var binding : FragmentScoreBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScoreBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.addone.setOnClickListener{
            binding.score.text = viewModel.addOne().toString()
        }
        binding.subtwo.setOnClickListener{
            viewModel.checkScoreValue()
            binding.score.text = viewModel.subTwo().toString()
        }
        binding.addFour.setOnClickListener{
            binding.score.text = viewModel.addFour().toString()
        }


        binding.score.text = getString(R.string.score)
    }




}