package com.sugoigroup.del1

import android.app.Application
import com.sugoigroup.del1.di.DatabaseModule
import com.sugoigroup.del1.domain.entity.Article
import com.sugoigroup.del1.domain.repository.LocalRepository
import com.sugoigroup.del1.domain.usecase.DashboardUsecase
import com.sugoigroup.del1.ui.dashboard.DashboardViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(module {
                factory { Article() }
                single { DatabaseModule(get()) }
                single { LocalRepository(get()) }
                factory { DashboardUsecase(get()) }
                viewModel { DashboardViewModel() }
            })
        }
    }
}