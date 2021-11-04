package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.fragment.databinding.Fragment1Binding


class BlankFragment : Fragment() {
    private val dataModel: DataModel by activityViewModels()
    lateinit var binding:Fragment1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment1Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.bSendFrag1.setOnClickListener {
            dataModel.messageForFrag1.value = "Hello from Frag 1"
        }
        binding.bSendToActivity.setOnClickListener {
            dataModel.messageForActivity.value= "Hello activity from Frag 1"
        }

    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment()
    }
}