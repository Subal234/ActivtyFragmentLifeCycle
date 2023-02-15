package com.androidstudio.activtyfragmentlifecycle

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

        }
        System.out.println("OnCreate Method")

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        System.out.println("OnAttach Method")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_blank_fragment, container, false)
        System.out.println("OnCreateView Method")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        System.out.println("OnViewCreated Method")
    }

    override fun onStart() {
        super.onStart()
        System.out.println("OnStart Method")
    }

    override fun onResume() {
        super.onResume()
        System.out.println("OnResume Method")
    }

    override fun onPause() {
        super.onPause()
        System.out.println("OnPause Method")
    }

    override fun onStop() {
        super.onStop()
        System.out.println("OnStop Method")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        System.out.println("OnDestroyView Method")
    }

    override fun onDestroy() {
        super.onDestroy()
        System.out.println("OnDestroy Method")
    }

    override fun onDetach() {
        super.onDetach()
        System.out.println("OnDetach Method")
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

}