package de.zabuza.treeflood.demo.gui.view;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import de.zabuza.treeflood.demo.gui.view.properties.IReColorable;
import de.zabuza.treeflood.demo.gui.view.util.StyleManager;
import de.zabuza.treeflood.demo.gui.view.util.Window;

/**
 * Provides a customized {@link JTextArea} having some special attributes set.
 *
 * @author Ativelox {@literal <ativelox.dev@web.de>}
 *
 */
public final class OptionTextArea extends JTextArea implements IReColorable {

	/**
	 * The serial version UID used for serialization.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The style manager used to handle colors.
	 */
	private final StyleManager mManager;

	/**
	 * Constructs a new OptionTextArea with the text given.
	 * 
	 * @param content
	 *            The content written onto this area.
	 * @param manager
	 *            The style manager used to handle colors.
	 */
	public OptionTextArea(final String content, final StyleManager manager) {
		super(content);
		// Add a little margin to the left, so the content of this text area
		// doesn't cling to its edge.
		this.setBorder(
				BorderFactory.createCompoundBorder(LineBorder.createBlackLineBorder(), new EmptyBorder(0, 2, 0, 0)));

		// This isn't a good solution. We just set our preferred width to 1 so
		// the layout manager managing this component doesn't try to resize it
		// beyond its own "fill" parameter, since 1 < fill. This maintains a
		// stable size of this text area and won't deform the layout if the
		// input query is too long.
		this.setPreferredSize(new Dimension(1, (int) (Window.TEXT_AREA_FONT.getSize() * 1.3f)));

		this.setFont(Window.TEXT_AREA_FONT);

		this.mManager = manager;

		this.setBackground(manager.getTextAreaColor());
		this.setForeground(manager.getDefaultFontColor());
	}

	/**
	 * Constructs a new OptionTextArea with no text.
	 * 
	 * @param manager
	 *            The style manager used to handle colors.
	 */
	public OptionTextArea(final StyleManager manager) {
		this("", manager);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.zabuza.treeflood.demo.gui.view.properties.IRecolorable#reColor()
	 */
	@Override
	public void reColor() {
		this.setBackground(this.mManager.getTextAreaColor());
		this.setForeground(this.mManager.getDefaultFontColor());
	}
}
