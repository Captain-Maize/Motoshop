package com.motoshop.client.motoshop;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.motoshop.client.ControllerHelper;
import com.motoshop.common.entity.CartItem;
import com.motoshop.common.entity.Customer;

@Controller
public class MotoShopController {

	@Autowired
	private ControllerHelper controllerHelper;
	@Autowired
	private MotoShopService cartService;

	@GetMapping("/cart")
	public String viewCart(Model model, HttpServletRequest request) {
		Customer customer = controllerHelper.getAuthenticatedCustomer(request);// dùng email để lấy ra customer tương
																				// ứng
		List<CartItem> cartItems = cartService.listCartItems(customer);// lấy tất cả cartItems thuộc về customer này

		float estimatedTotal = 0.0F;// tính tổng số tiền của tất cả các cartItems

		for (CartItem item : cartItems) {
			estimatedTotal += item.getSubtotal();// số tiền của mỗi cartItem = discountPrice * quantity
		}

		model.addAttribute("cartItems", cartItems);
		model.addAttribute("estimatedTotal", estimatedTotal);

		return "cart/shopping_cart";
	}
}
