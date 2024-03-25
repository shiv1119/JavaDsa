import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    String data;
    TreeNode leftChild;
    TreeNode rightChild;
    public TreeNode(String value) {
        data = value;
        leftChild = null;
        rightChild = null;
    }
}
public class Tree1 {

    public static void preOrderTraversal(TreeNode rootNode){
        if (rootNode == null){
            return;
        }
        System.out.println(rootNode.data);
        preOrderTraversal(rootNode.leftChild);
        preOrderTraversal(rootNode.rightChild);
    }

    public static void inOrderTraversal(TreeNode rootNode){
        if (rootNode == null){
            return;
        }
        inOrderTraversal(rootNode.leftChild);
        System.out.println(rootNode.data);
        inOrderTraversal(rootNode.rightChild);
    }

    public static void postOrderTraversal(TreeNode rootNode){
        if(rootNode == null){
            return;
        }
        postOrderTraversal(rootNode.leftChild);
        postOrderTraversal(rootNode.rightChild);
        System.out.println(rootNode.data);
    }

    public static void levelOrderTraversal(TreeNode rootNode){
        if(rootNode == null){
            return;
        } else {
            Queue<TreeNode> customQueue = new LinkedList<TreeNode>();
            customQueue.add(rootNode);
            while (!customQueue.isEmpty()){
                TreeNode root = customQueue.remove();
                System.out.println(root.data);
                if(root.leftChild != null){
                    customQueue.add(root.leftChild);
                }
                if(root.rightChild != null){
                    customQueue.add(root.rightChild);
                }
            }
        }

    }

    public static String searchBT(TreeNode rootNode, String nodeValue){
        if(rootNode == null){
            return "The Binary Tree is null";
        } else {
            Queue<TreeNode> customeQueue = new LinkedList<TreeNode>();
            customeQueue.offer(rootNode);
            while (!customeQueue.isEmpty()){
                TreeNode root = customeQueue.poll();
                if(root.data == nodeValue){
                    return "Success the Node exists in Binary Tree";
                }
                if(root.leftChild != null){
                    customeQueue.offer(root.leftChild);
                }
                if(root.rightChild != null){
                    customeQueue.offer(root.rightChild);
                }
            }
        }

        return "Node is not found in Binary Tree";
    }

    public static boolean insertNode(TreeNode rootNode, TreeNode newNode){
        if(rootNode == null){
            rootNode = newNode;
            return true;
        } else {
            Queue<TreeNode> customQueue = new LinkedList<TreeNode>();
            customQueue.offer(rootNode);
            while(!customQueue.isEmpty()){
                TreeNode root = customQueue.poll();
                if(root.leftChild != null){
                    customQueue.offer(root.leftChild);
                } else {
                    root.leftChild = newNode;
                    return true;
                }

                if(root.rightChild != null){
                    customQueue.offer(root.rightChild);
                } else {
                    root.rightChild = newNode;
                    return true;
                }
            }
        }
        return false;
    }

    public static TreeNode getDeepestNode(TreeNode rootNode){
        if(rootNode == null){
            return null;
        } else {
            Queue<TreeNode> customeQueue = new LinkedList<TreeNode>();
            customeQueue.offer(rootNode);
            TreeNode root = null;
            while(!customeQueue.isEmpty()){
                root = customeQueue.poll();
                if(root.leftChild != null){
                    customeQueue.offer(root.leftChild);
                }
                if(root.rightChild != null){
                    customeQueue.offer(root.rightChild);
                }
            }
            return root;
        }
    }

    public static void deleteDeepestNode(TreeNode rootNode, TreeNode dNode){
        if(rootNode == null){
            return;
        } else {
            Queue<TreeNode> customeQueue = new LinkedList<TreeNode>();
            customeQueue.offer(rootNode);
            TreeNode root = null;
            while(!customeQueue.isEmpty()){
                root = customeQueue.poll();
                if(root == dNode){
                    root.data = null;
                    return;
                }
                if(root.rightChild != null){
                    if(root.rightChild == dNode){
                        root.rightChild = null;
                        return;
                    } else {
                        customeQueue.offer(root.rightChild);
                    }
                }
                if(root.leftChild != null){
                    if(root.leftChild == dNode){
                        root.leftChild = null;
                        return;
                    } else {
                        customeQueue.offer(root.leftChild);
                    }
                }
            }
        }
    }

    public static String deleteNode(TreeNode rootNode, String node){
        if(rootNode == null){
            return "The BT does not exist";
        } else {
            Queue<TreeNode> customQueue = new LinkedList<TreeNode>();
            customQueue.offer(rootNode);
            while (!customQueue.isEmpty()){
                TreeNode root = customQueue.poll();
                if(root.data == node){
                    TreeNode dNode = getDeepestNode(rootNode);
                    root.data = dNode.data;
                    deleteDeepestNode(rootNode, dNode);
                    return "The Node deleted";
                }

                if(root.leftChild != null){
                    customQueue.offer(root.leftChild);
                }

                if(root.rightChild != null){
                    customQueue.offer(root.rightChild);
                }
            }
            return "Failed to delete";
        }
    }

    public static void deleteAllNode(TreeNode rootNode){
        if(rootNode == null){
            return;
        }
        rootNode.data = null;
        rootNode.leftChild = null;
        rootNode.rightChild = null;
    }


    public static void main(String[] args){
        TreeNode newBT = new TreeNode("Drink");
        TreeNode leftChild = new TreeNode("Hot");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        leftChild.leftChild = tea;
        leftChild.rightChild = coffee;
        TreeNode rightChild = new TreeNode("Cold");
        TreeNode mountainDew = new TreeNode("Mountain Dew");
        TreeNode cocaCola = new TreeNode("Coca Cola");
        rightChild.leftChild = mountainDew;
        rightChild.rightChild = cocaCola;
        newBT.leftChild = leftChild;
        newBT.rightChild = rightChild;
        TreeNode newNode = new TreeNode("Cola");
//        preOrderTraversal(newBT);
//        System.out.println();
//        inOrderTraversal(newBT);
//        System.out.println();
//        postOrderTraversal(newBT);
//        System.out.println();
//        System.out.println(insertNode(newBT,newNode));
        System.out.println();
        levelOrderTraversal(newBT);
        System.out.println();
//        System.out.println(searchBT(newBT,"Mountain Dew"));
        TreeNode deepestNode = getDeepestNode(newBT);
//        System.out.println(deepestNode.data);
//        deleteDeepestNode(newBT, deepestNode);
        System.out.print(deleteNode(newBT, "Hot"));
        System.out.println();
        levelOrderTraversal(newBT);
        deleteAllNode(newBT);
        System.out.println();
        levelOrderTraversal(newBT);
    }
}