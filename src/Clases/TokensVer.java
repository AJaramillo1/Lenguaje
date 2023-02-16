/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author DELL LATITUDE E7440
 */
public class TokensVer
{

    String[] toks =
    {
        " ", "public", "static", "void", "main", "for", "do", "while", "si", "sino", "false", "true", "case", "catch", "class", "implements", "import",
        "private", "protected", "return", "break", "package", "null", "new", "switch", "try", "Scanner", "System", "out", "println", "final", "this", "extends",
        "throws", "dinal", "long", "extends", "enum", "args", "sin", "atan", "cos", "tan", "set", "get", "Object", "javax", "java", "jLabel", "swing", "center",
        "JTextComponent", "toString", "Document", "FileOutputStream", "length", "Close", "Setter", "Getter", "Integer", "parseInt"
    };

    public int verifir(String txt) throws IOException
    {
        int s = 0;
//        System.out.println(txt);
        for (int i = 0; i < toks.length; i++)
        {
            if (txt.equals(toks[i]))
            {
                s = i;
                break;
            }
        }
        return s;
    }

    public int verSep(String txt)
    {
        if (txt.equals("Ent") || txt.equals("Dec") || txt.equals("Char") || txt.equals("String"))
        {
            return 99;
        } else if ("&&".equals(txt) || "||".equals(txt))
        {
            return 61;
        } else if ("!=".equals(txt))
        {
            return 63;
//                                System.out.println(s1);
        } else if ("=".equals(txt))
        {
            return 68;
//                                System.out.println(s1);
        } else if ("==".equals(txt) || "<".equals(txt) || ">".equals(txt) || "<=".equals(txt) || ">=".equals(txt))
        {
            return 64;
//                                System.out.println(s1);
        } else if ("+".equals(txt) || "-".equals(txt) || "*".equals(txt) || "/".equals(txt) || "%".equals(txt))
        {
            return 67;
//                                System.out.println(s1);
        } else if ("{".equals(txt))
        {
            return 78;
        } else if ("}".equals(txt))
        {
            return 79;
        } else if (".".equals(txt))
        {
            return 80;
        } else if ("#".equals(txt))
        {
            return 82;
        } else if ("$".equals(txt))
        {
            return 83;
        } else if ("(".equals(txt))
        {
            return 84;
        } else if (")".equals(txt))
        {
            return 85;
        } else if ("_".equals(txt))
        {
            return 83;
        } else if (";".equals(txt))
        {
            return 86;
        } else if ("[".equals(txt))
        {
            return 89;
        } else if ("]".equals(txt))
        {
            return 90;
        } else if (txt.equals('"'))
        {
            return 88;
        } else if (txt.equals("'"))
        {
            return 89;
        } else
        {
            return 0;
        }
    }
}
