/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.waruwucoder.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author Waruwu
 */
public class KeywordExtractorController {

    private static String fileName = "";
    private static final String fileStopword = "E:\\File TA\\stopword.txt";

    public KeywordExtractorController() {

    }

    public static String getFileName() {

        return fileName;
    }
    
    public static void setFileName(String path){
        fileName = path;
    }

    public static String getFileStopword() {
        return fileStopword;
    }

    public FileReader readFile(String fileName) throws FileNotFoundException {
        FileReader fr = null;
        fr = new FileReader(fileName);
        return fr;
    }

    public static int countWords(String s) {
        String trim = s.trim();
        if (trim.isEmpty()) {
            return 0;
        }
        return trim.split("\\s+").length;
    }

    /**
     * @param doc list of strings
     * @param term String represents a term
     * @return term frequency of term in document
     */
    public double tf(String doc, String term) {
        double result = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {

            lastIndex = doc.indexOf(term, lastIndex);

            if (lastIndex != -1) {
                result++;
                lastIndex += term.length();
            }
        }
        int size = countWords(doc);
        //System.out.println("term : " +term +"tf : " + result);
        return result;
    }

    /**
     * @param docs list of list of strings represents the dataset
     * @param term String represents a term
     * @return the inverse term frequency of term in documents
     */
    public double idf(ArrayList<String> docs, String term) {
        double n = 0;
       
        for (String sentence : docs) {
            if(sentence.contains(term)) n++;
        }
        //System.out.println("term : " +term +"idf : " + Math.log(docs.size()/n));
        return Math.log10(docs.size() / n);
        //return 0;
    }

    /**
     * @param doc a text document
     * @param docs all documents
     * @param term term
     * @return the TF-IDF of term
      */
    public double tfIdf(String doc, ArrayList<String> docs, String term) {
        return tf(doc, term) * idf(docs, term);
    }

    public static int countStringInSentence(String str, String sentence) {
        int result = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {

            lastIndex = sentence.indexOf(str, lastIndex);

            if (lastIndex != -1) {
                result++;
                lastIndex += str.length();
            }
        }

        return result;
    }

}
