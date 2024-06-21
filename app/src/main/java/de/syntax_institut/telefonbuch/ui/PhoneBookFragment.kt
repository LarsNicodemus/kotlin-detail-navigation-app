package de.syntax_institut.telefonbuch.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import de.syntax_institut.telefonbuch.MainActivity
import de.syntax_institut.telefonbuch.adapter.ItemAdapter
import de.syntax_institut.telefonbuch.data.model.Contact
import de.syntax_institut.telefonbuch.databinding.FragmentPhoneBookBinding

class PhoneBookFragment : Fragment() {
    private lateinit var binding: FragmentPhoneBookBinding
    private lateinit var contacts: MutableList<Contact>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPhoneBookBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mainActivity = activity as MainActivity
        contacts = mainActivity.contacts
        contacts.sortBy { it.name }
        val recyclerView = binding.recyclerView
        recyclerView.adapter = ItemAdapter(contacts)
        recyclerView.adapter?.notifyDataSetChanged()
        recyclerView.setHasFixedSize(true)
        binding.btnAdd.setOnClickListener {
            val name = binding.inName.text.toString()
            val number = binding.inPhoneNumber.text.toString()

            if (name != "" && number != "") {
                val position = contacts.size
                contacts.add(position, Contact(name, number))
                recyclerView.adapter?.notifyItemInserted(position)
                binding.inName.setText("")
                binding.inPhoneNumber.setText("")
            }
        }
    }


}