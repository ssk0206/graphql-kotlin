package com.example.graphql.kotlin.domain.model

data class Answer(
    val aid: Int,
    val qid: Int,
    val content: String,
    val answerUid: Int
)