package de.syntax_institut.telefonbuch.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import de.syntax_institut.telefonbuch.MainActivity
import de.syntax_institut.telefonbuch.data.model.Contact
import de.syntax_institut.telefonbuch.databinding.FragmentDetailViewEditorBinding


class DetailViewEditorFragment : Fragment() {
    private lateinit var binding: FragmentDetailViewEditorBinding
    private lateinit var contacts: MutableList<Contact>
    private val args: DetailViewEditorFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailViewEditorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mainActivity = activity as MainActivity
        val contacts = mainActivity.contacts

        binding.edName.setText(args.nameID)
        binding.edPhoneNumber.setText(args.numberID)
        val position = args.positionID

        binding.btnSave.setOnClickListener {
            val name:String = binding.edName.text.toString()
            val number:String = binding.edPhoneNumber.text.toString()
            if (name != "" && number != "") {
                val contact = Contact(name, number)
                contacts[position] = contact
                val action = DetailViewEditorFragmentDirections.actionDetailViewEditorFragmentToDetailViewFragment(name, number, position)
                findNavController().navigate(action)


            }

            }
        binding.ibBack.setOnClickListener {
            findNavController().navigateUp()
        }


    }



}