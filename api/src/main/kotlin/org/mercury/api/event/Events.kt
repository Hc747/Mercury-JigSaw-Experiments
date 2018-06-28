package org.mercury.api.event

import java.util.*

typealias Event<T> = (T) -> Unit

class EventContainer<TKey, TEntity> internal constructor(private val entity: TEntity, private val events: MutableMap<TKey, MutableSet<Event<TEntity>>>) {

    fun invoke(key: TKey) {
        val handlers = events[key] ?: return
        handlers.forEach { it.invoke(entity) }
    }

    fun register(key: TKey, event: Event<TEntity>) {
        val handlers = events[key] ?: mutableSetOf()

        handlers.add(event)

        events[key] = handlers
    }

    fun deregister(key: TKey, event: Event<TEntity>) {
        val handlers = events[key] ?: return

        handlers.remove(event)

        if (handlers.isEmpty()) {
            events.remove(key)
        }
    }

    companion object {

        fun <TKey, TEntity> withKeyType(keyType: Class<TKey>, entity: TEntity): EventContainer<TKey, TEntity> {
            val events = mutableMapOf<TKey, MutableSet<Event<TEntity>>>()
            return EventContainer(entity, events)
        }

        fun <TKey : Enum<TKey>, TEntity> withEnumKeyType(enumClass: Class<TKey>, entity: TEntity): EventContainer<TKey, TEntity> {
            val events = EnumMap<TKey, MutableSet<Event<TEntity>>>(enumClass)
            return EventContainer(entity, events)
        }

    }

}