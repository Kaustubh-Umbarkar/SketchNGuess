package com.example.sketchnguess.data.remote.ws.models


import com.example.sketchnguess.data.remote.ws.models.BaseModel
import com.example.sketchnguess.data.remote.ws.models.PlayerData
import com.example.sketchnguess.util.Constants.TYPE_PLAYERS_LIST

data class PlayersList(
    val players: List<PlayerData>
): BaseModel(TYPE_PLAYERS_LIST)
