class treenode{
    int value;
    treenode left,right;
    treenode(int value)
    {
        this.value=value;
        left=right=null;
    }
}
public class treetraversal1
{
    public void inorder(treenode root)
    {
        if(root==null)
        return;
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    public void preorder(treenode root)
    {
        if(root==null)
        return;
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);                    
    }
    public void postorder(treenode root)
    {
        if(root==null)
        return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }
    public static void main(String[]args)
{
    treenode root=new treenode(4);
    root.left=new treenode(2);
    root.right=new treenode(5);
    root.left.left=new treenode(3);
    root.right.left=new treenode(7);
    root.right.right=new treenode(6);
    root.left.left.right=new treenode(9);
    root.right.right.left=new treenode(8);
    root.left.left.right.left=new treenode(1);
    treetraversal1 tree=new treetraversal1();
    System.out.print("inorder:");
    tree.inorder(root);
    System.out.println(" ");
    System.out.print("postorder:");
    tree.postorder(root);
    System.out.println(" ");
    System.out.print("preorder:");
   tree.preorder(root);     
    }
}


