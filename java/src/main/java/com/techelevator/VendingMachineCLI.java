package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };
	private static final String[] PURCHASE_OPTIONS = {"Feed Money", "Select Product", "Finish Transaction"};

	private Menu menu;
	private List<Item> itemList = new ArrayList<>();

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {

		loadData();

		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				displayItems();
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				displayPurchaseMenu();
			}
		}
	}

	public void loadData() {
		File file = new File("vendingmachine.csv");

		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String [] lineArr = line.split("\\|");
				String slot = lineArr[0];
				String name = lineArr[1];
				double price = Double.parseDouble(lineArr[2]);
				String type = lineArr[3];

				Item items = new Item(slot, name, price, type);
				itemList.add(items);

			}
		} catch (FileSystemNotFoundException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void displayItems() {
		System.out.println("===============================");
		System.out.println("     Vending Machine Items     ");
		System.out.println("===============================");

		for (Item item : itemList) {
			System.out.println(item.getSlot() + " | " + item.getName() + " | " + item.getPrice() + " | " + item.getType());
		}
	}

	public void displayPurchaseMenu() {
		System.out.println("===============================");
		System.out.println("         Purchase Menu         ");
		System.out.println("===============================");
		boolean stay = true;

		while(stay) {
			String choice = (String) menu.getChoiceFromOptions(PURCHASE_OPTIONS);
			if (choice.equals("Feed Money")) {

			} else if (choice.equals("Select Product")) {

			} else if (choice.equals("Finish Transaction")) {
				stay = false;
			}
		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
