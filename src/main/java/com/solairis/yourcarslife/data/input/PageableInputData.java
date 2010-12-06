/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.solairis.yourcarslife.data.input;

/**
 *
 * @author josh
 */
public class PageableInputData {

	private int maxRecords;
	private int startRecord;

	public int getMaxRecords() {
		return maxRecords;
	}

	public void setMaxRecords(int resultsPerPage) {
		this.maxRecords = resultsPerPage;
	}

	public int getStartRecord() {
		return startRecord;
	}

	public void setStartRecord(int startRecord) {
		this.startRecord = startRecord;
	}

}
