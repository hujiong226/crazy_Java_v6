package org.crazyit.gobang;

/**
 * 棋子枚举类
 *
 * @version  1.0
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br>Copyright (C), 2009-2010
 * <br>This program is protected by copyright laws.
 */
public enum Chessman {
	BLACK("●"), WHITE("○");
	private String chessman;

	/**
	 * 私有构造器
	 */
	private Chessman(String chessman) {
		this.chessman = chessman;
	}

	/**
	 * @return String 黑棋或者白棋
	 */
	public String getChessman() {
		return this.chessman;
	}
}