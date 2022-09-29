package com.example.dailyplanner.domain

import com.example.dailyplanner.data.RepositoryCalendar
import com.example.dailyplanner.entity.CaseDB
import com.example.dailyplanner.entity.CaseInt
import com.example.dailyplanner.entity.NewCaseDB
import javax.inject.Inject

// Domain-класс для связи viewModel и Data-слоя
// добавление нового дела (связь viewModel с репозиторием)

class AddDayCaseUseCase @Inject constructor (private val repositoryCalendar: RepositoryCalendar){

    //Добавление нового дела
   suspend fun addDayCase(case:NewCaseDB){
        repositoryCalendar.addDayCase(case)
    }
}