import org.mercury.api.plugins.providers.language.french.FrenchPlugin;

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */
module providers.language.french {

	requires kotlin.stdlib;
	requires api;

	provides org.mercury.api.plugins.services.language.LanguagePlugin with FrenchPlugin;

}