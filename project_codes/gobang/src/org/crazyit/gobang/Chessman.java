package org.crazyit.gobang;

/**
 * ����ö����
 *
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010
 * <br>This program is protected by copyright laws.
 */
public enum Chessman {
	BLACK("��"), WHITE("��");
	private String chessman;

	/**
	 * ˽�й�����
	 */
	private Chessman(String chessman) {
		this.chessman = chessman;
	}

	/**
	 * @return String ������߰���
	 */
	public String getChessman() {
		return this.chessman;
	}
}