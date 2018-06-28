package org.mercury.api.plugin

import java.lang.annotation.Inherited

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 28/6/18
 */

@Inherited
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class PluginMetaData(val name: String,
                                val description: String,
                                val version: Double = 1.0,
                                val authors: Array<String>)