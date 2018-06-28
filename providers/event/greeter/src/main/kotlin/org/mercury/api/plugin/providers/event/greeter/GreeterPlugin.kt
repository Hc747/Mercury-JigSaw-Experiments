package org.mercury.api.plugin.providers.event.greeter

import org.mercury.api.entity.event.EntityEventKey
import org.mercury.api.entity.player.Player
import org.mercury.api.event.Event
import org.mercury.api.plugin.PluginMetaData
import org.mercury.api.plugin.service.event.EventPlugin

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */

@PluginMetaData(name = "PlayerGreeterPlugin", description = "Welcomes the player to the game.", authors = ["Hc747"])
class PlayerGreeterPlugin : EventPlugin<EntityEventKey, Player> {

    override val key = EntityEventKey.INIT

    override val event: Event<Player> = { it.say("Welcome to XXX.") }

}

@PluginMetaData(name = "PlayerGreeterPlugin", description = "Bids the player farewell and thanks them for playing.", authors = ["Hc747"])
class PlayerFarewellPlugin : EventPlugin<EntityEventKey, Player> {

    override val key = EntityEventKey.FINISH

    override val event: Event<Player> = { it.say("Farewell, thank you for playing.") }

}