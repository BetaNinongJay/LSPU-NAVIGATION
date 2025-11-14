/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bueta_cosico_lspunavigation;

import java.awt.Color;



/**
 *
 * @author Shinozaki
 */
public class ThemeManager {
    public static String currentTheme = "Default";

    public static Color headerColor;
    public static Color bodyColor;
    public static Color bodyColor1;
    public static Color footerColor;
    public static Color textColor;
    public static Color whitetextColor;
    public static Color smalltextColor;
    public static Color hoverColor;
    public static Color btnColor;
    

    public static void applyTheme(String themeName) {
        if (themeName == null || themeName.trim().isEmpty()) themeName = "Default";
        currentTheme = themeName;

        switch (themeName) {
            case "Default" -> {
                textColor = new Color(1, 51, 153);
                whitetextColor = Color.WHITE;
                headerColor = new Color(1, 51, 153);
                bodyColor = new Color(245, 245, 245);
                footerColor = new Color(1, 51, 153);
                hoverColor = bodyColor.brighter();
                btnColor = new Color(1, 51, 153);
            }
            case "Light Blue" -> {
                textColor = new Color(37, 150, 190);
                smalltextColor = new Color(37, 150, 190);
                headerColor = new Color(37, 150, 190);
                bodyColor = new Color(203, 245, 233);
                bodyColor1 = new Color(211, 235, 234);
                footerColor = new Color(37, 150, 190);
                hoverColor = bodyColor.brighter();
                btnColor = new Color(37, 150, 190);
            }
            case "Night Mode" -> {
                textColor = Color.WHITE;
                smalltextColor = Color.WHITE;
                headerColor = new Color(34, 34, 34);
                bodyColor = new Color(16, 18, 17);
                //bodyColor1 = Color.BLACK;
                footerColor = new Color(34, 34, 34);
                hoverColor = bodyColor.brighter();
                btnColor = Color.BLACK;
            }
            case "Nature" -> {
                textColor = new Color(46, 139, 87);
                smalltextColor = new Color(46, 139, 87);
                headerColor = new Color(46, 139, 87);
                bodyColor = new Color(199, 242, 220);
                bodyColor1 = new Color(219, 237, 190);
                footerColor = new Color(46, 139, 87);
                hoverColor = bodyColor.brighter();
                btnColor = new Color(46, 139, 87);
            }
            case "Sunset" -> {
                textColor = new Color(255, 94, 77);
                smalltextColor = new Color(255, 94, 77);
                headerColor = new Color(255, 94, 77);
                bodyColor = new Color(242, 220, 203);
                bodyColor1 = new Color(237, 200, 185);
                footerColor = new Color(255, 140, 105);
                hoverColor = bodyColor.brighter();
                btnColor = new Color(255, 94, 77);
            }
            default -> {
                textColor = Color.BLACK;
                headerColor = new Color(220, 220, 220);
                bodyColor = new Color(245, 245, 245);
                footerColor = new Color(220, 220, 220);
                hoverColor = bodyColor.brighter();
            }
        }
    }
}
