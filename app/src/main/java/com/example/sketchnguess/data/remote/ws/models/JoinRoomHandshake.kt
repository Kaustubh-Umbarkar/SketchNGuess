package com.example.sketchnguess.data.remote.ws.models


import com.example.sketchnguess.data.remote.ws.models.BaseModel
import com.example.sketchnguess.util.Constants.TYPE_JOIN_ROOM_HANDSHAKE

data class JoinRoomHandshake(
    val username: String,
    val roomName: String,
    val clientId: String
): BaseModel(TYPE_JOIN_ROOM_HANDSHAKE)
