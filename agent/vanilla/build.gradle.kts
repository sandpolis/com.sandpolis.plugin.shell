//============================================================================//
//                                                                            //
//                         Copyright © 2015 Sandpolis                         //
//                                                                            //
//  This source file is subject to the terms of the Mozilla Public License    //
//  version 2. You may not use this file except in compliance with the MPL    //
//  as published by the Mozilla Foundation.                                   //
//                                                                            //
//============================================================================//

plugins {
	id("java-library")
	id("sandpolis-java")
	id("sandpolis-module")
	id("sandpolis-soi")
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter-engine:5.5.1")

	compileOnly(project(":plugin:com.sandpolis.plugin.shell"))
}

eclipse {
	project {
		name = "com.sandpolis.plugin.shell:agent:vanilla"
		comment = "com.sandpolis.plugin.shell:agent:vanilla"
	}
}
