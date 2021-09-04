package nyx.model

import kotlinx.serialization.Serializable

@Serializable
data class Question(val text:String, val answers:List<String>, val correctAnswer:Int)
