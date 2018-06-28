package org.mercury.api.plugin.service.registry

import java.util.*

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */

class ServiceRegistry<TService>(_class: Class<TService>) {

    val services = ServiceLoader.load(_class)!!

}