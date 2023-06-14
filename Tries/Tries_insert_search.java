package Tries;

import java.util.*;
class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
    TrieNode(){
        isEnd=false;
        for(int i=0;i<26;i++){
            children[i]=null;
        }
    }
    public static boolean search(TrieNode root,String target){
        TrieNode crawl=root;
        int index;
        for(int i=0;i<target.length();i++){
            index=target.charAt(i)-'a';
            if(crawl.children[index]==null){
                return false;
            }
            crawl=crawl.children[index];
        }
        return crawl.isEnd=true;
    }
    public static void insert(TrieNode root,String word){
        TrieNode crawl=root;
        int index;
        for(int i=0;i<word.length();i++){
            index=word.charAt(i)-'a';
            if(crawl.children[index]==null){
                crawl.children[index]=new TrieNode();
            }
            crawl=crawl.children[index];
        }
    }
}
public class Tries_insert_search{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] words = new String[n];
        for(int i=0;i<n;i++){
            words[i]=in.next();
        }
        String target=in.next();
        TrieNode root=new TrieNode();
        for(String word: words){
            TrieNode.insert(root,word);
        }
        System.out.println(TrieNode.search(root,target));
    }
}
