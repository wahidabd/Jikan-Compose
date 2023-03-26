package com.wahidabd.jikanclientv4.data.top

import com.wahidabd.jikanclientv4.data.responses.wrapper.ListWrapper
import com.wahidabd.jikanclientv4.data.top.response.TopAnimeResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET


/**
 * Created by Wahid on 3/26/2023.
 * Github wahidabd.
 */

interface TopRepository {

    @GET("top/anime")
    fun getTopAnime(): Single<ListWrapper<TopAnimeResponse>>

}