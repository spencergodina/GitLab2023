package edu.unl.raikes.git;

public class GitLab {
	public static void main(String[] args) {
		String[] persons = new String[] {"Spencer", "Jay"};
		GitLabHelper helper = new GitLabHelper(persons);
		helper.PrintWelcomeMessage();
	}
}
