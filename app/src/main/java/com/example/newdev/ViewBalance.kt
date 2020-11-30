package com.example.newdev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newdev.databinding.FragmentViewbalanceBinding

class ViewBalance : Fragment() {
    private lateinit var mBinding: FragmentViewbalanceBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_viewbalance, container, false)
    }

}