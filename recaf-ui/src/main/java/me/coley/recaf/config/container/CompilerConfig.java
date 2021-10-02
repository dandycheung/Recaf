package me.coley.recaf.config.container;

import me.coley.recaf.config.ConfigContainer;
import me.coley.recaf.config.ConfigID;
import me.coley.recaf.config.Group;
import me.coley.recaf.ui.util.Icons;

/**
 * Config container for compiler values.
 *
 * @author Matt Coley
 */
public class CompilerConfig implements ConfigContainer {
	/**
	 * Compiler impl to use from {@link me.coley.recaf.compile.CompileManager}.
	 */
	@Group("general")
	@ConfigID("impl")
	public String impl = "javac";
	/**
	 * Flag to include variable symbols in compilation.
	 */
	@Group("debug")
	@ConfigID("vars")
	public boolean debugVars = true;
	/**
	 * Flag to include line numbers in compilation.
	 */
	@Group("debug")
	@ConfigID("lines")
	public boolean debugLines = true;
	/**
	 * Flag to include source file attribute in compilation.
	 */
	@Group("debug")
	@ConfigID("sourcefile")
	public boolean debugSourceName = true;

	@Override
	public String iconPath() {
		return Icons.SYNTHETIC;
	}

	@Override
	public String internalName() {
		return "conf.compiler";
	}
}
