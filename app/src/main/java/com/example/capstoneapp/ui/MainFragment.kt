package com.example.capstoneapp.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.example.capstoneapp.R
import com.example.capstoneapp.Utility
import com.example.capstoneapp.databinding.MainFragmentBinding
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
        private const val COL = 3
    }


    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding: MainFragmentBinding =
            DataBindingUtil.inflate(inflater,R.layout.main_fragment, container, false)
        // Allows Data Binding to Observe LiveData with the lifecycle of this Fragment
        binding.lifecycleOwner = this
        // Giving the binding access to the OverviewViewModel
        binding.viewModel = viewModel
        fetchData()
        setData();
        setHasOptionsMenu(true)
        return binding.root
    }

    fun setData(){
        val movieAdapter = MovieAdapter()
        movie_recycler_view.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(activity, COL)
            adapter = movieAdapter
        }
    }

    private fun fetchData(){
        //val appContext = context!!.applicationContext
        Utility.hasNetwork(requireContext())
        viewModel.getDataFromRepository()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel
    }

}
