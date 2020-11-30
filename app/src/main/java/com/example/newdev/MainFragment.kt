package com.example.newdev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.newdev.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private  var mBinding:FragmentMainBinding? =null
    private val binding get() = mBinding!!
    private var navController : NavController? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = FragmentMainBinding.inflate(layoutInflater,container,false)
        val view = binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        mBinding!!.viewTransID.setOnClickListener{
            navController!!.navigate(R.id.action_mainFragment_to_transactionFragment)
        }
        mBinding!!.sendMoneyID.setOnClickListener {
            navController!!.navigate(R.id.action_mainFragment_to_chooseRecepient)
        }
        mBinding!!.viewBalanceID.setOnClickListener {
            navController!!.navigate(R.id.action_mainFragment_to_viewBalance)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}
