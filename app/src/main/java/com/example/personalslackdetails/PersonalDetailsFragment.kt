package com.example.personalslackdetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.personalslackdetails.databinding.FragmentPersonalDetailsBinding

class PersonalDetailsFragment : Fragment() {
    private var _binding : FragmentPersonalDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPersonalDetailsBinding.inflate(layoutInflater, container, false)

        binding.openGithubBtn.setOnClickListener {
            findNavController().navigate(R.id.action_personalDetailsFragment_to_githubProfileFragment)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}