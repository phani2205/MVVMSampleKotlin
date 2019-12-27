package com.example.mvvmsample.data.network

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MyApi {


    /*
    value should be end point of the api
    https://api.simplifiedcoding.in/course-apis/mvvm/login
    in this case it is login

    When we are working with Post FormUrlEncoded annotation is must

    @Field  - this value should match with the key that we use in the
    api calls - variables names can be any string that you want
 */

    @FormUrlEncoded
    @POST("login")
    fun userLogin(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<ResponseBody>


    companion object {
        /*
        Methods that we declare inside the companion object will
        be static methods - No class object required

        We can call them directly as with <classname.methodname> -Same like in jave

        operator keyword will let you call this method by simply writing MyApi()
        MyApi() - Which means MyApi.invoke()

         */

        operator fun invoke(): MyApi {
            return Retrofit.Builder()
                .baseUrl("https://api.simplifiedcoding.in/course-apis/mvvm/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MyApi::class.java)

        }

    }

}