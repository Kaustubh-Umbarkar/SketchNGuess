package com.example.sketchnguess.data.remote.ws.models


import com.example.sketchnguess.data.remote.ws.models.BaseModel
import com.example.sketchnguess.util.Constants.TYPE_DRAW_ACTION

data class DrawAction(
    val action: String
): BaseModel(TYPE_DRAW_ACTION) {

    companion object {
        const val ACTION_UNDO = "ACTION_UNDO"
    }
}