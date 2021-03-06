/* Date:        January 6, 2011
 * Template:	PluginScreenJavaTemplateGen.java.ftl
 * generator:   org.molgenis.generators.ui.PluginScreenJavaTemplateGen 3.3.3
 * 
 * THIS FILE IS A TEMPLATE. PLEASE EDIT :-)
 */

package org.molgenis.compute.db.ui;

import org.molgenis.framework.db.Database;
import org.molgenis.framework.server.MolgenisRequest;
import org.molgenis.framework.ui.PluginModel;
import org.molgenis.framework.ui.ScreenController;
import org.molgenis.util.Entity;

public class ComputeHeader extends PluginModel<Entity>
{

	private static final long serialVersionUID = -6399721492853956608L;

	public ComputeHeader(String name, ScreenController<?> parent)
	{
		super(name, parent);
	}

	@Override
	public String getViewName()
	{
		return "plugins_header_ComputeHeader";
	}

	@Override
	public String getViewTemplate()
	{
		return "templates/ComputeHeader.ftl";
	}

	@Override
	public String getCustomHtmlHeaders()
	{
		return "<link rel=\"stylesheet\" href=\"css/compute.css\" type=\"text/css\">";
	}

	@Override
	public void handleRequest(Database db, MolgenisRequest request)
	{
		//
	}

	@Override
	public void reload(Database db)
	{
		//
	}

}
