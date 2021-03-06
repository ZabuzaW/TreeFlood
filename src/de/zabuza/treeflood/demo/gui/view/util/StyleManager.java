package de.zabuza.treeflood.demo.gui.view.util;

import java.awt.Color;

import de.zabuza.treeflood.demo.gui.view.properties.EStyle;

/**
 * Provides the correct color for the current style given with its methods.
 *
 * @author Ativelox {@literal <ativelox.dev@web.de>}
 *
 */
public final class StyleManager {

	/**
	 * The color of the buttons used throughout this view. (dark style)
	 */
	private static final Color BUTTON_COLOR_DARK = new Color(0, 0, 0);

	/**
	 * The color of the buttons used throughout this view. (standard style)
	 */
	private static final Color BUTTON_COLOR_STANDARD = new Color(255, 255, 255);

	/**
	 * The color of fonts used with nodes. (dark style)
	 */
	private static final Color DEFAULT_FONT_COLOR_DARK = new Color(171, 85, 0);

	/**
	 * The color of fonts used with nodes. (standard style)
	 */
	private static final Color DEFAULT_FONT_COLOR_STANDARD = new Color(0, 0, 0);

	/**
	 * The color of the border surrounding the node. (dark style)
	 */
	private static final Color FRINGE_COLOR_DARK = new Color(120, 120, 120);

	/**
	 * The color of the border surrounding the node. (standard style)
	 */
	private static final Color FRINGE_COLOR_STANDARD = new Color(0, 0, 0);

	/**
	 * The color for highlighting. (dark style)
	 */
	private static final Color HIGHLIGHT_COLOR_DARK = new Color(14, 69, 3);

	/**
	 * The color for highlighting. (standard style)
	 */
	private static final Color HIGHLIGHT_COLOR_STANDARD = new Color(245, 99, 99);

	/**
	 * The color used for the option panel. (dark style)
	 */
	private static final Color OPTIONPANEL_COLOR_DARK = new Color(20, 20, 20);

	/**
	 * The color used for the option panel. (standard style)
	 */
	private static final Color OPTIONPANEL_COLOR_STANDARD = new Color(235, 235, 235);

	/**
	 * The color used for the separators used. (dark style)
	 */
	private static final Color SEPARATOR_COLOR_DARK = new Color(120, 120, 120);

	/**
	 * The color used for the separators used. (standard style)
	 */
	private static final Color SEPARATOR_COLOR_STANDARD = new Color(0, 0, 0);

	/**
	 * The color used for the sliders. (dark style)
	 */
	private static final Color SLIDER_COLOR_DARK = new Color(20, 20, 20);

	/**
	 * The color used for the sliders. (standard style)
	 */
	private static final Color SLIDER_COLOR_STANDARD = new Color(235, 235, 235);

	/**
	 * The color of the text areas used. (dark style)
	 */
	private static final Color TEXT_AREA_COLOR_DARK = new Color(0, 0, 0);

	/**
	 * The color of the text areas used. (standard style)
	 */
	private static final Color TEXT_AREA_COLOR_STANDARD = new Color(255, 255, 255);

	/**
	 * The color of the text panes used. (dark style)
	 */
	private static final Color TEXT_PANE_COLOR_DARK = new Color(20, 20, 20);

	/**
	 * The color of the text panes used. (standard style)
	 */
	private static final Color TEXT_PANE_COLOR_STANDARD = new Color(235, 235, 235);

	/**
	 * The color of the rectangle surrounding the tooltips. (dark style)
	 */
	private static final Color TOOLTIP_FILL_COLOR_DARK = new Color(20, 20, 20);

	/**
	 * The color of the rectangle surrounding the tooltips. (standard style)
	 */
	private static final Color TOOLTIP_FILL_COLOR_STANDARD = new Color(230, 230, 230);

	/**
	 * The color used for the tree panel. (dark style)
	 */
	private static final Color TREEPANEL_COLOR_DARK = new Color(0, 0, 0);

	/**
	 * The color used for the tree panel. (standard style)
	 */
	private static final Color TREEPANEL_COLOR_STANDARD = new Color(255, 255, 255);

	/**
	 * The color of an edge which has not yet been visited by robot. (dark
	 * style)
	 */
	private static final Color UNVISITED_EDGE_COLOR_DARK = new Color(69, 69, 69);

	/**
	 * The color of an edge which has not yet been visited by robot. (standard
	 * style)
	 */
	private static final Color UNVISITED_EDGE_COLOR_STANDARD = new Color(201, 201, 201);

	/**
	 * The color of a node which has not yet been visited by a robot. (dark
	 * style)
	 */
	private static final Color UNVISITED_NODE_COLOR_DARK = new Color(69, 69, 69);

	/**
	 * The color of a node which has not yet been visited by a robot. (standard
	 * style)
	 */
	private static final Color UNVISITED_NODE_COLOR_STANDARD = new Color(201, 201, 201);

	/**
	 * The color of an edge which has been visited by a robot. (dark style)
	 */
	private static final Color VISITED_EDGE_COLOR_DARK = new Color(14, 69, 3);

	/**
	 * The color of an edge which has been visited by a robot. (standard style)
	 */
	private static final Color VISITED_EDGE_COLOR_STANDARD = new Color(255, 184, 136);

	/**
	 * The color of a node which has been visited by a robot. (dark style)
	 */
	private static final Color VISITED_NODE_COLOR_DARK = new Color(14, 69, 3);

	/**
	 * The color of a node which has been visited by a robot. (standard style)
	 */
	private static final Color VISITED_NODE_COLOR_STANDARD = new Color(245, 99, 99);

	/**
	 * The current style of this manager.
	 */
	private EStyle mCurrentStyle;

	/**
	 * Constructs a new StyleManager which is able to return the correct color
	 * based on the current style.
	 * 
	 * @param initialStyle
	 *            The initial style for this manager.
	 */
	public StyleManager(final EStyle initialStyle) {
		this.mCurrentStyle = initialStyle;
	}

	/**
	 * Changes the style for this manager.
	 * 
	 * @param styleToSet
	 *            The new style for this manager.
	 */
	public void changeStyle(final EStyle styleToSet) {
		this.mCurrentStyle = styleToSet;
	}

	/**
	 * Gets the color for the buttons on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getButtonColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.BUTTON_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.BUTTON_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the default color for the fonts on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getDefaultFontColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.DEFAULT_FONT_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.DEFAULT_FONT_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the color for the fringes on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getFringeColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.FRINGE_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.FRINGE_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the color for the highlighting on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getHighlightingColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.HIGHLIGHT_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.HIGHLIGHT_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the color for the option panel on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getOptionPanelColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.OPTIONPANEL_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.OPTIONPANEL_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the color for the separators on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getSeparatorColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.SEPARATOR_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.SEPARATOR_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the color for the slider on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getSliderColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.SLIDER_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.SLIDER_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the color for the text area on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getTextAreaColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.TEXT_AREA_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.TEXT_AREA_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the color for the text pane on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getTextPaneColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.TEXT_PANE_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.TEXT_PANE_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the color for the tool tips on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getToolTipFillColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.TOOLTIP_FILL_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.TOOLTIP_FILL_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the color for the tree panel on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getTreepanelColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.TREEPANEL_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.TREEPANEL_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the color for the unvisited edges on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getUnvisitedEdgeColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.UNVISITED_EDGE_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.UNVISITED_EDGE_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the color for the unvisited nodes on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getUnvisitedNodeColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.UNVISITED_NODE_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.UNVISITED_NODE_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the color for the visited edges on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getVisitedEdgeColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.VISITED_EDGE_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.VISITED_EDGE_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}

	/**
	 * Gets the color for the visited nodes on the GUI.
	 * 
	 * @return The color mentioned.
	 */
	public Color getVisitedNodeColor() {
		if (this.mCurrentStyle == EStyle.STANDARD) {
			return StyleManager.VISITED_NODE_COLOR_STANDARD;
		} else if (this.mCurrentStyle == EStyle.DARK) {
			return StyleManager.VISITED_NODE_COLOR_DARK;
		}

		// Couldn't find a color for the given style.
		throw new AssertionError();
	}
}
