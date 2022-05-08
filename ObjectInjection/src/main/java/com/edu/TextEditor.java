package com.edu;

public class TextEditor {
private SpellCheck Spellcheck;
/*
public SpellCheck getSpellcheck() {
	return Spellcheck;
}

public void setSpellcheck(SpellCheck spellcheck) {
	Spellcheck = spellcheck;
}
*/
public TextEditor(SpellCheck spellcheck) {
	super();
	Spellcheck = spellcheck;
}

public void textEditorFunction() {
	if(Spellcheck!=null) {
		Spellcheck.enable();
	}
	else {
		System.out.println("Spellcheck is Disabled");
	}
}
}

