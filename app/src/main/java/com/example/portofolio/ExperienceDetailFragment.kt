package com.example.portofolio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import coil.load
import com.example.portofolio.databinding.FragmentExperienceDetailBinding
import kotlinx.android.synthetic.main.fragment_experience_detail.*

class ExperienceDetailFragment : Fragment() {
    private var _binding : FragmentExperienceDetailBinding? = null
    private val binding get() = _binding!!
    private val experienceArgs by navArgs<ExperienceDetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExperienceDetailBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
        txt_title.text = experienceArgs.experience.title
        txt_subtitle.text = experienceArgs.experience.detail
        img_detail_profile.load(experienceArgs.experience.image) {
            crossfade(1000)
            }
        }
    }
}