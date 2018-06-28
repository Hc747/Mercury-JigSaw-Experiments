/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */
module api {

	requires kotlin.stdlib;

	exports org.mercury.api.entity;

	exports org.mercury.api.event;

	exports org.mercury.api.plugins;
	exports org.mercury.api.plugins.services.registry;
	exports org.mercury.api.plugins.services.event;
	exports org.mercury.api.plugins.services.language;

	//uses org.mercury.api.services.services.event.PlayerEventPlugin;
	uses org.mercury.api.plugins.services.event.EventPlugin;

}