/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author root
 */
public class MainClass {

    public static void main(String[] args) {
        Tree t1 = new Tree(4); 
        t1.add(t1.root, 2);
        t1.add(t1.root, 1);
        t1.add(t1.root, 3);
        t1.add(t1.root, 8);
        t1.Inorder(t1.root);
    }
    
}
