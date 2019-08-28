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
		
		ModelAndView modelAndView = new ModelAndView("ProductsHome");
		
		modelAndView.addObject("productsMessage", "Products lists to be displayed here...!");
		return modelAndView; 
	}
}
