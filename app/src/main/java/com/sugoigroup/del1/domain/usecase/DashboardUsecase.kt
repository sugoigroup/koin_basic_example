package com.sugoigroup.del1.domain.usecase

import com.sugoigroup.del1.di.DatabaseModule
import com.sugoigroup.del1.domain.entity.Article
import com.sugoigroup.del1.domain.repository.LocalRepository
import org.koin.dsl.module


class DashboardUsecase (
   private val localRepository: LocalRepository
)  {
    fun changeText() : String {
        return localRepository.sayHello()
    }
}

