package com.example.sketchnguess.data.remote.ws.models


import com.example.sketchnguess.data.remote.ws.Room
import com.example.sketchnguess.data.remote.ws.models.BaseModel
import com.example.sketchnguess.util.Constants.TYPE_PHASE_CHANGE

data class PhaseChange(
        var phase: Room.Phase?,
        var time: Long,
        val drawingPlayer: String? = null
): BaseModel(TYPE_PHASE_CHANGE)