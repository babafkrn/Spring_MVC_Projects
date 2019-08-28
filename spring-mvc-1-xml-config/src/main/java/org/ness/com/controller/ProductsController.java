/**
 * 
 */
package org.ness.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author localadmin
 *
 */
@Controller
public class ProductsController {

	@GetMapping("/products/home")
	public ModelAndView showProductsHome() {
	
		return new ModelAndView("ProductsHome", "productsMessage", "Products lists to be displayed here...!"); 
	}
}
