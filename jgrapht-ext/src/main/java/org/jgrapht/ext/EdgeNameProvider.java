/* ==========================================
 * JGraphT : a free Java graph-theory library
 * ==========================================
 *
 * Project Info:  http://jgrapht.sourceforge.net/
 * Project Creator:  Barak Naveh (http://sourceforge.net/users/barak_naveh)
 *
 * (C) Copyright 2003-2008, by Barak Naveh and Contributors.
 *
 * This program and the accompanying materials are dual-licensed under
 * either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation, or (at your option) any
 * later version.
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */
/* ------------------
 * VertexNameProvider.java
 * ------------------
 * (C) Copyright 2005-2008, by Trevor Harmon.
 *
 * Original Author:  Trevor Harmon
 *
 */
package org.jgrapht.ext;

/**
 * Assigns a display name for each of the graph edes.
 */
public interface EdgeNameProvider<E>
{


    /**
     * Returns a unique name for an edge. This is useful when exporting a graph,
     * as it ensures that all edges are assigned simple, consistent names.
     *
     * @param edge the edge to be named
     *
     * @return the name of the edge
     */
    public String getEdgeName(E edge);
}

// End EdgeNameProvider.java
