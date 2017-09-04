/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author Talmadge Glenn
 */
public class TreeExercise extends TreeNode
{
    public static void main(String args[])
    {
        String[] myStringsChars = new String[26];
        int level = 0;
        
        for(int i = 0; i < 26; i++)
        {
            myStringsChars[i] = new String(Character.toChars(i+65));
            System.out.println(myStringsChars[i]);
        }
        
        // create the Tree as a linked structure from the array myStringChars
        // the Strings are stored using the representation for trees as arrays in the book
        // (e.g. for an element i, the left child is stored in position 2*i + 1, right child is 
        // on position 2*(i + 1). Also specify the level of a TreeNode
        
        LinkedList<TreeNode> TreeTal = new LinkedList<>();
        TreeNode[] charArray = new TreeNode[TreeTal.size()];
        TreeNode<String> parent = null;
        
                       
        for (int i = 0; i < myStringsChars.length; i++)
        {
            
            if (i == 0)
            {
                parent = new TreeNode<>("A", null);
                parent.setLevel(level);
                level++;
            }
            else
            {
            //set level
                if((i == 3)||(i == 7)||(i == 15))
                {
                    level++;
                }
                if(i%2 == 1)
                {
                    parent = new TreeNode(myStringsChars[i], TreeTal.get((i-1)/2));
                    parent.getParent().setLeftChild(parent);
                    parent.setLevel(level);
                    
                }
                else
                {
                    parent = new TreeNode(myStringsChars[i], TreeTal.get(((i-2)/2)));
                    //System.out.println("i: " + i);
                    parent.getParent().setRightChild(parent);
                    parent.setLevel(level);
                }               
            }
            
            TreeTal.add(parent);
        }
        
        
        //create a traversal by levels and print as you traverse to check that the creation of the tree has happened correctly
        for (int i = 0; i < charArray.length; i++)
        {
            System.out.print(charArray[i].getContents());
            if (i==0||(i==2)||(i==6)||(i==14))
            {
                System.out.println();
            }
        } 
        
        
        // create the code that asks the user for two letters in uppercase and searches for the nodes in the tree that contain
        // such letters  
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter two letters in Uppercase. These letters will be searched in the tree: "); 
        
        //first letter
        System.out.println("\nYour first letter: ");
        String letter1 = myScan.nextLine();
        
        //second letter         
        System.out.println("\nYour second letter: ");
        String letter2 = myScan.nextLine();
        
        System.out.println("\nYou have selected letters: " + letter1 + "," + letter2);
        
        parent = TreeTal.get(0);
        TreeNode firstNode = parent.findNodeOnTree(letter1);
        TreeNode secondNode = parent.findNodeOnTree(letter2);
        
        System.out.println(firstNode.getContents());
        System.out.println(secondNode.getContents());
        
   
          


        //create the code that calls the static method below and finds the lowest common ancestor of two TreeNodes
        
        TreeNode commonAncestor = findLowestCommonAncestor(firstNode, secondNode);
        
        if(commonAncestor != null)
        {
            System.out.println(commonAncestor.getContents());
        }    
        if(commonAncestor == null)
        {
            System.out.println("Method Does Not Work.");
            //System.out.println(commonAncestor);
        }
       
    }
    
    public static TreeNode findLowestCommonAncestor(TreeNode node1, TreeNode node2)
    {
        // Given two nodes on the same tree, this method should return the lowest common ancestor.
        // if no common ancestor is found, this method returns null .       
        Set<TreeNode> node1Parents = new HashSet<>();
        Set<TreeNode> node2Parents = new HashSet<>();
                
        do
        {
            if (node1 != null)
            {
                node1Parents.add(node1.getParent()); 
                node1 = node1.getParent();
            }
            if (node2 != null)
            {
                node2Parents.add(node2.getParent()); 
                node2 = node2.getParent();
            }
            if (node1Parents.contains(node1) && node2Parents.contains(node1))
            {
              return node1;
            }
            if(node1Parents.contains(node2) && node2Parents.contains(node2))
            {
              return node2;
            }          
        } while(node1 != null || node2 != null);   
        
            return null;                
    } 
        
}



