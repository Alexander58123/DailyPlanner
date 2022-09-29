package com.example.dailyplanner.domain

import com.example.dailyplanner.data.RepositoryCalendar
import com.example.dailyplanner.entity.CaseDB
import com.example.dailyplanner.entity.CaseHour
import java.sql.Timestamp
import javax.inject.Inject


// Domain-класс для связи viewModel и Data-слоя
// Список дел на определенный день (связь viewModel с репозиторием)

class GetListCaseUseCase @Inject constructor(private val repositoryCalendar: RepositoryCalendar) {

    //Запрос списка всех дел на данный день (day:Timestamp)
    suspend fun getListCase(day:Timestamp): List<CaseHour> {
     return repositoryCalendar.getListCase(day)
    }
}