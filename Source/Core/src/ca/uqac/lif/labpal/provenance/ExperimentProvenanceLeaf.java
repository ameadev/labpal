/*
  LabPal, a versatile environment for running experiments on a computer
  Copyright (C) 2014-2017 Sylvain Hallé

  This program is free software: you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package ca.uqac.lif.labpal.provenance;

import ca.uqac.lif.labpal.Experiment;

public class ExperimentProvenanceLeaf extends ProvenanceLeaf
{
	protected final String m_paramName;
	
	public ExperimentProvenanceLeaf(String param_name, DataOwner owner)
	{
		super("E" + ((Experiment) owner).getId() + ":" + param_name, owner);
		m_paramName = param_name;
	}

	@Override
	public String toString()
	{
		Experiment e = (Experiment) m_owner;
		return "Value of " + m_paramName + " in experiment #" + e.getId();
	}
}
