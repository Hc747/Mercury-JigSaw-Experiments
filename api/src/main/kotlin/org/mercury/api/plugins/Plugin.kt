package org.mercury.api.plugins

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */

interface Plugin {

    fun meta() = this::class.java.getAnnotation(PluginMetaData::class.java)!!

}