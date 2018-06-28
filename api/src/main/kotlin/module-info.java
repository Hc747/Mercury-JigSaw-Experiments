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

	exports org.mercury.api.plugin;
	exports org.mercury.api.plugin.service.registry;
	exports org.mercury.api.plugin.service.event;
	exports org.mercury.api.plugin.service.language;

	//uses org.mercury.api.services.services.event.PlayerEventPlugin;
	uses org.mercury.api.plugin.service.event.EventPlugin;

}