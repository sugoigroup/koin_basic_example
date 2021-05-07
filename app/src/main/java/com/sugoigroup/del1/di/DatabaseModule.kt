package com.sugoigroup.del1.di

import com.sugoigroup.del1.domain.entity.Article
import org.koin.dsl.module


class DatabaseModule(
    val article: Article
) {
    fun getDashboard() : Article {
        article.say = "Say Hello Koin"
        return article
    }
}