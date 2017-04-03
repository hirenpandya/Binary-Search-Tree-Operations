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
public class Tree {

    Node root;
    
    public Tree(int data){
        root = new Node(data);
    }
    
    public void add(Node current, int data){
        if(current.left==null && data<current.data){
            Node n = new Node(data);
            current.left = n;
        } else if(current.right==null && data>current.data){
            Node n = new Node(data);
            current.right = n;
        } else {
            if(data<current.data){
                add(current.left,data);
            } else{
                add(current.right, data);
            }
        }
    }
    
    public void remove(Node current, int data){
        if(current.data==data){
            Node n = pickNode(current);
            current.data = n.data;
            n = null;
        } else {
            if(current.left==null && current.right==null){
                current = null;
            } else if(current.left!=null && current.right==null){
                remove(current.left, data);
            } else if (current.left==null && current.right!=null){
                remove(current.right, data);
            } else {
                if(data<current.data){
                    remove(current.left, data); 
                } else{
                    remove(current.right, data);
                }
            }
        }
    }
    
    public Node pickNode(Node current){
        Node curr = new Node();
        if(current.left==null && current.right==null){
            curr = current;
        } else if(current.left!=null){
            curr = current.left;
            while(curr.right!=null){
                curr = curr.right;
            }
        } else if(current.right!=null){
            curr = current.right;
            while(curr.left!=null){
                curr = curr.left;
            }
        }
        
        return curr;
    }
    
    public void Inorder(Node current){
        if(current==null){
            return;
        }
        Inorder(current.left);
        System.out.println(current.data);
        Inorder(current.right);
    }
    
}
