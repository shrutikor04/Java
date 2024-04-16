package com.eb.entity;

public class Menu {
	private int menuId;
	private String menuName;
	private int price;
	private int Quantity;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public void show() {
		System.out.println("Menu ID:"+menuId+"\nMenu Name:"+menuName+"\nMenu Price:"+price+"\nMenu Quantity:"+Quantity);
	}

}
