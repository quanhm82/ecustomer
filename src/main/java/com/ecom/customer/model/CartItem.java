package com.ecom.customer.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author quanhoang
 * Item in Cart as resource
 */
public class CartItem {
	
	@Id
	@Column(name = "CARTITEM_ID")
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@ColumnDefault("random_uuid()")
	@Type(type = "uuid-char")
	private UUID cartItemId;
	
	@ManyToOne
	@JoinColumn(name = "cartId", nullable = false)
	private ShoppingCart cart;
	
	@Column(name = "PROD_ID")
	private String productId;
	
	@Column(name = "PROD_NAME")
	private String productName;

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public UUID getCartItemId() {
		return cartItemId;
	}
}
