package com.example.dailyplanner.domain

import com.example.dailyplanner.data.RepositoryCalendar
import com.example.dailyplanner.entity.CaseDB
import javax.inject.Inject

// Domain-класс для связи viewModel и Data-слоя
// полная информация по делу (связь viewModel с репозиторием)

class GetCaseFullUseCase @Inject constructor(private val repositoryCalendar: RepositoryCalendar) {

    //Запрос конткретного дела по id
    suspend fun getCaseFull(id:Int):CaseDB{
      return  repositoryCalendar.getCaseFull(id)
    }
}