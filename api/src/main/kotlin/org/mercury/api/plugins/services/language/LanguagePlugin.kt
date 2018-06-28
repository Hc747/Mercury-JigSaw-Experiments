package org.mercury.api.plugins.services.language

import org.mercury.api.plugins.Plugin
import org.mercury.api.plugins.PluginMetaData

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */

@PluginMetaData(name = "LanguagePlugin", description = "The base language plugin interface", authors = ["Hc747"])
interface LanguagePlugin : Plugin {

    val language: String

    val greeting: String

}