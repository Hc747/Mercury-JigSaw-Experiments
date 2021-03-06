package org.mercury.api.plugin.providers.language.english

import org.mercury.api.plugin.PluginMetaData
import org.mercury.api.plugin.service.language.LanguagePlugin

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */

@PluginMetaData(name = "main.kotlin.providers.language.english.EnglishPlugin", description = "A language plugin for English", authors = ["Hc747"])
class EnglishPlugin : LanguagePlugin {

    override val language = "English"

    override val greeting = "Hello"

}