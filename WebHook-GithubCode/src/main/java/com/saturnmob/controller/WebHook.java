package com.saturnmob.controller;

public class WebHook {

	String repoName;
	String repoCreationTime;

	/**
	 * @return the repoName
	 */
	public String getRepoName() {
		return repoName;
	}

	/**
	 * @param repoName
	 *            the repoName to set
	 */
	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}

	/**
	 * @return the repoCreationTime
	 */
	public String getRepoCreationTime() {
		return repoCreationTime;
	}

	/**
	 * @param repoCreationTime
	 *            the repoCreationTime to set
	 */
	public void setRepoCreationTime(String repoCreationTime) {
		this.repoCreationTime = repoCreationTime;
	}

}
