package org.mercury.api.plugins.providers.event.greeter

import org.mercury.api.entity.Player
import org.mercury.api.event.Event
import org.mercury.api.event.EventKey
import org.mercury.api.plugins.PluginMetaData
import org.mercury.api.plugins.services.event.EventPlugin

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */

@PluginMetaData(name = "PlayerGreeterPlugin", description = "Welcomes the player to the game.", authors = ["Hc747"])
class PlayerGreeterPlugin : EventPlugin<Player> {

    override val key = EventKey.INIT

    override val event: Event<Player> = { it.say("Welcome to RuneScape.") }

}

@PluginMetaData(name = "PlayerGreeterPlugin", description = "Bids the player farewell and thanks them for playing.", authors = ["Hc747"])
class PlayerFarewellPlugin : EventPlugin<Player> {

    override val key = EventKey.FINISH

    override val event: Event<Player> = { it.say("Farewell, thank you for playing.") }

}