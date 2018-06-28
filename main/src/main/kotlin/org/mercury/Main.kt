package org.mercury

import org.mercury.api.entity.player.Player
import org.mercury.api.event.EventContainer
import org.mercury.api.entity.event.EntityEventKey
import org.mercury.api.plugin.PluginMetaData
import org.mercury.api.plugin.service.event.EventPlugin
import org.mercury.api.plugin.service.registry.ServiceRegistry
import java.util.*

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val player = Player("Hc747")
        val container = EventContainer.withEnumKeyType(EntityEventKey::class.java, player)

        val registry = ServiceRegistry(EventPlugin::class.java as Class<EventPlugin<EntityEventKey, Player>>)

        registry.services.forEach {
            plugin -> container.register(plugin.key, plugin.event)

            plugin.meta().info()
        }

        container.invoke(EntityEventKey.INIT)

        for (i in 1 .. 3) {
            container.invoke(EntityEventKey.PROCESS)
        }

        container.invoke(EntityEventKey.FINISH)

    }

    fun PluginMetaData.info() {
        println("Registered plugin [name: $name, description: $description, version: $version, author(s): ${Arrays.toString(authors)}]")
    }

}