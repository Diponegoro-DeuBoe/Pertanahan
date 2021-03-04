package id.deuboe.pemkabkra.pertanahan.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.textview.MaterialTextView
import com.google.firebase.auth.FirebaseAuth
import id.deuboe.pemkabkra.pertanahan.R
import id.deuboe.pemkabkra.pertanahan.adapter.ChooseAdapter
import id.deuboe.pemkabkra.pertanahan.adapter.OnItemClickListener
import id.deuboe.pemkabkra.pertanahan.databinding.HomeFragmentBinding
import id.deuboe.pemkabkra.pertanahan.model.Choose
import id.deuboe.pemkabkra.pertanahan.ui.SplashActivity
import id.deuboe.pemkabkra.pertanahan.util.Util
import id.deuboe.pemkabkra.pertanahan.util.Util.HOME_FRAGMENT
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.Int.Companion.MAX_VALUE

class HomeFragment : Fragment(), OnItemClickListener {

    private val viewModel: HomeViewModel by viewModels()
    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth
    private var clicked = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth = FirebaseAuth.getInstance()

        val adapterRecycler = ChooseAdapter(this)

        viewModel.listChoose.observe(viewLifecycleOwner, {
            adapterRecycler.submitList(Util.listChoose)
        })

        binding.recyclerChoice.apply {
            adapter = adapterRecycler
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
        }
    }

    private fun signOut() {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                auth.signOut()
                withContext(Dispatchers.Main) {
                    Intent(requireContext(), SplashActivity::class.java).also {
                        startActivity(it)
                        activity?.finish()
                    }
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(requireContext(), e.message, Toast.LENGTH_LONG).show()
                }
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onIconClicked(choose: Choose) {
        Log.d(HOME_FRAGMENT, "onIconClicked: clicked")
        val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(
            id = choose.id,
            titleDetail = choose.title
        )
        requireView().findNavController().navigate(action)
    }

    override fun onAllClicked(
        choose: Choose,
        textSubtitle: MaterialTextView,
        textAll: MaterialTextView
    ) {
        Log.d(HOME_FRAGMENT, "onAllClicked: clicked")
        if (clicked) {
            textSubtitle.apply {
                maxLines = MAX_VALUE
            }
            textAll.text = getString(R.string.choose_lebih_sedikit)
        } else {
            textSubtitle.apply {
                maxLines = 3
            }
            textAll.text = getString(R.string.choose_lebih_banyak)
        }
        clicked = !clicked
    }

}