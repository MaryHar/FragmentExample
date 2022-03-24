package com.example.fragmentexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val btn: Button = view.findViewById(R.id.button)
        btn.setOnClickListener{
            val editText: EditText = view.findViewById(R.id.editText)
            val input = editText.text.toString()
            val bundle = Bundle()
            bundle.putString("data", input)
            val fragment = SecondFragment()
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.new_container, fragment)?.commit()

        }
        return view
    }
}