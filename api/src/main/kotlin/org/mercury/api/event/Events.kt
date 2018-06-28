package org.mercury.api.event

import java.util.*

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */

enum class EventKey {
    INIT,
    PROCESS,
    FINISH
}

typealias Event<T> = (T) -> Unit

class EventContainer<T>(private val entity: T) {

    private val events = EnumMap<EventKey, MutableList<Event<T>>>(EventKey::class.java)

    fun invoke(key: EventKey) {
        val handlers = events[key] ?: return
        handlers.forEach { it.invoke(entity) }
    }

    fun register(key: EventKey, event: Event<T>) {
        val handlers = events[key] ?: mutableListOf()

        handlers.add(event)

        events[key] = handlers
    }

    fun deregister(key: EventKey, event: Event<T>) {
        val handlers = events[key] ?: return

        handlers.remove(event)

        if (handlers.isEmpty()) {
            events.remove(key)
        }
    }

}