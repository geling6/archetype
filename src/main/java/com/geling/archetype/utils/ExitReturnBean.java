package com.geling.archetype.utils;

import org.springframework.boot.ExitCodeGenerator;

public class ExitReturnBean implements ExitCodeGenerator{

	@Override
	public int getExitCode() {
		System.out.println("fuck you, fuck her !");
		// TODO Auto-generated method stub
		return 0;
	}

}
