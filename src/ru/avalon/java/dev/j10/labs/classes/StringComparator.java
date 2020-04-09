/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.classes;

import java.util.Comparator;

/**
 *
 * @author eag
 */
public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return -str1.compareTo(str2);
    }
    
    
    
}
