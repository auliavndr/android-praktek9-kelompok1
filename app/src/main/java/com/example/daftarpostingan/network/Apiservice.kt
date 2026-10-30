package com.example.daftarpostingan.network

import com.example.daftarpostingan.data.Post
import retrofit2.Response
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    // GET https://jsonplaceholder.typicode.com/posts?_limit=20
    @GET("posts")
    suspend fun getPosts(@Query("_limit") limit: Int): List<Post>

    // DELETE https://jsonplaceholder.typicode.com/posts/{id}
    @DELETE("posts/{id}")
    suspend fun hapusPost(@Path("id") id: Int): Response<Unit>
}