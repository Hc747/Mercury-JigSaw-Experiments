package org.mercury.api.entity.player

import org.mercury.api.entity.Entity

class Player(val name: String) : Entity {

    fun say(message: String) = println("$name: $message")

}