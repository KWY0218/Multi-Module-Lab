package com.hous.multi_module.di

import com.hous.data.repository.RepositoryImpl
import com.hous.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideRepository(
        impl: RepositoryImpl
    ): Repository = impl
}
