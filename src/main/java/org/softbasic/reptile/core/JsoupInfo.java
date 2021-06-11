package org.softbasic.reptile.core;

import org.jsoup.nodes.Document;

/**
 * Jsoup请求的返回信息
 * @author Administrator
 *
 */
public class JsoupInfo {
	private Boolean isSuccess;
	private String errorInfo;
	private Document document;
	public Boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}

}
