package com.example.mvvmsample.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmsample.R
import com.example.mvvmsample.databinding.ActivityLoginBinding
import com.example.mvvmsample.utils.toast

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

/*
      This name ActivityLoginBinding is auto generated based on you xml name
      Here in this case as the name of my layout is activity_login ,the auto generated file name is
      ActivityLoginBinding
 */
        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login);
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.myviewmodel = viewModel

        viewModel.authListener = this

    }

    override fun onStarted() {
        toast("Login Start")
    }

    override fun onSuccess() {
        toast("Login success")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}
