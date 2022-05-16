package com.himbrhms.playground.data.api

import com.himbrhms.playground.data.model.Todo
import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {

    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>
}
