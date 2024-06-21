package de.syntax_institut.telefonbuch.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import de.syntax_institut.telefonbuch.MainActivity
import de.syntax_institut.telefonbuch.R
import de.syntax_institut.telefonbuch.data.model.Contact
import de.syntax_institut.telefonbuch.databinding.FragmentDetailViewBinding


class DetailViewFragment : Fragment() {
    private lateinit var binding: FragmentDetailViewBinding
    private lateinit var contacts: MutableList<Contact>
    private val args: DetailViewFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = args.nameID
        val number = args.numberID
        val position = args.positionID
        binding.tvContactName.text = name
        binding.tvContactNumber.text = number

//        contacts[position] = Contact(name, number)

        binding.btnEdit.setOnClickListener {
            val action = DetailViewFragmentDirections.actionDetailViewFragmentToDetailViewEditorFragment(name, number, position)
            findNavController().navigate(action)
        }

        binding.ibBack.setOnClickListener {
            val action = DetailViewFragmentDirections.actionDetailViewFragmentToPhoneBookFragment()
            findNavController().navigate(action)
        }
    }

}