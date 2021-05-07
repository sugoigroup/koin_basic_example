package com.sugoigroup.del1.domain.repository

import com.sugoigroup.del1.di.DatabaseModule

class LocalRepository(
    private val databaseModule: DatabaseModule
)
{
    fun sayHello() = databaseModule.getDashboard().say
}