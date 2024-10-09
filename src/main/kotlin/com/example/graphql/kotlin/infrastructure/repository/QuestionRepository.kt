package com.example.graphql.kotlin.infrastructure.repository;

import com.example.graphql.kotlin.infrastructure.table.QuestionTable
import org.springframework.stereotype.Repository

@Repository
class QuestionRepository {

    val questions = mutableListOf<QuestionTable>(
        QuestionTable(1, "What is your name?", 1),
        QuestionTable(2, "What is your age?", 1),
        QuestionTable(3, "What is your favorite programming language?", 1),
        QuestionTable(4, "What is your favorite food?", 1),
        QuestionTable(5, "What is your favorite color?", 1),
        QuestionTable(6, "What is your favorite movie?", 1),
        QuestionTable(7, "What is your favorite book?", 1),
        QuestionTable(8, "What is your favorite song?", 1),
        QuestionTable(9, "What is your favorite animal?", 1),
        QuestionTable(10, "What is your favorite place?", 1)
    )

    fun findQuestionById(id: Int): QuestionTable? {
        return questions.find { it.qid == id }
    }
}
