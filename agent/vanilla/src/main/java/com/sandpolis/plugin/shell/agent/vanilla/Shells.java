//============================================================================//
//                                                                            //
//                         Copyright © 2015 Sandpolis                         //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation.                                   //
//                                                                            //
//============================================================================//
package com.sandpolis.plugin.shell.agent.vanilla;

import com.sandpolis.plugin.shell.agent.vanilla.shell.BashShell;
import com.sandpolis.plugin.shell.agent.vanilla.shell.CmdShell;
import com.sandpolis.plugin.shell.agent.vanilla.shell.PwshShell;
import com.sandpolis.plugin.shell.agent.vanilla.shell.ZshShell;

public final class Shells {

	public static final PwshShell PWSH = new PwshShell();

	public static final CmdShell CMD = new CmdShell();

	public static final BashShell BASH = new BashShell();

	public static final ZshShell ZSH = new ZshShell();

	private Shells() {
	}
}
