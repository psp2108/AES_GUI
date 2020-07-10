/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

/**
 *
 * @author intern2
 */
public class log {

    private static int maximumClassName = 40;
    private static int maximumLineNumberLength = 6;
    private static final int ToDisplay = 0b111111;   //tmedis

    private static String addPadding(String tag) {
        while (tag.length() < maximumClassName) {
            tag += " ";
        }
        return tag;
    }

    private static String addLinePadding(String line) {
        while (line.length() < maximumLineNumberLength) {
            line += " ";
        }
        return line;
    }

    /**
     * To display Selenium error
     *
     * @param obj status
     * @param currentThread Current Class Thread Object
     * @param tag class name
     */
    public static void t(String tag, Thread currentThread, Object obj) {
        if ((ToDisplay & 0b100000) == 0b100000) {
            System.out.println("TARGET_APP : " + addPadding(tag) + addLinePadding("(" + currentThread.getStackTrace()[2].getLineNumber() + ")") + " -> " + obj);
        }
    }

    /**
     * To Log Message
     *
     * @param obj simple message
     * @param currentThread Current Class Thread Object
     * @param tag class name
     */
    public static void m(String tag, Thread currentThread, Object obj) {
        if ((ToDisplay & 0b10000) == 0b10000) {
            System.out.println("MESSAGE    : " + addPadding(tag) + addLinePadding("(" + currentThread.getStackTrace()[2].getLineNumber() + ")") + " -> " + obj);
        }
    }

    /**
     * To Log Error
     *
     * @param obj error message
     * @param currentThread Current Class Thread Object
     * @param tag class name
     */
    public static void e(String tag, Thread currentThread, Object obj) {
        if ((ToDisplay & 0b1000) == 0b1000) {
            System.out.println("ERROR      : " + addPadding(tag) + addLinePadding("(" + currentThread.getStackTrace()[2].getLineNumber() + ")") + " -> " + obj);
        }
    }

    /**
     * To Log Debugging
     *
     * @param obj debugging message
     * @param currentThread Current Class Thread Object
     * @param tag class name
     */
    public static void d(String tag, Thread currentThread, Object obj) {
        if ((ToDisplay & 0b100) == 0b100) {
            System.out.println("DEBUG      : " + addPadding(tag) + addLinePadding("(" + currentThread.getStackTrace()[2].getLineNumber() + ")") + " -> " + obj);
        }
    }

    /**
     * To Log Info
     *
     * @param obj info
     * @param currentThread Current Class Thread Object
     * @param tag class name
     */
    public static void i(String tag, Thread currentThread, Object obj) {
        if ((ToDisplay & 0b10) == 0b10) {
            System.out.println("INFO       : " + addPadding(tag) + addLinePadding("(" + currentThread.getStackTrace()[2].getLineNumber() + ")") + " -> " + obj);
        }
    }

    /**
     * To Status Info
     *
     * @param obj status
     * @param currentThread Current Class Thread Object
     * @param tag class name
     */
    public static void s(String tag, Thread currentThread, Object obj) {
        if ((ToDisplay & 0b1) == 0b1) {
            System.out.println("STATUS     : " + addPadding(tag) + addLinePadding("(" + currentThread.getStackTrace()[2].getLineNumber() + ")") + " -> " + obj);
        }
    }
}
