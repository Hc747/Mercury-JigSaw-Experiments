import org.mercury.api.plugin.providers.event.greeter.*;

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */
module providers.event.greeter {

	requires kotlin.stdlib;
	requires api;

	provides org.mercury.api.plugin.service.event.EventPlugin with
			PlayerGreeterPlugin, PlayerFarewellPlugin,
			PlayerAppearanceUpdatePlugin, PlayerMovementUpdatePlugin;

}