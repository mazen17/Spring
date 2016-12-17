package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

import com.tutorialspoint1.SpellChecker;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	@Autowired
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
