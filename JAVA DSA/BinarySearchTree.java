class Tree
{
    int val;
    Tree left ;
    Tree right;
    Tree(int val)
    {
        this.val = val;
        this.left = null;
        this.right= null;
    }
}

public class BinarySearchTree {
    Tree root =null ,temp =root,prev=temp;

    void insert(int val)
    {
        Tree newnode = new Tree(val);
        if(root == null)
        {
            root = newnode ;
            temp = root;
        }else{
            while(temp!=null)
            {
                if(val>temp.val)
                {
                    prev = temp;
                    temp = temp.right;
                }else{
                    prev = temp ;
                    temp = temp.left;
                }

            }
            if(val>prev.val)
            {
                prev.right = newnode;
            }else{
                prev.left = newnode;
            }
        }
    }

    void inorder(Tree temp)
    {
        if(temp!=null)
        {
            inorder(temp.left);
            System.out.println("The value is : "+temp.val);
            inorder(temp.right);
        }
    }
    void preorder(Tree temp)
    {
        if(temp!=null)
        {
            System.out.println("The value is : "+temp.val);
            preorder(temp.left);
            preorder(temp.right);
        }
    }
    void postorder(Tree temp)
    {
        if(temp!=null)
        {
            postorder(temp.left);
            postorder(temp.right);
            System.out.println("The value is : "+temp.val);
        }
    }
    boolean search(Tree temp,int key)
    {
        if(temp == null )
        {
            return false;
        }
        else if(temp.val == key)
        {
            return true;
        }else if(key>temp.val)
        {
            return search(temp.right,key);
        }else{
            return search(temp.left,key);
        }
    }
}
