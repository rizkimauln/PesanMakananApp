package com.example.pesanmakanan

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val menu1 = view.findViewById<LinearLayout>(R.id.menu1)
        val menu2 = view.findViewById<LinearLayout>(R.id.menu2)

        menu1.setOnClickListener {
            val intent = Intent(requireContext(), PesanActivity::class.java)
            startActivity(intent)
        }

        menu2.setOnClickListener {
            val intent = Intent(requireContext(), PesanActivity::class.java)
            startActivity(intent)
        }
    }
}
