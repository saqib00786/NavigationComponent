package com.example.newdev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.newdev.databinding.FragmentChooseRecepientBinding

class ChooseRecepient : Fragment(){

    private var mBinding: FragmentChooseRecepientBinding? = null
    private val binding get() = mBinding!!
    private var navController: NavController? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = FragmentChooseRecepientBinding.inflate(layoutInflater,container,false)
        val view = binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        mBinding!!.nextBtnID.setOnClickListener {
            navController!!.navigate(R.id.action_chooseRecepient_to_specifyAmount)
        }
        mBinding!!.backBtnID.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}