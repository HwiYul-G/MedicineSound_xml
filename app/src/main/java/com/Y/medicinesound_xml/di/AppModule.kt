package com.Y.medicinesound_xml.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

// This is a module that will be used by Hilt to generate dependencies(의존성의 시작점을 알림)
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    // @Singleton
    // @Provides : Hilt가 이 메서드를 호출하여 의존성을 제공하도록 지정


    private const val MEDICINE_INFO_BASE_URL = "http://apis.data.go.kr/1471000/DrbEasyDrugInfoService/"
    @Singleton
    @Provides
    fun provideMedicineInfoRetrofit(gson : Gson) : Retrofit = Retrofit.Builder()
        .baseUrl(MEDICINE_INFO_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    @Provides
    fun provideGson() : Gson = GsonBuilder().create()
}