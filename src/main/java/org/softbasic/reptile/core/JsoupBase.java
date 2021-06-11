package org.softbasic.reptile.core;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.Map;

/**
 * Created by LCR on 2018/11/12.
 */
public class JsoupBase {
    private final static int TIMEOUT = 60000;//毫秒

    /*** POST请求,HTML
     * @param url 请求地址
     * @param data 请求参数
     * @return JsoupInfo
     */
    public static JsoupInfo post(String url, Map<String, String> data) {
        JsoupInfo jsoupInfo = new JsoupInfo();
        try {
            Document doc = Jsoup
                    .connect(url)
                    .ignoreContentType(true)
                    .data(data)
                    .timeout(TIMEOUT)
                    .post();
            jsoupInfo.setIsSuccess(true);
            jsoupInfo.setDocument(doc);
        } catch (Exception e) {
            jsoupInfo.setIsSuccess(false);
            jsoupInfo.setErrorInfo(e.getMessage());
            e.printStackTrace();
        }
        return jsoupInfo;
    }

    /*** GET请求,HTML
     * @param url 请求地址
     * @param data 请求参数
     * @return JsoupInfo
     */
    public static JsoupInfo get(String url, Map<String, String> data) {
        JsoupInfo jsoupInfo = new JsoupInfo();
        try {
            Document doc = Jsoup
                    .connect(url)
                    .ignoreContentType(true)
                    .data(data)
                    .timeout(TIMEOUT)
                    .get();
            jsoupInfo.setIsSuccess(true);
            jsoupInfo.setDocument(doc);
        } catch (Exception e) {
            jsoupInfo.setIsSuccess(false);
            jsoupInfo.setErrorInfo(e.getMessage());
            e.printStackTrace();
        }
        return jsoupInfo;
    }

    /*** POST请求,JSON
     * @param url 请求地址
     * @param data 请求参数
     * @return JsoupInfo
     */
    public static JsoupInfo ajaxPost(String url, String data) {
        JsoupInfo jsoupInfo = new JsoupInfo();
        try {
            Document doc = Jsoup.connect(url)
                    .requestBody(data)
                    .ignoreContentType(true)
                    .header("Content-Type", "application/json")
                    .timeout(TIMEOUT)
                    .post();
            jsoupInfo.setIsSuccess(true);
            jsoupInfo.setDocument(doc);
        } catch (Exception e) {
            jsoupInfo.setIsSuccess(false);
            jsoupInfo.setErrorInfo(e.getMessage());
            e.printStackTrace();
        }
        return jsoupInfo;
    }

    /*** GET请求,JSON
     * @param url 请求地址
     * @param data 请求参数
     * @return JsoupInfo
     */
    public static JsoupInfo ajaxGet(String url, String data) {
        JsoupInfo jsoupInfo = new JsoupInfo();
        try {
            Document doc = Jsoup.connect(url)
                    .requestBody(data)
                    .header("Content-Type", "application/json")
                    .timeout(TIMEOUT)
                    .get();
            jsoupInfo.setIsSuccess(true);
            jsoupInfo.setDocument(doc);
        } catch (Exception e) {
            jsoupInfo.setIsSuccess(false);
            jsoupInfo.setErrorInfo(e.getMessage());
            e.printStackTrace();
        }
        return jsoupInfo;
    }


    /*** POST请求,HTML
     * @param url 请求地址
     * @param data 请求参数
     * @param headers headers参数
     * @param cookies cookies参数
     * @return JsoupInfo
     */
    public static JsoupInfo post(String url, Map<String, String> data, Map<String, String> headers, Map<String, String> cookies) {
        JsoupInfo jsoupInfo = new JsoupInfo();
        try {
            Document doc = Jsoup
                    .connect(url)
                    .ignoreContentType(true)
                    .data(data)
                    .headers(headers)
                    .cookies(cookies)
                    .timeout(TIMEOUT)
                    .post();
            jsoupInfo.setIsSuccess(true);
            jsoupInfo.setDocument(doc);
        } catch (Exception e) {
            jsoupInfo.setIsSuccess(false);
            jsoupInfo.setErrorInfo(e.getMessage());
            e.printStackTrace();
        }
        return jsoupInfo;
    }

    /*** GET请求,HTML
     * @param url 请求地址
     * @param data 请求参数
     * @param headers headers参数
     * @param cookies cookies参数
     * @return JsoupInfo
     */
    public static JsoupInfo get(String url, Map<String, String> data, Map<String, String> headers, Map<String, String> cookies) {
        JsoupInfo jsoupInfo = new JsoupInfo();
        try {
            Document doc = Jsoup
                    .connect(url)
                    .ignoreContentType(true)
                    .data(data)
                    .headers(headers)
                    .cookies(cookies)
                    .timeout(TIMEOUT)
                    .get();
            jsoupInfo.setIsSuccess(true);
            jsoupInfo.setDocument(doc);
        } catch (Exception e) {
            jsoupInfo.setIsSuccess(false);
            jsoupInfo.setErrorInfo(e.getMessage());
            e.printStackTrace();
        }
        return jsoupInfo;
    }

    /*** POST请求,JSON
     * @param url 请求地址
     * @param data 请求参数
     * @param headers headers参数
     * @param cookies cookies参数
     * @return JsoupInfo
     */
    public static JsoupInfo ajaxPost(String url, String data, Map<String, String> headers, Map<String, String> cookies) {
        JsoupInfo jsoupInfo = new JsoupInfo();
        try {
            Document doc = Jsoup.connect(url)
                    .requestBody(data)
                    .header("Content-Type", "application/json")
                    .headers(headers)
                    .cookies(cookies)
                    .timeout(TIMEOUT)
                    .post();
            jsoupInfo.setIsSuccess(true);
            jsoupInfo.setDocument(doc);
        } catch (Exception e) {
            jsoupInfo.setIsSuccess(false);
            jsoupInfo.setErrorInfo(e.getMessage());
            e.printStackTrace();
        }
        return jsoupInfo;
    }

    /***GET请求, JSON
     * @param url 请求地址
     * @param data 请求参数
     * @param headers headers参数
     * @param cookies cookies参数
     * @return JsoupInfo
     */
    public static JsoupInfo ajaxGet(String url, String data, Map<String, String> headers, Map<String, String> cookies) {
        JsoupInfo jsoupInfo = new JsoupInfo();
        try {
            Document doc = Jsoup.connect(url)
                    .requestBody(data)
                    .header("Content-Type", "application/json")
                    .headers(headers)
                    .cookies(cookies)
                    .timeout(TIMEOUT)
                    .get();
            jsoupInfo.setIsSuccess(true);
            jsoupInfo.setDocument(doc);
        } catch (Exception e) {
            jsoupInfo.setIsSuccess(false);
            jsoupInfo.setErrorInfo(e.getMessage());
            e.printStackTrace();
        }
        return jsoupInfo;
    }


    /**
     * Response对象返回值
     * @param url
     * @param data
     * @return
     * @throws Exception
     */
    public static Connection.Response execute(String url, Map<String, String> data) throws Exception {
        try {
            return Jsoup.connect(url).ignoreContentType(true).data(data).timeout(TIMEOUT).method(Connection.Method.POST).execute();
        } catch (Exception e) {
            throw e;
        }
    }


}
