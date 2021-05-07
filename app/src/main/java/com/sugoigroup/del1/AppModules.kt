package com.sugoigroup.del1

import com.sugoigroup.del1.di.DatabaseModule
import com.sugoigroup.del1.domain.entity.Article
import com.sugoigroup.del1.domain.repository.LocalRepository
import com.sugoigroup.del1.domain.usecase.DashboardUsecase
import com.sugoigroup.del1.ui.dashboard.DashboardViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

data class AppModules(
    val modules : Module = module {
        factory { Article() }
        single { DatabaseModule(get()) }
        single { LocalRepository(get()) }
        factory { DashboardUsecase(get()) }
        viewModel { DashboardViewModel() }
    },
)
