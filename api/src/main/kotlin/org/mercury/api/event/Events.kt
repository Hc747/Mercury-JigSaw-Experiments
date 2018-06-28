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

class EventContainer<K, T> internal constructor(private val entity: T, private val events: MutableMap<K, MutableSet<Event<T>>>) {

    fun invoke(key: K) {
        val handlers = events[key] ?: return
        handlers.forEach { it.invoke(entity) }
    }

    fun register(key: K, event: Event<T>) {
        val handlers = events[key] ?: mutableSetOf()

        handlers.add(event)

        events[key] = handlers
    }

    fun deregister(key: K, event: Event<T>) {
        val handlers = events[key] ?: return

        handlers.remove(event)

        if (handlers.isEmpty()) {
            events.remove(key)
        }
    }

    companion object {

        fun <K, T> withKeyType(keyType: Class<K>, entity: T): EventContainer<K, T> {
            val events = mutableMapOf<K, MutableSet<Event<T>>>()
            return EventContainer(entity, events)
        }

        fun <K : Enum<K>, T> withEnumKeyType(enumClass: Class<K>, entity: T): EventContainer<K, T> {
            val events = EnumMap<K, MutableSet<Event<T>>>(enumClass)
            return EventContainer(entity, events)
        }

    }

}