package org.mercury

import org.mercury.api.entity.Player
import org.mercury.api.event.EventContainer
import org.mercury.api.event.EventKey
import org.mercury.api.plugins.PluginMetaData
import org.mercury.api.plugins.services.event.EventPlugin
import org.mercury.api.plugins.services.registry.ServiceRegistry
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
        val container = EventContainer.withEnumKeyType(EventKey::class.java, player)

        val registry = ServiceRegistry(EventPlugin::class.java as Class<EventPlugin<Player>>)

        registry.services.forEach {
            plugin -> container.register(plugin.key, plugin.event)

            plugin.meta().info()
        }

        container.invoke(EventKey.INIT)

        for (i in 1 .. 3) {
            container.invoke(EventKey.PROCESS)
        }

        container.invoke(EventKey.FINISH)

    }

    fun PluginMetaData.info() {
        println("Registered plugin [name: $name, description: $description, version: $version, author(s): ${Arrays.toString(authors)}]")
    }

}