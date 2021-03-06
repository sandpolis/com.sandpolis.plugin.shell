//============================================================================//
//                                                                            //
//                         Copyright © 2015 Sandpolis                         //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation.                                   //
//                                                                            //
//============================================================================//
package com.sandpolis.plugin.shell.agent.vanilla.shell;

import java.util.Base64;

public class ZshShell extends AbstractShell {

	@Override
	public String[] searchPath() {
		return new String[] { "/bin/zsh", "/usr/bin/zsh" };
	}

	@Override
	public String[] buildSession() {
		return new String[] { location, "-i" };
	}

	@Override
	public String[] buildCommand(String command) {
		return new String[] { location, "-c",
				"echo " + Base64.getEncoder().encodeToString(command.getBytes()) + " | base64 --decode | " + location };
	}
}
