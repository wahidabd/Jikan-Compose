package com.wahidabd.jikanclientv4.di

import io.reactivex.rxjava3.disposables.CompositeDisposable
import org.koin.dsl.module


/**
 * Created by Wahid on 3/26/2023.
 * Github wahidabd.
 */

val rxModule = module {
    factory { CompositeDisposable() }
}