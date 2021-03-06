package de.zabuza.treeflood.tree.util;

import de.zabuza.treeflood.tree.ITreeNode;

/**
 * A simple implementation of a tree node stringifier that returns the
 * {@link Object#toString()} representation of a given node.
 * 
 * @author Zabuza {@literal <zabuza.dev@gmail.com>}
 *
 */
public final class SimpleTreeNodeStringifier implements ITreeNodeStringifier {

	/**
	 * Returns the {@link Object#toString()} representation of the given node.
	 */
	@Override
	public String nodeToString(final ITreeNode node) {
		return node.toString();
	}

}
