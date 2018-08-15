/**
 * 
 */
package com.shadab.grocery.api;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mshadab
 *
 */
public interface GroceryApi {
	
	@RequestMapping("/initializeapp")
	public String home(Map<String, Object> model);

}
