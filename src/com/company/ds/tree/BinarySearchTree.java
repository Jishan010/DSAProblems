package com.company.ds.tree;

public class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        this.root = null;
    }

    public void newInsert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }

        Node currentNode = root;
        while (true) {
            if (newNode.data > currentNode.data) {
                //right
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    return;
                } else
                    currentNode = currentNode.right;
            } else {
                //left
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    return;
                } else
                    currentNode = currentNode.left;
            }
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        boolean isRight = false;
        if (root == null) {
            root = newNode;
            return;
        }

        Node currentNode = root;
        Node parentNode = root;
        while (currentNode != null) {
            if (newNode.data > currentNode.data) {
                //right
                parentNode = currentNode;
                currentNode = currentNode.right;
                isRight = true;
            } else {
                //left
                parentNode = currentNode;
                currentNode = currentNode.left;
                isRight = false;
            }
        }

        if (isRight) {
            parentNode.right = newNode;
        } else
            parentNode.left = newNode;
    }


    /**
     * function to remove given node from tree
     *
     * @return Node [Node]
     */
    public Node removeNode() {
        // tip : to remove the node , always check node which is greater than removable node and which is smaller than rest of the nodes of right childrens of removable node
        /*
        remove(value) {
    if (!this.root) {
      return false;
    }
    let currentNode = this.root;
    let parentNode = null;
    while(currentNode){
      if(value < currentNode.value){
        parentNode = currentNode;
        currentNode = currentNode.left;
      } else if(value > currentNode.value){
        parentNode = currentNode;
        currentNode = currentNode.right;
      } else if (currentNode.value === value) {
        //We have a match, get to work!

        //Option 1: No right child:
        if (currentNode.right === null) {
          if (parentNode === null) {
            this.root = currentNode.left;
          } else {

            //if parent > current value, make current left child a child of parent
            if(currentNode.value < parentNode.value) {
              parentNode.left = currentNode.left;

            //if parent < current value, make left child a right child of parent
            } else if(currentNode.value > parentNode.value) {
              parentNode.right = currentNode.left;
            }
          }

        //Option 2: Right child which doesnt have a left child
        } else if (currentNode.right.left === null) {
          currentNode.right.left = currentNode.left;
          if(parentNode === null) {
            this.root = currentNode.right;
          } else {

            //if parent > current, make right child of the left the parent
            if(currentNode.value < parentNode.value) {
              parentNode.left = currentNode.right;

            //if parent < current, make right child a right child of the parent
            } else if (currentNode.value > parentNode.value) {
              parentNode.right = currentNode.right;
            }
          }

        //Option 3: Right child that has a left child
        } else {

          //find the Right child's left most child
          let leftmost = currentNode.right.left;
          let leftmostParent = currentNode.right;
          while(leftmost.left !== null) {
            leftmostParent = leftmost;
            leftmost = leftmost.left;
          }

          //Parent's left subtree is now leftmost's right subtree
          leftmostParent.left = leftmost.right;
          leftmost.left = currentNode.left;
          leftmost.right = currentNode.right;

          if(parentNode === null) {
            this.root = leftmost;
          } else {
            if(currentNode.value < parentNode.value) {
              parentNode.left = leftmost;
            } else if(currentNode.value > parentNode.value) {
              parentNode.right = leftmost;
            }
          }
        }
      return true;
      }
    }
  }
         */
        return null;
    }

    public Node lookup(int value) {
        if (root == null) {
            return null;
        }
        Node currentNode = root;
        while (currentNode != null) {
            if (value > currentNode.data) {
                currentNode = currentNode.right;
            } else if (value < currentNode.data) {
                currentNode = currentNode.left;
            } else {
                return currentNode;
            }
        }
        return null;
    }


    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else {
            int length = 1;
            Node currentNode = root;
            while (true) {
                if (currentNode.right != null && currentNode.left != null) {
                    if (currentNode.left.data > currentNode.right.data) {
                        currentNode = currentNode.left;
                        length++;
                    } else if (currentNode.right.data > currentNode.left.data) {
                        currentNode = currentNode.right;
                        length++;
                    }
                } else if (currentNode.right != null) {
                    currentNode = currentNode.right;
                    length++;
                } else if (currentNode.left != null) {
                    currentNode = currentNode.left;
                    length++;
                } else return length;
            }
        }
    }

    public Node getRoot() {
        return root;
    }
}
