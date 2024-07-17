package org.crazyit.flashget.navigation;

import javax.swing.ImageIcon;

import org.crazyit.flashget.util.ImageUtil;

/**
 * ������ɽڵ�
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010
 * <br>This program is protected by copyright laws.
 */
public class FinishNode implements DownloadNode {

	public ImageIcon getImageIcon() {
		return ImageUtil.FINISH_NODE_IMAGE;
	}

	public String getText() {
		return "�������";
	}

}