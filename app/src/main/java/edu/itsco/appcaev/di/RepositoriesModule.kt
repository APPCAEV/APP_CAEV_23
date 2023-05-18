package edu.itsco.appcaev.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import edu.itsco.appcaev.data.repositories.CharacterRepositoryImpl
import edu.itsco.appcaev.domain.repositories.CharacterRepository

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindCharacterRepository(impl: CharacterRepositoryImpl): CharacterRepository
}