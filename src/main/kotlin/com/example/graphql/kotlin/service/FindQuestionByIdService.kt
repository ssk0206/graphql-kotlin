package com.example.graphql.kotlin.application.service

import com.example.graphql.kotlin.domain.model.Question
import com.example.graphql.kotlin.infrastructure.repository.QuestionRepository
import org.springframework.stereotype.Service

@Service
class FindQuestionByIdService(
     private val questionRepository: QuestionRepository
) {
    fun execute(id: Int): Question {
        val question = questionRepository.findQuestionById(id)
        return Question(question!!.qid, question.content, question.questionUid)
    }
}