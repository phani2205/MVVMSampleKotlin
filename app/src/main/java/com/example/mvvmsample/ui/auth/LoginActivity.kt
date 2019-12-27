package com.example.mvvmsample.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmsample.R
import com.example.mvvmsample.data.db.entities.User
import com.example.mvvmsample.databinding.ActivityLoginBinding
import com.example.mvvmsample.utils.hide
import com.example.mvvmsample.utils.show
import com.example.mvvmsample.utils.toast
import kotlinx.android.synthetic.main.activity_login.*


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

        //API Url : https://api.simplifiedcoding.in/course-apis/mvvm/login

    }

    override fun onStarted() {
        progress_bar.show()
    }

    override fun onSuccess(user: User) {
        progress_bar.hide()
        toast("${user.name} is Logged In")
    }

    override fun onFailure(message: String) {
        progress_bar.hide()
        toast(message)
    }
}
