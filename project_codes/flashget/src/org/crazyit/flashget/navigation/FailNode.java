package org.crazyit.flashget.navigation;

import javax.swing.ImageIcon;

import org.crazyit.flashget.util.ImageUtil;

/**
 * ����ʧ�ܵ����ڵ�
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010
 * <br>This program is protected by copyright laws.
 */
public class FailNode implements DownloadNode {

	public ImageIcon getImageIcon() {
		return ImageUtil.FAIL_NODE_IMAGE;
	}

	public String getText() {
		return "����ʧ��";
	}

}
