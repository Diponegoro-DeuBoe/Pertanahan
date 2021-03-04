package id.deuboe.pemkabkra.pertanahan.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import id.deuboe.pemkabkra.pertanahan.R
import id.deuboe.pemkabkra.pertanahan.adapter.ItemAdapter
import id.deuboe.pemkabkra.pertanahan.databinding.DetailFragmentBinding
import id.deuboe.pemkabkra.pertanahan.model.Item
import id.deuboe.pemkabkra.pertanahan.util.Util

class DetailFragment : Fragment() {

    private val viewModel: DetailViewModel by viewModels()
    private var _binding: DetailFragmentBinding? = null
    private val binding get() = _binding!!
    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DetailFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val index = args.id
        val adapterRecycler = ItemAdapter()
        adapterRecycler.submitList(getList(index))

        binding.apply {
            recyclerPersyaratan.apply {
                adapter = adapterRecycler
                layoutManager = LinearLayoutManager(requireContext())
                setHasFixedSize(true)
            }
        }

    }

    private fun getList(index: Int) = Util.listDetailPersyaratan[index].listItem


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}