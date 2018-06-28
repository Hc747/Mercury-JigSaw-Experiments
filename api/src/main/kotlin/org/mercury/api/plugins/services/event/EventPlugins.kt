package org.mercury.api.plugins.services.event

import org.mercury.api.event.Event
import org.mercury.api.event.EventKey
import org.mercury.api.plugins.Plugin
import org.mercury.api.plugins.PluginMetaData

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */

@PluginMetaData(name = "EventPlugin", description = "The base event plugin interface", authors = ["Hc747"])
interface EventPlugin<T> : Plugin {

    val key: EventKey

    val event: Event<T>

}