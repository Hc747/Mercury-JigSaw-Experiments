package org.mercury.api.plugins.providers.language.french

import org.mercury.api.plugins.PluginMetaData
import org.mercury.api.plugins.services.language.LanguagePlugin

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */

@PluginMetaData(name = "main.kotlin.org.mercury.api.services.providers.language.french.FrenchPlugin", description = "A language plugin for French", authors = ["Hc747"])
class FrenchPlugin : LanguagePlugin {

    override val language = "French"

    override val greeting = "Bonjour"

}