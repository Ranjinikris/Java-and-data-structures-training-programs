#include <iostream>

class TreeNode {
public:
    int data;
    TreeNode* left;
    TreeNode* right;

    TreeNode(int val) : data(val), left(nullptr), right(nullptr) {}
};

class BST {
private:
    TreeNode* root;

    TreeNode* insert(TreeNode* root, int val) {
        if (root == nullptr) {
            return new TreeNode(val);
        }

        if (val < root->data) {
            root->left = insert(root->left, val);
        } else if (val > root->data) {
            root->right = insert(root->right, val);
        }

        return root;
    }

    TreeNode* findMin(TreeNode* node) {
        while (node->left != nullptr) {
            node = node->left;
        }
        return node;
    }

    TreeNode* remove(TreeNode* root, int val) {
        if (root == nullptr) {
            return nullptr;
        }

        if (val < root->data) {
            root->left = remove(root->left, val);
        } else if (val > root->data) {
            root->right = remove(root->right, val);
        } else {
            if (root->left == nullptr) {
                TreeNode* temp = root->right;
                delete root;
                return temp;
            } else if (root->right == nullptr) {
                TreeNode* temp = root->left;
                delete root;
                return temp;
            }

            TreeNode* temp = findMin(root->right);
            root->data = temp->data;
            root->right = remove(root->right, temp->data);
        }

        return root;
    }

    bool search(TreeNode* root, int val) {
        if (root == nullptr) {
            return false;
        }

        if (val == root->data) {
            return true;
        } else if (val < root->data) {
            return search(root->left, val);
        } else {
            return search(root->right, val);
        }
    }

public:
    BST() : root(nullptr) {}

    void insert(int val) {
        root = insert(root, val);
    }

    void remove(int val) {
        root = remove(root, val);
    }

    bool search(int val) {
        return search(root, val);
    }
};

int main() {
    BST bst;
    
    bst.insert(50);
    bst.insert(30);
    bst.insert(70);
    bst.insert(20);
    bst.insert(40);
    bst.insert(60);
    bst.insert(80);

    std::cout << "Is 40 present in the BST? " << std::boolalpha << bst.search(40) << std::endl;

    bst.remove(30);
    std::cout << "Is 30 present in the BST? " << std::boolalpha << bst.search(30) << std::endl;

    return 0;
}
