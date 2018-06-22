/**
 * 
 */
package com.binji.common.domain;

/**
 * @author amit.bharti
 *
 */
public enum ActionType {
	// Calls a JS method to launch an app
	APPLAUNCH, 
	
	// Displays a dialog on screen
	DIALOG,
	
	// Starts full screen playback of a streaming video
	VIDEO, 
	
	// Opens image in lighbox
	IMAGE,
	
	// Navigates to an area of the portal
	GOTO;
}
