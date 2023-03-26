package com.wahidabd.jikanclientv4

import com.wahidabd.jikanclientv4.di.apiModule
import com.wahidabd.jikanclientv4.di.rxModule
import com.wahidabd.library.presentation.BaseApplication
import org.koin.core.module.Module
import timber.log.Timber


/**
 * Created by Wahid on 3/26/2023.
 * Github wahidabd.
 */

class App : BaseApplication() {

    override fun getDefineModule(): List<Module> =
        listOf(
            apiModule,
            rxModule
        )

    override fun initApp() {
        Timber.plant(Timber.DebugTree())
    }
}