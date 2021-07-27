package com.lockedme;

public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperation.createMainFolderIfNotPresent("main");
		
		MenuDetails.printWelcomeScreen("LockedMe", "Soumya G K");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}


