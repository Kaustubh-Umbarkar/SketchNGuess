package com.example.sketchnguess.data.remote.ws.models


import com.example.sketchnguess.data.remote.ws.models.BaseModel
import com.example.sketchnguess.util.Constants.TYPE_CHOSEN_WORD

data class ChosenWord(
    val chosenWord: String,
    val roomName: String
): BaseModel(TYPE_CHOSEN_WORD)