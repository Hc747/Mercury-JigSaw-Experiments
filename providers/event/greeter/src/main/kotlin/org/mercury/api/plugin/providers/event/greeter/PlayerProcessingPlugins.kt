package org.mercury.api.plugin.providers.event.greeter

import org.mercury.api.entity.player.Player
import org.mercury.api.event.Event
import org.mercury.api.entity.event.EntityEventKey
import org.mercury.api.plugin.PluginMetaData
import org.mercury.api.plugin.service.event.EventPlugin

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */

@PluginMetaData(name = "PlayerAppearanceUpdatePlugin", description = "Updates the players appearance", authors = ["Hc747"])
class PlayerAppearanceUpdatePlugin : EventPlugin<EntityEventKey, Player> {

    override val key = EntityEventKey.PROCESS

    override val event: Event<Player> = { it.say("Appearance Updated!") }

}

@PluginMetaData(name = "PlayerMovementUpdatePlugin", description = "Updates the players movement", authors = ["Hc747"])
class PlayerMovementUpdatePlugin : EventPlugin<EntityEventKey, Player> {

    override val key = EntityEventKey.PROCESS

    override val event: Event<Player> = { it.say("Player Moved!") }

}