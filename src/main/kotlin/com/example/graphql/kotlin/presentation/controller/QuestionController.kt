package com.example.graphql.kotlin.presentation.controller

import com.example.graphql.kotlin.application.service.FindQuestionByIdService
import com.example.graphql.kotlin.domain.model.Question
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class QuestionController(
    private val findQuestionByIdService: FindQuestionByIdService
) {

    @QueryMapping
    fun question(id: Int): Question {
        return findQuestionByIdService.execute(id)
    }
}