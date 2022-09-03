package com.example.sketchnguess.data.remote.ws.models


import com.example.sketchnguess.data.remote.ws.models.BaseModel
import com.example.sketchnguess.util.Constants.TYPE_GAME_STATE


data class GameState(
    val drawingPlayer: String,
    val word: String
): BaseModel(TYPE_GAME_STATE)
